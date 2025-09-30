public class Movie {

    String name;
    int yearOfRelease;
    boolean includedInPlan;
    double rating;
    int totalRatings;
    int durationInMinutes;

    void displayTechnicalData() {
        System.out.println("Name: " + name);
        System.out.println("Year of release: " + yearOfRelease);
        System.out.println("Included in plan: " + includedInPlan);
        System.out.println("Rating: " + rating);
        System.out.println("Total ratings: " + totalRatings);
        System.out.println("Duration in minutes: " + durationInMinutes);
    }

    void addRating(double rating) {
        this.rating += rating;
        this.totalRatings++;
    }
    
    double getAverageRating() {
        return this.rating / this.totalRatings;
    }


}
