package org.andestech.learning.rfb19.g4;


import org.andestech.learning.rfb19.g4.utils.Book;

import java.util.*;

import static org.andestech.learning.rfb19.g4.utils.Utils.echo;

class CheckedMap<K,V> extends HashMap<K,V>
{
    public V put(K key, V value)
    {
        if(containsKey(key)) return null;
        return super.put(key,value);
    }

}


public class App
{
    private static <K,V> boolean putChecked(Map<K,V> map, K key, V value ){

        if(map.containsKey(key)) return false;
        map.put(key,value);
        return true;
    }

    public static void main( String[] args )
    {
//      HashSet<Integer> set = new HashSet<>();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

       set.add(123);
       set.add(98098);
       set.add(-234);
       set.add(897987);
       set.add(123);
       set.add(222);
       set.add(-987);


        System.out.println(set);

      // remove dubles

        ArrayList<String> datas = new ArrayList<>(
        Arrays.asList(new String[]{"AA","B","CC2","C","BB","B","CC2", "Z"})
        );

        echo();
        System.out.println(datas);

        Set<String> set2 = new LinkedHashSet<>(datas);
        datas.clear();
        datas.addAll(set2);
        System.out.println(datas);

        String[] arr = new String[datas.size()];
        datas.toArray(arr);

        System.out.println(Arrays.toString(arr));

        //-------------------------------------------------

        System.out.println(Integer.MAX_VALUE);


        HashMap<String, Book> books = new HashMap<>();
      //  CheckedMap<String, Book> books = new CheckedMap<>();
        books.put("super1", new Book("Белое безмолвие","Джек Лондон",1899));
        books.put("super3", new Book("Крейцерова соната","Лев Толстой",1904));
        books.put("super2", new Book("Аэлита","Алексей Толстой",1932));

        String key = "super3";

      //  if(!books.containsKey(key))
        books.put("super3", new Book("AAAA","Лев Толстой",1904));



        System.out.println(books.get("super3"));
        echo();
        for(String s: books.keySet())
        {
            System.out.println(books.get(s));
        }

   //-----------------------------------------------------
      echo('+');
      Vector<Integer> v = new Vector<>(10,5);
      System.out.println(v.capacity() + " : " + v.size());
      for(int i=0; i<9; i++) v.add(new Random().nextInt(100));
      System.out.println(v.capacity() + " : " + v.size());
        v.add(new Random().nextInt(100));
        System.out.println(v.capacity() + " : " + v.size());
        v.add(new Random().nextInt(100));
        System.out.println(v.capacity() + " : " + v.size());



    }
}
