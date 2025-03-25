import java.util.Random;


public class Main {
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    Random rand = new Random();

        //int
	    int a = rand.nextInt(-5, 2);

        //double
	    double b = rand.nextDouble(-5, 2);

        //boolean
	    boolean status = rand.nextBoolean();
	    
	    if(status) System.out.println("Sim");
	    else System.out.println(("Não"));
	    
	    scan.close();
	}
}
