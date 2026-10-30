class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vinay");
        // System.out.println(sb);

        // char at index 0
        // System.out.println(sb.charAt(0));

        // set char at index 0
        // sb.setCharAt(0,'s');
        // System.out.println(sb);

        // insert
        // sb.insert(2, "n");
        // System.out.println(sb);

        // // delete the extra
        // sb.delete(2,3);
        // System.out.println(sb);

        // appends
        // sb.append('i');
        // sb.append('n');
        // sb.append('a');
        // sb.append('y');
        // System.out.println(sb);
        // System.out.println(sb.length());

        // reverse
        // sb.reverse();
        // System.out.println(sb);

        // substring
        String str = sb.substring(1, 3);
        System.out.println(str);
    }
}