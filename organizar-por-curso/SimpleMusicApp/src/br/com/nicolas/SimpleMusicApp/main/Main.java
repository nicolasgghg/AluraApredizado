package br.com.nicolas.SimpleMusicApp.main;

import br.com.nicolas.SimpleMusicApp.model.Music;
import br.com.nicolas.SimpleMusicApp.model.MyFavorites;
import br.com.nicolas.SimpleMusicApp.model.Podcast;

public class Main {
    public static void main(String[] args) {

        Music myMusic = new Music();
        myMusic.setTitle("My Music 01");
        myMusic.setArtist("Artist 01");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.Like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("My Podcast 01");
        myPodcast.setHost("Host 01");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.Like();
        }

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.include(myMusic);
        myFavorites.include(myPodcast);

    }
}
