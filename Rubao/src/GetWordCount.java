public class GetWordCount {

	public static void main(String[] args) {
		String word = "This is a test";
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			
			char c = word.charAt(i);			
			System.out.println(c);
			count += (c == ' ' ? 1 : 0);
			
			
		}
		System.out.println(count);
	}
}