package com.twu.refactor;

import junit.framework.TestCase;
import org.junit.Test;

public class MoviePricingCategoryTest extends TestCase {
    @Test
    public void testChildrenCategoryGiveCostOf4Days(){
     double costFor4Days = MoviePricingCategory.CHILDRENS.getCostFor(4);
        assertEquals(3,costFor4Days,0.0);
    }
    @Test
    public void testChildrenCategoryGiveCostOf1DaysAnd2Days(){
        double costFor1Days = MoviePricingCategory.CHILDRENS.getCostFor(1);
        double costFor2Days = MoviePricingCategory.CHILDRENS.getCostFor(2);
        assertEquals(1.5,costFor1Days,0.0);
        assertEquals(1.5,costFor2Days,0.0);
    }
    @Test
    public void testForREGULARMovieCategoryGiveCostOf$Days(){
        double costFor4Days = MoviePricingCategory.REGULAR.getCostFor(5);
        assertEquals(6.5,costFor4Days,0.0);
    }


}