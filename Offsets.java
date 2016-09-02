public class Offsets{
	public static void main(String[] args){
		Offsets test = new Offsets();
		System.out.println("TOTAL = " + test.offsets("14839"));
	}

	int offsets(String c){
		int o = 0;
		for(int i = c.length()-1; i > 1; i--){
			System.out.println(c.charAt(i) + " - " + c.charAt(i-1));

			o += (int)c.charAt(i)-(int)c.charAt(i-1);
		}
		return o;
	}
}