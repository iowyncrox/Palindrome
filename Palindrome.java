import java.util.Objects;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		Objects.requireNonNull(str);
		String value = str.trim().toLowerCase();
		int i = 0;
		int j = value.length() - 1;
		while(i < j) {
			if(value.charAt(i) != value.charAt(j)) {
				return false;
			}
			++i;
			--j;
		}
		
		return true;
	}
	
	public static boolean palindrome(String str) {
		StringBuilder sb1 = new StringBuilder(str.trim().toLowerCase());
		StringBuilder sb2 = new StringBuilder(sb1).reverse();
		return sb1.toString().equals(sb2.toString());
	}
	
	public static void main(String[] args) {
		String value = "degged";
		String notValue = "forrest";
		System.out.println(isPalindrome(value));
		System.out.println(palindrome(value));
		System.out.println(isPalindrome(notValue));
		System.out.println(palindrome(notValue));
	}
}
