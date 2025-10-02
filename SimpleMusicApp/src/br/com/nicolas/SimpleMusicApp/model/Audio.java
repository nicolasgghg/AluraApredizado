package br.com.nicolas.SimpleMusicApp.model;

public class Audio {
    private String title;
    private int totalViews;
    private int totalLikes;
    private int classification;

    public void Like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalViews++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }

}
