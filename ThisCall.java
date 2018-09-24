	class ThisCall{  
	    int id;  
	    String name;  
	    String city;  
	      
	    ThisCall(int id,String name){  
	    this.id = id;  
	    this.name = name;  
	    }  
	   ThisCall(int id,String name,String city){  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
	      
	    public static void main(String args[]){  
	   ThisCall e1 = new ThisCall(111,"SATHYA");  
	  ThisCall e2 = new ThisCall(222,"SMATY","KANCHIPURAM");  
	    e1.display();  
	    e2.display();  
	   }  
}  
