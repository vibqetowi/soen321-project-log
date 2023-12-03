package nd;

import java.util.concurrent.Callable;
/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class n0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Callable f26094u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ya.i f26095v;

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    public class a implements ya.b<Object, Void> {
        public a() {
        }

        @Override // ya.b
        public final Void then(ya.h<Object> hVar) {
            boolean isSuccessful = hVar.isSuccessful();
            n0 n0Var = n0.this;
            if (isSuccessful) {
                n0Var.f26095v.b(hVar.getResult());
                return null;
            }
            n0Var.f26095v.a(hVar.getException());
            return null;
        }
    }

    public n0(ya.i iVar, v vVar) {
        this.f26094u = vVar;
        this.f26095v = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ((ya.h) this.f26094u.call()).continueWith(new a());
        } catch (Exception e10) {
            this.f26095v.a(e10);
        }
    }
}
