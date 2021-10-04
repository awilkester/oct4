package main.java;
import java.util.Scanner;

public class Arithmetic {


    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Please input your name: ");
        String name = t.nextLine();
        System.out.println("Please input your age: ");
        int age = t.nextInt();
        t.nextLine();
        System.out.println("Please input your gender: ");
        String gender = t.nextLine();
        System.out.println("Please input your email address: ");
        String email = t.nextLine();
        System.out.println("Please input your job title: ");
        String jobtitle = t.nextLine();
        System.out.println("Please input your company: ");
        String company = t.nextLine();
        System.out.println("Your name is: " + name +"\n" +
                "Your age is: "  + age + "\n" +
                "Your gender is: "  + gender + "\n" +
                "Your email is: "  + email + "\n" +
                "Your jobtitle is: "  + jobtitle + "\n" +
                "Your company is: "  + company + "\n");
    }

}
