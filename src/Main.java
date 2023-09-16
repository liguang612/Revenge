import controller.HomepageController;
import view.Homepage;

class Main {
    public static void main(String[] args) {  
        Homepage homepage = new Homepage();
        new HomepageController(homepage);
    }
}