package lab1.altLab1;
public abstract class ProgrammingCourse {
   private final String courseName;
   private final String courseNumber;
   private final double credits;
   private final String prerequisites;

    public ProgrammingCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    

    public final String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courseName);
    
    public final String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);
    
    public final double getCredits() {
        return credits;
    }
    
    public abstract void setCredits(double credits);
    
    
    public final String getPrerequisites() {
        return prerequisites;
    }

    public abstract void setPrerequisites(String prerequisites);
    
    
    
    
   
   
}
