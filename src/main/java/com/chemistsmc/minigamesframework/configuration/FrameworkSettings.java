package com.chemistsmc.minigamesframework.configuration;

import ch.jalu.configme.Comment;
import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.properties.Property;

import static ch.jalu.configme.properties.PropertyInitializer.newProperty;

public class FrameworkSettings implements SettingsHolder
{

    @Comment("Print out debug messages to the console")
    public static final Property<Boolean> USE_DEBUG =
            newProperty("use-debug", false);
}
