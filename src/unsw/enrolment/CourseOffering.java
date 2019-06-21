package unsw.enrolment;
import java.util.ArrayList;
import java.util.List;

public class CourseOffering {

    private Course course;
    private String term;
    private List<Session> sessions;
    private List<Enrolment> enrolments;

    public CourseOffering(Course course, String term) {
        this.course = course;
        this.term = term;
        this.sessions = new ArrayList<>();
        this.enrolments = new ArrayList<>();
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public Course getCourse() {
        return course;
    }

    public String getTerm() {
        return term;
    }
    
    public int getNumCoursePrereqs() {
    	return course.getSizePrereqs();
    }
    
    public String getPrereqCourseCode(int i) {
    	return course.getPrereqCourseCode(i);
    }
    
    public String getCourseCode() {
    	return course.getCourseCode();
    }

}
