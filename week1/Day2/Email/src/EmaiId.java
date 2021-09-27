import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmaiId {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	Pattern pattern = Pattern.compile("([a-zA-Z0-9_.-]+)@[a-zA-Z0-9_.-]+[a-zA-Z])");
	Matcher matcher = pattern.matcher("abc.txt");
	while(matcher.find()){
		System.out.println(matcher.group());
	}
	
	
}
}
