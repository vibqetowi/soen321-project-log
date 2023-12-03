package kotlinx.coroutines.internal;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes2.dex */
public class f extends g {
    @Override // kotlinx.coroutines.internal.g
    public final boolean v() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.g
    public final boolean w() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}
