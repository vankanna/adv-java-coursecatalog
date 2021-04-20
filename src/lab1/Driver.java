package lab1;

public class Driver {

    public static void main(String[] args) {

        Course course1 = new AdvancedJavaCourse("Java 2", "333");
        System.out.println(course1.getCourseNumber());

        Course course2 = new IntroJavaCourse("Intro To Java", "101");
        System.out.println(course2.getCourseNumber());

        Course course3 = new IntroToProgrammingCourse("Intro To Programming with Python", "102");
        System.out.println(course3.getCourseNumber());

        // declaring the variable type as the superclass is nice because it tells future programmers right away that the class you are implementing extends the superclass

    }
}
