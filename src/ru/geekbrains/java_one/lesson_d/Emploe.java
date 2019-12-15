package ru.geekbrains.java_one.lesson_d.online;

import javax.swing.*;

public class Emploe {  //1. Создаём класс сотрудник
    private int currentYear = 2019;
    private String fio; //Фамилия Имя Отчество
    private String position; // Должность
    private String phoneNumber; // Телефон
    private int salary; //Зарплата
    private int age; // Возраст
    private int birthYear;

// 3. Методы возвращающие значения полей
    public void setFio(){
        this.fio = fio;
    }
    public String getFio(){
        return fio;
    }
    public void setPosition(){this.position = position;}
    public String getPosition(){return position;}
    public void setPhoneNumber(){this.phoneNumber = phoneNumber;}
    public String getPhoneNumber(){return phoneNumber;}
    public void setSalary(){this.salary = salary;}
    public int getSalary(){return  salary;}
    private void getAge(){this.age = (currentYear - birthYear);}
    private int setAge(){return age = (currentYear - birthYear);}



    public Emploe (String fio, String position, String phoneNumber, int salary, int birthYear){ // 2.Заполняем поля класса сотрудник
        this.fio = fio;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthYear = birthYear;
        this.age = setAge();
      //  this.fullInf();
      //  this.pribavka();
    }
    public Emploe (String fio, String position, int salary, int birthYear){ // 2.Заполняем поля класса сотрудник, если не указан телефон
        this.fio = fio;
        this.position = position;
        this.phoneNumber = "Нет данных";
        this.salary = salary;
        this.birthYear = birthYear;
        this.age = setAge();
     //   this.fullInf();
     //   this.pribavka();

    }
    public void shortInf () { // 4. Выводим в консоль, краткую информацию по сотруднику
        System.out.println(fio + " | " + position);
    }
    public void fullInf () { // Выводим в консоль полную информацию по сотруднику
        getAge();
        System.out.println(fio + " | " + position + " | " + phoneNumber + " | " + salary + " | " + age);

    }
    void pribavka () { // Прибавляем 5000 в зарплату, сотрудникам, кому больше 45 лет
        if (age >= 45) {
            salary += 5000;
            System.out.println("Получает прибавку: " + fio + " | " + salary + " | " + age);
        }
    }
    public void findOld(){ //Ищем сотрудников старше 40
            if (age > 40)
                fullInf();
            }

}

