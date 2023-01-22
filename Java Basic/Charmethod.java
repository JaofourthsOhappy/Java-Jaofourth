class Charmethod {
    public static void main(String[] args) {
        char a = '2';
        char b = 'c';
        char c = 'D';
        System.out.println(Character.isLetter(a)); //check that is a letter(ตัวอักษร)
        System.out.println(Character.isLetter(b));
        System.out.println(Character.isDigit(a)); // check that is a digit(ตัวเลข)
        System.out.println(Character.isDigit(b));

        if(Character.isUpperCase(c)){
            System.out.println("Is Uppercase");
        }
        if(Character.isLowerCase(b)){
            System.out.println("Is Lowercase");
        }
        System.out.println(Character.toUpperCase(b));
        System.out.println(Character.toLowerCase(c));
    }

}
