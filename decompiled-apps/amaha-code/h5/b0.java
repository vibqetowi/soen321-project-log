package h5;

import android.os.Handler;
import h5.t;
import java.io.FilterOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProgressOutputStream.kt */
/* loaded from: classes.dex */
public final class b0 extends FilterOutputStream implements c0 {
    public static final /* synthetic */ int B = 0;
    public e0 A;

    /* renamed from: u  reason: collision with root package name */
    public final t f17188u;

    /* renamed from: v  reason: collision with root package name */
    public final Map<q, e0> f17189v;

    /* renamed from: w  reason: collision with root package name */
    public final long f17190w;

    /* renamed from: x  reason: collision with root package name */
    public final long f17191x;

    /* renamed from: y  reason: collision with root package name */
    public long f17192y;

    /* renamed from: z  reason: collision with root package name */
    public long f17193z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(FilterOutputStream filterOutputStream, t tVar, HashMap progressMap, long j10) {
        super(filterOutputStream);
        kotlin.jvm.internal.i.g(progressMap, "progressMap");
        this.f17188u = tVar;
        this.f17189v = progressMap;
        this.f17190w = j10;
        p pVar = p.f17269a;
        w5.f0.e();
        this.f17191x = p.f17275h.get();
    }

    @Override // h5.c0
    public final void a(q qVar) {
        e0 e0Var;
        if (qVar != null) {
            e0Var = this.f17189v.get(qVar);
        } else {
            e0Var = null;
        }
        this.A = e0Var;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        for (e0 e0Var : this.f17189v.values()) {
            e0Var.a();
        }
        g();
    }

    public final void e(long j10) {
        e0 e0Var = this.A;
        if (e0Var != null) {
            long j11 = e0Var.f17211d + j10;
            e0Var.f17211d = j11;
            if (j11 >= e0Var.f17212e + e0Var.f17210c || j11 >= e0Var.f) {
                e0Var.a();
            }
        }
        long j12 = this.f17192y + j10;
        this.f17192y = j12;
        if (j12 >= this.f17193z + this.f17191x || j12 >= this.f17190w) {
            g();
        }
    }

    public final void g() {
        Boolean valueOf;
        if (this.f17192y > this.f17193z) {
            t tVar = this.f17188u;
            Iterator it = tVar.f17314x.iterator();
            while (it.hasNext()) {
                t.a aVar = (t.a) it.next();
                if (aVar instanceof t.b) {
                    Handler handler = tVar.f17311u;
                    if (handler == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(handler.post(new g.v(aVar, 14, this)));
                    }
                    if (valueOf == null) {
                        ((t.b) aVar).a();
                    }
                }
            }
            this.f17193z = this.f17192y;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer) {
        kotlin.jvm.internal.i.g(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        e(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer, int i6, int i10) {
        kotlin.jvm.internal.i.g(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i6, i10);
        e(i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i6) {
        ((FilterOutputStream) this).out.write(i6);
        e(1L);
    }
}
