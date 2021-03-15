package HandlingArrays;

public class PassingArrayToMethods {

	public static void main(String[] args) {
		int[] arrToPass= {23,34,35};
		
		arrParameterMethod(arrToPass);
	}
	public static void  arrParameterMethod(int[] arrToPass) {
		for(int i=0;i<3;i++) {
			
			System.out.print(arrToPass[i]+" ");
		}
	}

}
