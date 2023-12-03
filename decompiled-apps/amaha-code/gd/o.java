package gd;

import com.google.android.gms.internal.p000firebaseauthapi.zzqx;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final y9.a f16439a = new y9.a("GetTokenResultFactory", new String[0]);

    public static fd.g a(String str) {
        Map hashMap;
        try {
            hashMap = p.b(str);
        } catch (zzqx e10) {
            f16439a.b("Error parsing token claims", e10, new Object[0]);
            hashMap = new HashMap();
        }
        return new fd.g(str, hashMap);
    }
}
