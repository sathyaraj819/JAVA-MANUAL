	class ParameterizedCon{  
	    int id;  
	    String name;  
	      
	    ParameterizedCon(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	ParameterizedCon s1 = new ParameterizedCon(111,"SATHYA");  
	    	ParameterizedCon s2 = new ParameterizedCon(222,"SMATY");  
	    s1.display();  
	    s2.display();  
	   }  
	}  
