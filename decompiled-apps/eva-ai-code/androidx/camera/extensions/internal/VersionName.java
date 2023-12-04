package androidx.camera.extensions.internal;
/* loaded from: classes.dex */
public class VersionName {
    private static final VersionName CURRENT = new VersionName("1.1.0");
    private final Version mVersion;

    public static VersionName getCurrentVersion() {
        return CURRENT;
    }

    public Version getVersion() {
        return this.mVersion;
    }

    public VersionName(String str) {
        this.mVersion = Version.parse(str);
    }

    VersionName(int i, int i2, int i3, String str) {
        this.mVersion = Version.create(i, i2, i3, str);
    }

    public String toVersionString() {
        return this.mVersion.toString();
    }
}
