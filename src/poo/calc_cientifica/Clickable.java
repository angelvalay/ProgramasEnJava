package poo.calc_cientifica;

public interface Clickable<T> {
    T onClickOperand(T key) throws Exception;

    T onClickOperator(T key) throws Exception;
}
