package OOPS.Projects.Project5.courses;

import OOPS.Projects.Project5.service.CourseList;

public class Cpp implements CourseList {
    public boolean courseChoice(double amount) {
        System.out.println("CPP course is purchased successfully amount "+amount);
        return true;
    }
}
