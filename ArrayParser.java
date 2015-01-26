import java.util.Arrays;
public class ArrayParser{
	public static void main(String[] args){
		String s = "1,2;3,4;5,6;7,8";
		String[] sArray = s.split(";");
		Double[][] dArray = new Double[sArray.length][];
		for (int i=0; i<sArray.length; i++) {
		 //	System.out.println(sArray[i]);
		 	String[] sArray2 = sArray[i].split(",");
		 	dArray[i] = new Double[sArray2.length];
		 	for(int j = 0;j < sArray2.length;j++){
		 			dArray[i][j] = Double.parseDouble(sArray2[j]);		 	
		 		}
		}
		/*for(int i = 0;i < dArray.length; i++ ){
			for(int j = 0;j < dArray[i].length; j++){
				System.out.print(dArray[i][j]+" ");
				}
				System.out.println();
			}*/
			System.out.println(Arrays.deepToString(dArray));
	}
}