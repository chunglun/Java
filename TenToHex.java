package lu.string;

public class TenToHex {
	public static void main(String[] args){
		TenToHex t = new TenToHex();
		System.out.println(t.process(500, 16));
	}
	
	public String process(int number, int base){
		String result = "";
		
		while(number > 0){
			int current = number%base;
			if((base == 16) && (current > 9) && (current < 16)){
				result  = mapping(current) + result;
			}
			else{
				result  = current + result;
			}
			number /= base;
		}
		return result;
	}
	
	public String mapping(int number){
		switch (number) {
		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		case 15:
			return "F";
		}
		return null;
	}
}
