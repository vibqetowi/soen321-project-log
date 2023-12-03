package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u  reason: invalid package */
/* loaded from: classes.dex */
public final class u {
    public static zzvg a(String str, String str2, Exception exc) {
        String message = exc.getMessage();
        Log.e(str, "Failed to parse " + str + " for string [" + str2 + "] with exception: " + message);
        return new zzvg("Failed to parse " + str + " for string [" + str2 + "]", exc);
    }
}
