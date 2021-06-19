import java.util.Arrays;
import java.util.UUID;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.Random;
import java.math.BigInteger;
import java.util.Random; 



public class ScramblersTV3 {
    public static void main(String[] args) throws Exception { 
             
    // for(long o = (long )(Math.random()); o < 1; o++){
    for(long o = (long )(Math.random()); o < 1;){
    
    int maxa = 99;
    int mina = 10;
    int range = maxa - mina + 1;
    int pot = (int)(Math.random() * range) + mina;
      
      
    int maxa16 = 99;
    int mina16 = 10;
    int range16 = maxa16 - mina16 + 0;
      
    int maxa1 = 99;
    int mina1 = 10;
    int pot1 = maxa1 - mina1 + 0;
    
    int maxa2 = 99;
    int mina2 = 10;
    int pot2 = maxa1 - mina1 + 0;
           
    int maxa21 = 99;
    int mina21 = 10;
    int range21 = maxa21 - mina21 + 0;
      
    int maxa17 = 99;
    int mina17 = 10;
    int range17 = maxa17 - mina17 + 0;
      
    int maxa12 = 99;
    int mina12 = 10;
    int range12 = maxa12 - mina12 + 0;
      
    int maxa7 = 99;
    int mina7 = 10;
    int range7 = maxa7 - mina7 + 0;
      
    int maxa9 = 99;
    int mina9 = 10;
    int range9 = maxa9 - mina9 + 0;
    // i1 = i.intValue();
    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
      
      for ( int n = 1 ; n <= 52; n = n+1 ){
       // System.out.println(pot);
      int aa1 = (int)(Math.random() * range9) + mina;  
      int aa2 = (int)(Math.random() * range12) + mina;
        
      int aa3 = (int)(Math.random() * range21) + mina;
      int aa4 = (int)(Math.random() * range16) + mina;
    int maxas = 99;
    int minas = 10;
    int range50 = maxas - minas + 0; 
      
      BigInteger ir1 = BigInteger.valueOf(aa1);
      BigInteger ir2 = BigInteger.valueOf(aa2);
      BigInteger ir3 = BigInteger.valueOf(aa3);
      BigInteger ir4 = BigInteger.valueOf(aa4);
      BigInteger bi1 = new BigInteger("2");
      BigInteger bi2 = new BigInteger("3");  
      BigInteger bi3 = new BigInteger("5");
    int aa5 = (int)(Math.random() * range9) + minas;
    int aa6 = (int)(Math.random() * range21) + minas;
    int aa7 = (int)(Math.random() * range21) + minas;
    int aa8 = (int)(Math.random() * range9) + minas;
    BigInteger eighta1 = BigInteger.valueOf(aa5);
    BigInteger eighta2 = BigInteger.valueOf(aa6);
    BigInteger eighta3 = BigInteger.valueOf(aa7);
    BigInteger eighta4 = BigInteger.valueOf(aa8);
      // create 3 Integer objects
      int i1, i2, i3, i7;
        
              
        // create first number
         
         i1 = ir1.intValue();
         //  System.out.println("" + i1 + "");
        //   System.out.println(" here 1 ");
            
          
         if (i1 > 99 | i1 < 0) {
          
         BigInteger irreg = BigInteger.valueOf(i1); 
          BigInteger obj3 = bi1.add(irreg);
          i1 = obj3.intValue();
          // System.out.println("" + i1 + "");
            
         //  System.out.println(" here 2 ");         
          
          if  (i1 < 0 ) {
          irreg = BigInteger.valueOf(i1);
          BigInteger obj2 = irreg.subtract(irreg);
          BigInteger obj4 = irreg.add(obj2);
          i1 = obj4.intValue();
         
            if (i1 > 99){
              irreg = BigInteger.valueOf(i1);
            BigInteger obj5 = obj4.subtract(irreg);
            i1 = obj5.intValue();
               }
            else {}
                    
            if (i1 < 0)    {
            irreg = BigInteger.valueOf(i1);
            BigInteger obj5 = obj4.add(irreg);
            i1 = obj5.intValue();
                }
            else {}  
            
            if (i1 > 99){
              irreg = BigInteger.valueOf(i1);
            BigInteger obj5 = obj4.subtract(irreg);
            i1 = obj5.intValue();
               }
            else {}
            if (i1 > 99){
              irreg = BigInteger.valueOf(i1);
            BigInteger obj5 = obj4.subtract(irreg);
            i1 = obj5.intValue();
               }
            else {
            }        
            if (i1 < 0)    {
            irreg = BigInteger.valueOf(i1);
            BigInteger obj5 = obj4.add(irreg);
            i1 = obj5.intValue();
                }
            else {}
            if (i1 > 99){
              irreg = BigInteger.valueOf(i1);
            BigInteger obj5 = obj4.subtract(irreg);
            i1 = obj5.intValue();
               }
            else {
            }        
            if (i1 < 0)    {
            irreg = BigInteger.valueOf(i1);
            BigInteger obj5 = obj4.add(irreg);
            i1 = obj5.intValue();
                }
            else {} 
            if (i1 > 99){
              irreg = BigInteger.valueOf(i1);
            BigInteger obj5 = obj4.subtract(irreg);
            i1 = obj5.intValue();
               }
            else {
            }        
            if (i1 < 0)    {
            irreg = BigInteger.valueOf(i1);
            BigInteger obj5 = obj4.add(irreg);
            i1 = obj5.intValue();
                }
            else {}   
            if (i1 < 0)    {
            irreg = BigInteger.valueOf(i1);
            BigInteger obj5 = obj4.add(irreg);
            i1 = obj5.intValue();
                }
          }
          
          else {}        
         
          }
          else {  
          }    

              
          
            
           // end of if-else
               
    
        if  (i1 > 100) {
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta4.subtract(its2);
        i1 = akta2.intValue();
          }
        else {}
        if (i1 < 10){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta1.add(its2);
        i1 = akta2.intValue();
           }
        else {}
        if (i1 > 99){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta2.subtract(its2);
        i1 = akta2.intValue();
           }
        else {}    
        if (i1 < 10){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta3.add(its2);
        i1 = akta2.intValue();
           }
        else {}
        if (i1 > 99){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta4.subtract(its2);
        i1 = akta2.intValue();
           }
        else {}                      
        if (i1 < 10){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta3.add(its2);
        i1 = akta2.intValue();
           }
        else {}
        if (i1 > 99){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta4.subtract(its2);
        i1 = akta2.intValue();
           }
        else {}   
      
        if  (i1 < 99 & i1 > 10) {
          
         //  System.out.println("" + i1 + "");
         // System.out.println(" here 7 ");
                      
           
          if (i1 > 99){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta1.subtract(its2);
        i1 = akta2.intValue();
           }
        else {}
        if (i1 < 10){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta2.add(its2);
        i1 = akta2.intValue();
           }
        else {}
        if (i1 > 99){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta3.subtract(its2);
        i1 = akta2.intValue();
           }
        else {}
         if (i1 < 10){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta4.add(its2);
        i1 = akta2.intValue();
           }
        else {} 
        if (i1 < 10){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta4.add(its2);
        i1 = akta2.intValue();
           }
        else {}
        if (i1 > 99){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta3.subtract(its2);
        i1 = akta2.intValue();
           }
        else {}
        if (i1 > 99){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta3.subtract(its2);
        i1 = akta2.intValue();
           }
        else {}  
        if (i1 < 10){
        BigInteger its2 = BigInteger.valueOf(i1);
        BigInteger akta2 = eighta4.add(its2);
        i1 = akta2.intValue();
           }
        else {}
          }
         
        
         // System.out.println("" + i1 + "");
        
      
   if (n > 0)
    {
 
        // Creating an empty HashMap
       // Mapping string values to int keys
  //  hash_map.put(n, ""+ i1 +"");
    String returned_value = (String)hash_map.put(n, "" + i1 + "");
        // Displaying the HashMap
     //  System.out.println("Initial Mappings are: " + hash_map);
     //    int foo = Integer.parseInt(returned_value);
        // Inserting existing key along with new value
      // String returned_value = (String)hash_map.put(20, "All");
   // String returned_value = (String)hash_map.put(15, "All");
        // Verifying the returned value
   // System.out.println("Returned value is: " + returned_value);
 
        // Displaying the new map
    //   System.out.println("New map is: " + hash_map);
    //       System.out.println(" here 8 ");
          
     // hasmaprunning  
    }
   /**    int foo;
        try {
             
        }
        catch (NumberFormatException e)
        {
   foo = 0;
        }
      
   // hashmaprunned 
      
          }
                  
   // hashmap run off - with old
 
    **/    
        else {
          } }
        
  for (int n = 1 ; n <= 1; n = n+1 ){
      
  //  System.out.println("New map is: " + hash_map);
  String returning_value = (String)hash_map.put(1, "All");
 //  System.out.println("Returned value is: " + returning_value);
        
   int d1 = Integer.parseInt(returning_value);
                   
   returning_value = (String)hash_map.put(2, "All");
 //  System.out.println("Returned value is: " + returning_value);
    int d2 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(3, "All");
 //   System.out.println("Returned value is: " + returning_value);
   int d3 = Integer.parseInt(returning_value);
      
   returning_value = (String)hash_map.put(4, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d4 = Integer.parseInt(returning_value);
      
   returning_value = (String)hash_map.put(5, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d5 = Integer.parseInt(returning_value);
      
   returning_value = (String)hash_map.put(6, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d6 = Integer.parseInt(returning_value);
      
   returning_value = (String)hash_map.put(7, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d7 = Integer.parseInt(returning_value);
      
   returning_value = (String)hash_map.put(8, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d8 = Integer.parseInt(returning_value);
      
   returning_value = (String)hash_map.put(9, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d9 = Integer.parseInt(returning_value);
      
   returning_value = (String)hash_map.put(10, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d10 = Integer.parseInt(returning_value);
      
   returning_value = (String)hash_map.put(11, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d11 = Integer.parseInt(returning_value);
        
   returning_value = (String)hash_map.put(12, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d12 = Integer.parseInt(returning_value);
        
   returning_value = (String)hash_map.put(13, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d13 = Integer.parseInt(returning_value);
        
returning_value = (String)hash_map.put(14, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d14 = Integer.parseInt(returning_value);
        
returning_value = (String)hash_map.put(15, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d15 = Integer.parseInt(returning_value);
        
returning_value = (String)hash_map.put(16, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d16 = Integer.parseInt(returning_value);              

returning_value = (String)hash_map.put(17, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d17 = Integer.parseInt(returning_value); 
        
  returning_value = (String)hash_map.put(18, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d18 = Integer.parseInt(returning_value); 
        
        returning_value = (String)hash_map.put(19, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d19 = Integer.parseInt(returning_value); 
        
        returning_value = (String)hash_map.put(20, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d20 = Integer.parseInt(returning_value); 
        
        returning_value = (String)hash_map.put(21, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d21 = Integer.parseInt(returning_value); 
        
        returning_value = (String)hash_map.put(22, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d22 = Integer.parseInt(returning_value); 
        
        returning_value = (String)hash_map.put(23, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d23 = Integer.parseInt(returning_value); 
        
        returning_value = (String)hash_map.put(24, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d24 = Integer.parseInt(returning_value); 
        
        returning_value = (String)hash_map.put(25, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d25 = Integer.parseInt(returning_value); 
        
        returning_value = (String)hash_map.put(26, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d26 = Integer.parseInt(returning_value); 
        
        returning_value = (String)hash_map.put(27, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d27 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(28, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d28 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(29, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d29 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(30, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d30 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(31, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d31 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(32, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d32 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(33, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d33 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(34, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d34 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(35, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d35 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(36, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d36 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(37, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d37 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(38, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d38 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(39, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d39 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(40, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d40 = Integer.parseInt(returning_value); 
      returning_value = (String)hash_map.put(41, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d41 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(42, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d42 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(43, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d43 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(44, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d44 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(45, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d45 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(46, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d46 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(47, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d47 = Integer.parseInt(returning_value); 
        returning_value = (String)hash_map.put(48, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d48 = Integer.parseInt(returning_value); 
         returning_value = (String)hash_map.put(49, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d49 = Integer.parseInt(returning_value);      
   returning_value = (String)hash_map.put(50, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d50 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(51, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d51 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(52, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d52 = Integer.parseInt(returning_value);
   /**
   returning_value = (String)hash_map.put(53, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d53 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(54, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d54 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(55, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d55 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(56, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d56 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(57, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d57 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(58, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d58 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(59, "All");
   // System.out.println("Returned value is: " + returning_value);
   /** 
   int d59 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(60, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d60 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(61, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d61 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(62, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d62 = Integer.parseInt(returning_value); 
   /** 
   returning_value = (String)hash_map.put(63, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d63 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(64, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d64 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(65, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d65 = Integer.parseInt(returning_value);      
   returning_value = (String)hash_map.put(66, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d66 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(67, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d67 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(68, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d68 = Integer.parseInt(returning_value);     
   returning_value = (String)hash_map.put(69, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d69 = Integer.parseInt(returning_value);     
   returning_value = (String)hash_map.put(70, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d70 = Integer.parseInt(returning_value);     
   returning_value = (String)hash_map.put(71, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d71 = Integer.parseInt(returning_value);    
   returning_value = (String)hash_map.put(72, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d72 = Integer.parseInt(returning_value);  
   returning_value = (String)hash_map.put(73, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d73 = Integer.parseInt(returning_value);
   returning_value = (String)hash_map.put(74, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d74 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(75, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d75 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(76, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d76 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(77, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d77 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(78, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d78 = Integer.parseInt(returning_value);   
   returning_value = (String)hash_map.put(79, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d79 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(80, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d80 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(81, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d81 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(82, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d82 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(83, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d83 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(84, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d84 = Integer.parseInt(returning_value); 
   returning_value = (String)hash_map.put(85, "All");
   // System.out.println("Returned value is: " + returning_value);
   int d85 = Integer.parseInt(returning_value); 
   **/   
   
    System.out.println("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16 + d17 + d18 + d19 + d20 + d21 + d22 + d23 + d24 + d25 + d26 + d27 + d28 + d29 + d30 + d31 + d32 + d33 + d34 + d35 + d36 + d37 + d38 + d39 + d40 + d41 + d42 + d43 + d44 + d45 + d46 + d47 + d48 + d49 + d50 + d51 + d52 + "");      
   }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               // thread.sleep(0,5);  
                     // d63 + d64 + d65 + d66 + d67 + d68 + d69 + d70 + d71 + d72 + d73 + d74 + d75 + d76 + d77 + d78 + d79 + d80 + d81 + d82 + d83 + d84 + d85 +
  
   /**  
    for ( int n = 1 ; n <= 0; n = n+1 ){  
    int maxasa = 99;
    int minasa = 10;
    int range501 = maxasa - minasa + 0;
    int aa5 = (int)(Math.random() * range501) + minasa;
    int aa6 = (int)(Math.random() * range501) + minasa;
    int aa7 = (int)(Math.random() * range501) + minasa;
    int aa8 = (int)(Math.random() * range501) + minasa;
    BigInteger eighta1 = BigInteger.valueOf(aa5);
    BigInteger eighta2 = BigInteger.valueOf(aa6);
    BigInteger eighta3 = BigInteger.valueOf(aa7);
    BigInteger eighta4 = BigInteger.valueOf(aa8);
   
    int its1;
       if (aa5 > 0){
        BigInteger akta3 = eighta1.add(eighta2);
        BigInteger akta = eighta3.subtract(akta3);
        its1 = akta.intValue();
      
        if (its1 < 10){
        BigInteger its2 = BigInteger.valueOf(its1);
        BigInteger akta2 = eighta1.add(its2);
        its1 = akta2.intValue();
           }
        else {}
        if (its1 > 99){
        BigInteger its2 = BigInteger.valueOf(its1);
        BigInteger akta2 = eighta1.subtract(its2);
        its1 = akta2.intValue();
           }
        else {}
        
        if (its1 < 10){
        BigInteger its2 = BigInteger.valueOf(its1);
        BigInteger akta2 = eighta1.add(its2);
        its1 = akta2.intValue();
           }
        else {}
        if (its1 > 99){
       BigInteger its2 = BigInteger.valueOf(its1);
        BigInteger akta2 = eighta1.subtract(its2);
        its1 = akta2.intValue();
           }
        else {}
        if (its1 < 10){
        BigInteger its2 = BigInteger.valueOf(its1);
        BigInteger akta2 = eighta1.add(its2);
        its1 = akta2.intValue();
           }
        else {}
        if (its1 > 99){
        BigInteger its2 = BigInteger.valueOf(its1);
        BigInteger akta2 = eighta1.subtract(its2);
        its1 = akta2.intValue();
           }
        else {}
        if (its1 < 10){
        BigInteger its2 = BigInteger.valueOf(its1);
        BigInteger akta2 = eighta1.add(its2);
        its1 = akta2.intValue();
           }
        else {}
        if (its1 > 99){
        BigInteger its2 = BigInteger.valueOf(its1);
        BigInteger akta2 = eighta1.subtract(its2);
        its1 = akta2.intValue();
           }
        else {}
           System.out.println("" + its1 + "");
           System.out.println(" here lucky one ");
        
        }
        
        else {} 
      **/ 
       
     }}
                            
}   
