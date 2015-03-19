package com.twu.refactor;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class TextStatementTest extends TestCase {
    @Test
    public void testForGetFooterLineGivesTheStringOfTotalPointAndFrequentPoint(){
        String statement = TextStatement.getFooterLine(12.3,4);
        String expected = "Amount owed is 12.3\nYou earned 4 frequent renter points";
        assertTrue(statement.equals(expected));
    }
    @Test
    public void testForGetHeaderGivesTheHeaderOfThatLine(){
        Customer customer = new Customer("Jangali Billi");
        String statement = TextStatement.getHeader(customer);
        String expected = "Rental Record for Jangali Billi\n";
        assertTrue(statement.equals(expected));
    }
    @Test
    public void testForGetHTMLFooterLineGivesTheStringOfTotalPointAndFrequentPoint(){
        String statement = TextStatement.getHtmlFooterLine(12.3,4);
        String expected = "<P>You owe <EM>12.3</EM>" +
                             "<P>On this rental you earned <EM>4</EM> frequent renter points<P>\n";
        assertTrue(statement.equals(expected));
    }
    @Test
    public void testForGetHTMLHeaderGivesTheHeaderOfThatLine(){
        Customer customer = new Customer("Jangali Billi");
        String statement = TextStatement.getHtmlHeader(customer);
        String expected = "<H1>Rentals for <EM>Jangali Billi</EM></H1><P>";
        assertTrue(statement.equals(expected));
    }
}