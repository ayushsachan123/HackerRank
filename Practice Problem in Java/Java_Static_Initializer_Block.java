
    static int B,H;
    static boolean flag;

    static{
        Scanner cin=new Scanner(System.in);
        B=cin.nextInt();
        H=cin.nextInt();
        if(B>0&&H>0){
            flag=true;
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

