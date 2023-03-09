class Reversearray {
public static void main(String []args) {
Reversearray obj = new Reversearray();
obj.copyreversearray();
}
private void copyreversearray() {
int arr[]={98,88,78,68,58};
int arrrev[]=new int[arr.length];
int j=0;
for(int i=arr.length-1; i>=0; i--) {
arrrev[j]=arr[i];
j++;
}
for(j=0;j<arr.length; j++) {
System.out.println(arrrev[j]);
}
}
}
