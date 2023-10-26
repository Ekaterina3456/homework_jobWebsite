package ru.gb.lesson7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, int salary);
    JobVacancy Job();
}
