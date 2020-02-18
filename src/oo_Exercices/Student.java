package oo_Exercices;

public class Student {

	public String name;
	public double notaTrimester_1, notaTrismester_2, notaTrimester_3;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNotaTrimester_1() {
		return notaTrimester_1;
	}

	public void setNotaTrimester_1(double notaTrimester_1) {
		this.notaTrimester_1 = notaTrimester_1;
	}

	public double getNotaTrismester_2() {
		return notaTrismester_2;
	}

	public void setNotaTrismester_2(double notaTrismester_2) {
		this.notaTrismester_2 = notaTrismester_2;
	}

	public double getNotaTrimester_3() {
		return notaTrimester_3;
	}

	public void setNotaTrimester_3(double notaTrimester_3) {
		this.notaTrimester_3 = notaTrimester_3;
	}


	public double totalScore() {
		return  notaTrimester_1 + notaTrismester_2 + notaTrimester_3;
	}
	
	public void getAproved() {
		
		if(totalScore() > 60) {
			System.out.println("FINAL GRADE: " + totalScore());
			System.out.println("PASS");
		}
		else {
			System.out.println("FINAL GRADE: " + totalScore());
			System.out.println("FAILED");
			System.out.println(60 - totalScore());
		}
	}
}
