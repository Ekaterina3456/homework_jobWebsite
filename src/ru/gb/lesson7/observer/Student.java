package ru.gb.lesson7.observer;

import java.util.Random;

public class Student implements Observer{

    private String name;
    private int salary = 2000;

    private JobVacancy jobVacancy = JobVacancy.Programmer;

    public JobVacancy getJobVacancy() {
        return jobVacancy;
    }

    //    private boolean isFindJob = false;
//
//    public boolean isFindJob() {
//        return isFindJob;
//    }
//
//    public void setFindJob(boolean findJob) {
//        isFindJob = findJob;
//    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public JobVacancy Job() {
        Random random = new Random();
        JobVacancy[] jobVacancies = JobVacancy.values();
        return jobVacancies[random.nextInt(jobVacancies.length)];
    }
}
