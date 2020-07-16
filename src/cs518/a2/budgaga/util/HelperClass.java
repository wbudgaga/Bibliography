/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs518.a2.budgaga.util;

import java.util.*;

/**
 *
 * @author budgaga
 */
public class HelperClass {
  private static final  String[] MONTHS = {"January","February","March","April",
                                     "May","June","July","August", "September",
                                     "October","November","December"};

   public static int getMonthPos(String monthName){
       for (int i = 0; i < 12 ; ++i)
           if (MONTHS[i].compareToIgnoreCase(monthName)==0)
               return (i+1);
       return -1;
   }

   public static String getMonthName(int monthPos){
       return MONTHS[monthPos - 1];
   }
   public static String getFirstPartValue(String src){
       return removeSpecialCharacters(src.replaceAll("(.+?),(.*)","$1"));     
   }

   public static String removeSpecialCharacters(String src){
       String value = src.replaceAll("[^\\dA-Za-z\\- ]", "");
       return value.trim();
   }
   
   public static String getPartValue(String src,String name){
       if (name.compareToIgnoreCase("year")==0)
          return removeSpecialCharacters(src.replaceAll("(.+?)\\s*,\\s*("+name+")\\s*=\\s*(\\d*)(?)","$3"));
       else
          return removeSpecialCharacters(src.replaceAll("(.+?)\\s*,\\s*("+name+")\\s*=\\s*(.+?),(.*)","$3"));     
   }
}
