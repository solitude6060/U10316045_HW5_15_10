import java.util.Scanner;//import Scanner


public class TestMyStack {
	//main method
	public static void main(String[] args) {		
		MyStack str =new MyStack();//new an MyStack type object
		Scanner input = new Scanner(System.in);//new a scanner
		
		
		String[] Array1 = {"1","2","3","4","5"};//a string array
		
		System.out.println("Enter Strings into Array str.");// tell what to do next
		
		//Asking for entering
		for(String i : Array1){
			System.out.print("Please enter No."+i+" string : ");//asking
			str.push(input.next());//put what user entering into MyStack 
		}
		
		MyStack Array2 = (MyStack)(str.clone());//deep(shallow) clone
		
		System.out.println("Array original : "+str);//display the original array
		System.out.println("\nAnd display the array copy from array str.\n");
		System.out.println("Array copy : "+Array2);//display the copy array
		
		
	}

}
