public class Assignment4_StudentRecord {
	
	private double quiz1, quiz2, quiz3, midterm, finale, finalPercentage;
	private String finalGrade;

	public void Assignment4_StudentRecord() {
		quiz1=0; quiz2=0; quiz3=0; midterm=0; finale=0;
	}

	public boolean setQuiz1(int i) { //mutator method
		if (i>0 && i<=10) {
			quiz1=i;
			return true;
		}
		else 
			return false;
	}

	public boolean setQuiz2(int i) {//mutator method
		if (i>0 && i<=10) {
			quiz2=i;
			return true;
		}
		else 
			return false;
	}

	public boolean setQuiz3(int i) {//mutator method
		if (i>0 && i<=10) {
			quiz3=i;
			return true;
		}
		else 
			return false;
	}

	public boolean setMidterm(int i) {//mutator method
		if (i>0 && i<=100) {
			midterm=i;
			return true;
		}
		else 
			return false;
	}

	public boolean setFinal(int i) {//mutator method
		if (i>0 && i<=100){  
			finale=i;
			return true;
		}
		else 
			return false;
	}

	public double getQuiz1() {//accessor method
			return quiz1;
	}

	public double getQuiz2() {//accessor method
			return quiz2;
	}

	public double getQuiz3() { //accessor method
			return quiz3;
	}

	public double getMidterm() {//accessor method
			return midterm;
	}

	public double getFinal() {//accessor method
			return finale;
	}

	public void finalGrade() {//weighted calculation and letter grade method
		finalPercentage = ((quiz1/10 + quiz2/10 + quiz3/10)/3*0.25 + midterm/100*0.35 + finale/100*0.4);
		int composite = (int)(finalPercentage*10);
		switch (composite) {
			case 9:
				finalGrade = "A";
				break;
			case 8:
				finalGrade = "B";
				break;
			case 7:
				finalGrade = "C";
				break;
			case 6:
				finalGrade = "D";
				break;
			default:
				finalGrade = "F";
		}
	}

	public float getFinalPercentage(){
		return (float) finalPercentage;
	}
	public String getFinalGrade() {
		return finalGrade;
	}

	public String toString() {
		finalGrade();
		return ("\n" + "Final percentage: " + getFinalPercentage()*100 + "%" 
			+ "\n" + "Final grade: " + getFinalGrade());
	}

	public boolean equals(String letter) {
		if (finalGrade==letter)
			return true;
		else 
			return false;
	}
}
