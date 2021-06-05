package com.mustafatmaca.pathfinder.database;

import com.mongodb.client.*;
import com.mustafatmaca.pathfinder.models.Kullanıcı;
import org.bson.Document;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

/**
 * @author Muallim
 */
public class VeriTabani {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public VeriTabani() {
        try {
            this.mongoClient = MongoClients.create("mongodb+srv://muallim:abc1234@pfdatabase.y5owz.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
            this.database = mongoClient.getDatabase("pfdatabase");
        } catch (Error e){

        }
    }


    /*
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
    */

    public void kayıtOlustur(VeriTabani VeriTabani, Kullanıcı kullanıcı){

        MongoCollection<Document> kullanicilar = VeriTabani.database.getCollection("kullanicilar");
        Document document = new Document("kullaniciAdi", kullanıcı.getKullaniciAdi())
                .append("sifre", kullanıcı.getSifre())
                .append("email", kullanıcı.getEmail())
                .append("gsm", kullanıcı.getGsm())
                .append("sehir", kullanıcı.getSehir());
        kullanicilar.insertOne(document);

    }

    public boolean kayitKontrol(VeriTabani VeriTabani, Kullanıcı kullanıcı){
        MongoCollection<Document> kullanicilar = VeriTabani.database.getCollection("kullanicilar");
        Document doc = kullanicilar.find(eq("email", kullanıcı.getEmail())).first();
        if (doc == null){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean girisKontrol(VeriTabani VeriTabani, Kullanıcı kullanıcı){
        MongoCollection<Document> kullanicilar = VeriTabani.database.getCollection("kullanicilar");
        Document doc = kullanicilar.find(and(eq("kullaniciAdi", kullanıcı.getKullaniciAdi()), eq("sifre", kullanıcı.getSifre()))).first();
        if (doc == null){
            return false;
        }
        else {
            return true;
        }
    }

}
