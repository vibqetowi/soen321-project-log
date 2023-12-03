package gd;

import com.google.firebase.auth.FirebaseAuth;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f16422u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final Object f16423v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f16424w;

    public k(l lVar, String str) {
        this.f16424w = lVar;
        v9.o.e(str);
        this.f16423v = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f16422u;
        Object obj = this.f16423v;
        switch (i6) {
            case 0:
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(sc.e.f((String) obj));
                if (firebaseAuth.f != null) {
                    ya.v c10 = firebaseAuth.c(true);
                    l.f.e("Token refreshing started", new Object[0]);
                    c10.addOnFailureListener(new j(this));
                    return;
                }
                return;
            default:
                ((kotlinx.coroutines.j) this.f16424w).k((kotlinx.coroutines.a0) obj, hs.k.f19476a);
                return;
        }
    }

    public k(kotlinx.coroutines.a0 a0Var, kotlinx.coroutines.k kVar) {
        this.f16423v = a0Var;
        this.f16424w = kVar;
    }
}
