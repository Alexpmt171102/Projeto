import java.util.Scanner;

class ÁreaDoTriângulo {
    public static void main(String args[]){

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the width of the Triangle:");
            double b = s.nextDouble();

            System.out.println("Enter the height of the Triangle:");
            double h = s.nextDouble();

            double area = (b*h)/2;
            System.out.println("Area of Triangle is: " + area);
        }

    }
}