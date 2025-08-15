public class String_buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Malik");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Abdul");
        System.out.println(sb);

        sb.deleteCharAt(7);
        System.out.println(sb);

        sb.insert(5, " java");
        System.out.println(sb);
    }
}
