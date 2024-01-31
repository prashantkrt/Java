package OOPS.Projects.Project5.main;

import OOPS.Projects.Project5.courses.Cpp;
import OOPS.Projects.Project5.courses.Java;
import OOPS.Projects.Project5.service.ProcessCourse;

public class LaunchMain {
    public static void main(String[] args) {
        ProcessCourse pc = new ProcessCourse(new Cpp());
        pc.setCourse(new Java());
        pc.processCourse(2000);
    }
}
