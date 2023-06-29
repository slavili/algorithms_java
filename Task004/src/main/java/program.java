import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program {
    public static void main(String[] args) throws IOException {

        BinaryTree tree = new BinaryTree();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int value = Integer.parseInt(reader.readLine());
            tree.addNode(value);
            tree.print();
        }
    }

}
