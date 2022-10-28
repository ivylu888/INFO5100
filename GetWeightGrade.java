public class GetWeightGrade {

  private double pointTotal;
  private double earnedPoints;
  private double percentage;
  private double totalWeightedGrade;

  //since those three variable are private
  public void setPointTotal(double pointTotal) {
    this.pointTotal = pointTotal;
  }

  public void setEarnedPoints(double earnedPoints) {
    this.earnedPoints = earnedPoints;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  //calculate the Weight
  public void calculatorWeight(){
    totalWeightedGrade = earnedPoints / pointTotal * percentage;
  }

  //return the value
  public double getTotalWeightedGrade() {
    return totalWeightedGrade;
  }
}
