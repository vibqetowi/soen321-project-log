package v9;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import v9.i;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class e extends w9.a {
    public static final Parcelable.Creator<e> CREATOR = new a1();
    public static final Scope[] I = new Scope[0];
    public static final s9.d[] J = new s9.d[0];
    public Bundle A;
    public Account B;
    public s9.d[] C;
    public s9.d[] D;
    public final boolean E;
    public final int F;
    public boolean G;
    public final String H;

    /* renamed from: u  reason: collision with root package name */
    public final int f34881u;

    /* renamed from: v  reason: collision with root package name */
    public final int f34882v;

    /* renamed from: w  reason: collision with root package name */
    public final int f34883w;

    /* renamed from: x  reason: collision with root package name */
    public String f34884x;

    /* renamed from: y  reason: collision with root package name */
    public IBinder f34885y;

    /* renamed from: z  reason: collision with root package name */
    public Scope[] f34886z;

    public e(int i6, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, s9.d[] dVarArr, s9.d[] dVarArr2, boolean z10, int i12, boolean z11, String str2) {
        i i1Var;
        scopeArr = scopeArr == null ? I : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        s9.d[] dVarArr3 = J;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f34881u = i6;
        this.f34882v = i10;
        this.f34883w = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f34884x = "com.google.android.gms";
        } else {
            this.f34884x = str;
        }
        if (i6 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = i.a.f34909b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof i) {
                    i1Var = (i) queryLocalInterface;
                } else {
                    i1Var = new i1(iBinder);
                }
                int i14 = a.f34838c;
                if (i1Var != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = i1Var.b();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.B = account2;
        } else {
            this.f34885y = iBinder;
            this.B = account;
        }
        this.f34886z = scopeArr;
        this.A = bundle;
        this.C = dVarArr;
        this.D = dVarArr2;
        this.E = z10;
        this.F = i12;
        this.G = z11;
        this.H = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        a1.a(this, parcel, i6);
    }
}
