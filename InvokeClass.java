	class InvokeClass{  
	  void m(){  
	  System.out.println("method is invoked");  
	  }  
	  void n(){  
	  this.m();//no need because compiler does it for you.  
	  }  
	  void p(){  
	  n();//complier will add this to invoke n() method as this.n()  
	  }  
	  public static void main(String args[]){  
	  InvokeClass s1 = new InvokeClass();  
	  s1.p();  
	  }  
	}  
