import br.com.nicolas.screenmatch.model.Movie;
import br.com.nicolas.screenmatch.model.Serie;

public class App {
    public static void main(String[] args) {

        Movie myMovie = new Movie();
        myMovie.setName("Top Gun: Maverick");
        myMovie.setYearOfRelease(2022);
        myMovie.setDurationInMinutes(142);

        myMovie.displayTechnicalData();
        System.out.println();
        myMovie.addRating(8);
        myMovie.addRating(5);
        myMovie.addRating(10);
        System.out.println();
        myMovie.displayTechnicalData();
        System.out.println("Average rating: " + myMovie.getAverageRating());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setYearOfRelease(2004);
        lost.setDurationInMinutes(60);
        lost.setEpisodesPerSeason(6);
        lost.setMinutesPerEpisode(50);
        lost.setSeasons(10);
        lost.displayTechnicalData();
        System.out.println("Duration lost in minutes: " + lost.getDurationInMinutes());

    }

}
