package strings;

public class ex1 {

	public static void main(String[] args) {
       String s1="fgfgf";
       String s2="abc";
       String s3="cde";
       String s4="efg";
       String s5="ghi";
       String s6="fgfgf";
       String s7="fgfgf";
       String s8= new String("abc");
       
       if(s1==s6) {
    	   System.out.println("same location");
       }
       else {
    	   System.out.println("diff location");
       }
       
       if(s2.equals(s8)) {
    	   System.out.println("same value");
       }
       else {
    	   System.out.println("diff value");
       }
       
       

	}

}
