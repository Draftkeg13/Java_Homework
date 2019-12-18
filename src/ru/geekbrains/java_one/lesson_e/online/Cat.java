package ru.geekbrains.java_one.lesson_e.online;

public class Cat extends Animal {
    public Cat (String name) {
        super(name);
        this.run = (int) setRun();
        this.swim = (int) setSwim();
        this.jump = setJump();
    }
    @Override
    public double setRun(){ //Определяю разброс параметра для бега
        run = 0;
        while (150 > run || run > 220){
            run = Math.random()*300;
        }
        return run;
    }
    @Override
    public void swimDistance(int distance){ // Не плавают
        System.out.println("Котики не плавают");
    }
    @Override
    public double setJump(){ //Определяю разброс параметра для прыжков
        jump = 0;
        while (1.5 > jump || jump > 2.2){
            jump = Math.random()*10;
        }
        return jump;
    }


}
