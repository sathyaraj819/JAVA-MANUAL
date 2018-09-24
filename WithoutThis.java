class WithoutThis{  
	    int id;  
	    String name;  
	      
	    WithoutThis(int id,String name){  
	    id = id;  
	    name = name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	  
	    public static void main(String args[]){  
	   WithoutThis s1 = new WithoutThis(111,"Karan");  
	    WithoutThis s2 = new WithoutThis(321,"Aryan");  
	    s1.display();  
	    s2.display();  
	    }  
	}  
