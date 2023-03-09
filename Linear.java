class Linear {
public static void main(String []args) {
Linear obj =new Linear();
obj.linearmethod();
}
private void linearmethod() {
int arr[] ={99,85,92,78,80};
int marks=100;
boolean found=false;
for(int i=0; i<arr.length; i++) {
if(arr[i]==marks) {
System.out.println(" the number is "+marks+" present position " +i);
found=true;
break;
}
}
if(found==false) {
System.out.println(" the number is "+marks+" not present ");
}
}
}

 












