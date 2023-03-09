public class Towards {

  public static void main(String[] args) {
    Towards tobj=new Towards();
    tobj.towardsone();
    tobj.towardstwo();

  }

  private void towardstwo() {
    int arr[]= {88,77,90,97,89,90};
    int box=arr[0],box1=arr[1];
    int i;
    for(i=0;i<arr.length-2;i++) {
      arr[i]=arr[i+2];
    }
    arr[i]=box;
    arr[i+1]=box1;
    for(int j=0;j<arr.length;j++) {
    System.out.println(arr[j]);
    }
  }

  private void towardsone() {
    int arr[]= {77,88,99,89,95,80};
    int box=arr[0];
    int i;
    for(i=0;i<arr.length-1;i++) {
      arr[i]=arr[i+1];
    }
    arr[i]=box;
    for(int j=0;j<arr.length;j++) {
      System.out.println(arr[j]);
    }
  }
  }

