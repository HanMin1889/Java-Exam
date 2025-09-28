import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

public class UsingToArray {
    public static void main(String[] args) {
    
        String[] colors = {"black", "blue", "yellow"};
        List<String> links = new LinkedList<String>(Arrays.asList(colors));

        links.addLast("red"); 
        links.add("pink"); 
        links.addFirst("cyan"); 

        colors = links.toArray(new String[links.size()]);

        System.out.println("colors: ");
        for (String color : colors) {
            System.out.println(color);
        }
    } 
} 