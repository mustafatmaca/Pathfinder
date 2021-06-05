/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mustafatmaca.pathfinder.UI;

import com.mustafatmaca.pathfinder.database.VeriTabani;
import com.mustafatmaca.pathfinder.models.Kullanici;

import java.awt.CardLayout;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

/**
 * @author Muallim
 */
public class AnaEkran extends javax.swing.JFrame {

    /**
     * Creates new form AnaSayfa
     */
    CardLayout cardLayout;
    
    public AnaEkran() {
        initComponents();
        
        cardLayout = (CardLayout)(pnlCards.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnlAnaEkran = new javax.swing.JSplitPane();
        pnlSekme = new javax.swing.JPanel();
        lblPathfinder = new javax.swing.JLabel();
        btnAnasayfa = new javax.swing.JButton();
        btnRehberBul = new javax.swing.JButton();
        btnRehberOl = new javax.swing.JButton();
        btnProfil = new javax.swing.JButton();
        btnAyarlar = new javax.swing.JButton();
        btnCikisYap = new javax.swing.JButton();
        pnlCards = new javax.swing.JPanel();
        crdAnasayfa = new javax.swing.JPanel();
        lblHosgeldiniz = new javax.swing.JLabel();
        lblNasil = new javax.swing.JLabel();
        lblRehberBul = new javax.swing.JLabel();
        lblRehberOl = new javax.swing.JLabel();
        lblProfil = new javax.swing.JLabel();
        lblAyarlar = new javax.swing.JLabel();
        crdRehberBul = new javax.swing.JPanel();
        lblSehirSec = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        crdRehberOl = new javax.swing.JPanel();
        lblDurum = new javax.swing.JLabel();
        btnRehberlikYap = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        crdProfil = new javax.swing.JPanel();
        lblProBaslik = new javax.swing.JLabel();
        lblProAd = new javax.swing.JLabel();
        lblProEmail = new javax.swing.JLabel();
        lblProGsm = new javax.swing.JLabel();
        lblProSehir = new javax.swing.JLabel();
        crdAyarlar = new javax.swing.JPanel();
        lblAyarBaslik = new javax.swing.JLabel();
        lblAyarAd = new javax.swing.JLabel();
        lblAyarSifre = new javax.swing.JLabel();
        lblAyarEmail = new javax.swing.JLabel();
        lblAyarGsm = new javax.swing.JLabel();
        lblAyarSehir = new javax.swing.JLabel();
        tfAyarAd = new javax.swing.JTextField();
        tfAyarEmail = new javax.swing.JTextField();
        tfAyarGsm = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        pfAyarSifre = new javax.swing.JPasswordField();
        btnGuncelle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        pnlSekme.setBackground(new java.awt.Color(51, 51, 51));
        pnlSekme.setPreferredSize(new java.awt.Dimension(200, 575));

        lblPathfinder.setBackground(new java.awt.Color(51, 51, 51));
        lblPathfinder.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblPathfinder.setForeground(new java.awt.Color(255, 204, 51));
        lblPathfinder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPathfinder.setText("Pathfinder");

        btnAnasayfa.setBackground(new java.awt.Color(255, 204, 51));
        btnAnasayfa.setText("Ana Sayfa");
        btnAnasayfa.setBorderPainted(false);
        btnAnasayfa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnasayfa.setFocusPainted(false);
        btnAnasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnasayfaActionPerformed(evt);
            }
        });

        btnRehberBul.setBackground(new java.awt.Color(255, 204, 51));
        btnRehberBul.setText("Rehber Bul");
        btnRehberBul.setBorderPainted(false);
        btnRehberBul.setFocusPainted(false);
        btnRehberBul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehberBulActionPerformed(evt);
            }
        });

        btnRehberOl.setBackground(new java.awt.Color(255, 204, 51));
        btnRehberOl.setText("Rehber Ol");
        btnRehberOl.setBorderPainted(false);
        btnRehberOl.setFocusPainted(false);
        btnRehberOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehberOlActionPerformed(evt);
            }
        });

        btnProfil.setBackground(new java.awt.Color(255, 204, 51));
        btnProfil.setText("Profil");
        btnProfil.setBorderPainted(false);
        btnProfil.setFocusPainted(false);
        btnProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilActionPerformed(evt);
            }
        });

        btnAyarlar.setBackground(new java.awt.Color(255, 204, 51));
        btnAyarlar.setText("Ayarlar");
        btnAyarlar.setBorderPainted(false);
        btnAyarlar.setFocusPainted(false);
        btnAyarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyarlarActionPerformed(evt);
            }
        });

        btnCikisYap.setBackground(new java.awt.Color(255, 204, 51));
        btnCikisYap.setText("Çıkış Yap");
        btnCikisYap.setBorderPainted(false);
        btnCikisYap.setFocusPainted(false);
        btnCikisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisYapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSekmeLayout = new javax.swing.GroupLayout(pnlSekme);
        pnlSekme.setLayout(pnlSekmeLayout);
        pnlSekmeLayout.setHorizontalGroup(
            pnlSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSekmeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPathfinder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnasayfa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRehberBul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAyarlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCikisYap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRehberOl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSekmeLayout.setVerticalGroup(
            pnlSekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSekmeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblPathfinder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnAnasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRehberBul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRehberOl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAyarlar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCikisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        spnlAnaEkran.setLeftComponent(pnlSekme);

        pnlCards.setPreferredSize(new java.awt.Dimension(573, 575));
        pnlCards.setLayout(new java.awt.CardLayout());

        crdAnasayfa.setBackground(new java.awt.Color(255, 204, 51));

        lblHosgeldiniz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHosgeldiniz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHosgeldiniz.setText("Hoşgeldiniz");
        lblHosgeldiniz.setToolTipText("");
        lblHosgeldiniz.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblNasil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNasil.setText("Pathfinder Programı Nasıl Kullanılır?\n");

        lblRehberBul.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRehberBul.setText("Rehber Bul    :    Rehber Bul menüsünde bulunduğunuz şehiri seçerek, şehrinizde size rehberlik etmek isteyen diğer kullanıcıları bulabilirsiniz.");

        lblRehberOl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRehberOl.setText("Rehber Ol    :    Rehber Ol menüsünde Rehberlik Yap tuşunu seçerek hesabınızın durumunu Rehber olarak ayarlarsınız ve diğer kullanıcılara gözükür hale gelirsiniz.\n");

        lblProfil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProfil.setText("Profil    :    Profil menüsünde bilgilerinizi görüntüleyebilirsiniz.");

        lblAyarlar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAyarlar.setText("Ayarlar    :    Ayarlar menüsünde bilgilerinizi değiştirebilir ve hesabınızı kalıcı olarak silebilirsiniz.");

        javax.swing.GroupLayout crdAnasayfaLayout = new javax.swing.GroupLayout(crdAnasayfa);
        crdAnasayfa.setLayout(crdAnasayfaLayout);
        crdAnasayfaLayout.setHorizontalGroup(
            crdAnasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crdAnasayfaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(crdAnasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAyarlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRehberBul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRehberOl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHosgeldiniz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crdAnasayfaLayout.setVerticalGroup(
            crdAnasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crdAnasayfaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHosgeldiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNasil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRehberBul, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRehberOl, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAyarlar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pnlCards.add(crdAnasayfa, "pnlCard1");

        crdRehberBul.setBackground(new java.awt.Color(255, 204, 51));

        lblSehirSec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSehirSec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSehirSec.setText("Şehir Seç : ");

        jComboBox1.setBackground(new java.awt.Color(255, 204, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout crdRehberBulLayout = new javax.swing.GroupLayout(crdRehberBul);
        crdRehberBul.setLayout(crdRehberBulLayout);
        crdRehberBulLayout.setHorizontalGroup(
            crdRehberBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crdRehberBulLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(crdRehberBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(crdRehberBulLayout.createSequentialGroup()
                        .addComponent(lblSehirSec, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 787, Short.MAX_VALUE)))
                .addContainerGap())
        );
        crdRehberBulLayout.setVerticalGroup(
            crdRehberBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crdRehberBulLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(crdRehberBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSehirSec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCards.add(crdRehberBul, "pnlCard2");

        crdRehberOl.setBackground(new java.awt.Color(255, 204, 51));

        lblDurum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDurum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDurum.setText("Durum : ");

        btnRehberlikYap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRehberlikYap.setText("Rehberlik Yap");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kullanıcı", "Puan", "Yorum"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout crdRehberOlLayout = new javax.swing.GroupLayout(crdRehberOl);
        crdRehberOl.setLayout(crdRehberOlLayout);
        crdRehberOlLayout.setHorizontalGroup(
            crdRehberOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crdRehberOlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crdRehberOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                    .addGroup(crdRehberOlLayout.createSequentialGroup()
                        .addComponent(lblDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRehberlikYap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        crdRehberOlLayout.setVerticalGroup(
            crdRehberOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crdRehberOlLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(crdRehberOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRehberlikYap, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pnlCards.add(crdRehberOl, "pnlCard3");

        crdProfil.setBackground(new java.awt.Color(255, 204, 51));

        lblProBaslik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProBaslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProBaslik.setText("Profil");

        lblProAd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProAd.setText("Kullanıcı Adı : ");

        lblProEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProEmail.setText("Email : ");

        lblProGsm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProGsm.setText("GSM : ");

        lblProSehir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProSehir.setText("Şehir : ");

        javax.swing.GroupLayout crdProfilLayout = new javax.swing.GroupLayout(crdProfil);
        crdProfil.setLayout(crdProfilLayout);
        crdProfilLayout.setHorizontalGroup(
            crdProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crdProfilLayout.createSequentialGroup()
                .addGroup(crdProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crdProfilLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lblProBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(crdProfilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProAd, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(crdProfilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(crdProfilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProGsm, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(crdProfilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        crdProfilLayout.setVerticalGroup(
            crdProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crdProfilLayout.createSequentialGroup()
                .addComponent(lblProBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProAd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProGsm, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pnlCards.add(crdProfil, "pnlCard4");

        crdAyarlar.setBackground(new java.awt.Color(255, 204, 51));

        lblAyarBaslik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAyarBaslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAyarBaslik.setText("Ayarlar");

        lblAyarAd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAyarAd.setText("Kullanıcı Adı : ");

        lblAyarSifre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAyarSifre.setText("Şifre : ");

        lblAyarEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAyarEmail.setText("Email : ");

        lblAyarGsm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAyarGsm.setText("GSM : ");

        lblAyarSehir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAyarSehir.setText("Şehir : ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGuncelle.setText("Güncelle");

        btnSil.setText("Hesabı Kalıcı Olarak Sil");

        javax.swing.GroupLayout crdAyarlarLayout = new javax.swing.GroupLayout(crdAyarlar);
        crdAyarlar.setLayout(crdAyarlarLayout);
        crdAyarlarLayout.setHorizontalGroup(
            crdAyarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crdAyarlarLayout.createSequentialGroup()
                .addGroup(crdAyarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(crdAyarlarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crdAyarlarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(crdAyarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crdAyarlarLayout.createSequentialGroup()
                                .addComponent(lblAyarSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crdAyarlarLayout.createSequentialGroup()
                                .addComponent(lblAyarAd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAyarAd, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crdAyarlarLayout.createSequentialGroup()
                                .addComponent(lblAyarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAyarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(lblAyarSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pfAyarSifre))
                    .addGroup(crdAyarlarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crdAyarlarLayout.createSequentialGroup()
                        .addGroup(crdAyarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crdAyarlarLayout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(lblAyarBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crdAyarlarLayout.createSequentialGroup()
                                .addGap(468, 468, 468)
                                .addComponent(lblAyarGsm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAyarGsm, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        crdAyarlarLayout.setVerticalGroup(
            crdAyarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crdAyarlarLayout.createSequentialGroup()
                .addGroup(crdAyarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(crdAyarlarLayout.createSequentialGroup()
                        .addComponent(lblAyarBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(crdAyarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(crdAyarlarLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(crdAyarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfAyarAd, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(lblAyarAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(crdAyarlarLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pfAyarSifre))))
                    .addComponent(lblAyarSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crdAyarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAyarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAyarGsm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAyarEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(tfAyarGsm, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(crdAyarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAyarSehir, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jComboBox2))
                .addGap(18, 18, 18)
                .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        pnlCards.add(crdAyarlar, "pnlCard5");

        spnlAnaEkran.setRightComponent(pnlCards);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlAnaEkran, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlAnaEkran, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnasayfaActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlCard1");
    }//GEN-LAST:event_btnAnasayfaActionPerformed

    private void btnRehberBulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehberBulActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlCard2");
    }//GEN-LAST:event_btnRehberBulActionPerformed

    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlCard4");
    }//GEN-LAST:event_btnProfilActionPerformed

    private void btnAyarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyarlarActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlCard5");
    }//GEN-LAST:event_btnAyarlarActionPerformed

    private void btnCikisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisYapActionPerformed
        // TODO add your handling code here:
        GirisEkrani girisEkrani = new GirisEkrani();
        girisEkrani.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCikisYapActionPerformed

    private void btnRehberOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehberOlActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlCard3");
    }//GEN-LAST:event_btnRehberOlActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    public void kullanıcıBilgi(VeriTabani VeriTabani, Kullanici kullanıcı){
        kullanıcı = VeriTabani.kullaniciAl(VeriTabani, kullanıcı);


        lblHosgeldiniz.setText("Hoşgeldiniz " + kullanıcı.getKullaniciAdi().toUpperCase());

        lblProAd.setText(lblProAd.getText() + kullanıcı.getKullaniciAdi());
        lblProEmail.setText(lblProEmail.getText() + kullanıcı.getEmail());
        lblProGsm.setText(lblProGsm.getText() + kullanıcı.getGsm());
        lblProSehir.setText(lblProSehir.getText() + kullanıcı.getSehir());

        tfAyarAd.setText(kullanıcı.getKullaniciAdi());
        tfAyarEmail.setText(kullanıcı.getEmail());
        tfAyarGsm.setText(kullanıcı.getGsm());
        pfAyarSifre.setText(kullanıcı.getSifre());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnasayfa;
    private javax.swing.JButton btnAyarlar;
    private javax.swing.JButton btnCikisYap;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnRehberBul;
    private javax.swing.JButton btnRehberOl;
    private javax.swing.JButton btnRehberlikYap;
    private javax.swing.JButton btnSil;
    private javax.swing.JPanel crdAnasayfa;
    private javax.swing.JPanel crdAyarlar;
    private javax.swing.JPanel crdProfil;
    private javax.swing.JPanel crdRehberBul;
    private javax.swing.JPanel crdRehberOl;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAyarAd;
    private javax.swing.JLabel lblAyarBaslik;
    private javax.swing.JLabel lblAyarEmail;
    private javax.swing.JLabel lblAyarGsm;
    private javax.swing.JLabel lblAyarSehir;
    private javax.swing.JLabel lblAyarSifre;
    private javax.swing.JLabel lblAyarlar;
    private javax.swing.JLabel lblDurum;
    private javax.swing.JLabel lblHosgeldiniz;
    private javax.swing.JLabel lblNasil;
    private javax.swing.JLabel lblPathfinder;
    private javax.swing.JLabel lblProAd;
    private javax.swing.JLabel lblProBaslik;
    private javax.swing.JLabel lblProEmail;
    private javax.swing.JLabel lblProGsm;
    private javax.swing.JLabel lblProSehir;
    private javax.swing.JLabel lblProfil;
    private javax.swing.JLabel lblRehberBul;
    private javax.swing.JLabel lblRehberOl;
    private javax.swing.JLabel lblSehirSec;
    private javax.swing.JPasswordField pfAyarSifre;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlSekme;
    private javax.swing.JSplitPane spnlAnaEkran;
    private javax.swing.JTextField tfAyarAd;
    private javax.swing.JTextField tfAyarEmail;
    private javax.swing.JTextField tfAyarGsm;
    // End of variables declaration//GEN-END:variables
}
