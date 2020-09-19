package com.dailybyte;

class BinaryAddition {
    public static String addBinary(String a, String b) {
        
        if(a.equals("") || a == null)   return b;
        if(b.equals("") || b == null)   return a;
    
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        while( i >= 0 || j >= 0){
            sum = carry;
            if(i >= 0)
                sum += a.charAt(i--) - '0';
            if(j >= 0)
                sum += b.charAt(j--) - '0';
            
            sb.insert(0, sum % 2);  // Insert digit at left/starting of output String
                                    // If Sum is 0 : insert 0, if Sum is 1 : insert 1 
                                    //if Sum is 2 : insert 0 and Carry as 1 in next step
        
            carry = sum / 2; //if sum is 2, carry will be 1. If sum is 1 or 0, carry will be 0 
         }

        if( carry > 0)
            sb.insert(0,1);

        return sb.toString();
    }
    
    public static void main(String[] args) {
    	System.out.println(addBinary("100","1")); // Return "101"
    	System.out.println(addBinary("11","1"));  // Return "100"
    	System.out.println(addBinary("1","0"));	  // Return "1"
	}
}
