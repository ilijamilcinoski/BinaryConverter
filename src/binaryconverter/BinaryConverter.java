/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryconverter;

/**
 *
 * @author Ilija
 */
public class BinaryConverter {
    private static Object val;
 public static void main(String[] args){
for (int i=-5; i<33; i++){
System.out.println(i + ": " + toBinary(i));
System.out.println(i+":" +Integer.toBinaryString(i));
//Always other way
System.out.println();
  

 
 }

 }

    private static String toBinary(int base10Num) {
    boolean isNeg = base10Num<0;
    base10Num=Math.abs(base10Num);
    String result="";
    while(base10Num>1){
    result=(base10Num %2)+ result;
    base10Num/=2;
    }
    assert base10Num==0||base10Num==1:"value is not <= 1: \" + base10Num;";
    result=base10Num+result;
    assert all0sAnd1S(result);
    if(isNeg)
        result="-"+result;
        return result;
        
    
    }
     /*
     * pre: cal != null
     * post: return true if val consists only of characters 1 and 0, false otherwise
     */

    private static boolean all0sAnd1S(String result) {
    
     assert val != null : "Failed precondition all0sAnd1s. parameter cannot be null";
        boolean all = true;
        int i = 0;
        char c;
        return false;
       
        
       
       
    }}
    


