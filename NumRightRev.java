class NumRightRev{
	public static void main(String []Num){
		for(int row=5;row>=1;row--){
			for(int col=1;col<=row;col++){
				System.out.print(col);
			}
			System.out.println();
		}
	}
}