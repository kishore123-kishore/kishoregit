package newpackage;

public class NewProjectClass {

	
	public static void main (String[]args) {
		
		String str = "automation testing";
		String str1 = "automation testing";
		
	int	count=str.length();
	System.out.println(count);
		
   char ch = str.charAt(5);
   System.out.println(ch);
	
	int firstindex= str.indexOf(2);
	System.out.println(firstindex);
	
	int Secoundoccurance = str.indexOf("2",firstindex+1);
	System.out.println(Secoundoccurance);
	
     String replacedString = str.replace("testing","training");
     System.out.println(replacedString);
	
     boolean b = str.equals(str1);
     System.out.println(b);
	
	boolean bb = str.equalsIgnoreCase(str1);
	System.out.println(bb);
	
	boolean bbb= str.contains("Testing");
	System.out.println(bbb);
	
	
	
	
	}
	
	
	
	
}
