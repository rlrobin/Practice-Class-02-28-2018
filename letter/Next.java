package letter;
import java.util.Scanner;
public class Next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
	System.out.println("What is your first dogs name? ");
	String dog=scan.nextLine();
	int charc=dog.length()-1;
	System.out.println(dog.charAt(charc));
	}

}
