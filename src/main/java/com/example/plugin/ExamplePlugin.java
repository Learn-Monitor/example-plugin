package com.example.plugin;

import de.igslandstuhl.database.modules.WebModule;
import de.igslandstuhl.database.modules.config.ModuleConfig;

@WebModule.Module
public class ExamplePlugin extends WebModule {
    @Override
    protected void onLoad() {
        System.out.println("ExamplePlugin loaded!");
    }

    @Override
    protected void onEnable() {}

    @Override
    protected void onDisable() {}

    @Override
    public ModuleConfig<?> getConfig() {
        return null;
    }
}