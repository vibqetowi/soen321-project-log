package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutionException;
import pe.f;
import sc.e;
import tr.r;
import v9.o;
import ya.k;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ne  reason: invalid package */
/* loaded from: classes.dex */
public final class ne {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8013a;

    /* renamed from: b  reason: collision with root package name */
    public te f8014b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8015c;

    /* renamed from: d  reason: collision with root package name */
    public final e f8016d;

    public ne(Context context, e eVar, String str) {
        o.h(context);
        this.f8013a = context;
        o.h(eVar);
        this.f8016d = eVar;
        this.f8015c = String.format("Android/%s/%s", "Fallback", str);
    }

    public final void a(HttpURLConnection httpURLConnection) {
        String concat = String.valueOf(this.f8015c).concat("/FirebaseCore-Android");
        if (this.f8014b == null) {
            Context context = this.f8013a;
            this.f8014b = new te(context, context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Package", this.f8014b.f8158a);
        httpURLConnection.setRequestProperty("X-Android-Cert", this.f8014b.f8159b);
        httpURLConnection.setRequestProperty("Accept-Language", r.z());
        httpURLConnection.setRequestProperty("X-Client-Version", concat);
        String str = null;
        httpURLConnection.setRequestProperty("X-Firebase-Locale", null);
        e eVar = this.f8016d;
        eVar.b();
        httpURLConnection.setRequestProperty("X-Firebase-GMPID", eVar.f31434c.f31445b);
        f fVar = (f) FirebaseAuth.getInstance(eVar).f9546l.get();
        if (fVar != null) {
            try {
                str = (String) k.a(fVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: ".concat(String.valueOf(e10.getMessage())));
            }
        }
        httpURLConnection.setRequestProperty("X-Firebase-Client", str);
    }
}
