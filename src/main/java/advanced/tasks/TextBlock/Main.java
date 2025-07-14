package advanced.tasks.TextBlock;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextBlock block1 = new TextBlock(Arrays.asList("Hello world", "Stream API is powerful"));
        TextBlock block2 = new TextBlock(Arrays.asList("Hello Java", "API is design matter"));

        List<TextBlock> blocks = Arrays.asList(block1,block2);
        List<String> result =TextProcessor.getFirstFiveUniqueWords(blocks);
        System.out.println(result);
    }
}
