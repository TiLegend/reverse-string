package app;

import utils.CommonStringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Tlegen on 05.12.2017.
 */
public class AppRun {

    public static void main(String[] args) {
        CommonStringUtils commonStringUtils = new CommonStringUtils();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input word:");
        String word = scanner.nextLine();
        System.out.println(word);
        System.out.println(commonStringUtils.reverse(word));
        List<Integer> repeatCounts = Arrays.asList(1000,10000,100000);
        repeatCounts.forEach(count ->{
            long startTime = System.currentTimeMillis();
            for (int i=0; i<count; i++)
                commonStringUtils.reverse(word);
            long endTime   = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println(totalTime);
        });


    }
}
