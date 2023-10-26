package ru.gb.lesson7.observer;

public class Freelancer implements Observer {

    private  String name;

    private int salary = 20000;

    //private double minHourInWeek = 16;

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

    public Freelancer(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public JobVacancy Job() {
        return JobVacancy.Programmer;
    }
}
