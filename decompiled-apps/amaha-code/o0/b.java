package o0;

import android.os.Bundle;
import android.os.IBinder;
/* compiled from: Bundle.kt */
/* loaded from: classes.dex */
public final class b {
    public static final void a(Bundle bundle, String key, IBinder iBinder) {
        kotlin.jvm.internal.i.g(bundle, "bundle");
        kotlin.jvm.internal.i.g(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
