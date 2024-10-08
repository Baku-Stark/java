package org.example;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Sorts.ascending;

public class MongoCRUD {
    MongoCollection<Document> collection;

    public MongoCRUD(MongoDatabase database, String collectionName) {
        this.collection = database.getCollection(collectionName);
    }

    //  ==== INSERT ====
    public boolean  insert(Document document) {
        try {
            collection.insertOne(document);
            System.out.println("Inserted document: " + document.toJson());
            return true;
        }
        catch (com.mongodb.MongoWriteException e) {
            System.out.println("Error inserting document: " + document.toJson());
            e.printStackTrace();
        }

        return false;
    }

    //  ==== READ ====
    public FindIterable<Document> findAll() {
        return collection.find();
    }

    //  ==== READ (By ID) ====
    public Document findByID(ObjectId Id) {
        return collection.find(Filters.eq("_id", Id)).first();
    }

    // ==== READ (By Categoria) ===
    public void findByCategoria(String categoria) {
        // Busca todos os documentos que correspondem à categoria especificada usando regex
        FindIterable<Document> results = collection.find(Filters.regex("categoria", "\\b" + categoria + "\\b", "i"))
                .sort(ascending("title"));

        // Itera sobre os resultados e imprime cada documento
        try (MongoCursor<Document> cursor = results.iterator()) {
            // Verifica se há documentos e os imprime
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                System.out.println(doc.toJson());
            }
        }
    }

    // ==== UPDATE ====
    public boolean update(Document document, ObjectId Id) {
        try{
            Document updatedDoc = new Document("$set", document);
            collection.updateOne(Filters.eq("_id", Id), updatedDoc);
            System.out.println(updatedDoc);
            return true;
        }
        catch(Exception e){
            System.out.println("Error updating document: " + document.toJson());
            e.printStackTrace();
        }

        return false;
    }

    //  ==== DELETE ====
    public boolean delete(ObjectId Id) {
        try{
            collection.deleteOne(Filters.eq("_id", Id));
            return true;
        }
        catch (com.mongodb.MongoWriteException e) {
            System.out.println("Error deleting document: " + e.toString());
            e.printStackTrace();
        }
        return false;
    }
}
