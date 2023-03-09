class Biggest {
public static void main(String []args) {
Biggest obj = new Biggest();
obj.findbiggest();
}
private void findbiggest() {
int arr[]={99,88,77,66,55,90};
int big=arr[0];
for(int i=1; i<arr.length; i++) {
if (arr[i]>big) {
big=arr[i];
}
}
System.out.println(big);
}
}
