public class Countgiven {

  public static void main(String[] args) {
    Countgiven countobj = new Countgiven();
    countobj.coumethod();

  }

  private void coumethod() {
    int[] as= {10,17,9,22,11,10,12,10};
    int count=0;
    int num=10;
   for(int i=0;i<as.length;i++) {
     if(as[i]==num)
     {
       count++;
     }
   }
    System.out.println(num+" "+"the number count is  "+count);
  }

}
