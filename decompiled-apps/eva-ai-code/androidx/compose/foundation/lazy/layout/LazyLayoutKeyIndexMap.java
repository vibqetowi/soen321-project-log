package androidx.compose.foundation.lazy.layout;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LazyLayoutKeyIndexMap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "", "getIndex", "", "key", "getKey", FirebaseAnalytics.Param.INDEX, "Empty", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyLayoutKeyIndexMap {
    public static final Empty Empty = Empty.$$INSTANCE;

    int getIndex(Object obj);

    Object getKey(int i);

    /* compiled from: LazyLayoutKeyIndexMap.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap$Empty;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "()V", "getIndex", "", "key", "", "getKey", "", FirebaseAnalytics.Param.INDEX, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Empty implements LazyLayoutKeyIndexMap {
        static final /* synthetic */ Empty $$INSTANCE = new Empty();

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public int getIndex(Object key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return -1;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public Void getKey(int i) {
            return null;
        }

        private Empty() {
        }
    }
}
