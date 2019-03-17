
import java.util.Arrays;
import java.util.Date;
import java.util.Collections;
import java.util.stream.IntStream;


    public class Example {
        public static void main(String args[]) {
            int  myArray[] = {1,2,3};
            System.out.println(Arrays.stream(myArray).sum());

            // int total = IntStream.of(myArray).sum();
            //System.out.println(total);
            System.out.println(Arrays.stream(myArray).sum());

            //Date date = new Date();
            // System.out.println(date.toString());
        }



    }


