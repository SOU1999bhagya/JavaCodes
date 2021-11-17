class Square{
	public static void main(String []args){
		
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if( (i==1 ||i==row) || (j==1 || j==col) ){
					System.out.print(i+""+j+" ");
				}
				else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}