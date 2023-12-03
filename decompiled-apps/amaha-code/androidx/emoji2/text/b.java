package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
/* compiled from: ConcurrencyHelpers.java */
/* loaded from: classes.dex */
public final class b {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
