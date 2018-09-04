	class CopyCon{  
	    int id;  
	    String name;  
	    CopyCon(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	   CopyCon(CopyCon s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    CopyCon s1 = new CopyCon(1,"SATHYA");  
	    CopyCon s2 = new CopyCon(s1);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
