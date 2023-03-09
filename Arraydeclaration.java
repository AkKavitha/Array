class Arraydeclaration {
public static void main(String []args) {
Arraydeclaration obj = new Arraydeclaration();
obj.arrdecprinting();
obj.reverseorder();
}
private void reverseorder() {
int arr[] ={99,95,80,70,75};
for(int i=arr.length-1; i>=0;i--) {
System.out.println(arr[i]);
}
}
private void arrdecprinting() {
int arr[]={8,7,4,6,5};
for(int i=0; i<arr.length; i++) {
System.out.println(arr[i]);
}
}
}
