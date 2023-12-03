package h5;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
/* compiled from: ProgressNoopOutputStream.kt */
/* loaded from: classes.dex */
public final class a0 extends OutputStream implements c0 {

    /* renamed from: u  reason: collision with root package name */
    public final Handler f17182u;

    /* renamed from: v  reason: collision with root package name */
    public final HashMap f17183v = new HashMap();

    /* renamed from: w  reason: collision with root package name */
    public q f17184w;

    /* renamed from: x  reason: collision with root package name */
    public e0 f17185x;

    /* renamed from: y  reason: collision with root package name */
    public int f17186y;

    public a0(Handler handler) {
        this.f17182u = handler;
    }

    @Override // h5.c0
    public final void a(q qVar) {
        e0 e0Var;
        this.f17184w = qVar;
        if (qVar != null) {
            e0Var = (e0) this.f17183v.get(qVar);
        } else {
            e0Var = null;
        }
        this.f17185x = e0Var;
    }

    public final void e(long j10) {
        q qVar = this.f17184w;
        if (qVar == null) {
            return;
        }
        if (this.f17185x == null) {
            e0 e0Var = new e0(this.f17182u, qVar);
            this.f17185x = e0Var;
            this.f17183v.put(qVar, e0Var);
        }
        e0 e0Var2 = this.f17185x;
        if (e0Var2 != null) {
            e0Var2.f += j10;
        }
        this.f17186y += (int) j10;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer) {
        kotlin.jvm.internal.i.g(buffer, "buffer");
        e(buffer.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i6, int i10) {
        kotlin.jvm.internal.i.g(buffer, "buffer");
        e(i10);
    }

    @Override // java.io.OutputStream
    public final void write(int i6) {
        e(1L);
    }
}
