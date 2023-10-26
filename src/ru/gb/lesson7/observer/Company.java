package ru.gb.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private Publisher jobAgency;

    private int maxSalary;

//    private JobVacancy jobVacancy;
//
//    public JobVacancy getJobVacancy() {
//        return jobVacancy;
//    }
//
//    public void setJobVacancy(JobVacancy jobVacancy) {
//        this.jobVacancy = jobVacancy;
//    }

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        //this.jobVacancy = jobVacancy;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

}
