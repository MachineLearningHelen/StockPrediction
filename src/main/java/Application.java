import Test.Tester;
import Train.Learner;
import Train.Model;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by oradchykova on 5/18/17.
 */
public class Application {
    public static void main(String[] args) {
        try {
            Model model = Learner.learn(new File("Stock.txt"), 1000, 80);
            //System.out.println(model.computeRatio(1.2951, 1.2970-1.2884));
            Tester.getRoc(model, new File("Stock.txt"), 1000, 15, new File("Roc.txt"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
