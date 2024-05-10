public class StringMethod {
    public static void main (String[] args){
        String name = "Hallo Guys, How are you today?";

        // 1. length
        System.out.println("Hasilnya dari method length adalah :" + name.length());

        // 2. substring
        System.out.println("Hasilnya dari method substring adalah :" + name.substring(5,8));
        System.out.println("Hasilnya dari method substring adalah :" + name.substring(5, name.length()));
        
        // 3. charAt
        System.out.println("Hasilnya dari method charArt adalah huruf :" + name.charAt(7));
        
        // 4. toLowerCase
        System.out.println("Hasilnya dari method toLowerCase adalah :" + name.toLowerCase());
        
        // 5. toUpperCase
        System.out.println("Hasilnya dari method toUPperCase adalah :" + name.toUpperCase());
        
        // 6. replace
        System.out.println("Hasilnya dari method replace (karakter) adalah :" + name.replace('y','i'));
        System.out.println("Hasilnya dari method replace (kata) adalah :" + name.replace("Guys","sist"));
        
        // 7. contains
        System.out.println("Hasilnya dari method contains (are)  adalah :" + name.contains("are"));
        System.out.println("Hasilnya dari method contains (me) adalah :" + name.contains("me"));
        
        // 8. equals
        System.out.println("Hasilnya dari method equals (semua karakter sama huruf besar dan kecilnya) adalah :" + name.equals("Hallo Guys, How are you today?"));
        System.out.println("Hasilnya dari method equals (semua karakter tidak sama huruf besar dan kecilnya) adalah :" + name.equals("Hallo Guys, How are you today?"));
        
        // 9. equalsIgnoreCase
        System.out.println("Hasilnya dari method equalsIgnoreCase adalah :" + name.equalsIgnoreCase("Hallo Guys, HoW Are yoU today?"));
        
        // 10. endsWith
        System.out.println("Hasilnya dari method endsWith adalah :" + name.endsWith("?"));
        System.out.println("Hasilnya dari method endsWith adalah :" + name.endsWith("Y"));
        System.out.println("Hasilnya dari method endsWith adalah :" + name.endsWith("you"));

    }
}