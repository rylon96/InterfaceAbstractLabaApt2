//Incorrect First Attempt Please Move to altLab1Folder for correct code keeping this here to learn from mistakes.
package lab1;



public class IntroToProgrammingCourse extends ProgrammingCourse {
    
    @Override
    public void getCourseName() {
        System.out.println("Course Name:    Introduction to Programming");
    }

    @Override
    public void getCourseNumber() {
        System.out.println("Course Number:  " + 20124);
    }

    @Override
    public void getCredits() {
        System.out.println("Credits:    "+2);
    }

    @Override
    public void getPrerequisites() {
        System.out.println("Prerequisites:  None");
    }

    
}
