import java.util.Scanner;

class Patient {
    String name;
    double weight;
    double height;
    Patient(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Petient name: ");
        name = in.nextLine();

        System.out.println("Enter your Weight: ");
        weight = in.nextDouble();

        System.out.println("Enter your height: ");
        height = in.nextDouble();

    }

    void bmi()
    {
        double bmi;
        bmi = (weight/(height*height))*703;
        System.out.println("Your Enter Name "+name);
        System.out.println("Your Enter Weight "+weight);
        System.out.println("Your Enter Height "+height);
        System.out.println("Your Enter Bmi is  "+bmi);

    }

}
class Main {
    public static void main(String[] args) {

        Patient obj = new Patient();
        obj.bmi();
    }

}


