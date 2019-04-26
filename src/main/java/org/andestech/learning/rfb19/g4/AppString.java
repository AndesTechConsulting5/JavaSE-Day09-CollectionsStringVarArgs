package org.andestech.learning.rfb19.g4;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.andestech.learning.rfb19.g4.utils.Utils.echo;

public class AppString {

    public static void  main(String[] args)
    {

        String s1 ="Hello!";
        String s2 = new String("Hello!");

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1==s2); // так нельзя сравнивать строки!!!

        //1
        System.out.println(s1.equals(s2));

        //2
        System.out.println(s1.compareTo(s2));

        // String meths
        echo();
        String data = "  Hello!!2131 9898)_ ";
        // trim
        System.out.println(data = data.trim());

        System.out.println(data.substring(0,1));
        System.out.println(data.startsWith("He "));
        System.out.println(data.indexOf("!!"));

        echo();

        String login = "   BasIL ";

        login = login.trim().toUpperCase();
        System.out.println(login);

        String list = "a123123,bad123;jj234,567567 uuu8797,;32423";
      //  String[] listArray = list.split(",;|,|;| ");
        String[] listArray = list.split("[,; ]{1,2}");

        System.out.println(data.startsWith("He "));
        System.out.println(Arrays.toString(listArray));

        // list of integers

        String list2 = "123123,123;234,567567 8797,;32423";
        String[] listArray2 = list2.split("[,; ]{1,2}");

        int[] arr = new int[listArray2.length];
        for (int i =0; i<listArray2.length; i++)
        {
            arr[i] = Integer.parseInt(listArray2[i]);
        }

        System.out.println(Arrays.toString(arr));
        echo('+');

        String phone = "+7(234)-234-44-44";
        String invN = "AAA-1298987-z";
        String patternPhone =
                "^\\+\\d{1,3}\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}$";

        System.out.println(phone.matches(patternPhone));

        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher(list2);
echo('#');
        System.out.println(matcher.matches());

        while (matcher.find())
        {
            System.out.println(matcher.start() +" : " +
                    matcher.group());

        }

echo();
        String res =
                String.format(new Locale("eng"),"Number: %10d, Double: %8.4f, Greets: %s",123,44.4444,"Hello!!");

        System.out.println(res);
        System.out.printf("Greets: %s", "Hi!");


// ABC13123, BVV21312, VVV87987, MHB908809
// сортировка инв. номеров по цифровой части


        ArrayList<String> list3 = new ArrayList<>(10);
        list3.addAll(Arrays.asList(
                new String[]{"ABC13123", "BVV21312", "VVV87987", "MHB908809"}));


        list3.sort( (a,b) -> {

            String sa = a.substring(3);
            String sb = b.substring(3);
            return Integer.parseInt(sa) - Integer.parseInt(sb);
        });
        System.out.println();
        System.out.println(list3);


//---------------------------------------------
// Точные вычисления для чисел с дробной частью

        MathContext mctx = new MathContext(12);

        BigDecimal dec1 = new BigDecimal(1.222, mctx);
        BigDecimal dec2 = new BigDecimal(33333.222, mctx);

        System.out.println( dec1.add(dec2));




    }
}
