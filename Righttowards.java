public class Righttowards {

  public static void main(String[] args) {
    Righttowards riobj = new Righttowards();
    riobj.oneright();
    riobj.tworight();

  }

  private void tworight() {
    int arr[]= {77,88,99,89,95,80};
    int box=arr[arr.length-1];
    int box1=arr[arr.length-2];
    int i;
    for(i=arr.length-1;i>1;i--) {
      arr[i]=arr[i-2];
    }
    arr[i]=box;
    arr[i-1]=box1;
    for(int j=0;j<arr.length;j++) {
      System.out.println(arr[j]);
    
  }
    }

  private void oneright() {
    int arr[]= {77,88,99,89,95,80};
    int box=arr[arr.length-1];
    int i;
    for(i=arr.length-1;i>0;i--) {
      arr[i]=arr[i-1];
    }
    arr[i]=box;
    for(int j=0;j<arr.length;j++) {
      System.out.println(arr[j]);
    }

    
  }

}
