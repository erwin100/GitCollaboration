import java.util.ArrayList;

public class GitCollaborationTest {

	public static void main(String[] args) {
		ArrayList<Welcome> welcomeArray = new ArrayList<Welcome>();

		String type = "Welcome to Github!!!";
		String yourName = "Erwin Cornejo";
		Welcome myGreeting = new Welcome(type, yourName);

		welcomeArray.add(myGreeting);

		for (Welcome greeting : welcomeArray) {
			System.out.println(greeting.type + '\n' + greeting.yourName);
		}

	}
}
