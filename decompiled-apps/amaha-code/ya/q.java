package ya;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public final class q implements f, e, c, s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38409a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f38410b;

    /* renamed from: c  reason: collision with root package name */
    public final v f38411c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f38412d;

    public /* synthetic */ q(Executor executor, Object obj, v vVar, int i6) {
        this.f38409a = i6;
        this.f38410b = executor;
        this.f38412d = obj;
        this.f38411c = vVar;
    }

    @Override // ya.s
    public final void a(h hVar) {
        int i6 = this.f38409a;
        Executor executor = this.f38410b;
        switch (i6) {
            case 0:
                executor.execute(new androidx.work.n(this, hVar, 24));
                return;
            default:
                executor.execute(new androidx.work.n(this, hVar, 28));
                return;
        }
    }

    @Override // ya.c
    public final void b() {
        int i6 = this.f38409a;
        v vVar = this.f38411c;
        switch (i6) {
            case 0:
                vVar.c();
                return;
            default:
                vVar.c();
                return;
        }
    }

    @Override // ya.s
    public final void c() {
        switch (this.f38409a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ya.e
    public final void onFailure(Exception exc) {
        int i6 = this.f38409a;
        v vVar = this.f38411c;
        switch (i6) {
            case 0:
                vVar.a(exc);
                return;
            default:
                vVar.a(exc);
                return;
        }
    }

    @Override // ya.f
    public final void onSuccess(Object obj) {
        int i6 = this.f38409a;
        v vVar = this.f38411c;
        switch (i6) {
            case 0:
                vVar.b(obj);
                return;
            default:
                vVar.b(obj);
                return;
        }
    }
}
