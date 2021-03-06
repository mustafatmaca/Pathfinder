package com.mustafatmaca.pathfinder.models;

/**
 * @author Muallim
 */
public class Kullanici {
    private int id;
    private String kullaniciAdi;
    private String sifre;
    private String email;
    private String gsm;
    private String sehir;
    private int puan = 0;
    private String durum = "Kullanıcı";

    public Kullanici(int id, String kullaniciAdi, String sifre, String email, String gsm, String sehir) {
        this.id = id;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.email = email;
        this.gsm = gsm;
        this.sehir = sehir;
    }

    public Kullanici(String kullaniciAdi, String sifre, String email, String gsm, String sehir, int puan, String durum) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.email = email;
        this.gsm = gsm;
        this.sehir = sehir;
        this.puan = puan;
        this.durum = durum;
    }

    public Kullanici(String kullaniciAdi, String sifre, String email, String gsm, String sehir) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.email = email;
        this.gsm = gsm;
        this.sehir = sehir;
    }

    public Kullanici(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

}
