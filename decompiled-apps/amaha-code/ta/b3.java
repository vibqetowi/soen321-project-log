package ta;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class b3 extends y5 {
    public /* synthetic */ b3(d6 d6Var, int i6) {
        super(d6Var);
    }

    @Override // ta.x3
    public final boolean g() {
        i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f32943u.f32953u.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override // ta.y5
    public final void k() {
    }
}
