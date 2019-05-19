class Test{
	public static void main(String[] args){
		/*
		Integer i = 10;
		Integer j = 10;
		System.out.println(i==j);

		Integer a = 500;
		Integer b = 500;

		System.out.println(a==b);
		*/
		// What is the difference between int and Integer in java?
		// See the output, we found wierd thing, think about why.
		//java hash array
		/*
		String s = "LOVE";
		int hash_pat[] = new int[s.length()];
		for(int i = 0;i<s.length();i++){
			hash_pat[s.charAt(i)]++;
		}
		*/
		//It turned out that java array can index as char instead of int.
		//char - char = ?
		System.out.println('z'-'a');
		//25
	}
}