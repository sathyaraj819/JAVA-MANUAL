	//Program of this() constructor call (constructor chaining)  
	class ThisInvoked{  
	    int id;  
   String name;  
   ThisInvoked(){System.out.println("default constructor is invoked");}  
	      
   ThisInvoked(int id,String name){  
    this ();//it is used to invoked current class constructor.  
    this.id = id;  
    this.name = name;  
    }  
    void display(){System.out.println(id+" "+name);}  
	      
	    public static void main(String args[]){  
	    	ThisInvoked e1 = new ThisInvoked(1,"SATHYA");  
	    	ThisInvoked e2 = new ThisInvoked(2,"SMATY");  
    e1.display();  
	    e2.display();  
	   }  
	}  
