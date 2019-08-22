import java.util.*;
class SelectionSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int [] arr=new int[5];
       for(int i=0;i<arr.length;i++){
       	arr[i]=sc.nextInt();
       }
        for(int i=0;i<arr.length;i++){
         	for(int j=0;j<arr.length;j++){
        		if(arr[i]<arr[j]){
         			int temp=0;
         			temp=arr[i];
         			arr[i]=arr[j];
         			arr[j]=temp;
         		}
         		}
         	}

       	for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}


       }
	
	
	
		

}