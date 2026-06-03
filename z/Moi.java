
//import javax.swing.JOptionPane;

public class Moi {

    public static void main(String[] args) {
        /*   public class Punkt {
            private int x;
            private int y;

            public Punkt(int x, int y) {
                this.x =x;
                this.y =y;
            }
            public void verschiebeUmEins(){
                x = x +1;
                y = y +1;
            }
            public boolean istUrsprung(){
                return x == 0 && y == 0;
            }
            public void ausgeben(){
                System.err.println
            }
         }*/
         Punkt p1 =new Punkt();
         p1.setZ(1);
         p1.setU(2);
         p1.verschiebe(2,2);

         System.out.println(p1.getZ());
         System.out.println(p1.getU());
         

        }

         public static class Punkt {
            private int z;
            private int u;

            public void setZ(int i){
                z=i;
            }

            public void setU(int i) {
                u=i;
            }

            public int getZ(){
                return z;
            }

            public int getU(){
                return u;
            }

            public void verschiebe(int deltaZ, int deltaU){
                z = z + deltaZ;
                u = u + deltaU;
            }

         }
    


}
