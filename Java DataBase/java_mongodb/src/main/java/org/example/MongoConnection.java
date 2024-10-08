package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {
    private MongoDatabase database;

    public void setUpConnection(){
        try{
            //conectar na database na porta 27017
            MongoClient mongoClient = MongoClients.create("mongodb+srv://<user>:<pass>@nodeapi.61bjodc" +
                    ".mongodb.net/");
            //selecionar a database
            database = mongoClient.getDatabase("lab");
            System.out.println("\033[32m" + "===== Conectado a database! =====" + "\033[0m");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }
}