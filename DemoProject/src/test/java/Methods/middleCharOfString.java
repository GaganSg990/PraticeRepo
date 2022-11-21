package Methods;

public class middleCharOfString {
//	MY LOGIC
	
	public static void main(String[] args) {
		String Word="Mangoees";
		int Size = Word.length();
		
		if(Size%2==0) {
			int Number1 = (Size/2)-1;
			int Number2 = (Size/2);
			System.out.println("Even ---->"+Word.charAt(Number1)+Word.charAt(Number2));
		}else {
			int Number1 = Size/2;
			System.out.println(Word.charAt(Number1));
			
		}
	}

}
