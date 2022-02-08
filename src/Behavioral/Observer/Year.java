package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kbs
 */
public class Year {
    private int currentYear;
    private final List<YearInCollegeObserver> observers;

    public Year(){
        observers = new ArrayList<>();
        currentYear = 2022;
    }

    public void addObserver(YearInCollegeObserver obs){
        observers.add(obs);
    }

    public void removeObserver(YearInCollegeObserver obs){
        observers.remove(obs);
    }

    public void yearGoes() {
        currentYear = currentYear + 1;
        System.out.println("A year is passed." + "This year is " + currentYear + ".");
        notifyObservers();
    }

    private void notifyObservers(){
        for(var obs: observers){
            obs.updateGrade(currentYear);
        }
    }

    public static void main(String[] args) {
        var Year = new Year();
        Year.addObserver(new Professor());
        Year.addObserver(new Student());
        Year.yearGoes();
        Year.yearGoes();
        Year.yearGoes();
        Year.yearGoes();
    }
}
