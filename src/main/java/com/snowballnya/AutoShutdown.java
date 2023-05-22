package com.snowballnya;

import org.bukkit.plugin.java.JavaPlugin;

public class AutoShutdown extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("AutoShutdown插件已启用！");
        getServer().shutdown();
    }

    @Override
    public void onDisable() {
        getLogger().info("AutoShutdown插件已禁用！");
    }
}
