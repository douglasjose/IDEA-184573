package com.douglasjose.tech;

import org.gradle.api.DefaultTask;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.internal.artifacts.dependencies.DefaultExternalModuleDependency;
import org.gradle.api.tasks.TaskAction;

/**
 * Simple custom task that adds a dependency to the 'compile' configuration
 */
public class DependencyTask extends DefaultTask {

    @TaskAction
    public void apply() {
        ConfigurationContainer configurations = getProject().getConfigurations();
        Configuration compileConfiguration = configurations.getByName("compile");
        compileConfiguration.getDependencies().add(
                new DefaultExternalModuleDependency("org.apache.commons", "commons-lang3", "3.7"));
    }
    
}