package com.websiteskeleton.products;

/**
 * Created by nataliekerby on 7/12/15.
 */
public class Day {
    private double distance;
    private String activityType;
    private Boolean isMiles;

    public Day(){

    }

    public Day(String activityType, double distance, Boolean miles){
        this.activityType = activityType;
        this.distance = distance;
        this.isMiles = miles;
    }

    public void setDistance( double distance){
        this.distance = distance;
    }

    public void setActivityType(String activityType){
        this.activityType = activityType;
    }

    public void setIsMiles(Boolean isMiles){
        this.isMiles = isMiles;
    }

    public String getActivityType(){
        return activityType;
    }

    public double getDistance(){
        return distance;
    }

    public Boolean getIsMiles(){
        return isMiles;
    }
}
