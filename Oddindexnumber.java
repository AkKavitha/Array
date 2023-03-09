class Oddindexnumber {
public static void main(String []args) {
Oddindexnumber obj = new Oddindexnumber();
obj.oddnumber();
}
private void oddnumber() {
int a[]={95,83,90,67,73};
int odd[]=new int[a.length/2];
int j=0;
for(int i=0; i<a.length-1; i=i+2) {
odd[j]=a[i];
System.out.println(odd[j]);
j++;
}
}
}

