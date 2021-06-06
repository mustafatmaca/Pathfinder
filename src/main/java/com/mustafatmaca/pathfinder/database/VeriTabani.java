package com.mustafatmaca.pathfinder.database;

import com.mongodb.client.*;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mustafatmaca.pathfinder.models.Kullanici;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

/**
 * @author Muallim
 */
public class VeriTabani {
    private MongoClient mongoClient;

    public MongoDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }

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

    public void kayitOlustur(VeriTabani veritabani, Kullanici kullanıcı){

        MongoCollection<Document> kullanicilar = veritabani.database.getCollection("kullanicilar");
        Document document = new Document("kullaniciAdi", kullanıcı.getKullaniciAdi())
                .append("sifre", kullanıcı.getSifre())
                .append("email", kullanıcı.getEmail())
                .append("gsm", kullanıcı.getGsm())
                .append("sehir", kullanıcı.getSehir())
                .append("puan", kullanıcı.getPuan())
                .append("durum", kullanıcı.getDurum());
        kullanicilar.insertOne(document);

    }

    public void deleteUser(VeriTabani veritabani, Kullanici kullanici){
        MongoCollection<Document> kullanicilar = veritabani.database.getCollection("kullanicilar");
        Document document = kullanicilar.find(and(eq("kullaniciAdi", kullanici.getKullaniciAdi()), eq("sifre", kullanici.getSifre()), eq("email", kullanici.getEmail()), eq("gsm", kullanici.getGsm()))).first();
        if (document == null){
           System.out.println("Kayıt Bulunumadı!!!");
        }
        else {
            kullanicilar.deleteOne(document);
        }
    }

    public Kullanici kullaniciAl(VeriTabani veritabani, Kullanici kullanıcı){
        MongoCollection<Document> kullanicilar = veritabani.database.getCollection("kullanicilar");
        Document document = kullanicilar.find(and(eq("kullaniciAdi", kullanıcı.getKullaniciAdi()), eq("sifre", kullanıcı.getSifre()))).first();
        if (document == null){
            return null;
        }
        else {
            Object[] objects = document.values().toArray();
            Kullanici dbKullanici = new Kullanici(objects[1].toString(),objects[2].toString(),objects[3].toString(),objects[4].toString(),objects[5].toString(), (Integer) objects[6], objects[7].toString());

            return dbKullanici;
        }

    }

    public boolean kayitKontrol(VeriTabani veritabani, Kullanici kullanıcı){
        MongoCollection<Document> kullanicilar = veritabani.database.getCollection("kullanicilar");
        Document doc = kullanicilar.find(eq("email", kullanıcı.getEmail())).first();
        if (doc == null){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean girisKontrol(VeriTabani veritabani, Kullanici kullanıcı){
        MongoCollection<Document> kullanicilar = veritabani.database.getCollection("kullanicilar");
        Document doc = kullanicilar.find(and(eq("kullaniciAdi", kullanıcı.getKullaniciAdi()), eq("sifre", kullanıcı.getSifre()))).first();
        if (doc == null){
            return false;
        }
        else {
            return true;
        }
    }

    public List<String> sehirleriAl(VeriTabani veriTabani){
        List<String> sehirListesi = new ArrayList<>();

        MongoCollection<Document> sehirler = veriTabani.database.getCollection("sehirler");
        List<Document> cities = sehirler.find().into(new ArrayList<>());
        if (cities == null){
            return null;
        }
        else {
            for (Document document: cities) {
                Object[] objects = document.values().toArray();
                sehirListesi.add(objects[1].toString());
            }
            return sehirListesi;
        }

    }

    public void durumRehber(VeriTabani veriTabani, Kullanici kullanıcı){
        MongoCollection<Document> kullanicilar = veriTabani.database.getCollection("kullanicilar");
        Document filter = new Document("kullaniciAdi", kullanıcı.getKullaniciAdi());
        Bson update = set("durum", "Rehber");
        FindOneAndUpdateOptions findOneAndUpdateOptions = new FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER);
        Document document = kullanicilar.find(and(eq("kullaniciAdi", kullanıcı.getKullaniciAdi()), eq("sifre", kullanıcı.getSifre()))).first();
        if (document == null){
            System.out.println("Kayıt Bulunumadı");
        }
        else {
            Document doc = kullanicilar.findOneAndUpdate(filter, update, findOneAndUpdateOptions);
            System.out.println(doc.toJson());
        }
    }

    public void durumKullanıcı(VeriTabani veriTabani, Kullanici kullanıcı){
        MongoCollection<Document> kullanicilar = veriTabani.database.getCollection("kullanicilar");
        Document filter = new Document("kullaniciAdi", kullanıcı.getKullaniciAdi());
        Bson update = set("durum", "Kullanıcı");
        FindOneAndUpdateOptions findOneAndUpdateOptions = new FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER);
        Document document = kullanicilar.find(and(eq("kullaniciAdi", kullanıcı.getKullaniciAdi()), eq("sifre", kullanıcı.getSifre()))).first();
        if (document == null){
            System.out.println("Kayıt Bulunumadı");
        }
        else {
            Document doc = kullanicilar.findOneAndUpdate(filter, update, findOneAndUpdateOptions);
            System.out.println(doc.toJson());
        }
    }

    /*

    ////Şehirleri veritabanına eklemek için kullandığım method

    public void sehirEkleme(VeriTabani VeriTabani) throws FileNotFoundException {
        List<String> cities = new ArrayList<String>();
        File file = new File("dosya yolu");  //dosya yolu belirtilir
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            cities.add(scanner.nextLine());
        }
        for (String city: cities) {
            MongoCollection<Document> sehirler = VeriTabani.database.getCollection("sehirler");
            Document document = new Document("sehir", city);
            sehirler.insertOne(document);
        }
    }
     */

}