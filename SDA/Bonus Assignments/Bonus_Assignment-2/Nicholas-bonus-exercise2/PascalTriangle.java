public class PascalTriangle {

    private int row;
    private int column;



    public PascalTriangle() {
    }

    public PascalTriangle(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void generateTriangleInternet (int row) {
            int c=1;
            int blk;
            int i;
            int j;

    for(i=0;i<row;i++) {
        for(blk=1;blk<=row-i;blk++) {
            System.out.print(" ");
        }
        for(j=0;j<=i;j++) {
          if (j==0) {
            c=1;
          } else {
            c=c*(i-j+1)/j;
          }
          System.out.print(" "+c);
        }
      System.out.println();  
    }
  }


}
