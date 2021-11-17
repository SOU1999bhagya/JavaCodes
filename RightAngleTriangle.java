class RightAngleTriangle{
	public static void main(String args[]){
		String n=args[0];
		int num=Integer.parseInt(n);
		
		RightAngleTriangle pattern=new RightAngleTriangle();
		pattern.printRignt(num);
	}
	
	void printRignt(int pattern)
	{
		for(int i=1;i<=pattern;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}