package mi;

import java.util.Observable;
/* compiled from: SyncCompleteObservable.kt */
/* loaded from: classes.dex */
public final class s1 extends Observable {
    public final void a(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        setChanged();
        notifyObservers(sdkInstance);
    }
}
