public class Addoddindex {

  public static void main(String[] args) {
    Addoddindex adobj = new Addoddindex();
    adobj.oddindex();

  }

  private void oddindex() {
    int a[]= {77,88,55,66,77,88,88};
    int total=0;
    for(int i=0;i<a.length;i=i+2) {
      total=total+a[i];
    } 
    System.out.println(total);

    
  }

}
