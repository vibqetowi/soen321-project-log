package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c5  reason: invalid package */
/* loaded from: classes.dex */
public final class c5 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7750a = Logger.getLogger(c5.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f7751b = new AtomicBoolean(false);

    public static boolean a() {
        if (f7751b.get()) {
            return true;
        }
        return false;
    }
}
