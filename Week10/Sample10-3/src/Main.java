void main(){
    Scanner input = new Scanner(System.in);
    String source;
    char[] reverse;

    System.out.print("영어 문장 입력 : ");
    source = input.nextLine();
    reverse = new char[source.length()];

    for(int i = 0; i<source.length(); i++){
        if(source.charAt(i) >= 'A' && source.charAt(i) <= 'Z'){
            reverse[i] = (char) (source.charAt(i) + 32);
        }else if(source.charAt(i) >= 'a' && source.charAt(i) <= 'z'){
            reverse[i] = (char) (source.charAt(i) - 32);
        }else reverse[i] = source.charAt(i);
    }

    System.out.printf("원본 : %s\n",source);
    System.out.printf("수정본 : %s\n", new String(reverse));
}