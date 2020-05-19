public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float imt = service.calculate();
        System.out.println(imt);
    }
}
