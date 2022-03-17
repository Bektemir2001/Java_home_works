class Acer extends Laptop{
    public int cost;
    public String Os_type;

    Acer(){
        cost = 24000;
        Os_type = "64-bit";
    }
    Acer(String name, String OS_name){
        this.name = name;
        this.OS_name = OS_name;
    }
    
    public void cmd(){
        System.out.println();
        System.out.println("Do some think with cmd");
    }

    public void cmd(String command){
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
        System.out.println("count = "+count);
        System.out.println("f = "+f);


    }
}