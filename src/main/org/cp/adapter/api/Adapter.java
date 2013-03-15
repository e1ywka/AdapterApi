package org.cp.adapter.api;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.InputStream;

public abstract class Adapter {

    public abstract String id();

    public static void loadTemplate(AdapterTemplate template, InputStream stream) throws AdapterException {
        if (template.version().areTemplatesCrypted()) {
            throw new AdapterException();
        }
    }

    //public static List<AdapterVersion> availibleVersions() { } - список версий
    //public static List<AdapterTemplate> availibleTemplates(AdapterVersion)


    protected static InputStream loadTemplateFromResources(AdapterTemplate template) {
        throw new NotImplementedException();
    }
}
