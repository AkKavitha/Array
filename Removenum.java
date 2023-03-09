class Removenum {
public static void main(String [] args) {
Removenum obj = new Removenum();
obj.removgivennum();
}
private void removgivennum() {
int a[]={87,95,76,64,58};
int remove=58;
for(int i=0; i<a.length; i++) {
if(a[i]==remove) {
i++;
}
System.out.println(a[i]);
}
}
}

