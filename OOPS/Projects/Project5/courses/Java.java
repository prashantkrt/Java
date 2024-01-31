package OOPS.Projects.Project5.courses;

import OOPS.Projects.Project5.service.CourseList;

public class Java implements CourseList {
    public boolean courseChoice(double amount) {
        System.out.println("Java course is purchased successfully amount "+amount);
        return true;
    }
}
