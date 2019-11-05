import java.util.Scanner;
public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Car c=new Car();
		System.out.println("Enter Car Name");
		String cname=s.next();
		c.name(cname);
		System.out.println("Enter Car Model");
		String cmodel=s.next();
		c.car_model(cmodel);
		System.out.println("Enter Speed");
		int sp=s.nextInt();
		c.speed(sp);

	}

}
