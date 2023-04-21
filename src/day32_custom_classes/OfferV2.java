package day32_custom_classes;

public class OfferV2 {

    // location, company, salary, is full time, number of PTO
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;



/*
    - constructor

        - create a constructor that creates an Offer object with the company and location

        - create a constructor that creates an Offer object with the company, location, and salary

        - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

*/

    public OfferV2 (String company, String location){
        this.company = company;
        this.location = location;
    }

    public OfferV2 (String company, String location, double salary){
//        this.company = company;
//        this.location = location;

        this(company, location);
        this.salary = salary;
    }

    public OfferV2 (String company, String location, double salary, boolean isFullTime, int numOfPTO){
//        this.company = company;
//        this.location = location;
//        this.salary = salary;

        this (company, location, salary);  // Using this() keyword we call another constructor which instantiate the values on instance variables.
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;
    }
    public String toString() {
        return "Offer: " +
                "\nLocation: " + location +
                "\nCompany: " + company +
                "\nSalary: $" + salary +
                "\nIs Full Time: " + isFullTime +
                "\nNumber Of PTO: " + numOfPTO;
    }

}
