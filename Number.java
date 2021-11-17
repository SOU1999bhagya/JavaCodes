class Number{
	
	public static void main(String args[])
	{
		String n=args[0];
		int num=Integer.parseInt(n);
		
		Number pattern=new Number();
		pattern.print(num);
	}
	
	void print(int pattern)
	{
		for(int i=1;i<=pattern;i++){
			for(int j=4;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}