package week6;

public class RandomLetter {

	public static void main(String[] args) {
		String word = ""; 
		
		StringBuilder sb = new StringBuilder(word);
		
		int i,c;
		
		for(i=0;i<=9;i++){
			c = ((int) (Math.random()*26+97));
			sb.append((char)c);
		}System.out.println("Word 1: " + sb);
		
		int index;
		String ch="";
		
		StringBuilder sb2 = new StringBuilder(ch);
		
		
		for(i=2;i<=20;i++) {
			sb2.append((char)((int) (Math.random()*26+97)));
			index =((int) (Math.random()*10));
			sb.replace(index, index+1, sb2.toString());
			System.out.println("Word " + i + ": " + sb);
			sb2.deleteCharAt(0);
		}

	}

}
