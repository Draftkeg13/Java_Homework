package ru.geekbrains.java_one.lesson_e.online;

public class Animal {
     String name;
     double run;
     double swim;
     double jump;

    /* public Animal(String name, Float run, Float swim, Float jump){
          this.name = name;
          this.run = run;
          this.swim = swim;
          this.jump = jump;
     }
     public Animal(String name, Float run, Float jump){
          this.name = name;
          this.run = run;
          this.jump = jump;


          Вот тут не до конца понимаю, а нужно ли тут делать перегрузку, если у нас все параметры определяются
          в своих классах и из конструктора мы ничего не берем
     } */

     public Animal(String name){
          this.name = name;

     }
     public double setRun() {return run;}
     public double setSwim(){return swim;}
     public double setJump(){return jump;}

     public void runDistance(int distance){ //Животные бегут дистанцию

          if (distance <= run)
               System.out.println(name + " Пробежал дистанцию " + distance + " м" + "| может пробежать " + run);
          else System.out.println(name + " Не побежал дистанцию " + distance + " м" + "| может пробежать " + run);

     }
     public void swimDistance(int distance){ //Животные плывут дистанцию

          if (distance <= swim)
               System.out.println(name + " Проплыл дистанцию " + distance + " м" + "| может проплыть " + swim);
          else System.out.println(name + " Не проплыл дистанцию " + distance + " м" + "| может проплыть " + swim);

     }
     public void jumpBarrier(int barrier){ //Животные прыгают через препятствия

          if (barrier <= jump)
               System.out.println(name + " Перепрыгнул препятствие " + barrier + " м" + "| может прыгнуть на высоту " + jump);
          else System.out.println(name + " Не перепрыгнул препятствие " + barrier + " м" + "| может прыгнуть на высоту " + jump);

     }
}
