package unsw.enrolment;

public class Enrolment {

    private CourseOffering offering;
    private Grade grade;
    private Student student;

    public Enrolment(CourseOffering offering, Student student) {
    	
    	boolean passed_prereqs = true;
    	int numPrereqs = offering.getNumCoursePrereqs();
    	for (int i=0; i < numPrereqs; i++) {
    		String courseCode1 = offering.getPrereqCourseCode(i);
    		
    		int numEnrolments = student.getNumEnrolments();
    		for (int j=0; j < numEnrolments; j++) {
    			String courseCode2 = student.getEnrolmentCourseCode(j);
    			
    			if (courseCode1 == courseCode2) {
    				int mark = student.getEnrolmentMark(j);
    				if (mark < 50) {
    					passed_prereqs = false;
    				}
    			}
    			
    		}
    	}
    	
    	if (passed_prereqs == true) {
    		this.offering = offering;
            this.student = student;
            this.grade = new Grade(0,"NA");
            this.student.addEnrolment(this);
    		System.out.print("Successfully enrolled in " + offering.getCourseCode() + "\n");
    	} else {
    		System.out.print("Failed to enrol as prerequisites are not met.\n");
    	}
    }

    public Course getCourse() {
        return offering.getCourse();
    }

    public String getTerm() {
        return offering.getTerm();
    }
    
    public Grade getGrade() {
        return grade;
    }
    
    public void setGrade(int mark, String grade) {
    	this.grade.setMark(mark);
    	this.grade.setGrade(grade);
    }
    
    public String getCourseCode() {
    	return offering.getCourseCode();
    }
    
    public int getEnrolmentMark(int i) {
    	return grade.getMark();
    }

}
