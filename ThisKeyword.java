class ThisKeyword{  
	    int id;  
	    String name;  
	      
	    ThisKeyword(int id,String name){  
	    this.id = id;  
	    this.name = name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
    public static void main(String args[]){  
    	ThisKeyword s1 = new ThisKeyword(111,"SATHYA");  
    	ThisKeyword s2 = new ThisKeyword(222,"SMATY");  
	    s1.display();  
	    s2.display();  
	}  
	}  
