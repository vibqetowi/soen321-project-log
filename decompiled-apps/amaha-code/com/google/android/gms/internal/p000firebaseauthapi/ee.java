package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import y9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ee  reason: invalid package */
/* loaded from: classes.dex */
public interface ee {

    /* renamed from: c  reason: collision with root package name */
    public static final a f7825c = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    void Q(Uri uri, String str);

    Context a();

    Uri.Builder d(Intent intent, String str, String str2);

    String f(String str);

    void g(Status status);

    HttpURLConnection l(URL url);
}
