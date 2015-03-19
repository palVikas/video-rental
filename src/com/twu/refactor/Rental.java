package com.twu.refactor;

public class Rental {

    Movie movie;

    public int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getFrequentRentalPoint() {
        int frequentRenterPoints=0;
        frequentRenterPoints++;
        if (isNewRelease() && getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    private boolean isNewRelease() {
        return (getMovie().getPriceCode() == MoviePricingCategory.NEW_RELEASE);
    }
}