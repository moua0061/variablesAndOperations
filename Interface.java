public interface Interface {
    // when a class implements an interface, it must

    // an interface only has abstract method(s)
    // abstract methods does not include brackets {}
    public void info(String info);

    public void warning(String warning);

    public void error(String error);

    public void fatal(String fatal);

    public void close();
}
