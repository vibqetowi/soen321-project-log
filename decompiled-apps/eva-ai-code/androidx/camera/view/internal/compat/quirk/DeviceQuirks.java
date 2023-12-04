package androidx.camera.view.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;
/* loaded from: classes.dex */
public class DeviceQuirks {
    private static final Quirks QUIRKS = new Quirks(DeviceQuirksLoader.loadQuirks());

    private DeviceQuirks() {
    }

    public static <T extends Quirk> T get(Class<T> cls) {
        return (T) QUIRKS.get(cls);
    }
}
