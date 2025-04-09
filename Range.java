public class Range {

    
} Range implement NumberGroup {

   public int min;
   public int max;


   public int Range ( int min , int max ){
    this.min = min;
    this.max = max;
   }

   public boolean contains(int nums){
    return num>= min && num<= max;
   }
    
}
