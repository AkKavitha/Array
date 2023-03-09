class Negativenumber {
public static void main(String [] args) {
Negativenumber obj = new Negativenumber();
obj.negativemethod();
obj.negativeanotherarray();
}
private void negativeanotherarray() {
int a[]={8,-88,-96,-73,-17,8};
int count=0;
for(int i=0;i<a.length-1;i++) {
if(a[i]<0) {
count++;
}
}
int copy[]=new int[count];
int j=0;
for(int i=0;i<a.length-1;i++) {
if(a[i]<0)
{
copy[j]=a[i];
System.out.println(copy[j]);
j++;
}
}
}
private void negativemethod() {
int a[]={8,-88,-96,-73,-17,8};
for(int i=0; i<a.length-1; i++) {
if(a[i]<0)
System.out.println(a[i]);
}
}
}
