package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import ih.g;
import java.util.ArrayList;
import jh.b;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s  reason: invalid package */
/* loaded from: classes.dex */
public final class s implements je {

    /* renamed from: u  reason: collision with root package name */
    public String f8114u;

    /* renamed from: v  reason: collision with root package name */
    public String f8115v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8116w;

    /* renamed from: x  reason: collision with root package name */
    public Object f8117x;

    /* renamed from: y  reason: collision with root package name */
    public Object f8118y;

    /* renamed from: z  reason: collision with root package name */
    public Object f8119z;

    public /* synthetic */ s() {
    }

    public /* synthetic */ s(g gVar, String str, String str2, b bVar, boolean z10, ArrayList integrations) {
        i.g(integrations, "integrations");
        this.f8117x = gVar;
        this.f8114u = str;
        this.f8115v = str2;
        this.f8118y = bVar;
        this.f8116w = z10;
        this.f8119z = integrations;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.je
    public final String S() {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty((String) this.f8118y)) {
            jSONObject.put("phoneNumber", this.f8114u);
            jSONObject.put("temporaryProof", (String) this.f8118y);
        } else {
            jSONObject.put("sessionInfo", this.f8115v);
            jSONObject.put("code", (String) this.f8117x);
        }
        String str = (String) this.f8119z;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.f8116w) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(g gVar, String str, String str2, ArrayList integrations) {
        this(gVar, str, str2, null, false, integrations);
        i.g(integrations, "integrations");
    }
}
