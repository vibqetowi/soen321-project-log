package j9;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.f0;
import v9.d0;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public abstract class n extends ja.a {
    public n() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
    }

    @Override // ja.a
    public final boolean S1(int i6, Parcel parcel, Parcel parcel2) {
        boolean z10;
        BasePendingResult basePendingResult;
        boolean z11;
        BasePendingResult basePendingResult2;
        if (i6 != 1) {
            if (i6 != 2) {
                return false;
            }
            q qVar = (q) this;
            qVar.X1();
            m.a(qVar.f21767b).b();
        } else {
            q qVar2 = (q) this;
            qVar2.X1();
            Context context = qVar2.f21767b;
            b a10 = b.a(context);
            GoogleSignInAccount b10 = a10.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.F;
            if (b10 != null) {
                googleSignInOptions = a10.c();
            }
            v9.o.h(googleSignInOptions);
            i9.a aVar = new i9.a(context, googleSignInOptions);
            f0 f0Var = aVar.f7312h;
            Context context2 = aVar.f7306a;
            if (b10 != null) {
                if (aVar.c() == 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                l.f21764a.a("Revoking access", new Object[0]);
                String e10 = b.a(context2).e("refreshToken");
                l.b(context2);
                if (z11) {
                    if (e10 == null) {
                        y9.a aVar2 = e.f21757w;
                        Status status = new Status(4, null);
                        v9.o.a("Status code must not be SUCCESS", !status.f0());
                        BasePendingResult eVar = new t9.e(status);
                        eVar.a(status);
                        basePendingResult2 = eVar;
                    } else {
                        e eVar2 = new e(e10);
                        new Thread(eVar2).start();
                        basePendingResult2 = eVar2.f21759v;
                    }
                } else {
                    j jVar = new j(f0Var);
                    f0Var.b(jVar);
                    basePendingResult2 = jVar;
                }
                basePendingResult2.b(new d0(basePendingResult2, new ya.i(), new ug.l()));
            } else {
                if (aVar.c() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l.f21764a.a("Signing out", new Object[0]);
                l.b(context2);
                if (z10) {
                    Status status2 = Status.f7296z;
                    v9.o.i(status2, "Result must not be null");
                    BasePendingResult oVar = new com.google.android.gms.common.api.internal.o(f0Var);
                    oVar.a(status2);
                    basePendingResult = oVar;
                } else {
                    i iVar = new i(f0Var);
                    f0Var.b(iVar);
                    basePendingResult = iVar;
                }
                basePendingResult.b(new d0(basePendingResult, new ya.i(), new ug.l()));
            }
        }
        return true;
    }
}
