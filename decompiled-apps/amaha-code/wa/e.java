package wa;

import android.os.Parcel;
import androidx.work.n;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q0;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class e extends ja.a implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 1);
    }

    @Override // ja.a
    public final boolean R1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        switch (i6) {
            case 3:
                s9.b bVar = (s9.b) ka.a.a(parcel, s9.b.CREATOR);
                b bVar2 = (b) ka.a.a(parcel, b.CREATOR);
                break;
            case 4:
                Status status = (Status) ka.a.a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) ka.a.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) ka.a.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) ka.a.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                q0 q0Var = (q0) this;
                q0Var.f7424c.post(new n(q0Var, (l) ka.a.a(parcel, l.CREATOR), 10));
                break;
            case 9:
                h hVar = (h) ka.a.a(parcel, h.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
