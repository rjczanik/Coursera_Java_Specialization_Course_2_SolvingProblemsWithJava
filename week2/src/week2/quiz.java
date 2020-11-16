package week2;

public class quiz {

	public static void findAbc(String input) {
	    int index = input.indexOf("abc");
	    while (true) {
	        if (index == -1) {
	            break;
	        }
	        String found = input.substring(index+1, index+4);
	        System.out.println(found);
	        index = input.indexOf("abc", index+4);
	    }
	}
	   public static void test() {
		   findAbc("aaaaabc");
		   //"yabcyabc"
		   //"abcbbbabcdddabc"
		   //"eusabce"
		   //"woiehabchi"
		   //"aaaaabc"

	}	
	
	public static void main(String[] args) {
		test();
	}

}
