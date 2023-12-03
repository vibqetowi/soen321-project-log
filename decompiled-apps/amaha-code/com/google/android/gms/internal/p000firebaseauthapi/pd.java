package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import j7.k;
import java.util.ArrayList;
import java.util.List;
import v9.o;
import y9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pd  reason: invalid package */
/* loaded from: classes.dex */
public final class pd implements se {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f8053u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ef f8054v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p2 f8055w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ jf f8056x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ se f8057y;

    public pd(k kVar, p2 p2Var, se seVar, ef efVar, jf jfVar) {
        this.f8053u = kVar;
        this.f8054v = efVar;
        this.f8055w = p2Var;
        this.f8056x = jfVar;
        this.f8057y = seVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void e(String str) {
        this.f8057y.e(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void j(ke keVar) {
        String encodeToString;
        g gVar = (g) keVar;
        k kVar = this.f8053u;
        kVar.getClass();
        o.e("EMAIL");
        boolean contains = ((h) kVar.A).f7868v.contains("EMAIL");
        List list = null;
        ef efVar = this.f8054v;
        if (contains) {
            efVar.f7827v = null;
        } else {
            String str = (String) kVar.f21734w;
            if (str != null) {
                efVar.f7827v = str;
            }
        }
        o.e("DISPLAY_NAME");
        Object obj = kVar.A;
        if (((h) obj).f7868v.contains("DISPLAY_NAME")) {
            efVar.f7829x = null;
        } else {
            String str2 = (String) kVar.f21733v;
            if (str2 != null) {
                efVar.f7829x = str2;
            }
        }
        o.e("PHOTO_URL");
        if (((h) obj).f7868v.contains("PHOTO_URL")) {
            efVar.f7830y = null;
        } else {
            String str3 = (String) kVar.f21737z;
            if (str3 != null) {
                efVar.f7830y = str3;
            }
        }
        if (!TextUtils.isEmpty((String) kVar.f21735x)) {
            byte[] bytes = "redacted".getBytes();
            if (bytes == null) {
                encodeToString = null;
            } else {
                encodeToString = Base64.encodeToString(bytes, 0);
            }
            efVar.getClass();
            o.e(encodeToString);
            efVar.A = encodeToString;
        }
        e eVar = gVar.f7856u;
        if (eVar != null) {
            list = eVar.f7795u;
        }
        if (list == null) {
            list = new ArrayList();
        }
        efVar.getClass();
        e eVar2 = new e();
        efVar.f7831z = eVar2;
        eVar2.f7795u.addAll(list);
        jf jfVar = this.f8056x;
        o.h(jfVar);
        String str4 = gVar.f7857v;
        String str5 = gVar.f7858w;
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            jfVar = new jf(str5, str4, Long.valueOf(gVar.f7859x), jfVar.f7925x);
        }
        p2 p2Var = this.f8055w;
        p2Var.getClass();
        try {
            ((yd) p2Var.f8038v).b(jfVar, efVar);
        } catch (RemoteException e10) {
            ((a) p2Var.f8039w).b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }
}
