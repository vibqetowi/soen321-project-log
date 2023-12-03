package d5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: Executors.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12189a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f12190b = new b();

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    public class a implements Executor {

        /* renamed from: u  reason: collision with root package name */
        public final Handler f12191u = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f12191u.post(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
