void main() {
    int[] score = {95, 70, 80, 75, 100};
    int total = 0;
    float avg;

    for (int k : score) {
        total += k;
    }
    avg = (float)total/ score.length;

    for (int j : score) {
        System.out.println(j);
    }

    System.out.println("총점 : " + total);
    System.out.println("평균 : "+ avg);
}