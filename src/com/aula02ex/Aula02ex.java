package com.aula02ex;

public class Aula02ex {
    public static void main(String[] args) {
        Album album01 = new Album();
        album01.bandName = "Iron Maiden";
        album01.albumName = "The number of the beast";
        album01.releaseDate = 1982;
        album01.numberTracks = 8;
        album01.playingNow = true;
        album01.damagedDisc = true;

        album01.status();
        album01.play();

        System.out.println();
        Album album02 = new Album();
        album02.bandName = "Tame Impala";
        album02.albumName = "Currents";
        album02.releaseDate = 2015;
        album02.numberTracks = 13;
        album02.playingNow = false;
        album02.damagedDisc = false;

        album02.status();
        album02.play();
    }
}
