public class LoopInLopp {
  public static void main(String[] args) {
      int baris = 4;
      for (int i = 0; i < baris; i++) {
          for (int j = 0; j < baris; j++) {
            if(j < baris - i - 1){
              System.out.print("S ");
            }else{
              System.out.print("0 ");
            }
          }
          System.out.println("");
      }
  }
}