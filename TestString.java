public class TestString{
	public static void main(String[] args){
		String str = "AaaaaaaBBBBcc#%$%$^adfgssh97979_haHA";
		int lowCount = 0;
		int upperCount = 0;
		int norCount = 0;
		for(int i = 0;i < str.length();i++){
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z'){
				lowCount++;
			}else if(c >= 'A' && c <= 'Z'){
				upperCount++;
			}else {
				norCount++;
				}
			}
			System.out.println("L:"+lowCount+" U:"+upperCount+" N:"+norCount);
		}
}