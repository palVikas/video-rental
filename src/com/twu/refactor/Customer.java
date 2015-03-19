package com.twu.refactor;

import java.util.ArrayList;

public class Customer {

	private String name;
	private ArrayList<Rental> rentalList = new ArrayList<Rental>();
	public Customer(String name) {
		this.name = name;
	}
	public void addRental(Rental arg) {
		rentalList.add(arg);
	}
	public String getName() {
		return name;
	}

	public String getStatement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
        String result = TextStatement.getHeader(this);
        for(Rental eachRental:rentalList){
            double rentalAmount = eachRental.movie.getCostForMovie(eachRental);
            frequentRenterPoints += eachRental.getFrequentRentalPoint();
            result += getRentalSubTotal(rentalAmount, eachRental);
            totalAmount += rentalAmount;
		}
        result += TextStatement.getFooterLine(totalAmount, frequentRenterPoints);
		return result;
	}

    private String getRentalSubTotal(double thisAmount, Rental each) {
        String result = "\t" + each.getMovie().getTitle() + "\t"
                + String.valueOf(thisAmount) + "\n";
        return result;
    }

    public String htmlStatement() {
        double totalAmount = 0;
        int frequentRentalPoints = 0;
        String result = TextStatement.getHtmlHeader(this);
        for(Rental rental : rentalList) {
            double rentalAmount = rental.movie.getCostForMovie(rental);
            frequentRentalPoints += rental.getFrequentRentalPoint();
            result += getRentalString(rentalAmount, rental);
            totalAmount += rentalAmount;
        }
        result += TextStatement.getHtmlFooterLine(totalAmount, frequentRentalPoints);
        return result;
    }

    private String getRentalString(double rentalAmount, Rental rental) {
        return rental.getMovie().getTitle()+": "+rentalAmount+"<BR>";
    }
}
