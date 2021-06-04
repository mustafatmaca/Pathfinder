package com.mustafatmaca.pathfinder.models;

/**
 * @author Muallim
 */
public class Gezgin extends Kullanıcı{

    public Gezgin(String kullaniciAdi, String sifre, String email, String gsm, String sehir) {
        super(kullaniciAdi, sifre, email, gsm, sehir);
    }

    public Gezgin(String kullaniciAdi, String sifre) {
        super(kullaniciAdi, sifre);
    }
    
}
