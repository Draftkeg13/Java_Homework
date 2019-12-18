package ru.geekbrains.java_one.lesson_e.online;

public class Bird extends Animal {
    public Bird (String name) {
        super(name);
        this.run = setRun();
        this.swim = (int) setSwim();
        this.jump = setJump();
    }
    @Override
    public double setRun(){ //Определяю разброс параметра для бега
        run = 0;
        while (4 > run || run > 6){
            run = Math.random()*100;
        }
        return run;
    }
    @Override
    public void swimDistance(int distance) { // Не плавают
        System.out.println("Птички не плавают");
    }

    @Override
    public double setJump(){ //Определяю разброс параметра для прыжков
        jump = 0;
        while (0.1 > jump || jump > 0.21){
            jump = Math.random();
        }
        return jump;
    }
}

