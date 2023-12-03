package p0;

import android.os.Handler;
import java.util.concurrent.Callable;
/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public final class o<T> implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final Callable<T> f27862u;

    /* renamed from: v  reason: collision with root package name */
    public final s0.a<T> f27863v;

    /* renamed from: w  reason: collision with root package name */
    public final Handler f27864w;

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ s0.a f27865u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Object f27866v;

        public a(s0.a aVar, Object obj) {
            this.f27865u = aVar;
            this.f27866v = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f27865u.accept(this.f27866v);
        }
    }

    public o(Handler handler, i iVar, j jVar) {
        this.f27862u = iVar;
        this.f27863v = jVar;
        this.f27864w = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t3;
        try {
            t3 = this.f27862u.call();
        } catch (Exception unused) {
            t3 = null;
        }
        this.f27864w.post(new a(this.f27863v, t3));
    }
}
