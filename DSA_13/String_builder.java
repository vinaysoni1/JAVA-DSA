class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vinay");
        System.out.println(sb);


        //  char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0,'s');
        System.out.println(sb);
    }
}