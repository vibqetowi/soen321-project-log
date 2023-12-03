package v9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class i1 extends z6.a implements i {
    public i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 5);
    }

    @Override // v9.i
    public final Account b() {
        Parcel v10 = v(z(), 2);
        Account account = (Account) ma.a.a(v10, Account.CREATOR);
        v10.recycle();
        return account;
    }
}
