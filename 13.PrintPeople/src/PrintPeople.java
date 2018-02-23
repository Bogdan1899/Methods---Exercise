import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrintPeople {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();

        String[] inputArgs = bfr.readLine().split(" ");

        while (!inputArgs[0].equals("END")){
            people.add(new Person(inputArgs[0], Integer.parseInt(inputArgs[1]), inputArgs[2]));

            inputArgs = bfr.readLine().split(" ");
        }

        people.stream().sorted().forEach(a -> System.out.println(a.toString()));
    }
}
