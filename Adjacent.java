class Adjacent {
public static void main(String []args) {
Adjacent obj = new Adjacent();
obj.adjacentmethod();
}
private void adjacentmethod() {
int j=0;
int arr[]={8,6,22,83,44};
while(j<arr.length-1) {
int a=arr[j];
int b=arr[j+1];
int small=a<b?a:b;
int big=a>b?a:b;
for(int i=small+1; i<big; i++) {
System.out.println(i);
}
j++;
}
}
}
