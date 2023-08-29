public class Main {
    public static boolean isPalindrome(String s){
        String cls = s.replaceAll("[^a-zA-Zа-яА-Я0-9]", ""); //Создаем подстроку, в которую включены только буквы и цифры
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < (cls.length() / 2); i++){
            s1 += cls.charAt(i);
            s2 += cls.charAt(cls.length() - (i+1));
        }
        return s1.equalsIgnoreCase(s2);
    }
    public static void main(String[] args) {
        //Проверка работоспособности алгоритма на следующих примерах
        System.out.println(" 'zx 123 321 xz' - "+isPalindrome("zx 123 321 xz")); //true
        System.out.println(" 'Bob' - "+isPalindrome("Bob")); //true
        System.out.println(" '121' - "+isPalindrome("121")); //true
        System.out.println(" 'I'm MI' - "+isPalindrome("I'm MI")); //true
        System.out.println(" 'APAC' - "+isPalindrome("APAC")); //false
        System.out.println(" '339' - "+isPalindrome("339")); //false
    }
}