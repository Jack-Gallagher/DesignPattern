package factoryPattern;

public class Factory extends AbstractHumanFactory{

    @Override
    public <T extends Human> T createMan(Class<T> c) {
        Human human = null;
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("wrong man");
        }

        return (T) human;
    }
}
