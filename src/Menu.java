
public class Menu {

    public void Run(){
        while (MenuItem.isRunning){
            new MenuItem();
        }
    }
}
