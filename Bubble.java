import java.util.*;
class Bubble{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int [] arr=new int[5];
       for(int i=0;i<arr.length;i++){
       	arr[i]=sc.nextInt();
       }
        for(int i=0;i<arr.length;i++){
         	for(int j=i;j<arr.length-1;j++){
        		if(arr[j]<arr[j+1]){
         			int temp=0;
         			temp=arr[j];
         			arr[j]=arr[j+1];
         			arr[j+1]=temp;
         		}
         		}
         	}

       	for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}


       }
	
	
	
		

}