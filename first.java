class first{
 public first(){
   int count = 10;
   System.out.println("I am inside constructor");
 }
 private int sum(int a, int b){
  return a+b;
 }
public static void main(String a[]){
  System.out.println("this is a simple program in java");
 First fst=new First();
 System.out.println("the value of cpunt is : "+fst.count);
 System.out.println("constructor is called first followed by other methods");
}
}
