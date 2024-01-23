package com.mycompany.bangunruang;


class Bola extends BangunRuang {
    double r; // radius

    double @Override
    double volume() {
        double volumeBola = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Volume Bola: " + volumeBola);
        return volumeBola;
    }
}

class Kubus extends BangunRuang {
    double s; // sisi

    double @Override
    double volume() {
        double volumeKubus = Math.pow(s, 3);
        System.out.println("Volume Kubus: " + volumeKubus);
        return volumeKubus;
    }
}

class Tabung extends BangunRuang {
    double r; // radius
    double t; // tinggi

    double @Override
    double volume() {
        double volumeTabung = Math.PI * Math.pow(r, 2) * t;
        System.out.println("Volume Tabung: " + volumeTabung);
        return volumeTabung;
    }
}

class LimasSegitiga extends BangunRuang {
    double la; 
    double tl; 
    double @Override
    double volume() {
        double volumeLimasSegitiga = (1.0 / 3.0) * la * tl;
        System.out.println("Volume Limas Segitiga: " + volumeLimasSegitiga);
        return volumeLimasSegitiga;
    }
}
