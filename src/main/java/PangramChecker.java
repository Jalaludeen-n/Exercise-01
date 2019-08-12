import java.util.HashSet;

public class PangramChecker {
    public boolean isPangram(String string) {
        if (string.isEmpty())
            return false;
        HashSet<Character> hashSet = new HashSet<>();
        String temp = string.toLowerCase();
        for (char Char : temp.toCharArray()) {
            if (Char >= 'a' && Char <= 'z')
                hashSet.add(Char);
        }
        return hashSet.size() == 26;

    }
}