public class BmiService {
    public float calculate(float height, float weight) {
        float extent = height * height;
        //возведение в квадрат, по другому не знаю как
        float imt = weight / extent;
        return imt;
    }

}
