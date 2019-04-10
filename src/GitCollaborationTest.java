import java.util.ArrayList;

public class GitCollaborationTest {
	
	public static void main(String[] args) {
		ArrayList<Welcome> welcomeArray = new ArrayList<Welcome>();

		Welcome myGreeting = new Welcome();
		myGreeting.type = "Welcome to Github!!!";
		myGreeting.name = "What's your GitHub user name?";
		welcomeArray.add(myGreeting);
		
		for (Welcome greeting : welcomeArray) {
			System.out.println(greeting.type + '\n' + greeting.name);

		}

	}
}
