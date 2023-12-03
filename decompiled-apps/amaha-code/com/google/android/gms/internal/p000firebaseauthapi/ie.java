package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ie  reason: invalid package */
/* loaded from: classes.dex */
public final class ie {
    public static Object a(String str, Class cls) {
        if (cls == String.class) {
            try {
                ze zeVar = new ze();
                zeVar.a(str);
                if (!TextUtils.isEmpty(zeVar.f8296u)) {
                    return zeVar.f8296u;
                }
                throw new zzvg("No error message: " + str);
            } catch (Exception e10) {
                throw new zzvg("Json conversion failed! ".concat(String.valueOf(e10.getMessage())), e10);
            }
        } else if (cls != Void.class) {
            try {
                ke keVar = (ke) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    keVar.e(str);
                    return keVar;
                } catch (Exception e11) {
                    throw new zzvg("Json conversion failed! ".concat(String.valueOf(e11.getMessage())), e11);
                }
            } catch (Exception e12) {
                throw new zzvg("Instantiation of JsonResponse failed! ".concat(cls.toString()), e12);
            }
        } else {
            return null;
        }
    }
}
