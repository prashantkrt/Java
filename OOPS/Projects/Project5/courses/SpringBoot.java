package OOPS.Projects.Project5.courses;

import OOPS.Projects.Project5.service.CourseList;

public class SpringBoot implements CourseList {
    public boolean courseChoice(double amount) {
        System.out.println("SpringBoot course is purchased successfully amount " + amount);
        return true;
    }
}
