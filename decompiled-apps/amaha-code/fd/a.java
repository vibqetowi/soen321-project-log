package fd;

import android.net.Uri;
import com.theinnerhour.b2b.utils.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Map f14942c;

    /* renamed from: a  reason: collision with root package name */
    public final String f14943a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14944b;

    static {
        HashMap hashMap = new HashMap();
        pl.a.h(2, hashMap, "recoverEmail", 0, "resetPassword", 4, "signIn", 1, "verifyEmail");
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f14942c = Collections.unmodifiableMap(hashMap);
    }

    public a(String str) {
        String a10 = a(str, "apiKey");
        String a11 = a(str, "oobCode");
        String a12 = a(str, "mode");
        if (a10 != null && a11 != null && a12 != null) {
            v9.o.e(a10);
            v9.o.e(a11);
            this.f14943a = a11;
            v9.o.e(a12);
            a(str, "continueUrl");
            a(str, "languageCode");
            this.f14944b = a(str, "tenantId");
            return;
        }
        throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains(Constants.API_COURSE_LINK)) {
                String queryParameter = parse.getQueryParameter(Constants.API_COURSE_LINK);
                v9.o.e(queryParameter);
                return Uri.parse(queryParameter).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
