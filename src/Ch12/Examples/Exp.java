package Ch12.Examples;

public class Exp {
    public Foo doRiskyThing(String s) throws Exception {
        if ("yes".equals(s))
            throw new Exception();
        return new Foo();
    }
}
