
public class Digits {
	public static void main(String[] args) {
		String s = "ja1v25";
		char num= '0';
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') {
				num= num + ch;
			}	
		System.out.println(Integer.passInt(num + " "));
		}
	}

}