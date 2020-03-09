class Sample{
public Sample(){
	int count =5;
}
priavte static String SimpleOut(){
	return "rose";
}
public static void main(String a[]){
		System.out.println("inside SOP of mian");
		Sample sam=new Sample();
		System.out.println("the value of count is "+ count);
		System.out.println("SimpeOut is "+SimpleOut());
		System.out.println("additional line added");
	}
}
