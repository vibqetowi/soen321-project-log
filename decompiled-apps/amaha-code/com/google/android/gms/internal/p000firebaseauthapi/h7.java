package com.google.android.gms.internal.p000firebaseauthapi;

import com.android.volley.toolbox.a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h7  reason: invalid package */
/* loaded from: classes.dex */
public final class h7 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7874a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7875b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7876c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f7877d;

    public /* synthetic */ h7(e7 e7Var) {
        this.f7874a = new HashMap(e7Var.f7818a);
        this.f7875b = new HashMap(e7Var.f7819b);
        this.f7876c = new HashMap(e7Var.f7820c);
        this.f7877d = new HashMap(e7Var.f7821d);
    }

    public final a a(c7 c7Var) {
        f7 f7Var = new f7(c7.class, c7Var.f7758b);
        HashMap hashMap = this.f7875b;
        if (hashMap.containsKey(f7Var)) {
            return ((j6) hashMap.get(f7Var)).a(c7Var);
        }
        throw new GeneralSecurityException(b.m("No Key Parser for requested key type ", f7Var.toString(), " available"));
    }
}
