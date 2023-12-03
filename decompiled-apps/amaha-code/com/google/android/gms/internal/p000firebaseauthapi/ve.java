package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.Executors;
import v9.h;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ve  reason: invalid package */
/* loaded from: classes.dex */
public final class ve {
    static {
        String[] strArr = {"SmsRetrieverHelper"};
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
        new h("FirebaseAuth", null);
        for (int i6 = 2; i6 <= 7 && !Log.isLoggable("FirebaseAuth", i6); i6++) {
        }
    }

    public ve(Context context) {
        new HashMap();
        Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
