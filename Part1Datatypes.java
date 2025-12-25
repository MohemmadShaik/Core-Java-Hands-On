class Part1Datatypes {

 public static void main(String args[]){


    byte n1 = 13;
    short n2 = 23425;
    int n3 = 464537644;
    long n4 = 34393003445454l;
    byte a = 20;
    byte b = 15;
    //byte res = a+b; // compilation error all whole numbers operations must return the int type not byte type.
    int res1 = a+b; // Eventhough the sum 20+15 = 35 falls in byte range of -127 to 127, It throws compilation error as 
                   // java by default uses int as the resultant of any whole number
    System.out.println(res1);
 }
}

/*
 * Keynote : 
 * 2. If we perform any of the operation on the whole number the
 *    resultant is always a integer.
 *  1.The default data type of whole number in Java is int
 */