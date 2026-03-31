package ar.edu.unlp.info.oo1;

public abstract class ElementRing {
    protected int idx;

    public ElementRing() {
        this.idx = 0;
    }

    protected int nextIndex(int length) {
        if (idx >= length)
            idx = 0;
        return idx++;
    }
}
