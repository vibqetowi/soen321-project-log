package w5;

import android.net.Uri;
import android.os.Bundle;
/* compiled from: InstagramCustomTab.kt */
/* loaded from: classes.dex */
public final class r extends e {
    public r(Bundle bundle, String str) {
        super(bundle, str);
        Uri b10;
        bundle = bundle == null ? new Bundle() : bundle;
        if (kotlin.jvm.internal.i.b(str, "oauth")) {
            e0 e0Var = e0.f36453a;
            b10 = e0.b(a0.b(), "oauth/authorize", bundle);
        } else {
            e0 e0Var2 = e0.f36453a;
            String b11 = a0.b();
            b10 = e0.b(b11, h5.p.d() + "/dialog/" + str, bundle);
        }
        if (!b6.a.b(this)) {
            try {
                this.f36452a = b10;
            } catch (Throwable th2) {
                b6.a.a(this, th2);
            }
        }
    }
}
