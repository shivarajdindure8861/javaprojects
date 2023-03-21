import javax.crypto.spec.IvParameterSpec;

import com.axis.input.CartDataInput;
import com.axis.itemController.ItemController;
import com.axis.itemController.ItemDb;
import com.axis.shoping.cart.CartController;
import com.axis.shoping.cart.CartMenu;
import com.axis.user.UserController;
import com.axis.user.UserMenu;

public class App {
    public static void main(String[] args) throws Exception {
        ItemDb.addItem(1, "pen", 10);
        ItemDb.addItem(2, "eraser", 5);
        ItemDb.addItem(3, "pencil", 8);
        ItemDb.addItem(4, "sharpner", 5);
        ItemDb.addItem(5, "ruler", 30);
        ItemDb.addItem(6, "notebook", 120);
        ItemDb.addItem(7, "bag", 800);
        ItemDb.addItem(8, "bottle", 300);
        ItemDb.addItem(9, "sparkles", 100);
        ItemDb.addItem(10, "colors", 450);

        CartDataInput ip = new CartDataInput();

        UserController userController = new UserController();
        CartController cartController = new CartController();
        ItemController itemController = new ItemController();
        CartMenu cartMenu = new CartMenu();
        UserMenu menu = new UserMenu(ip, userController, cartController, cartMenu, itemController);
        menu.performAction();

    }
}
