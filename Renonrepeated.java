class Renonrepeated {
public static void main(String []args) {
Renonrepeated obj=new Renonrepeated(); 
obj.nonrepeatedmethod();
obj.repeatedmethod();
}
private void repeatedmethod() {
char names[]={'k','a','v','i'};
int j=0;
boolean rep=false;
while(rep==false) {
char first=names[j];
int i=j+1;
for(;i<names.length;i++) {
if(names[i]==first) {
System.out.println(" the first repeated "+first);
rep=true;
break;
}
else {
continue;
}
}
j++;
}
}
private void nonrepeatedmethod() {
char names[]={'D','h','i','v','y','a'};
for(int j=0; j<names.length-1; j++) {
int first=names[j];
boolean rep=false;
int i=j+1;
for(;i<names.length;i++) {
if(names[i]!=first) {
continue;
}
else {
rep=true;
break;
}
}
if(rep==false) {
System.out.println(" the first nonrepeated "+names[j]);
break;
}
}
}
}

