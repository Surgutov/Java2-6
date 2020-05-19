public class BmiService {
    public float calculate() {
        float height = (float) 1.83;
        float weight = (float) 60;
        float extent = height * height;
        //возведение в квадрат, по другому не знаю как
        float imt = weight / extent;
        return imt;
    }

}
