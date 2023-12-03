package v9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    public static void a(e eVar, Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, eVar.f34881u);
        hc.d.s0(parcel, 2, eVar.f34882v);
        hc.d.s0(parcel, 3, eVar.f34883w);
        hc.d.x0(parcel, 4, eVar.f34884x);
        hc.d.r0(parcel, 5, eVar.f34885y);
        hc.d.z0(parcel, 6, eVar.f34886z, i6);
        hc.d.p0(parcel, 7, eVar.A);
        hc.d.w0(parcel, 8, eVar.B, i6);
        hc.d.z0(parcel, 10, eVar.C, i6);
        hc.d.z0(parcel, 11, eVar.D, i6);
        hc.d.o0(parcel, 12, eVar.E);
        hc.d.s0(parcel, 13, eVar.F);
        hc.d.o0(parcel, 14, eVar.G);
        hc.d.x0(parcel, 15, eVar.H);
        hc.d.C0(parcel, B0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        Scope[] scopeArr = e.I;
        Bundle bundle = new Bundle();
        s9.d[] dVarArr = e.J;
        s9.d[] dVarArr2 = dVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 2:
                    i10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 3:
                    i11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    iBinder = SafeParcelReader.k(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.f(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.c(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
                case '\n':
                    dVarArr = (s9.d[]) SafeParcelReader.f(parcel, readInt, s9.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (s9.d[]) SafeParcelReader.f(parcel, readInt, s9.d.CREATOR);
                    break;
                case '\f':
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    i12 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 14:
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 15:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new e(i6, i10, i11, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z10, i12, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new e[i6];
    }
}
