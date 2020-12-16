package calculadora;

public class request implements java.io.Serializable {
    private float val1;
    private float val2;
    public request(float val1, float val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
    public float getVal1() {
        return val1;
    }
    public float getVal2() {
        return val2;
    }
}