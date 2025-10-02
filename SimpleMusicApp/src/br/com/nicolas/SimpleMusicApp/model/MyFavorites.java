package br.com.nicolas.SimpleMusicApp.model;

public class MyFavorites {

    public void include(Audio audio){
        if(audio.getClassification() >= 8){
            System.out.println(audio.getTitle() + " is considered an absolute success and favorite for all");
        }else {
            System.out.println(audio.getTitle() + " It's also one that everyone is enjoying.");
        }
    }
}
