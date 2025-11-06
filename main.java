class main{
    public static void main(String[] args) {
      int a[]={10,20,30,40,50,60,70,};
      try {
          a[4]=100;
          System.out.println("value at index 4: " + a[4]);
      } catch (Exception e) {
          System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
      }
    
    }
}