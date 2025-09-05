package project;

public class WrapperClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ValueOf()");
		 Integer I = Integer.valueOf("10"); 
	        System.out.println(I); 
	        
	        Double D = Double.valueOf("10.0"); 
	        System.out.println(D); 
	        
	        Boolean B = Boolean.valueOf("true"); 
	        System.out.println(B+"\n");
	        
	        
	        System.out.println("ParseXxx()");
	        int i = Integer.parseInt("10"); 
	        double d = Double.parseDouble("10.5"); 
	        boolean b = Boolean.parseBoolean("true"); 
	        
	        System.out.println(i); 
	        System.out.println(d); 
	        System.out.println(b+"\n"); 
	        
	        
	        System.out.println("toString()");
	        Integer in = new Integer(10); 
	        String s = in.toString(); 
	        System.out.println(s+1);
	        
	       
	}

}
