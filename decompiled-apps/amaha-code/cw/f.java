package cw;
/* compiled from: SystemLibraryLoader.java */
/* loaded from: classes2.dex */
public final class f implements c {
    public final String a(String str) {
        if (str.startsWith("lib") && str.endsWith(".so")) {
            return str;
        }
        return System.mapLibraryName(str);
    }
}
