package hackkerrank.medium;

public class RenameFile {
    static int count = 0;
    public static int renameFile(String newName, String oldName) {
        // Write your code here
       
        int j = 0;
        int i = 0;
        while (i < oldName.length()) {
            int match = 0;
            j = i;
            while (j < oldName.length()) {
                if (oldName.charAt(j) == newName.charAt(j)) {
                    j++;
                    match++;
                } else if (oldName.charAt(j) != newName.charAt(j) && match == newName.length()) { // done
                    count++;

                }
                else {
                    
                }
            }
        }

        return 0;

    }

    public static int renameHelper(String name, int index, String arr) {
        return 0;
    }

    public static void main(String[] args) {
        String newName = "aba";
        String oldName = "ababa";
        System.out.println(renameFile(newName, oldName));
    }

}
