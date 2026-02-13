package org.prog.session5.MoreExercise2;

import static org.prog.session5.MoreExercise2.Song.globalChart;

public class Playlist {
    public String playlistName;
    public Song[] songs;
    double totalDuration = 0;

    public void filterAndSort(String genre) {
        this.songs = new Song[Song.globalChart.length];
        int count = 0;
        System.out.println("--- New playlist: " + playlistName + " ---");
        for (int i = 0; i < Song.globalChart.length; i++) {
            if (globalChart[i] != null && globalChart[i].title.contains(genre)) {
                this.songs[count] = Song.globalChart[i];
                totalDuration = totalDuration + globalChart[i].duration;
                count++;
            }
        }
        for (int i = 0; i < count; i++){
            System.out.println("New: " + songs[i].title + " [" + songs[i].duration + " min]");
        }
        System.out.println("TOTAL DURATION: " + totalDuration + " minutes.");
    }
}
