package com.mustafatmaca.pathfinder.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mustafatmaca.pathfinder.models.Kullanıcı;
import org.bson.Document;

public class connection {

    public MongoClient connectDb(){

        try {
            MongoClient mongoClient = MongoClients.create(
                    "mongodb+srv://muallim:abc1234@pfdatabase.y5owz.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
            MongoDatabase database = mongoClient.getDatabase("test");
            System.out.println("Bağlantı sağlandı.");
            return mongoClient;
        } catch (Error e){

        }
        return null;
    }

    public void kayıtOlustur(MongoClient mongoClient, Kullanıcı kullanıcı){
        MongoCollection<Document> kullanicilar = mongoClient.getDatabase("pfdatabase").getCollection("kullanicilar");
        Document document = new Document("kullaniciAdi", kullanıcı.getKullaniciAdi())
                .append("sifre", kullanıcı.getSifre())
                .append("email", kullanıcı.getEmail())
                .append("gsm", kullanıcı.getGsm())
                .append("sehir", kullanıcı.getSehir());
        kullanicilar.insertOne(document);

    }

}
