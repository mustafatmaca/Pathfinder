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
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

/**
 * @author Muallim
 */
public class VeriTabani {
    private MongoClient mongoClient;
    private MongoDatabase database;

    /**
     * Constructor (Veritabanına bağlantıyı sağlar.)
     **/
    public VeriTabani() {
        try {
            this.mongoClient = MongoClients.create("mongodb+srv://muallim:abc1234@pfdatabase.y5owz.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
            this.database = mongoClient.getDatabase("pfdatabase");
        } catch (Error e){

        }
    }

    /**
     * Programdan kullanıcı bilgilerini alıp, veritabanında yeni bir kullanıcı kaydı oluşturan method
     **/
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

    /**
     * Programdan kullanıcı bilgilerini alıp, veritabanında kullanıcıyı silen method
     **/
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

    /**
     * Programa giriş yapan kullanıcın bilgilerini veritabanından çeken method
     **/
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

    /**
     * Kayıt oluşturan kullanıcının veritabanında kayıtlı hesabı olup olmadığını email üzerinden kontrol eden method
     **/
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

    /**
     * Giriş yapan kullanıcının kullanıcı adı ve şifre üzerinden doğruluğunu kontrol eden method
     **/
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

    /**
     * Veritabanından şehirleri alıp String dizisi olarak döndüren method
     **/
    public String[] sehirleriAl(VeriTabani veriTabani){
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
            return sehirListesi.toArray(new String[sehirListesi.size()]);
        }

    }

    /**
     * cbSehir den seçilen şehirdeki durumu Rehber olan kullanıcıların listesini dönen method
     **/
    public List<Kullanici> rehberleriAl(VeriTabani veriTabani, String sehir){
        List<Kullanici> rehberListesi = new ArrayList<>();

        MongoCollection<Document> kullanicilar = veriTabani.database.getCollection("kullanicilar");
        List<Document> users = kullanicilar.find(and(eq("sehir", sehir), eq("durum", "Rehber"))).into(new ArrayList<>());
        if (users == null){
            return null;
        }
        else {
            for (Document document: users) {
                Object[] objects = document.values().toArray();
                Kullanici dbKullanici = new Kullanici(objects[1].toString(),objects[2].toString(),objects[3].toString(),objects[4].toString(),objects[5].toString(), (Integer) objects[6], objects[7].toString());
                rehberListesi.add(dbKullanici);
            }
            return rehberListesi;
        }

    }

    /**
     * Kullanıcının durumunu veritabanında Rehber yapan method
     **/
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
            kullanicilar.findOneAndUpdate(filter, update, findOneAndUpdateOptions);
        }
    }

    /**
     * Kullanıcının durumunu veritabanında Kullanıcı yapan method
     **/
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
            kullanicilar.findOneAndUpdate(filter, update, findOneAndUpdateOptions);
        }
    }

    /**
     * Yeni kullanıcıyı ve kullanıcının eski kullanıcı adını alıp veritabanında kayıt güncellemesi yapan method
     **/
    public void updateUser(VeriTabani veriTabani, Kullanici kullanici, String eskiKullaniciAdi) {
        MongoCollection<Document> kullanicilar = veriTabani.database.getCollection("kullanicilar");

        Document filter = new Document("kullaniciAdi", eskiKullaniciAdi);

        Bson updateAd = set("kullaniciAdi", kullanici.getKullaniciAdi());
        Bson updateSifre =  set("sifre", kullanici.getSifre());
        Bson updateMail = set("email", kullanici.getEmail());
        Bson updateGsm = set("gsm", kullanici.getGsm());
        Bson updateSehir = set("sehir", kullanici.getSehir());

        FindOneAndUpdateOptions findOneAndUpdateOptions = new FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER);

        kullanicilar.findOneAndUpdate(filter, combine(updateAd, updateSifre, updateMail, updateGsm, updateSehir), findOneAndUpdateOptions);
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