abstract class AbsractClass{  
  abstract void run();  
}  
class Honda4 extends AbsractClass {  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
AbsractClass obj = new Honda4();  
 obj.run();  
}  
}  
