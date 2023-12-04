package androidx.camera.view.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Quirk> loadQuirks() {
        ArrayList arrayList = new ArrayList();
        if (SurfaceViewStretchedQuirk.load()) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (SurfaceViewNotCroppedByParentQuirk.load()) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
