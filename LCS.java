package lu.string;

public class LCS {
	
	public String process(String a, String b){
		int aLen = a.length();
		int bLen = b.length();
		if(aLen == 0 || bLen == 0){
			return "";
		}
		else if(a.charAt(aLen-1) == b.charAt(bLen - 1)){
			return process(a.substring(0, aLen - 1), b.substring(0, bLen - 1)) + a.charAt(aLen - 1);
		}
		else{
			String x = process(a, b.substring(0, bLen - 1));
			String y = process(a.substring(0, aLen - 1), b);
			return (x.length() > y.length()) ? x : y;
		}
	}
	
	public static void main(String[] args){
		LCS lcs = new LCS();
		String result = lcs.process("2579312", "35328");
		System.out.println(result);
	}
}
