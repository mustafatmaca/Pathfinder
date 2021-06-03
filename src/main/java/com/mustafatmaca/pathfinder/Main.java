package com.mustafatmaca.pathfinder;

import com.mongodb.client.MongoClient;
import com.mustafatmaca.pathfinder.UI.GirisEkrani;
import com.mustafatmaca.pathfinder.database.connection;
import com.mustafatmaca.pathfinder.models.Kullanıcı;

/*
 * @author Muallim
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        GirisEkrani girisEkrani = new GirisEkrani();
        girisEkrani.setVisible(true);
    }
    
}
