package ru.netology;

public class MaxTextABC<T, C> {
    protected T text;
    protected C count;

    public void setText(T text) {
        this.text = text;
    }

    public void setCount(C count) {
        this.count = count;
    }

    public T getText() {
        return text;
    }

    public C getCount() {
        return count;
    }
}
