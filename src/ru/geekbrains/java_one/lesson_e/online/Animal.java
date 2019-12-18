package ru.geekbrains.java_one.lesson_e.online;

public class Animal {
     String name;
     double run;
     double swim;
     double jump;

     public Animal(String name, Float run, Float swim, Float jump){
          this.name = name;
          this.run = run;
          this.swim = swim;
          this.jump = jump;
     }
     public Animal(String name, Float run, Float jump){
          this.name = name;
          this.run = run;
          this.jump = jump;
     }
     public Animal(String name){
          this.name = name;
     }
     public double setRun(){
          run = 0f;
          while (10 > run || run > 20){
               run = Math.random()*20;
          }
          return run;
     }
     public double setSwim(){
          swim = 0f;
          while (10 > swim || swim > 20){
               swim = Math.random()*20;
          }
          return swim;
     }
     public double setJump(){
          jump = 0;
          while (10 > jump || jump > 20){
               jump = Math.random()*20;
          }
          return jump;
     }
     public void runDistance(int distance){

          if (distance <= run)
               System.out.println(name + " Пробежал дистанцию " + distance + " м" + "| может пробежать " + run);
          else System.out.println(name + " Не побежал дистанцию " + distance + " м" + "| может пробежать " + run);

     }
     public void swimDistance(int distance){

          if (distance <= swim)
               System.out.println(name + " Проплыл дистанцию " + distance + " м" + "| может проплыть " + swim);
          else System.out.println(name + " Не проплыл дистанцию " + distance + " м" + "| может проплыть " + swim);

     }
     public void jumpBarrier(int barrier){

          if (barrier <= jump)
               System.out.println(name + " Перепрыгнул препятствие " + barrier + " м" + "| может прыгнуть на высоту " + jump);
          else System.out.println(name + " Не перепрыгнул препятствие " + barrier + " м" + "| может прыгнуть на высоту " + jump);

     }
}
