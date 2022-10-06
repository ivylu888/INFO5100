import java.util.Scanner;

public class grade {

  public static void main(String[] args) {
    getWeightGrade wg = new getWeightGrade();
    

    Scanner sc =  new Scanner(System.in);
    double[] allPoint = new double [8];
    double[] allWeightd = new double [8];
    double[] allEarnedPoints = new double [8];
    

    System.out.println("Enter the total point you got: ");
    //read the input
    for(int i = 0; i < allPoint.length; i++){
      allPoint[i] = sc.nextDouble();
    }

    System.out.println("Enter the number of assignments percentage(%): ");
    //read the input
    for(int j = 0; j < allPoint.length; j++){
      allWeightd[j] = sc.nextDouble()/100;
    }

    System.out.println("Enter allEarnedPoints: ");
    //read the input
    for(int j = 0; j < allPoint.length; j++){
      allEarnedPoints[j] = sc.nextDouble();
    }

    
    
    //use the function
    for(double i: allPoint){
      wg.setPointTotal(i);
    }

    for(double i: allWeightd){
      wg.setWeight(i);
    }


    for(double i: allEarnedPoints){
      wg.setEarnGrade(i);
    }


    //earned points / all points * all weighted = 175 / 200 * 0.35

    double[] res = new double[allPoint.length];
    for(int i = 0; i < allEarnedPoints.length; i++){
      res[i] = allEarnedPoints[i] / allPoint[i] * allWeightd[i]*100;

    }

    //total of Final grade = sum of all of (grade[i] * weight[i])
    double finalWeightGrade = 0.0;
    for(int i = 0; i < res.length; i++){
      finalWeightGrade += res[i];
    }

    String FinalResult = wg.setScoreLevel(finalWeightGrade);
    System.out.println("---------YOUR TEST RESULT ----------");
    System.out.println(finalWeightGrade);
    System.out.println(FinalResult);
  }
}
