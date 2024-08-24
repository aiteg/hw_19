import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Theater<Integer, Person> theater = new Theater<>();
        Person[] persons = new Person[16];
        Integer row = 1;
        int place = 0;

        for(;;) {
            System.out.println("1 - Добавить зрителя \n2 - Удалить зрителя " +
                    "\n3 - Показать зрителей \n4 - Остановить программу");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (place == 16) {
                        row ++;
                        place = 0;
                    }

                    System.out.println("Выберите категорию зрителя и введите его данные" +
                            "\n 1 - Client     2 - Critic    3 - Staff");
                    int num = sc.nextInt();

                    System.out.println("Введите имя и возраст");

                    switch (num) {
                        case 1:
                            persons[place] = new Client(sc.next(), sc.nextInt());
                            place++;
                            break;
                        case 2:
                            persons[place] = new Critic(sc.next(), sc.nextInt());
                            place++;
                            break;
                        case 3:
                            persons[place] = new Staff(sc.next(), sc.nextInt());
                            place++;
                            break;
                        default:
                            System.out.println("Такого выбора нет");
                    }
                    theater.rows.put(row, persons);
                    break;
                case 2:
                    System.out.println("Введите ряд и место зрителя");
                    theater.deleteClient(sc.nextInt(),sc.nextInt());
                    break;
                case 3:
                    theater.checkTickets();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Вы ввели неверную команду");

            }

            if (choice == 4) break;

        }


    }
}