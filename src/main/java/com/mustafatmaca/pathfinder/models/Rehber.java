package com.mustafatmaca.pathfinder.models;

/*
 * @author Muallim
 */
public class Rehber extends Kullanıcı{
    private int puan;
    
    
    public Rehber(int puan, String kullaniciAdi, String sifre, String email, String gsm, String sehir) {
        super(kullaniciAdi, sifre, email, gsm, sehir);
        this.puan = puan;
    }

    public Rehber(String kullaniciAdi, String sifre, String email, String gsm, String sehir) {
        super(kullaniciAdi, sifre, email, gsm, sehir);
    }

    public Rehber(String kullaniciAdi, String sifre) {
        super(kullaniciAdi, sifre);
    }
    
    
    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }
}
