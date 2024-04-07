public class String_Compression {
    public static int compress(char[] chars) {

        // StringBuilder to build the compressed string
        StringBuilder sb = new StringBuilder();
        int i = 1;          // i----> Index
        int count = 1;      // Count of consecutive repeated characters

        sb.append(chars[0]);  // Append the first character to the StringBuilder

        while (i < chars.length) {
            // If the current character is the same as the previous character
            if (chars[i] == chars[i - 1]) {
                count++; // Increment the count of consecutive repeated characters
            } 
            else {
                // If it's a new character
                if (count > 1) {
                    sb.append(count);  // Append the count of the previous consecutive repeated characters
                }
            
                sb.append(chars[i]);   // Append the new character to the StringBuilder
                count = 1;             // Reset the count for new characters
            }

            i++;      // Move to the next character
        }

        // After the loop, append the count for the last set of consecutive repeated characters
        if (count > 1) {
            sb.append(count);
        }

        // Copy the compressed string from the StringBuilder to the input char array
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }

        // Return the length of the compressed string
        return sb.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'a', 'b', 'b', 'c', 'd', 'd', 'd', 'a', 'e', 'e', 'e'};
        int compressedLength = compress(chars);

        // Print the compressed characters
        for (int i = 0; i < compressedLength; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println(compressedLength);         // Print the length of the compressed string
        
    }
}