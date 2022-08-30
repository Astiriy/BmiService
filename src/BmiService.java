public class BmiService {
    public int calculate(int mass, double high) {
        int bmi = (int) (mass / (high * high));
        return bmi;
    }
}
