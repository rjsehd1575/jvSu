void main() {
    final long LIGHTSPEED = 299_792_458;
    final float YEAR = 365.2425f;

    float hour = YEAR * 24;
    float minute = hour * 60;
    float second = minute * 60;
    long distance = (long) (second * LIGHTSPEED);

    System.out.printf("빛은 초당 %,d Km/s를 이동\n",LIGHTSPEED / 1000);
    System.out.printf("빛이 1년간 지나간 거리는 %,d Km 이다.\n",distance / 1000);
}