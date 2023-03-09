class Smallest {
public static void main(String []args) {
Smallest obj = new Smallest();
obj.findsmallest();
}
private void findsmallest(){
int arr[]={92,82,72,62,98};
int small=arr[0];
for(int i=1; i<arr.length; i++) {
if(arr[i]<small) {
small=arr[i];
}
}
System.out.println(small);
}
}
