package lowOfDeteter.instance;

import java.lang.invoke.VarHandle;

/**
 * @Author：Jack
 * @Date： 2021/8/21 - 22:34
 * @Description： lowOfDeteter.instance
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {
        Installer installer = new Installer();
        final Wizard wizard = new Wizard();
        installer.install(wizard);

    }
}
