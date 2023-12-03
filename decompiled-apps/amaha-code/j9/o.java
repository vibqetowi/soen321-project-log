package j9;

import android.os.Parcel;
import com.appsflyer.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public abstract class o extends ja.a {
    public o() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
    }

    @Override // ja.a
    public final boolean S1(int i6, Parcel parcel, Parcel parcel2) {
        switch (i6) {
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) ja.c.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) ja.c.a(parcel, Status.CREATOR);
                ja.c.b(parcel);
                throw new UnsupportedOperationException();
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                Status status2 = (Status) ja.c.a(parcel, Status.CREATOR);
                ja.c.b(parcel);
                h hVar = (h) this;
                switch (hVar.f21762b) {
                    case 0:
                        ((i) hVar.f21763c).a(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                Status status3 = (Status) ja.c.a(parcel, Status.CREATOR);
                ja.c.b(parcel);
                h hVar2 = (h) this;
                switch (hVar2.f21762b) {
                    case 1:
                        ((j) hVar2.f21763c).a(status3);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
