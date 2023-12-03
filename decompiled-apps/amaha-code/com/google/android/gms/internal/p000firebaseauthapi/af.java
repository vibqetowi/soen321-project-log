package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import com.theinnerhour.b2b.utils.SessionManager;
import fd.a;
import fd.d;
import java.util.Map;
import org.json.JSONObject;
import v9.h;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.af  reason: invalid package */
/* loaded from: classes.dex */
public final class af implements je {

    /* renamed from: u  reason: collision with root package name */
    public final String f7717u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7718v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7719w;

    static {
        String simpleName = af.class.getSimpleName();
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
            sb2.append("] ");
        }
        new h(simpleName, null);
        for (int i6 = 2; i6 <= 7 && !Log.isLoggable(simpleName, i6); i6++) {
        }
    }

    public af(d dVar, String str) {
        String str2 = dVar.f14948u;
        o.e(str2);
        this.f7717u = str2;
        String str3 = dVar.f14950w;
        o.e(str3);
        this.f7718v = str3;
        this.f7719w = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.je
    public final String S() {
        a aVar;
        String str;
        Map map = a.f14942c;
        String str2 = this.f7718v;
        o.e(str2);
        String str3 = null;
        try {
            aVar = new a(str2);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar != null) {
            str = aVar.f14943a;
        } else {
            str = null;
        }
        if (aVar != null) {
            str3 = aVar.f14944b;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SessionManager.KEY_EMAIL, this.f7717u);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f7719w;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        return jSONObject.toString();
    }
}
