public class TestMenu {
	public static void main(String[] args) {
		Menu welcome = new Menu("Welcome to twitter",2) ;

		CreateAccountMenuEntry createAccountMenu = new CreateAccountMenuEntry() ;
		CreateAccountMenuEntry createAccountMenu2 = new CreateAccountMenuEntry() ;

		welcome.setEntry(0,createAccountMenu) ; 
		welcome.setEntry(1,createAccountMenu2) ; 
		welcome.launch() ;
		
	}
	
}

