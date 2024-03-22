package javaChallenges;

public class Challenge1_LengthofLastWord {

	public void inputStatement(String str, int i) {
		System.out.println("Example " + i + " - The Input is : "+str);
		String[] word = str.split(" ");
		System.out.println("Example " + i + " - The splitted words are -");
		for (String string : word) {
			if (string.isEmpty()) {

			} else
				System.out.println(string);
		}
		String lastWord = word[word.length - 1];
		int len = lastWord.length();
		System.out.println("Example "+i+" output: ");
		System.out.println("Last word- " + lastWord);
		System.out.println("length- " + len);
		System.out.println("-----------------------------------------------------------------------");
	}

		public static void main(String[] args) {
		Challenge1_LengthofLastWord obj = new Challenge1_LengthofLastWord();
		obj.inputStatement("Hello World", 1);
		obj.inputStatement("   fly me   to   the moon  ", 2);
		obj.inputStatement("luffy is still joyboy", 3);
	}

}
