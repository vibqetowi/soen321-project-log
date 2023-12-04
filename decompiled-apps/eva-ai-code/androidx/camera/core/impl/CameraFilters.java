package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class CameraFilters {
    public static final CameraFilter ANY = new CameraFilter() { // from class: androidx.camera.core.impl.CameraFilters$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            return CameraFilters.lambda$static$0(list);
        }

        @Override // androidx.camera.core.CameraFilter
        public /* synthetic */ Identifier getIdentifier() {
            Identifier identifier;
            identifier = CameraFilter.DEFAULT_ID;
            return identifier;
        }
    };
    public static final CameraFilter NONE = new CameraFilter() { // from class: androidx.camera.core.impl.CameraFilters$$ExternalSyntheticLambda1
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            List emptyList;
            emptyList = Collections.emptyList();
            return emptyList;
        }

        @Override // androidx.camera.core.CameraFilter
        public /* synthetic */ Identifier getIdentifier() {
            Identifier identifier;
            identifier = CameraFilter.DEFAULT_ID;
            return identifier;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List lambda$static$0(List list) {
        return list;
    }

    private CameraFilters() {
    }
}
