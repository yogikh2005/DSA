	class StringX {
		
		public boolean checkpalindrome(int i, String s) {
			if (i >= s.length() / 2) 
				return true;
		   
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;
			
			return checkpalindrome(i + 1,s);
		}
	}

	class CheckPalindrome {
		public static void main(String args[]) {
			StringX sobj = new StringX(); 
		
			String s="MAM";

			if(sobj.checkpalindrome(0,s))
				System.out.println("String is the palindrome");
			else
				System.out.println("String is not palindrone");

		 
		   
		}
	}
