package com.bridgelabz.dsprograms;

import java.io.*;
import java.util.*;
import com.bridgelabz.utility.Util;

public class Calender
{
   public static void main(String[] args) 
   {
       int month = Integer.parseInt(args[0]);    
       int year = Integer.parseInt(args[1]);     
       Util.dispCalender(month,year);
   }
}