public class Test {
	public static void main(String[] args){
	int j = 123456;
	String sNum = String.valueOf(j);
	System.out.println("j是一个"+sNum.length()+"位数");
	String s = "Mary,F,1967";
	String[] sp = s.split(",");
	for(int i = 0;i < sp.length;i++){
		System.out.println(sp[i]);
		}
	}
}