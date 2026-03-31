package com.example.plugin;

import de.igslandstuhl.database.plugins.config.BoolSetting;
import de.igslandstuhl.database.plugins.config.PluginConfig;
import de.igslandstuhl.database.plugins.config.PluginSetting;

public class ExamplePluginConfig extends PluginConfig<ExamplePlugin> {
    private final BoolSetting exampleSetting;

    private ExamplePluginConfig(ExamplePlugin plugin, BoolSetting exampleSetting) {
        super(plugin, new PluginSetting[] {exampleSetting});
        this.exampleSetting = exampleSetting;
    }
    ExamplePluginConfig(ExamplePlugin plugin) {
        this(plugin,
            new BoolSetting("example", "Example Setting", "Does nothing", false)
        );
    }

    public boolean isExample() {
        return exampleSetting.isEnabled();
    }
}
