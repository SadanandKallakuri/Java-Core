package methodCalls;

public class example1 {

	public static void main(String[] args) {
        example1 ex= new example1();
        ex.sayHello();
        ex.sayHi("hi");
        String mm=ex.sendMsg("fddfd");
		System.out.println("return "+mm);
		double add=ex.addTwoNumbers(3, 6);
		System.out.println("no "+add);


        
        
	}
	public void sayHello() {
		System.out.println("sadanand");
	}
	
	public void sayHi(String name) {
		System.out.println("sadanand "+name);
	}
	
	public String sendMsg(String name) {
		System.out.println("sadanand "+name);
        return "sda"; 
	}
	
	public double addTwoNumbers(int x,int y) {
        return x+y; 
	}
	
	
	

}
