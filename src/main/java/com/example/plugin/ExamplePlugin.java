package com.example.plugin;

import de.igslandstuhl.database.plugins.Plugin;

public class ExamplePlugin extends Plugin {
    private ExamplePluginConfig config;

    @Override
    protected void onLoad() {
        config = new ExamplePluginConfig(this);
        getLogger().info("Example plugin loaded.");
    }

    @Override
    protected void onEnable() {}

    @Override
    protected void onDisable() {}

    @Override
    public ExamplePluginConfig getConfig() {
        return config;
    }
}