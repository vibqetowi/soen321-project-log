package ng;

import android.os.Bundle;
import gv.n;
import gv.r;
import kotlin.jvm.internal.i;
/* compiled from: MoECoreHelper.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26311a = new a();

    public static String a(Bundle bundle) {
        i.g(bundle, "bundle");
        String string = bundle.getString("moe_app_id", null);
        if (string == null) {
            return null;
        }
        if (n.z0(string, "_DEBUG")) {
            String substring = string.substring(0, r.O0(string, "_DEBUG", 0, false, 6));
            i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return string;
    }
}
