public class Main
{
   public int maxtimes(int m,int[] A)
    {
        int n= A.length;
        int [] count = new int[m+1];
        for(int i=0;i<=m;i++){
            count[i]=0;
        }
        int maxoccurance= 1;
        int index =-1;
        for(int i=0;i<n;i++){
            if(count[A[i]]>0){
                int temp= count[A[i]];
    if(temp>maxoccurance){
                    maxoccurance=temp;
                    index=i;
                }
                
                count[A[i]]=temp+1;
            }
            else
            {
                count[A[i]]=1;
            }
        }
        return A[index];
    }
	public static void main(String[] args) {
		int[] a={3,2,1,1,3,1,3,3,3,4};
		int b=4;
		Main s= new Main();
		System.out.print(s.maxtimes(b,a));
	}
}