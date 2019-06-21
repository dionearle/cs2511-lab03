package unsw.enrolment.test;

import java.time.DayOfWeek;
import java.time.LocalTime;

import unsw.enrolment.Course;
import unsw.enrolment.CourseOffering;
import unsw.enrolment.Enrolment;
import unsw.enrolment.Lab;
import unsw.enrolment.Lecture;
import unsw.enrolment.Student;
import unsw.enrolment.Tutorial;

public class EnrolmentTest {

    public static void main(String[] args) {

        // Create courses
        Course comp1511 = new Course("COMP1511", "Programming Fundamentals");
        Course comp1531 = new Course("COMP1531", "Software Engineering Fundamentals");
        comp1531.addPrereq(comp1511);
        Course comp2521 = new Course("COMP2521", "Data Structures and Algorithms");
        comp2521.addPrereq(comp1511);

        CourseOffering comp1511Offering = new CourseOffering(comp1511, "19T1");
        CourseOffering comp1531Offering = new CourseOffering(comp1531, "19T1");
        CourseOffering comp2521Offering = new CourseOffering(comp2521, "19T2");

        // TODO Create some sessions for the courses
        Lecture comp1511Tue = new Lecture("UNSW", DayOfWeek.TUESDAY, LocalTime.of(10, 00), LocalTime.of(12, 00), "jeff");
        Lab comp1531Wed = new Lab("UNSW", DayOfWeek.WEDNESDAY, LocalTime.of(16, 00), LocalTime.of(19, 00), "jeff", "chef");
        Tutorial comp2521Fri = new Tutorial("UNSW", DayOfWeek.FRIDAY, LocalTime.of(8, 30), LocalTime.of(9, 00), "jeff");

        // TODO Create a student
        Student peter = new Student("z5205876");
        
        // TODO Enrol the student in COMP1511 for T1 (this should succeed)
        Enrolment comp1511PeterEnrolment = new Enrolment(comp1511Offering,peter);
        
        // TODO Enrol the student in COMP1531 for T1 (this should fail as they
        // have not met the prereq)
        Enrolment comp1531PeterEnrolment = new Enrolment(comp1531Offering,peter);
        
        // TODO Give the student a passing grade for COMP1511
        comp1511PeterEnrolment.setGrade(90,"HD");
        
        // TODO Enrol the student in 2521 (this should succeed as they have met
        // the prereqs)
        Enrolment comp2521PeterEnrolment = new Enrolment(comp2521Offering,peter);

    }
}
