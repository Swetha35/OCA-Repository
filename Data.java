package com.strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Data
{
    int value;
    Data(int value)//Constructor
    {  
      this.value = value;//refering the same vale
    }
    public String toString()
    {
return ""+value;
     }
 //predicate syntax : returntype  methodname(ArrayList<classname>variable,Pridicate<Classname>Variable)
public  void filterData(ArrayList<Data> dataList, Predicate<Data> p)
{
   Iterator<Data> i = dataList.iterator();
   while(i.hasNext())
   {
        if(p.test(i.next()))
        {
             i.remove();
    }
   }
}
/*Data d = new Data(1);
al.add(d);
d = new Data(2);
al.add(d);
d = new Data(3);
 al.add(d);

System.out.println(al);
}*/
}