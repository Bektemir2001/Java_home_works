class HomeWork_2{
    public static void main(String[] args){
        Asus asus = new Asus();
        asus.showData();
        asus.terminal();
        asus.terminal("create");

        System.out.println();

        Acer acer = new Acer("Acer", "Windows");
        acer.showData();
        acer.cmd();
        acer.cmd("delete");
    }
}