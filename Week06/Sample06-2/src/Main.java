void main() {
    Scanner input = new Scanner(System.in);

    final float GOLD = 3.75f;
    int goldValue = 910000;
    float weight;
    float don;

    System.out.print("당신의 체중은? ");
    weight = input.nextFloat();

    /*int intweight = (int) weight;
    float reminder = weight - intweight;
    int gram = (int) (intweight * 1000 + reminder * 1000);*/

    int gram = (int) (weight * 1000);
    don = gram * GOLD;
    long price = (long)(don * goldValue);
    price /= 1000;
    price *= 1000;

    System.out.printf("%.2f kg -> %,d g\n",weight, gram);
    System.out.printf("%.2f kg -> %.2f 돈\n",weight, don);
    System.out.printf("%.2f kg -> %,d 원\n",weight,price);
}