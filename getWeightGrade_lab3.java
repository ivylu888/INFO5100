public class getWeightGrade {

    private double pointTotal;
    private double weight;
    private double earnGrade;

    public void setPointTotal(double pointTotal) {
        this.pointTotal = pointTotal;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEarnGrade(double earnGrade) {
        this.earnGrade = earnGrade;
    }

    //calculate and return the result
    public String setScoreLevel(double totalWeightGrade) {
        String grade = "";
        if (totalWeightGrade <= 100 && totalWeightGrade >= 90) {
            grade = "A";
        }

        if (totalWeightGrade < 90 && totalWeightGrade >= 80.0) {
            grade = "B";
        }

        if (totalWeightGrade < 80 && totalWeightGrade >= 70.0) {
            grade = "C";
        }

        if (totalWeightGrade < 70 && totalWeightGrade >= 60) {
            grade = "D";
        }

        if (totalWeightGrade < 60) {
            grade = "F";
        }

        return grade;
    }
}


