public class ArrayReview
{

    /**
     * Write a method that will return a String with the name 
     * of each employee from a given array (separated by a space) 
     * who has been with the company for over 20 years.   
     * Assume there are no null employees in the array.
     * IMPORTANT:  Use a regular for loop. 
     */
    public static String getNames(Employee[] employees)
    {
      String names = "";
      for(int i =0; i<employees.length; i++){
        if(employees[i].getYears()>20){
          names = names + employees[i].getName() + " ";
        }
      }
      names.trim();
      return names;
        
    }

    /**
     * Suppose that nums is an array of doubles.  
     * Write a method that will find the average of 
     * only the positive numbers in the array.   
     * IMPORTANT:  Use an enhanced for loop.
     */
    public static double average(double[] nums)
    {
        int count = 0;
        int sum = 0;
        double average;
        for(double v: nums){
          if(v>0){
            count++;
            sum+=v;
          }
        }

        if (sum>0.0){
          average = sum/count;
          return average;
        }
        else{
        return 0.0;
        }
    }
}
