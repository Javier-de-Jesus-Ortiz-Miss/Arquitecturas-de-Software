package entrega;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Formatter {
    public List<String> applyFormat(List<String> names) {
        if (names == null || names.isEmpty()) {
            return names;
        }
        List<String> formattedNames = new ArrayList<>();
        for (String name : names) {
            String[] nameDivided = name.trim().split(" ");
            StringBuilder sb = new StringBuilder();
            for (String part : nameDivided) {
                if (part.isEmpty()) continue;
                part = part.toLowerCase();
                sb.append(Character.toUpperCase(part.charAt(0)));
                if (part.length() > 1) {
                    sb.append(part.substring(1));
                }
                sb.append(" ");
            }
            formattedNames.add(sb.toString().trim());
        }
        return formattedNames;
    }
    
    
}
