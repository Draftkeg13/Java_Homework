package ru.geekbrains.java_one.lesson_e.online;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.run = (int) setRun();
        this.swim = setSwim();
        this.jump = setJump();

    }

    @Override
    public double setRun() { //Определяю разброс параметра для бега
        run = 0;
        while (400 > run || run > 600) {
            run = Math.random() * 1000;
        }
        return run;
    }
    @Override
    public double setSwim(){ //Определяю разброс параметра для плавания
        swim = 0;
        while (8 > swim || swim > 15){
            swim = Math.random()*100;
        }
        return swim;
    }
    @Override
    public double setJump(){ //Определяю разброс параметра для прыжков
        jump = 0;
        while (0.4 > jump || jump > 0.6){
            jump = Math.random();
        }
        return jump;
    }
}
