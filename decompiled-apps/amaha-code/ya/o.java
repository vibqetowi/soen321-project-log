package ya;

import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public final class o<T> implements f, e, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f38398a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final int f38399b;

    /* renamed from: c  reason: collision with root package name */
    public final v f38400c;

    /* renamed from: d  reason: collision with root package name */
    public int f38401d;

    /* renamed from: e  reason: collision with root package name */
    public int f38402e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public Exception f38403g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f38404h;

    public o(int i6, v vVar) {
        this.f38399b = i6;
        this.f38400c = vVar;
    }

    public final void a() {
        int i6 = this.f38401d + this.f38402e + this.f;
        int i10 = this.f38399b;
        if (i6 == i10) {
            Exception exc = this.f38403g;
            v vVar = this.f38400c;
            if (exc != null) {
                int i11 = this.f38402e;
                vVar.a(new ExecutionException(i11 + " out of " + i10 + " underlying tasks failed", this.f38403g));
            } else if (this.f38404h) {
                vVar.c();
            } else {
                vVar.b(null);
            }
        }
    }

    @Override // ya.c
    public final void b() {
        synchronized (this.f38398a) {
            this.f++;
            this.f38404h = true;
            a();
        }
    }

    @Override // ya.e
    public final void onFailure(Exception exc) {
        synchronized (this.f38398a) {
            this.f38402e++;
            this.f38403g = exc;
            a();
        }
    }

    @Override // ya.f
    public final void onSuccess(T t3) {
        synchronized (this.f38398a) {
            this.f38401d++;
            a();
        }
    }
}
