package Method;
public class Utils {
    // method dynamic
    public static int sum(int...numbers){
        int sum =0 ;
        for(int number : numbers){
            sum +=number;
        }
        return sum;
    }
}
