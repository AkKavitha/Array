class Placing {
public static void main(String []args) {
Placing obj = new Placing();
obj.lastarray();
}
private void lastarray() {
int a[] ={99,85,93,75,70,65};
int last = a.length;
int value = 99;
for(int i=0; i<a.length; i++) {
if(last-1==i) {
a[i]=value;
}
System.out.println(a[i]);
}
}
}

