package j9;

import android.os.Parcel;
import com.appsflyer.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.f0;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class j extends k {
    public j(f0 f0Var) {
        super(f0Var);
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void m(a.e eVar) {
        g gVar = (g) eVar;
        p pVar = (p) gVar.y();
        h hVar = new h(this, 1);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(pVar.f39199c);
        int i6 = ja.c.f21771a;
        obtain.writeStrongBinder(hVar);
        GoogleSignInOptions googleSignInOptions = gVar.W;
        if (googleSignInOptions == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            googleSignInOptions.writeToParcel(obtain, 0);
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            pVar.f39198b.transact(R.styleable.AppCompatTheme_textAppearanceListItem, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t9.c d(Status status) {
        return status;
    }
}
