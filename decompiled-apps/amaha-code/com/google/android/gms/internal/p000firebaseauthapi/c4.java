package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c4  reason: invalid package */
/* loaded from: classes.dex */
public final class c4 {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList f7749a = new CopyOnWriteArrayList();

    public static b4 a(String str) {
        Iterator it = f7749a.iterator();
        while (it.hasNext()) {
            b4 b4Var = (b4) it.next();
            if (b4Var.f(str)) {
                return b4Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
