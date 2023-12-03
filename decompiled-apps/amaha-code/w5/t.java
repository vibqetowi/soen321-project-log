package w5;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import i5.i;
import w5.s;
/* compiled from: InstallReferrerUtil.kt */
/* loaded from: classes.dex */
public final class t implements InstallReferrerStateListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ InstallReferrerClient f36539u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s.a f36540v;

    public t(InstallReferrerClient installReferrerClient, i.a.C0300a c0300a) {
        this.f36539u = installReferrerClient;
        this.f36540v = c0300a;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i6) {
        if (b6.a.b(this)) {
            return;
        }
        InstallReferrerClient installReferrerClient = this.f36539u;
        try {
            if (i6 != 0) {
                if (i6 == 2) {
                    s.a();
                }
            } else {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    kotlin.jvm.internal.i.f(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (gv.r.J0(installReferrer2, "fb") || gv.r.J0(installReferrer2, "facebook"))) {
                        this.f36540v.a(installReferrer2);
                    }
                    s.a();
                } catch (RemoteException unused) {
                    return;
                }
            }
            try {
                installReferrerClient.endConnection();
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}
