package ar.edu.unlp.info.oo1;

public class CharRing extends ElementRing{
    private char[] source;

    public CharRing(String src) {
        super();
        source = src.toCharArray();
    }

    public char next() {
        return source[nextIndex(this.source.length)];
    }
}
