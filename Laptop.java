class Laptop{
    protected String name;
    protected String OS_name;
    private String memory;
    private String processor;
    public static int count = 1;
    public final int f = 2;

    Laptop(){
        name = "Asus";
        OS_name = "Ubuntu";
        memory = "4 Gb";
        processor = "1.04 Gh";
    }

    Laptop(String name, String OS_name, String memory, String processor){
        this.name = name;
        this.OS_name = OS_name;
        this.memory = memory;
        this.processor = processor;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setOsName(String OS_name){
        this.OS_name = OS_name;
    }
    public void setMemory(String memory){
        this.memory = memory;
    }
    public void setProcessor(String processor){
        this.processor = processor;
    }

    public String getName(){
        return name;
    }

    public String getOsName(){
        return OS_name;
    }

    public String getMemory(){
        count += 1;
        return memory;
    }
    public String getProcessor(){
        count += 1;
        return processor;
    }

    public void showData(){
        System.out.println("name: "+name);
        System.out.println("OS name: "+OS_name);
        System.out.println("memory: "+memory);
        System.out.println("processor: "+processor);

    }

}