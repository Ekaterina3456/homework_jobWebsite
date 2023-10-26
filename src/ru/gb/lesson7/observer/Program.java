package ru.gb.lesson7.observer;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);

//        for (int i = 0; i < 3; i++){
//            google.needEmployee();
//            yandex.needEmployee();
//            geekBrains.needEmployee();
//        }

        Student student2 = new Student("Студент №2");
        Student student3 = new Student("Студент №3");
        Freelancer freelancer1 = new Freelancer("Фрилансер №1");
        Freelancer freelancer2 = new Freelancer("Фрилансер №2");

        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(student3);
        jobAgency.registerObserver(freelancer1);
        jobAgency.registerObserver(freelancer2);



        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }

}
