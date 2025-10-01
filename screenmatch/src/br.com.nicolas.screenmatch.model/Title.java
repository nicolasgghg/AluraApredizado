package br.com.nicolas.screenmatch.model;

public class Title {

    private String name;
    private int yearOfRelease;
    private boolean includedInPlan;
    private double rating;
    private int totalRatings;
    private int durationInMinutes;

    public void displayTechnicalData() {
        System.out.println("Name: " + name);
        System.out.println("Year of release: " + yearOfRelease);
        System.out.println("Included in plan: " + includedInPlan);
        System.out.println("Rating: " + rating);
        System.out.println("Total ratings: " + totalRatings);
        System.out.println("Duration in minutes: " + durationInMinutes);
    }

    public void addRating(double rating) {
        this.rating += rating;
        this.totalRatings++;
    }

    public double getAverageRating() {
        return this.rating / this.totalRatings;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
