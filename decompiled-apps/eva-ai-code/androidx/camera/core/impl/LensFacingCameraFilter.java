package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class LensFacingCameraFilter implements CameraFilter {
    private int mLensFacing;

    @Override // androidx.camera.core.CameraFilter
    public /* synthetic */ Identifier getIdentifier() {
        Identifier identifier;
        identifier = CameraFilter.DEFAULT_ID;
        return identifier;
    }

    public LensFacingCameraFilter(int i) {
        this.mLensFacing = i;
    }

    @Override // androidx.camera.core.CameraFilter
    public List<CameraInfo> filter(List<CameraInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (CameraInfo cameraInfo : list) {
            Preconditions.checkArgument(cameraInfo instanceof CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            Integer lensFacing = ((CameraInfoInternal) cameraInfo).getLensFacing();
            if (lensFacing != null && lensFacing.intValue() == this.mLensFacing) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }

    public int getLensFacing() {
        return this.mLensFacing;
    }
}
