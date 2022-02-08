package Behavioral.Observer;

/**
 * @Author: kbs
 */
public interface YearInCollegeObserver {

    void updateGrade(int year);
}

class Student implements YearInCollegeObserver {
    static int admissionYear = 2022;
    @Override
    public void updateGrade(int year){
        System.out.println("I'm Student. I'm enrolled in the College for " + (year - admissionYear) + " years");
    }
}

class Professor implements YearInCollegeObserver {
    static int admissionYear = 2021;
    @Override
    public void updateGrade(int year){
        System.out.println("I'm Professor. I'm in the College for " + (year - admissionYear) + " years");
    }
}