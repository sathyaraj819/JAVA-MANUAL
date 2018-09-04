	class ObjectAndClass3{  
	 int rollno;  
	 String name;  
	  
	 void insertRecord(int r, String n){  //method  
	  rollno=r;  
	  name=n;  
	 }  
	  
	 void displayInformation(){
		 System.out.println(rollno+" "+name);
		//method  
	 }
	  
	 public static void main(String args[]){  
		 ObjectAndClass3 s1=new ObjectAndClass3();  
		 ObjectAndClass3 s2=new ObjectAndClass3();  
	  
	  s1.insertRecord(01,"SATHYA");  
	  s2.insertRecord(02,"SMATY");  
	  
	  s1.displayInformation();  
	  s2.displayInformation();  
	 }
	}
