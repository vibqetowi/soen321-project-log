package se;

import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import nd.z;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31467u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f31468v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f31469w;

    public /* synthetic */ b(c cVar, boolean z10, int i6) {
        this.f31467u = i6;
        this.f31468v = cVar;
        this.f31469w = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ue.a c10;
        boolean z10;
        ue.a h10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f31467u) {
            case 0:
                c cVar = this.f31468v;
                boolean z14 = this.f31469w;
                cVar.getClass();
                synchronized (c.f31470m) {
                    sc.e eVar = cVar.f31471a;
                    eVar.b();
                    z b10 = z.b(eVar.f31432a);
                    c10 = cVar.f31473c.c();
                    if (b10 != null) {
                        b10.k();
                    }
                }
                try {
                    boolean z15 = true;
                    if (c10.f() == 5) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (c10.f() == 3) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            if (!z14 && !cVar.f31474d.b(c10)) {
                                return;
                            }
                            h10 = cVar.d(c10);
                            cVar.e(h10);
                            cVar.l(c10, h10);
                            if (h10.f() != 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                cVar.k(h10.f34026b);
                            }
                            if (h10.f() != 5) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                cVar.i(new FirebaseInstallationsException());
                                return;
                            }
                            int i6 = h10.f34027c;
                            if (i6 != 2 && i6 != 1) {
                                z15 = false;
                            }
                            if (z15) {
                                cVar.i(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                return;
                            } else {
                                cVar.j(h10);
                                return;
                            }
                        }
                    }
                    h10 = cVar.h(c10);
                    cVar.e(h10);
                    cVar.l(c10, h10);
                    if (h10.f() != 4) {
                    }
                    if (z11) {
                    }
                    if (h10.f() != 5) {
                    }
                    if (!z12) {
                    }
                } catch (FirebaseInstallationsException e10) {
                    cVar.i(e10);
                    return;
                }
                break;
            default:
                this.f31468v.c(this.f31469w);
                return;
        }
    }
}
