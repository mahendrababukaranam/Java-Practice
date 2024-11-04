package CaseStudy;

import java.util.Arrays;
import java.util.Collections;

class DescendingOrder {
    public static void main(String[] args) {
        Integer[] arr = { 17, 12, 10 };
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int values : arr) {
            System.out.print(values + ", ");
           
        }
        
        
    }
}



