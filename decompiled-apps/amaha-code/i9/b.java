package i9;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class b implements t9.c {

    /* renamed from: u  reason: collision with root package name */
    public final Status f19917u;

    /* renamed from: v  reason: collision with root package name */
    public final GoogleSignInAccount f19918v;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f19918v = googleSignInAccount;
        this.f19917u = status;
    }

    @Override // t9.c
    public final Status X() {
        return this.f19917u;
    }
}
