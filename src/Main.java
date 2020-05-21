public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = (float) 1.83;
        float weight = 61;
        float imt = service.calculate(height, weight);
        System.out.println(imt);
    }
}
