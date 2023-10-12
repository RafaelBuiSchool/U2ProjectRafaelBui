import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        //Asks user for coordinate 1
        System.out.println("This is my Linear equation calculator!\nIf you want to find the distance, slope, y-intercept, slope intercept form or a y value of your coordinates, this is the place for you!\n");
        System.out.println("Enter your first coordinate: ");
        String coordinate1 = s.nextLine();

        //Asks user for coordinate 2
        System.out.println("Enter the second coordinate: ");
        String coordinate2 = s.nextLine();

        //creates new object to find calculations
        LinearEquation xyFormula = new LinearEquation(coordinate1,coordinate2);

        //Prints calculations
        System.out.println(" Your Results are...\n---------------------");
        System.out.println(xyFormula.toString());
        System.out.println(" ");

        //Asks user for x value to find y value and prints corresponding y value
        System.out.println("Enter an x value and we will tell you it's y value on the graph: ");
        double xValue = s.nextDouble();
        String yCoordinate = xyFormula.yValueCalculator(xValue);
        System.out.println(" ");
        System.out.println("Your y-value is...\n---------------------");
        System.out.println("Your coordinate is " + yCoordinate);


    }
}
