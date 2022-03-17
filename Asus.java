class Asus extends Laptop{
    private int cost;
    private String Os_type;

    Asus(){
        cost = 24000;
        Os_type = "64-bit";
    }
    public void terminal(){
        System.out.println();
        System.out.println("Do some think with terminal");
    }

    public void terminal(String command){
        System.out.println();
        System.out.println("execute command "+command);
    }

    public void showData(){
        System.out.println("cost: "+name);
        System.out.println("Os type: "+OS_name);
        getMemory();
        getProcessor();
        System.out.println("cost: "+cost);
        System.out.println("Os type: "+Os_type);
        System.out.println("count ="+count);
        System.out.println("f = "+f);


    }
}