package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateObserver.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapshotStateObserver$sendNotifications$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$sendNotifications$1(SnapshotStateObserver snapshotStateObserver) {
        super(0);
        this.this$0 = snapshotStateObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableVector mutableVector;
        boolean z;
        boolean drainChanges;
        MutableVector mutableVector2;
        do {
            mutableVector = this.this$0.observedScopeMaps;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (mutableVector) {
                z = snapshotStateObserver.sendingNotifications;
                if (!z) {
                    snapshotStateObserver.sendingNotifications = true;
                    mutableVector2 = snapshotStateObserver.observedScopeMaps;
                    int size = mutableVector2.getSize();
                    if (size <= 0) {
                        snapshotStateObserver.sendingNotifications = false;
                    } else {
                        Object[] content = mutableVector2.getContent();
                        int i = 0;
                        do {
                            ((SnapshotStateObserver.ObservedScopeMap) content[i]).notifyInvalidatedScopes();
                            i++;
                        } while (i < size);
                        snapshotStateObserver.sendingNotifications = false;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            drainChanges = this.this$0.drainChanges();
        } while (drainChanges);
    }
}
