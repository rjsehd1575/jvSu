void main() throws IOException {
    int sum;
    int[] score;

    Input input = new Input();
    score = input.readData(Subject.values().length);

    Compute compute = new Compute();
    sum = compute.calcTotal(score);

    Output output = new Output();
    output.display(score,sum);
}