package com.imooc;


public class love {

/**

* @author man

* @version 1.0

*/

public static void main(String[] args) {

System.out.println(callBack("*"));

System.out.println(callBack("O"));

}

public static String callBack(String input){

int[] array = {0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 4, 5, 2, 3, 4, 1, 0, 1,

            0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

StringBuffer sb = new StringBuffer();

for (int i = 0; i < array.length; i++) {

if(i % 7 == 0)

sb.append("  \n");

if(array[i] == 0)

sb.append("   ");

else if(array[i] == 4)

sb.append("  ");

else if(array[i] == 5)

sb.append(" ÎÒ ");

else if(array[i] == 2)

sb.append("°® ");

else if(array[i] == 3)

sb.append("Äã");

else

sb.append("  "+input);

}

return sb.toString();

}

}
