package tests;
import app.Application;
import org.junit.Test;
public class AddToCartTest extends BaseTest{
    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 3; i++){
            app.addItemToCart();
        }
        app.deleteItems();
        //app.quit();
    }
}
