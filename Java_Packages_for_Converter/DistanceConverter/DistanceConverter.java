package DistanceConverter;
public class DistanceConverter {

    public double metertokm(double meter){
        return meter/1000;
    }
    
    public double kmtometer(double km){
        return km*1000;
    }

    public double milestokm(double miles){
        return miles*1.60934;
    }

    public double kmtomiles(double km){
        return km*0.621371;
    }
}
