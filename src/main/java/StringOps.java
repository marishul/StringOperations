public class StringOps {

    public static void main(String[] args) {
        String str1 = "Songs are our weapons, our power of powers,\nOur gold — our voices — just hear us sing!\n";
        String str2 = "Meadow, lie green on the earth!\nWith silk our days for us line!";
        String str3 = (str1.concat(str2));

        System.out.println(str2.indexOf('s', 5));
        System.out.println(str3.indexOf("weapons"));
        System.out.print("\n");

        if ((str1.length() + str2.length() == str3.length())) {
            System.out.println("Concatenation provides the same length");
            System.out.print("\n");
        } else {
            System.out.println("Smth going wrong");
            System.out.print("\n");
        }

        System.out.println(str3.substring(14, 21));
        System.out.print("\n");

        System.out.println(str1.replaceAll("weapons", "Bazinga!"));

        System.out.println((str1.concat(str2)).equals(str3));
    }
}
