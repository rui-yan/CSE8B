/* Filename: Slide.java
 * Created by: Rui Yan, cs8afbfd and Mengying Li, cs8afabf
 * PID:
 * Rui Yan: A92089334
 * Mengying Li: A92124721
 * 
 * Email: 
 * Rui Yan: r9yan@ucsd.edu, 
 * Mengying Li: mel116@ucsd.edu
 * 
 * Partner Histories:
 * Rui Yan:
 PSA0 Partner:  Shijie Ji, cs8afbdh
 PSA1 Partner:  Shijie Ji, cs8afbdh
 PSA2 Partner:  Shijie Ji, cs8afbdh
 PSA3 Partner:  Shijie Ji, cs8afbdh
 PSA4 Partner:  Mengying Li, cs8afabf
 PSA5 Partner:  Mengying Li, cs8afabf
 PSA6 Partner:  Mengying Li, cs8afabf
 PSA7 Partner:  Mengying Li, cs8afabf
 PSA8 Partner:  Mengying Li, cs8afabf
 
 * Mengying Li:
 PSA0 Partner:  Wendi Wu, cs8afacq
 PSA1 Partner:  David Amadeo, cs8afbcl
 PSA2 Partner:  Xinyu Wu, cs8afafl
 PSA3 Partner:  David Amadeo, cs8afbcl
 PSA4 Partner:  Rui Yan, cs8afbfd
 PSA5 Partner:  Rui Yan, cs8afbfd
 PSA6 Partner:  Rui Yan, cs8afbfd
 PSA7 Partner:  Rui Yan, cs8afbfd
 PSA8 Partner:  Rui Yan, cs8afbfd
 
 * Date: 12/01/2015
 * Due Date:12/01/2015
 */ 
import java.io.*;
import java.util.*;

/**
* Class that describes a student.  A student has a name and an
* array of grades.  You can get information about a student
* such as her/his name and grade average.
*
* @author Barb Ericson ericson@cc.gatech.edu
*/
public class Student
{
  //////////// fields //////////////////
  /** the name of the student: first last */
  private String name;

  /** an array of grades for this student */
  private double[] gradeArray;

  //////////// constructors ///////////

  /**
   * No argument constructor.  Leaves
   * all fields with default values
   */
  public Student() {
    this.name = "Joe Student";
    this.gradeArray = new double[10];
  }

  /**
   * Constructor that takes the name
   * @param theName the student's name
   */
  public Student(String theName)
  {
    this.name = theName;
    this.gradeArray = new double[10];
  }

  /**
   * Constructor that takes the name
   * and an array of grades
   * @param theName the student's name
   * @param theGradeArray the array of grades
   */
  public Student(String theName,
                 double[] theGradeArray)
  {
    this.name = theName;
    this.gradeArray = theGradeArray;
  }

/////////// methods ///////////////

  /**
   * Method to return the name of this student
   * @return the student's name
   */
  public String getName() { return this.name; }

  /**
   * Method to set the name for this student
   * @param theName the new name to use
   * @return true if success else false
   */
  public void setName(String theName)
  {
    this.name = theName;
  }
  /**
   * Method to get the grade in the grade array
   * at the passed index
   * @param index the index that we want the grade for
   * @return the grade in the grade array at this passed index
   */
  public double getGrade(int index)
  {
    return this.gradeArray[index];
  }
  

  /**
   * Method to replace the array of grades
   * @param theArray the new array of grades to use
   * @return true if sucess, else false
   */
  public void setGradeArray(double[] theArray)
  {
    this.gradeArray = theArray;
  }

  /**
   * Method to set a grade at an index
   * @param index the index to set it at
   * @param newGrade the grade to use
   * @return true if success else false
   */
  public void setGrade(int index,
                          double newGrade)
  {
    this.gradeArray[index] = newGrade;
  }

  
  /**
   * Method to return a string with information about this student
   * @return a string with information about the student
   */  public String toString()
  {
    return "Student object named: " + this.name +
           " Average: " + this.getAverage();
  }

  
/***********PART B STARTS HERE**************/
  /**
   * Method to return the average of the grades for this student
   * @return the average of the grades or 0.0 if no grade array or
   * no grades
   */
  public double getAverage()
  {
    double average = 0.0;
  
    double sum = 0.0;
    for (int i = 0; i < this.gradeArray.length; i++)
    {
      sum = sum + this.gradeArray[i];
    }
    average = sum / this.gradeArray.length;
    return average;
  }
}