class HollowLeftTriangle{
	public static void main(String args[]){
		
		String num=args[0];
		int n=Integer.parseInt(num);
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				
					System.out.print(" ");
			}
			for(int k=1;k<=n;k++){
				if(k==1 || k==i || i==n){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}