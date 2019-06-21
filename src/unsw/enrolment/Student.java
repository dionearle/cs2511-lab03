package unsw.enrolment;
import java.util.ArrayList;

public class Student {

    private String zid;
    private ArrayList<Enrolment> enrolments;

	public Student(String zid) {
        this.zid = zid;
        enrolments = new ArrayList<>();
    }

	public String getZID() {
		return zid;
	}
	
	public ArrayList<Enrolment> getEnrolments() {
		return enrolments;
	}

	public String getZid() {
		return zid;
	}

	public void setZid(String zid) {
		this.zid = zid;
	}

	public void addEnrolment(Enrolment enrolment) {
		enrolments.add(enrolment);
	}
	
	public int getNumEnrolments() {
		return enrolments.size();
	}
	
	public String getEnrolmentCourseCode(int i) {
		return enrolments.get(i).getCourseCode();
	}
	
	public int getEnrolmentMark(int i) {
		return enrolments.get(i).getEnrolmentMark(i);
	}

}
