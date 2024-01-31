package OOPS.Projects.Project5.service;

public class ProcessCourse {
    private CourseList course;

    public ProcessCourse(CourseList course) {
        this.course = course;
    }

    public void setCourse(CourseList course) {
        this.course = course;
    }

    public void processCourse(double amount) {
        boolean status = course.courseChoice(amount);
        if (status)
            System.out.println("Course purchased successfully");
        else
            System.out.println("Error in processing the course enrollment");
    }
}
