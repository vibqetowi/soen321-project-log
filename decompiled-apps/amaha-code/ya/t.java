package ya;

import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public final class t implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public final qa.a f38414u = new qa.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f38414u.post(runnable);
    }
}
