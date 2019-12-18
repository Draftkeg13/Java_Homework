package ru.geekbrains.java_one.lesson_e.online;

public class Horse extends Animal {
    public Horse (String name) {
        super(name);
        this.run = (int)setRun();
        this.swim = (int) setSwim();
        this.jump = setJump();
    }
    @Override
    public double setRun(){
        run = 0;
        while (1300 > run || run > 1800){
            run = (Math.random()*10000);
        }
        return run;
    }
    @Override
    public double setSwim(){
        swim = 0;
        while (80 > swim || swim > 150){
            swim = Math.random()*1000;
        }
        return swim;
    }
    @Override
    public double setJump(){
        jump = 0;
        while (2.5 > jump || jump > 3.5){
            jump = Math.random()*100;
        }
        return jump;
    }
}

