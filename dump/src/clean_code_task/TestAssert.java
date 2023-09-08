package clean_code_task;

public class TestAssert {
    public static void main(String[] args) {
        test(1);
    }

    public static void test(int i){
        assert i>=0;
    }
}
