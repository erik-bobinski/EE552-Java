
public class Student02 {
	
	private String name;
    private String department;
    private String researchInterest;

    public Student02(String d, String ra, String n) {
        department = d;
        researchInterest = ra;
        name = n;
    }

    public void setName(String n) {
        name = n;
    }

    public void setDepartment(String d) {
        department = d;
    }

    public void setResearchInterest(String ra) {
        researchInterest = ra;
    }

    public String getDepartment() {
        return department;
    }

    public String getResearchInterest() {
        return researchInterest;
    }

    //====================================================================================
    public void display() {
        System.out.println("Student: Name= " + name + " department= " + department + " researchInterest= " + researchInterest);
    }
    //=====================================================================================

}
