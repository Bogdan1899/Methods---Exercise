import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingTool {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String figureType = bfr.readLine();
        int size = Integer.parseInt(bfr.readLine());
        CorDraw corDraw;

        if (figureType.equals("Square")){
            corDraw = new CorDraw(new Square(size));
        } else {
            int seconSize = Integer.parseInt(bfr.readLine());
            corDraw = new CorDraw(new Rectangle(size, seconSize));
        }

        System.out.println(corDraw.getShape());
    }
}
