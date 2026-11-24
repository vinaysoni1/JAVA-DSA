class Que_1 {
    public static void towerOfHanoi(int n, String src, String helper, String Des) {
        if(n==1){
            System.out.println("Transferred Disk " + n + " from " + src + " to " + Des);
            return;
        }

        towerOfHanoi(n - 1, src, Des, helper);
        System.out.println("Transferred Disk " + n + " from " + src + " to " + Des);
        towerOfHanoi(n - 1, helper, src, Des);
    }

    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "S", "H", "D");
    }
}