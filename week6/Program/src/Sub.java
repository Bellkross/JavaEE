public class Sub extends Super {

    void signal() throws Exception{
        throw new Exception();
    }

    @Override
    public void method() {
        try {
            signal();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Sub sb = new Sub();
        sb.method();
    }

}
