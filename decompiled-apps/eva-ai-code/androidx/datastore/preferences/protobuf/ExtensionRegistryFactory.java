package androidx.datastore.preferences.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ExtensionRegistryFactory {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    ExtensionRegistryFactory() {
    }

    static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static ExtensionRegistryLite create() {
        if (EXTENSION_REGISTRY_CLASS != null) {
            try {
                return invokeSubclassFactory("newInstance");
            } catch (Exception unused) {
            }
        }
        return new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite createEmpty() {
        if (EXTENSION_REGISTRY_CLASS != null) {
            try {
                return invokeSubclassFactory("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isFullRegistry(ExtensionRegistryLite extensionRegistryLite) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        return cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass());
    }

    private static final ExtensionRegistryLite invokeSubclassFactory(String str) throws Exception {
        return (ExtensionRegistryLite) EXTENSION_REGISTRY_CLASS.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
