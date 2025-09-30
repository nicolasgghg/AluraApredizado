public class App {
    public static void main(String[] args) {

        Movie myMovie = new Movie();
        myMovie.name = "Top Gun: Maverick";
        myMovie.yearOfRelease = 2022;
        myMovie.durationInMinutes = 200;

        myMovie.displayTechnicalData();
        System.out.println();
        myMovie.addRating(8);
        myMovie.addRating(5);
        myMovie.addRating(10);
        System.out.println();
        myMovie.displayTechnicalData();
        System.out.println("Average rating: " + myMovie.getAverageRating());
    }

}
