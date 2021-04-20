package lab2;

import lab2.AdvancedJavaCourse;
import lab2.Course;
import lab2.IntroJavaCourse;
import lab2.IntroToProgrammingCourse;

public class Driver {

    public static void main(String[] args) {

        Course course1 = new AdvancedJavaCourse("Java 2", "333");
        System.out.println(course1.getCourseNumber());

        Course course2 = new IntroJavaCourse("Intro To Java", "101");
        System.out.println(course2.getCourseNumber());

        Course course3 = new IntroToProgrammingCourse("Intro To Programming with Python", "102");
        System.out.println(course3.getCourseNumber());

        // I dont like this compared the the superclass example. It is a lot of extra work to re-implement the same function with the same functionality 3 times when it could have just been inherited
        // as for Liskov Substitution its hard for me to understand, but some classes dont seem to work because they require prerequisites so it sort of breaks the Liskov Substitution
    }
}
