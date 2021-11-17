class ReverseRightAngle{
	
	public static void main(String args[])
	{
		String n=args[0];
		int num=Integer.parseInt(n);
		
		ReverseRightAngle pattern=new ReverseRightAngle();
		pattern.printRignt(num);
	}
	
	void printRignt(int pattern)
	{
		for(int i=1;i<=pattern;i++){
			for(int j=pattern;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}