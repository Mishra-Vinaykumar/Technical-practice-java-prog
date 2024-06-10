import java.util.Scanner;

class dirPerson {

    static Scanner sc = new Scanner(System.in);

    String nameOfPerson, address, headOfFam;
    int phone;

    void getDetails() {
        System.out.println("Enter your phone ");
        int phone = sc.nextInt();
        System.out.println("Enter your Name ");
        String nameOfPerson = sc.next();
        System.out.println("Enter your Addree ");
        String address = sc.next();
        System.out.println("Enter your head Of Family ");
        String headOfFam = sc.next();
    }

    void PrintDetails() {
        System.out.println("Person Mobile Number is" + phone);
        System.out.println("Name of a Person is " + nameOfPerson);
        System.out.println(",Addrress of a Person is" + address);
        System.out.println("Head of The Family member is" + headOfFam);
    }
}

public class create_dir {

    public static void PrintDetails() {
        return;
    }

    public static void Menu() {
        System.out.println("1.Exit");
        System.out.println("2.Get Person Details :");
        System.out.println("3.Print Details");
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        dirPerson d = new dirPerson();
        int ch;

        do {
            Menu();
            System.out.println("Enter Your choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    // System.exit(0);
                    break;

                case 2:
                    d.getDetails();
                    break;
                case 3:
                    d.PrintDetails();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (ch != 1);
    }
}
