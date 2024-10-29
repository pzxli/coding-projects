package views;

import services.LoginService;

import java.util.Scanner;

public class Login {
    public static void view(){
        LoginService loginService = new LoginService();

        Scanner sc = new Scanner(System.in);
        System.out.println("LOGIN PAGE");

        //retrieve username
        System.out.print("Username: ");
        String username = sc.nextLine();

        //retrieve password
        System.out.print("Password: ");
        String password = sc.nextLine();


        if(loginService.validateCredentials(username, password)){
            Dashboard.view();
        }else{
            System.out.println("INVALID CREDENTIALS");
        }

    }
}