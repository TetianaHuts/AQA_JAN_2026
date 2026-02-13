package org.prog.session5.MoreExercise2;

public class Main {
    public static void main (String[] args){

        /** Rock and Roll All Nite — KISS
         Rock You Like a Hurricane — Scorpions
         Detroit Rock City — KISS
         Pop It — Anitta
         King of Pop — (в честь Michael Jackson)
         Blue Suede Shoes — Elvis Presley (случайная) **/


        Song.globalChart[0] = new Song();
        Song.globalChart[0].title = "Rock and Roll All Nite";
        Song.globalChart[0].artist = "KISS";
        Song.globalChart[0].duration = 2.5;

        Song.globalChart[1] = new Song();
        Song.globalChart[1].title = "King of Pop";
        Song.globalChart[1].artist = "Michael Jackson";
        Song.globalChart[1].duration = 3.1;

        Song.globalChart[2] = new Song();
        Song.globalChart[2].title = "Rock You Like a Hurricane";
        Song.globalChart[2].artist = "Scorpions";
        Song.globalChart[2].duration = 2.78;

        Song.globalChart[3] = new Song();
        Song.globalChart[3].title = "Detroit Rock City";
        Song.globalChart[3].artist = "KISS";
        Song.globalChart[3].duration = 3.48;

        Song.globalChart[4] = new Song();
        Song.globalChart[4].title = "Pop It";
        Song.globalChart[4].artist = "Anitta";
        Song.globalChart[4].duration = 4.25;

        Song.globalChart[5] = new Song();
        Song.globalChart[5].title = "Blue Suede Shoes";
        Song.globalChart[5].artist = "Elvis Presley";
        Song.globalChart[5].duration = 1.53;

        Playlist MyRockHits = new Playlist();
        MyRockHits.playlistName = ("My Rock Hits");
        MyRockHits.filterAndSort("Rock");


        Playlist MyPopHits = new Playlist();
        MyPopHits.playlistName = ("My Pop Hits");
        MyPopHits.filterAndSort("Pop");


    }
}
