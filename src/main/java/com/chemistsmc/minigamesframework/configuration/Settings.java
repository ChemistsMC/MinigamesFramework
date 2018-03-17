package com.chemistsmc.minigamesframework.configuration;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.SettingsManager;
import ch.jalu.configme.migration.MigrationService;
import ch.jalu.configme.migration.PlainMigrationService;
import ch.jalu.configme.resource.YamlFileResource;

import java.io.File;

/**
 * Settings class to get all of the framework's settings.
 */
public class Settings extends SettingsManager
{

    @SafeVarargs
    private Settings(YamlFileResource file, MigrationService migrator, Class<? extends SettingsHolder>... settingHolders)
    {
        super(file, migrator, settingHolders);
    }

    /**
     * Method to create a new Settings object.
     *
     * @param file The configuration file.
     * @return The created Settings instance.
     */
    public static Settings create(File file)
    {
        YamlFileResource yaml = new YamlFileResource(file);
        MigrationService migrator = new PlainMigrationService();

        // TODO: There's gotta be a better way of passing the classes...
        return new Settings(yaml, migrator, FrameworkSettings.class);
    }
}
