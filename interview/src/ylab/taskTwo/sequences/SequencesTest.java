package ylab.taskTwo.sequences;

public class SequencesTest {
    public static void main(String[] args) {
        Sequences sequences = new SequencesImpl();
        byte example = 7;
        sequences.a(example);//A. 2, 4, 6, 8, 10, 12, 14,
        sequences.b(example);//B. 1, 3, 5, 7, 9, 11, 13,
        sequences.c(example);//C. 1, 4, 9, 16, 25, 36, 49,
        sequences.d(example);//D. 1, 8, 27, 64, 125, 216, 343,
        sequences.e(example);//E. 1, -1, 1, -1, 1, -1, 1,
        sequences.f(example);//F. 1, -2, 3, -4, 5, -6, 7,
        sequences.g(example);//G. 1, -4, 9, -16, 25, -36, 49,
        sequences.h(example);//H. 1, 0, 2, 0, 3, 0, 4,
        sequences.i(example);//I. 1, 2, 6, 24, 120, 720, 5040,
        sequences.j(example);//J. 1, 1, 2, 3, 5, 8, 13,
    }
}
