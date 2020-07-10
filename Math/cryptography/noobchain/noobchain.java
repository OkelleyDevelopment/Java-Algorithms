
public class noobchain{

	public static void main(String[] args) {

		Block genesisBlock = new Block("Hi im the first block", "0");
		System.out.println("Hash for block 1 : " + genesisBlock.hash);

		Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
		System.out.println("Hash for block 2 : " + secondBlock.hash);

		Block thirdBlock = new Block("Hey im the third block",secondBlock.hash);
		System.out.println("Hash for block 3 : " + thirdBlock.hash);


		int chain = 0;
		Block newBlock1 = new Block("New chain is made: ", thirdBlock.hash);

		while(chain <= 2000){
			Block newBlock = new Block("New chain is made: ",genesisBlock.hash);
			System.out.println("Hash for block" + chain + " : " + newBlock.hash);
			chain++;
		}


	}
}
