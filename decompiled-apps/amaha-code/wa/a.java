package wa;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.work.n;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.q0;
import v9.b;
import v9.e0;
import v9.o;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class a extends v9.f<g> implements va.f {
    public final boolean W;
    public final v9.c X;
    public final Bundle Y;
    public final Integer Z;

    public a(Context context, Looper looper, v9.c cVar, Bundle bundle, c.a aVar, c.b bVar) {
        super(context, looper, 44, cVar, aVar, bVar);
        this.W = true;
        this.X = cVar;
        this.Y = bundle;
        this.Z = cVar.f34860h;
    }

    @Override // v9.b
    public final String A() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // va.f
    public final void g(f fVar) {
        GoogleSignInAccount googleSignInAccount;
        if (fVar != null) {
            try {
                Account account = this.X.f34854a;
                if (account == null) {
                    account = new Account("<<default account>>", "com.google");
                }
                if ("<<default account>>".equals(account.name)) {
                    googleSignInAccount = j9.b.a(this.f34842w).b();
                } else {
                    googleSignInAccount = null;
                }
                Integer num = this.Z;
                o.h(num);
                e0 e0Var = new e0(2, account, num.intValue(), googleSignInAccount);
                g gVar = (g) y();
                j jVar = new j(1, e0Var);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(gVar.f39199c);
                int i6 = ka.a.f23206a;
                obtain.writeInt(1);
                jVar.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(fVar.asBinder());
                Parcel obtain2 = Parcel.obtain();
                gVar.f39198b.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (RemoteException e10) {
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                try {
                    q0 q0Var = (q0) fVar;
                    q0Var.f7424c.post(new n(q0Var, new l(1, new s9.b(8, null), null), 10));
                    return;
                } catch (RemoteException unused) {
                    Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
                    return;
                }
            }
        }
        throw new NullPointerException("Expecting a valid ISignInCallbacks");
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final int l() {
        return 12451000;
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final boolean o() {
        return this.W;
    }

    @Override // va.f
    public final void p() {
        i(new b.d());
    }

    @Override // v9.b
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new g(iBinder);
    }

    @Override // v9.b
    public final Bundle w() {
        v9.c cVar = this.X;
        boolean equals = this.f34842w.getPackageName().equals(cVar.f34858e);
        Bundle bundle = this.Y;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", cVar.f34858e);
        }
        return bundle;
    }

    @Override // v9.b
    public final String z() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
}
