import java.util.Scanner;

public class Weight{

  public static void main(String[] args) {
    GetWeightGrade wg = new GetWeightGrade();
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter point total, Earned Points and assignments:");

    //Read the input
    double pointTotal = myObj.nextDouble();
    double points = myObj.nextDouble();
    double assignment = myObj.nextDouble();
    //Use function
    wg.setPointTotal(pointTotal);
    wg.setEarnedPoints(points);
    wg.setPercentage(assignment);
    wg.calculatorWeight();

    //Get the result
    double WeightGrade = wg.getTotalWeightedGrade();

    //Output
    System.out.println("Total Weighted grade: " +  WeightGrade);



  }

}
