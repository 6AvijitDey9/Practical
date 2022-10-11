package String;
import java.util.StringTokenizer;
public class String_tokenizer {

	public static void main(String[] args) {
		StringTokenizer S=new StringTokenizer("My name is Shamyal, Have a relax, See you not for mind");
		while (S.hasMoreTokens()) {
			System.out.println(S.nextToken());
		}
		StringTokenizer Str= new StringTokenizer("My name is Shamyal, Have a relax, See you not for mind");
		while (Str.hasMoreTokens()) {
			System.out.println(Str.nextToken(","));
		}
	}
}
