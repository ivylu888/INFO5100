import java.util.Scanner;

public class grade {

  public static void main(String[] args) {
    getWeightGrade wg = new getWeightGrade();
    Scanner sc =  new Scanner(System.in);
    double[] allPoint = new double [8];
    double[] allWeightd = new double [8];

    System.out.println("Enter the total point you got: ");
    //read the input
    for(int i = 0; i < allPoint.length; i++){
      allPoint[i] = sc.nextDouble();
    }

    System.out.println("Enter the percentage: ");
    //read the input
    for(int j = 0; j < allPoint.length; j++){
      allWeightd[j] = sc.nextDouble()/100;
    }



    for(double i: allPoint){
      wg.setPointTotal(i);
    }

    for(double i: allWeightd){
      wg.setPointTotal(i);
    }


    //grade[i] * weight[i]
    double[] res = new double[allPoint.length];
    for(int i = 0; i < allPoint.length; i++){
      res[i] = allPoint[i] * allWeightd[i];
    }

    //total of Final grade = sum of all of (grade[i] * weight[i])
    double finalWeightGrade = 0.0;
    for(int i = 0; i < allPoint.length; i++){
      finalWeightGrade += res[i];
    }

    String FinalResult = wg.setScoreLevel(finalWeightGrade);

    //System.out.println(finalWeightGrade);
    System.out.println(FinalResult);
  }
}
