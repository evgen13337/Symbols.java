class BoolDemo {
    public static void main (String args []){
        boolean b;
        b = false;
        System.out.println("Value b: " +b);

        b = true;
        System.out.println("Value b: " +b);
        if(b) System.out.println("This instruction is executed.");

        b = false;
        if(b) System.out.println("This instruction does not executed");

        System.out.println("Result 10 < 9: " +(10 < 9));

    }

}

// if (b == true) System.out.println("This instruction is excuted.")
// if (b == false) System.out.println("This instruction does not excuted.")
