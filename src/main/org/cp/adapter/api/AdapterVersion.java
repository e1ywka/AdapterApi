package org.cp.adapter.api;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Map;

public final class AdapterVersion {

    public static final String VERSION = "Version";
    public static final String AUTHOR = "Author";
    public static final String DESCRIPTION = "Description";
    public static final String CRYPT_ALGORITHM = "CryptAlgorithm";
    public static final String ARE_TEMPLATES_CRYPTED = "AreTemplatesCrypted";

    private String version;
    private String author;
    private String description;
    private String cryptAlgorithm;

    AdapterVersion(Map<String, String> attributes) {
        
    }

    public String version() {
        return this.version;
    }
    public String author() {
        return this.author;
    }
    public String description() {
        return this.description;
    }
    public String cryptAlgorithm() {
        return this.cryptAlgorithm;
    }
    public boolean areTemplatesCrypted() { throw new NotImplementedException(); }
}
