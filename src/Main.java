public class Main {
    public static void main(String[] args) {
        //Задание 1-1
        System.out.println("Задание 1-1");
        int person1Age = 25;
        System.out.println("Пользователю " + person1Age + " лет");
        if (person1Age >= 18) {
            System.out.println("Поздравляем пользователя с совершенолетием!");
        }
        if (person1Age < 18) {
            System.out.println("Для пользователя возраст совершенолетия еще не наступил. Вам нужно немного подождать!");
        }
        System.out.println();
        // Задание 2-1
        System.out.println("Задание 2-1");
        int person2Age = 26;
        System.out.println("Некоторому человеку " + person2Age + " лет");
        if (person2Age < 7) {
            System.out.println("Этот человек - ребенок младше семи лет - в школу еще рано");
        }
        if (person2Age >= 7 && person2Age < 18) {
            System.out.println("Этот человек - ребенок. Ему уже исполнилось семь лет - он может ходить в школу");
        }
        if (person2Age >= 18 && person2Age < 24) {
            System.out.println("Этот человек уже закончил школу и может отправляться в университет");
        }
        if (person2Age > 24) {
            System.out.println("Этот человек окончил университет и ему пора искать первую работу");
        }
        System.out.println();
        // Задание 3-1
        System.out.println("Задание 3-1");
        int numberPeopleIntoCarriage = 119;
        if (numberPeopleIntoCarriage <= 60) {
            System.out.println("Сейчас в вагоне " + numberPeopleIntoCarriage + " человек, имеются свободные сидячие и стоячие места");
        }
        if (numberPeopleIntoCarriage > 60 && numberPeopleIntoCarriage <= 102) {
            System.out.println("Сейчас в вагоне " + numberPeopleIntoCarriage + " человек, имеются свободные стоячие места");
        }
        if (numberPeopleIntoCarriage > 102) {
            System.out.println("Сейчас в вагоне " + numberPeopleIntoCarriage + " человек, вагон полностью забит, свободных мест нет");
        }
        System.out.println();
        // Задание 1-2
        System.out.println("Задание 1-2");
        System.out.println("Пользователю " + person1Age + " лет");
        if (person1Age >= 18) {
            System.out.println("Поздравляем пользователя с совершенолетием!");
        } else {
            System.out.println("Для пользователя возраст совершенолетия еще не наступил. Вам нужно немного подождать!");
        }
        System.out.println();
        // Задание 2-2
        System.out.println("Задание 2-2");
        System.out.println("Некоторому человеку " + person2Age + " лет");
        if (person2Age < 7) {
            System.out.println("Этот человек - ребенок младше семи лет - в школу еще рано");
        } else {
            if (person2Age >= 7 && person2Age < 18) {
                System.out.println("Этот человек - ребенок. Ему уже исполнилось семь лет - он может ходить в школу");
            } else {
                if (person2Age >= 18 && person2Age < 24) {
                    System.out.println("Этот человек уже закончил школу и может отправляться в университет");
                } else {
                    System.out.println("Этот человек окончил университет и ему пора искать первую работу");
                }
            }
        }
        System.out.println();
        // Задание 3-2
        System.out.println("Задание 3-2");
        if (numberPeopleIntoCarriage <= 60) {
            System.out.println("Сейчас в вагоне " + numberPeopleIntoCarriage + " человек, имеются свободные сидячие и стоячие места");
        } else {
            if (numberPeopleIntoCarriage > 60 && numberPeopleIntoCarriage <= 102) {
                System.out.println("Сейчас в вагоне " + numberPeopleIntoCarriage + " человек, имеются свободные стоячие места");
            } else {
                System.out.println("Сейчас в вагоне " + numberPeopleIntoCarriage + " человек, вагон полностью забит, свободных мест нет");
            }
        }
        System.out.println();
        // Задание 4
        System.out.println("Задание 4. В какое учреждение нужно отправить человека в зависимости от его возраста?");
        int age = 14;
        boolean children = (age >= 2 && age <= 6);
        boolean scoolChild = (age > 6 && age <= 18);
        boolean student = (age > 18 && age <= 24);
        ;
        boolean adult = (age > 24);
        if (children) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад");
        } else {
            if (scoolChild) {
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу");
            } else {
                if (student) {
                    System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет");
                } else {
                    if (adult) {
                        System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить на работу");
                    }
                }
            }
        }
        System.out.println();
        // Задание 5
        System.out.println("Задание 5. Можно ли ребенку кататься одному?");
        int childrenAge = 14;
        boolean canNot = (childrenAge < 5);
        boolean canWithAdult = (childrenAge >= 5 && childrenAge < 14);
        boolean can = (childrenAge >= 14);
        if (canNot) {
            System.out.println("Если возраст ребенка " + childrenAge + " лет, то ему нельзя кататься на аттракционе");
        } else {
            if (canWithAdult) {
                System.out.println("Если возраст ребенка " + childrenAge + " лет, то ему можно кататься на аттракционе вместе со взрослым");
            } else {
                if (can) {
                    System.out.println("Если возраст ребенка " + childrenAge + " лет, то ему можно одному кататься на аттракционе");
                }
            }

        }
        System.out.println();
        // Задание 6
        System.out.println("Задание 6. Определение наибольшего числа");
        int one = 22;
        int two = 111;
        int three = 216;
        System.out.println("Число one имеет значение: "+one);
        System.out.println("Число two имеет значение: "+two);
        System.out.println("Число three имеет значение: "+three);
        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Наибольшее число: " + two);
            } else {
                System.out.println("Наибольшее число: " + three);
            }
        }
    }
}

