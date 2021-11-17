class NumsAfterThree{
	public static void main(String args[]){
		
		String num=args[0];
		int n=Integer.parseInt(num);
		
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n;j++){
				if(i>=3 &&j>=3){
					System.out.print(i+""+j+" ");
				}
				else{
					System.out.print("   ");
				}
				//System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
	}
}