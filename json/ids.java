package json;
import java.util.UUID;

public class ids {

    public static void main(String [] args) {
        int i = 0;
        while(i < 10) {
            UUID uuid = UUID.randomUUID();
            String tempString = uuid.toString();
            System.out.println(tempString+"\n");
            i++;
        }
    }
}