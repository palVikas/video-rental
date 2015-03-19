package com.twu.refactor;

/**
 * Created by vikaspal on 3/19/2015.
 */
public class TextStatement {

    static String getHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    static String getFooterLine(double totalAmount, int frequentRenterPoints) {
        String result = "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                + " frequent renter points";
        return result;
    }

    static String getHtmlHeader(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>";
    }

    static String getHtmlFooterLine(double totalAmount, int frequentRentalPoints) {
        String result = "<P>You owe <EM>" + totalAmount + "</EM>" +
                "<P>On this rental you earned <EM>" + frequentRentalPoints + "</EM> frequent renter points<P>\n";
        return result;
    }
}
