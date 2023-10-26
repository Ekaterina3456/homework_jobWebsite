package ru.gb.lesson7.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, int salary) {
        Random random = new Random();
        JobVacancy[] jobVacancies = JobVacancy.values();
        for (Observer observer : observers) {
            if (observer.Job() == jobVacancies[random.nextInt(jobVacancies.length)]) {
                observer.receiveOffer(companyName, salary);
            }
        }
    }
}
