	class StaticMethod{  
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	       
	     static void change(){  
	     college = "BBDIT";  
	     }  
	  
	     StaticMethod(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	    public static void main(String args[]){  
	    	StaticMethod.change();  
	  
	    	StaticMethod s1 = new StaticMethod (1,"sathya");  
	    	StaticMethod s2 = new StaticMethod (2,"SMATY");  
	    	StaticMethod s3 = new StaticMethod (3,"BLUE_EYES");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  

