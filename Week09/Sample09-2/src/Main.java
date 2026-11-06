void main() {
    final int STAR = 20;
    for (int i = 1; i <= 5; i++) {
        System.out.println("********************");
    }
    System.out.println();

    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= STAR; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println();

    for(int i = 1; i <= 5; i++){
        int j = 0;
        while(j < STAR){
            System.out.print("*");
            j++;
        }
        System.out.println();
    }
}
