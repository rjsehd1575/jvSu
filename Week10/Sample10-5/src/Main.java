void main() throws IOException {
    Scanner input = new Scanner(System.in);
    String[] name = {"Hong", "Lee", "Kim", "Kyung", "Yee"};
    int[] kor = {90, 87, 75, 100, 100};
    int[] math = {95, 90, 96, 99, 98};
    int[] eng = {90, 88, 100, 100, 75};

    int[] sum = new int[name.length];
    int[] rank = new int[name.length];
    float[] avg = new float[name.length];

    int i = 0;

    // 입력
    /*
    while (i < name.length) {
        System.out.printf("%s 학생의 국어, 수학, 영어 성적 입력 : ", name[i]);
        kor[i] = input.nextInt();
        math[i] = input.nextInt();
        eng[i] = input.nextInt();

        if ((kor[i] >= 0 && kor[i] <= 100) && (math[i] >= 0 && math[i] <= 100) &&
                (eng[i] >= 0 && eng[i] <= 100)) {
            i++;
        } else {
            System.err.println("Error. 점수는 0~100까지");
            System.in.read();
        }
    }
    */

    for (i = 0; i < name.length; i++) sum[i] = kor[i] + math[i] + eng[i];


    // 등수 부여
    for (i = 0; i < name.length; i++) avg[i] = sum[i] / 3.0f;

    for (i = 0; i < name.length; i++) rank[i] = i + 1;

    for (i = 0; i < name.length - 1; i++)
        for (int j = i + 1; j < name.length; j++)
            if (sum[i] == sum[j]) {
                rank[j] = rank[i];
            }

    for(i = 0; i< name.length; i++){
        int step = 1;
        for(int j =0; j< name.length; j++){

        }
    }



    System.out.println("*************************************");
    System.out.println(" 이름  국어  수학  영어  총점  평균  등수");
    System.out.println("*************************************");

    for (i = 0; i < name.length; i++) {
        System.out.printf(" %3s %3d %3d %3d %3d %.2f %2d\n",
                name[i], kor[i], math[i], eng[i], sum[i], avg[i], rank[i]);
    }
}