package br.com.nicolas.SimpleMusicApp.model;

public class Music extends Audio {
    private String album;
    private String artist;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getClassification() {
        if (this.getTotalViews() > 2000) {
            return 10;
        } else {
            return 6;
        }
    }

}
