package com.twu.refactor;

/**
 * Created by vikaspal on 3/17/2015.
 */

public enum MoviePricingCategory {


    CHILDRENS(1.5,1.5,3), REGULAR(2,1.5,2), NEW_RELEASE(0,3,0);

    private final double upFrontCost;
    private final double perDayCost;
    private final int upFrontValidity;

    MoviePricingCategory(double upFrontCost,double perDayCost,int upFrontValidity ){
        this.upFrontCost =upFrontCost;
        this.perDayCost = perDayCost;
        this.upFrontValidity = upFrontValidity;
    }

    public double getCostFor(int days) {
       double rentalAmount = upFrontCost;
        if (days > upFrontValidity)
            rentalAmount += (days - upFrontValidity) *perDayCost;
        return rentalAmount;
    }
}
