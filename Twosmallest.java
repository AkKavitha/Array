class Twosmallest {
public static void main(String []args) {
Twosmallest obj = new Twosmallest();
obj.smallesttwo();
obj.findsmallest();
}
private void smallesttwo() {
int arr[] ={98,89,78,67,85};
int small = arr[0];
int small2 = arr[1];
for(int i=1; i<arr.length; i++) {
if(arr[i]<small) {
small2=small;
small=arr[i];
}
}
else if(arr[i]<small2) {
small2=arr[i];
}

System.out.println(small);
System.out.println(small2);
}
private void findsmallest() {
int arr[]={98,67,84,64,57};
int small=arr[0];
for(int i=1; i<arr.length; i++) {
if(arr[i]<small) {
small=arr[i];
}
}
System.out.println(small);
}
}

