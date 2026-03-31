package ar.edu.unlp.info.oo1;

public class IntRing extends ElementRing {
    private int[] source;

    public IntRing(int[] src) {
        super();
        source = src;
    }

    public int next() {
        return source[nextIndex(this.source.length)];
    }

}
