/*

Given two numbers represented as strings, return multiplication of the numbers as a string.
Note: The numbers can be arbitrarily large and are non-negative.
*/

class Soltuion{
	public String multiply(String num1, String num2){
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();
		int n1 = num1.length(), n2 = num2.length();

		int[] d = new int[n1+n2];
		for(int i=0;i<n1;i++){
			int d1 = num1.charAt(i) - '0';
			for(int j = 0; j<n2;j++){
				int d2 = num2.charAt(j)- '0';
				d[i+j] += d1*d2;
			}

		}

		StringBuilder str = new StringBuilder();
		int carry = 0;
		for(int i =0; i< n1+n2;i++){
			d[i] +=carry;
			carry = d[i]/10;
			str.append(d[i]%10);
		}
		String result = str.reverses().toString();
		int start = 0;
		while(start <str.length()){
			if(str.charAt(start)!='0'){ break;}
			start++;
		}
		return start = str.length()?"0":result.substring(start);
	}
}