import com.sun.prism.shader.Solid_Color_AlphaTest_Loader;

import java.net.SocketAddress;

public class RelLogOps {
    public static void main (String args []){
        int i,j;
        boolean b1, b2;
        i = 10;
        j = 11;
        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i !=j");
        if (i == j) System.out.println ("This is does not work ");
        if (i >= j) System.out.println("This is does not work");
        if (i > j) System.out.println("This is does not work");

        b1 = true;
        b2 = false;

        if (b1 & b2) System.out.println("This is does not work");
        if (!(b1 & b2)) System.out.println("!(b1 & b2): true");
        if (b1 | b2) System.out.println("b1 | b2: true");
        if (b1 ^ b2) System.out.println("b1 ^ b2: true");
    }
}
