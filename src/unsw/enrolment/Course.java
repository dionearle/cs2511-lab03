package unsw.enrolment;
import java.util.ArrayList;
import java.util.List;

/**
 * A course in the enrolment system.
 * @author Robert Clifton-Everest
 *
 */
public class Course {

    private String courseCode;
    private String title;
    private int uoc;
    private List<Course> prereqs;
    private List<CourseOffering> courseOfferings;


    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.prereqs = new ArrayList<Course>();
    }


    public void addPrereq(Course course) {
        prereqs.add(course);
    }
    
    public List<Course> getPrereq() {
        return prereqs;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getUOC() {
        return uoc;
    }
    
    public int getSizePrereqs() {
    	return prereqs.size();
    }
    
    public String getPrereqCourseCode(int i) {
    	return prereqs.get(i).getCourseCode();
    }

}
