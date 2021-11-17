class PlusPattern{
	public static void main(String []args){
		
		String num=args[0];
		int n=Integer.parseInt(num);
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==n/2+1 || j==n/2+1)
				{
					System.out.print(i+""+j+"\t");
				}
				else{
					System.out.print("  "+"\t");
				}
			}
			System.out.println();
		}
	}
}