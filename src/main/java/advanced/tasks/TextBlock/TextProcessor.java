package advanced.tasks.TextBlock;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextProcessor {
    public static List<String> getFirstFiveUniqueWords (List<TextBlock> blocks) {
        return blocks.stream()
                .flatMap(block -> block.getLines().stream())
                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                .map(line -> line.toLowerCase())
                .distinct()
                .sorted()
                .limit(5)
                .collect(Collectors.toList());
    }
}
