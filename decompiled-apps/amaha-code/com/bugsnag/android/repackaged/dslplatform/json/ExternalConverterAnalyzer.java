package com.bugsnag.android.repackaged.dslplatform.json;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
class ExternalConverterAnalyzer {
    private final ClassLoader[] classLoaders;
    private final Set<String> lookedUpClasses = new HashSet();

    public ExternalConverterAnalyzer(Collection<ClassLoader> collection) {
        this.classLoaders = (ClassLoader[]) collection.toArray(new ClassLoader[0]);
    }

    private String[] resolveExternalConverterClassNames(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return new String[]{String.format("_%s_DslJsonConverter", str)};
        }
        String substring = str.substring(0, lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        return new String[]{String.format("%s._%s_DslJsonConverter", substring, substring2), String.format("dsl_json.%s._%s_DslJsonConverter", substring, substring2), String.format("dsl_json.%s.%sDslJsonConverter", substring, substring2)};
    }

    public synchronized boolean tryFindConverter(Class<?> cls, DslJson<?> dslJson) {
        ClassLoader[] classLoaderArr;
        Class<?> loadClass;
        String name = cls.getName();
        if (!this.lookedUpClasses.add(name)) {
            return false;
        }
        String[] resolveExternalConverterClassNames = resolveExternalConverterClassNames(name);
        for (ClassLoader classLoader : this.classLoaders) {
            for (String str : resolveExternalConverterClassNames) {
                try {
                    loadClass = classLoader.loadClass(str);
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                }
                if (Configuration.class.isAssignableFrom(loadClass)) {
                    ((Configuration) loadClass.newInstance()).configure(dslJson);
                    return true;
                }
            }
        }
        return false;
    }
}
