package com.aula02ex;

public class Album {
    String albumName;
    String bandName;
    int numberTracks;
    int releaseDate;
    boolean playingNow;
    boolean damagedDisc;

    void play(){
        //O estado "base" é true, entao se faz necessario somente declarar sem colocar condicao no boolean
        //O estado de ! (not) quer dizer que se o damagedDisc estiver falso entao execute
        if (this.playingNow && !this.damagedDisc){
            System.out.println("I'm actually playing, no risks on disc!");
        } else {
            if (this.damagedDisc){
                System.out.println("Error reading the disc, please clean the unit");
            }
            System.out.println("I'm not playing, C'MMON PRESS PLAY");
        }
    }

    void status(){
        System.out.println("The name of band is: " + this.bandName);
        System.out.print("The name of album is: " + this.albumName + ", release date: " + this.releaseDate);
        System.out.println(" and it has " + this.numberTracks + " tracks");

    }
}
