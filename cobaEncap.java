public class cobaEncap{
    public static void main(String[] args){
        App app = new App();
        app.setAppName("INI NAMA");
        System.out.println(app.getAppName());
    }
}

class App{
    private String appName;
    
    public void setAppName(String nama){
        this.appName = nama;
    }
    public String getAppName(){
        return this.appName;
    }
}