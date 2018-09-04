	class ConOverloading{  
	    int id;  
	    String name;  
	    int age;  
	   ConOverloading(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	   ConOverloading(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	   ConOverloading s1 = new ConOverloading(111,"SATHYA");  
	    ConOverloading s2 = new ConOverloading(222,"SMATY",07);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
