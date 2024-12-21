public class StringEncryptor03 {
    public static String encryptString(String s ,int k ) {
    int n = s.length();
    StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < n; i++) {
        int newIndex = (i+k)%n;

        encrypted.append(s.charAt(newIndex));
    }
        return encrypted.toString();

}
//
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 3;
        System.out.print(encryptString(s, k));
    }
}
