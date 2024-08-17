package me.liam.productiveplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.reflections.Reflections;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Automatic Reflection Based Listener Registered.");
        reg("Enabled");
    }
    private void reg(String string){
        if (!(string.equals("Enabled"))) return;

        String packages = getClass().getPackage().getName();
        for (Class<? extends Listener> classes : new Reflections(packages + ".Listeners").getSubTypesOf(Listener.class)) {
            try {
                Constructor<? extends Listener> constructor = classes.getConstructor();
                Listener listener = constructor.newInstance();
                getServer().getPluginManager().registerEvents(listener, this);
            }catch
            (InstantiationException
             | IllegalAccessException |
             NoSuchMethodException |
             InvocationTargetException e)
            {
                throw new
                        RuntimeException("Error on listener: " + classes.getName(), e);
            }
        }
    }
}


