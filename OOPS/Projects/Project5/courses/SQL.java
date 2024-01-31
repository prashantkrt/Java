package OOPS.Projects.Project5.courses;

import OOPS.Projects.Project5.service.CourseList;

public class SQL implements CourseList {
    public boolean courseChoice(double amount) {
        System.out.println("SQL course is purchased successfully amount " + amount);
        return true;
    }
}
