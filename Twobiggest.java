class Twobiggest {
public static void main(String [] args) {
Twobiggest obj = new Twobiggest();
obj.findbigsecond();
}
private void findbigsecond() {
int arr[] ={99,90,88,80,77,70,66};
int big= arr[0];
int big2=arr[1];
for(int i=1; i<arr.length; i++) {
if(arr[i]>big) {
big2=big;
big=arr[i];
}
}
System.out.println(big);
System.out.println(big2);
}
}
