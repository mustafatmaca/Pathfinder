package com.mustafatmaca.pathfinder.database;

import com.mongodb.client.*;
import com.mustafatmaca.pathfinder.models.Kullanici;
import org.bson.Document;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

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
                .append("sehir", kullanıcı.getSehir());
        kullanicilar.insertOne(document);

    }

    public Kullanici kullaniciAl(VeriTabani veritabani, Kullanici kullanıcı){
        MongoCollection<Document> kullanicilar = veritabani.database.getCollection("kullanicilar");
        Document doc = kullanicilar.find(and(eq("kullaniciAdi", kullanıcı.getKullaniciAdi()), eq("sifre", kullanıcı.getSifre()))).first();
        if (doc == null){
            return null;
        }
        else {
            Object[] objects = doc.values().toArray();
            Kullanici dbKullanici = new Kullanici(objects[1].toString(),objects[2].toString(),objects[3].toString(),objects[4].toString(),objects[5].toString());

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