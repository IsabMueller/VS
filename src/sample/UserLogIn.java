import java.util.Scanner;
public class main
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner (System.in);

        String username;
        String password;


        System.out.println("Herzlich Willkommen bei SharingTime!");
        System.out.println("\nBitte gebe deinen Nutzernamen und dein Passwort an.");

        System.out.println("Nutzername: ");
        username = input.nextLine();

        System.out.println("Passwort: ");
        password = input.nextLine();

        UserAccount login = new UserAccount(username, password);

        if(login.checkPassword())
            System.out.println("Du wurdest erfolgreich eingeloggt.");
        else
            System.out.println("Der Nutzername und/oder das Passwort stimmt nicht überein.");
    }


}