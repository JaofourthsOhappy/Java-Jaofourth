class Stringmethod {
    public static void main(String[] args) {
        // นิยาม string
        String name = "Fourth";
        String name2 = new String("Amm");

        System.out.println(name + " " + name2);

        // length
        int count = name.length();
        System.out.println(count);

        // find point
        System.out.println(name.charAt(3));

        String message = "Happy New Years 2022 || Happy Birthday 2022";
        System.out.println("Before:"+ message);
        message = message.replace("2022", "2023");
        System.out.println("After:"+ message);

        String data = "Mango,Bananan,Apple,Watermelon";
        String [] fruit = data.split(",");
        System.out.println(fruit[2]);


        String eiei = "          Sittanat       ";
        eiei = eiei.trim();
        System.out.println(eiei);


        int number = 100;
        String result = String.valueOf(number);
        System.out.println(result);
    }
}
