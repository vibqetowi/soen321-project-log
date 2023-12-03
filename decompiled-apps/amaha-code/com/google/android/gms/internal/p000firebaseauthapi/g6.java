package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g6  reason: invalid package */
/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences.Editor f7863a;

    public g6(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (str == null) {
            this.f7863a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f7863a = applicationContext.getSharedPreferences(str, 0).edit();
        }
    }

    public final void a(ia iaVar) {
        if (this.f7863a.putString("GenericIdpKeyset", r.C(iaVar.p())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }

    public final void b(fb fbVar) {
        if (this.f7863a.putString("GenericIdpKeyset", r.C(fbVar.p())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }
}
