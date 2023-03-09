class Additionoftwointegers {

  public static void main(String[] args) {
    Additionoftwointegers addobj=new Additionoftwointegers();
    addobj.intaddmethod();

  }

  private void intaddmethod() {
    int arr1[]= {88,98,87,96,79};
    int arr2[]= {77,88,98};
    int small=arr1.length<arr2.length?arr1.length:arr2.length;
    int big=arr1.length>arr2.length?arr1.length:arr2.length;
    int result[]=new int[big];
    int i;
    for(i=0;i<small;i++) {
      result[i]=arr2[i]+arr1[i];
      System.out.println(result[i]);
    }
    while(i<big) {
      result[i]=arr1[i];
      System.out.println(result[i]);
      i++;
    }
  }

}
