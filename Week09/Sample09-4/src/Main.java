void main() {
    final int START = 1;
    final int END = 100;
    int total = 0;

    for (int i = START; i <= END; i++) {
        if (i % 3 == 0) continue;
        total += i;
    }
    System.out.printf("%d + %d + ...... + %d + %d = %d", START, START + 1, END - 1, END, total);
    System.out.println();

    total = 0;
    for (int i = START; i <= END; i++) {
        if (i % 3 == 0 && i % 5 != 0) continue;
        total += i;
    }
    System.out.printf("%d + %d + ...... + %d + %d = %d", START, START + 1, END - 1, END, total);
    System.out.println();

}
