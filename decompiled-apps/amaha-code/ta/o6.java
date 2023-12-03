package ta;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class o6 {

    /* renamed from: a  reason: collision with root package name */
    public final y3 f32791a;

    public o6(y3 y3Var) {
        this.f32791a = y3Var;
    }

    public final void a(Bundle bundle, String str) {
        String uri;
        y3 y3Var = this.f32791a;
        w3 w3Var = y3Var.D;
        y3.k(w3Var);
        w3Var.h();
        if (!y3Var.g()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                j3 j3Var = y3Var.B;
                y3.i(j3Var);
                j3Var.O.b(uri);
                y3.i(j3Var);
                y3Var.H.getClass();
                j3Var.P.b(System.currentTimeMillis());
            }
        }
    }

    public final boolean b() {
        j3 j3Var = this.f32791a.B;
        y3.i(j3Var);
        if (j3Var.P.a() > 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        y3 y3Var = this.f32791a;
        y3Var.H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        j3 j3Var = y3Var.B;
        y3.i(j3Var);
        if (currentTimeMillis - j3Var.P.a() <= y3Var.A.n(null, j2.R)) {
            return false;
        }
        return true;
    }
}
