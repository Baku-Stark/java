package org.example;

import org.bson.Document;
import org.bson.types.ObjectId;

public class Main {
    public static void main(String[] args) {
        MongoConnection mongoConnection = new MongoConnection();
        mongoConnection.setUpConnection();

        // Chamando o MongoCRUD
        MongoCRUD mongoCRUD = new MongoCRUD(mongoConnection.getDatabase(), "users");

        /*
        * Object Id = new ObjectId();
        Document document = new Document("_id", Id)
                .append("firstName", "John ")
                .append("lastName", "Doe")
                .append("email", "john.doe@example.com")
                .append("password", "password");

        if (mongoCRUD.insert(document)){
            System.out.println("usuário criado com sucesso!");
        }
        else{
            System.out.println("Erro na inserção");
        }
        * */

        //ObjectId ObjId = new ObjectId("67051c69f3b4bf1b5aa655e0");
        //mongoCRUD.delete(ObjId);

        ObjectId ObjID = new ObjectId("65ee38db000966dadaf8f555");
        //System.out.println(mongoCRUD.findByID(ObjID).toJson());
        Document document = new Document("_id", ObjID)
                .append("email", "simon@example.com");
        mongoCRUD.update(document, ObjID);

        mongoCRUD.findAll().forEach(System.out::println);
    }
}
