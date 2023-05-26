public class BmiService {
    public int calculate(double index) {
        int body = (int) (60 / (index * index));
        return body;
    }

}
