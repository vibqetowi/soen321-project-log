package h5;

import android.os.Handler;
import h5.q;
/* compiled from: RequestProgress.kt */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f17208a;

    /* renamed from: b  reason: collision with root package name */
    public final q f17209b;

    /* renamed from: c  reason: collision with root package name */
    public final long f17210c;

    /* renamed from: d  reason: collision with root package name */
    public long f17211d;

    /* renamed from: e  reason: collision with root package name */
    public long f17212e;
    public long f;

    public e0(Handler handler, q qVar) {
        this.f17208a = handler;
        this.f17209b = qVar;
        p pVar = p.f17269a;
        w5.f0.e();
        this.f17210c = p.f17275h.get();
    }

    public final void a() {
        Boolean valueOf;
        final long j10 = this.f17211d;
        if (j10 > this.f17212e) {
            final q.b bVar = this.f17209b.f17295g;
            final long j11 = this.f;
            if (j11 > 0 && (bVar instanceof q.e)) {
                Handler handler = this.f17208a;
                if (handler == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(handler.post(new Runnable(j10, j11) { // from class: h5.d0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((q.e) q.b.this).b();
                        }
                    }));
                }
                if (valueOf == null) {
                    ((q.e) bVar).b();
                }
                this.f17212e = this.f17211d;
            }
        }
    }
}
