package stacks;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        
        var split = path.split("/");
        for (String c: split) {
            if (c.equals("") || c.equals(".")) {
                continue;
            }

            if (c.equals("..")) {
                if (!s.isEmpty())
                    s.pop();
                continue;
            }
            s.add(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.insert(0, s.pop());
            sb.insert(0, "/");
        }
        if (sb.isEmpty()) {
            sb.append("/");
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        var sol = new SimplifyPath();
        String path = "/../";
        System.out.println(sol.simplifyPath(path));
    }
}
