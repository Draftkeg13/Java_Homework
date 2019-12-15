package ru.geekbrains.java_one.lesson_d.online;

public class Main {


    public static void main(String[] args){
  // Для четвёртого задания
        Emploe dir = new Emploe("Иванов Фёдор Геннадиевич", "Директор", "891111", 60000, 1969 );
        Emploe buh = new Emploe("Иванова Фёдора Геннадиевна", "Бухгалтер", 60000, 1979 );
        Emploe eng = new Emploe("Сидоров Пётр Иванович", "Инженер", "89859858585", 30000, 1999 );
        Emploe stud = new Emploe("Михаилов Иван Иванович", "Стажер", 20000, 2001);
        Emploe clean = new Emploe("Саруман Айгуль Фаридовна", "уборщица", "71111234567", 15000, 1959);


        Emploe[] kartoteka = new Emploe[5]; // Для пятого задания
        kartoteka[0] = new Emploe("Иванов Фёдор Геннадиевич", "Директор", "891111", 60000, 1969);
        kartoteka[1] = new Emploe("Иванова Фёдора Геннадиевна", "Бухгалтер", 60000, 1975);
        kartoteka[2] = new Emploe("Сидоров Пётр Иванович", "Инженер", "89859858585", 30000, 1999);
        kartoteka[3] = new Emploe("Михаилов Иван Иванович", "Стажер", 20000, 2001);
        kartoteka[4] = new Emploe("Саруман Айгуль Фаридовна", "уборщица", "71111234567", 15000, 1959);
        for (int i = 0; i < kartoteka.length; i++){ //цикл для вывода информации о сотрудниках старше 40
            kartoteka[i].findOld();
            kartoteka[i].pribavka();
        }

       // getInfo();
        // dir.fullInf();
       // buh.shortInf();

    }
    private void getInfo(Emploe[] kartoteka){
        for (int i = 0; i < kartoteka.length; i++){
            kartoteka[i].fullInf();
        }
    }

}
