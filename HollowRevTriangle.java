class HollowRevTriangle{
	public static void main(String args[]){
		
		String num=args[0];
		int n=Integer.parseInt(num);
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				if(i==1 || j==i || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int k=1;k<i;k++){
				
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}
}