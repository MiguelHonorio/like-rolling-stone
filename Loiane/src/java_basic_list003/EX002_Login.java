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
			
			System.out.println("Senha n�o pode ser igual o nome de usu�rio!");
		}else{
			infoValida = true;
			System.out.println("usu�rio e senha s�o v�lidos!");
		}
			
		}while(!infoValida);

	}

}
