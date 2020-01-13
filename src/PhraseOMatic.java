
public class PhraseOMatic {
	
	public static void main(String[] args) {
		String[] listOne = {"Sun", "Tech", "Integrators", "PVt", "Limited", "HBR", "Hennur", "Cross", "tfgc" };
		String[] listTwo = {"Java", "Technology", "Programming", "Head", "First", "James", "Goshling" };
		String[] listThree = {"Integers", "String", "Arrays", "Char", "float", "double", "byte"};
		
		int oneLength = listOne.length;
		int twoLength = listTwo.length;
		int threeLength = listThree.length; 
		System.out.println("Output is " +oneLength+","+twoLength+","+threeLength );
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		System.out.println("Output is " +rand1+","+rand2+","+rand3 );
		
		String output = listOne[rand1]+ " " + listTwo[rand2] + " "+ listThree[rand3];
		
		System.out.println("Output is " + output);
	}

}
