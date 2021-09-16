package creationalPatterns.factoryPattern;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createMan(Class<T> c);
}
