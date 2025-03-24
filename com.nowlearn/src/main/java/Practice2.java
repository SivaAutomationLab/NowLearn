public class Practice2 {

    public static void main(String[] args) {
Practice2 p = new Practice2();

        p.add();
        p.add(3);
        p.add(2, 2);



    }

    public void add() {
        String s = "Yes";
        int len = s.length();
        //System.out.println(len);
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

    }
    public void add(int n){
        System.out.println(n);
    }
    public void add(int i, int j){
        System.out.println(i+j);
    }

}
