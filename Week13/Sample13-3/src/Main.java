void main() throws IOException {
    int radius;
    double area;

    radius = Input.readData("원의 반지름");

    area = Compute.calcArea(radius);

    Output.display("원의 반지름", radius);
    Output.display("원의 면적", area);
}