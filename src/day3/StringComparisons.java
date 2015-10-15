package day3;

public class StringComparisons {

	public static void main(String[] args) {
		String str1="Selenium";
		String str2="Selenium";
		if(str1.equals(str2))
		{
			System.out.println("string are same");
		}
		else
		{
			System.out.println("strings are not same");
		}
		System.out.println("#########################");
		String str3="Selenium";
		String str4="selenium";
		if(str3.equalsIgnoreCase(str4))
		{
			System.out.println("string are same");
		}
		else
		{
			System.out.println("strings are not same");
		}
		
		String str5="Selenium Automation";
		String str6="Selenium";
		if(str5.contains(str6))
		{
			System.out.println("Word present");
		}
		else
		{
			System.out.println("Word not present");
		}
	}
}

