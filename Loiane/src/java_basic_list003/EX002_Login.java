package java_basic_list003;

import java.util.Scanner;

public class EX002_Login {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean infoValida = false;
		String user;
		String password;
		
		do{
			
		System.out.println("Username ");
		user = scan.next();
		
		System.out.println("Password");
		password = scan.next();
		
		
		if(user.equalsIgnoreCase(password)){
			
			System.out.println("Senha não pode ser igual o nome de usuário!");
		}else{
			infoValida = true;
			System.out.println("usuário e senha são válidos!");
		}
			
		}while(!infoValida);

	}

}
