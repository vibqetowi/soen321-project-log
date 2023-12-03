package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e7  reason: invalid package */
/* loaded from: classes.dex */
public final class e7 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7818a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7819b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7820c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f7821d;

    public e7() {
        this.f7818a = new HashMap();
        this.f7819b = new HashMap();
        this.f7820c = new HashMap();
        this.f7821d = new HashMap();
    }

    public final void a(h6 h6Var) {
        f7 f7Var = new f7(h6Var.f7915b, h6Var.f7914a);
        HashMap hashMap = this.f7819b;
        if (hashMap.containsKey(f7Var)) {
            j6 j6Var = (j6) hashMap.get(f7Var);
            if (!j6Var.equals(h6Var) || !h6Var.equals(j6Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(f7Var.toString()));
            }
            return;
        }
        hashMap.put(f7Var, h6Var);
    }

    public final void b(k6 k6Var) {
        g7 g7Var = new g7(k6Var.f7967a, k6Var.f7968b);
        HashMap hashMap = this.f7818a;
        if (hashMap.containsKey(g7Var)) {
            l6 l6Var = (l6) hashMap.get(g7Var);
            if (!l6Var.equals(k6Var) || !k6Var.equals(l6Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(g7Var.toString()));
            }
            return;
        }
        hashMap.put(g7Var, k6Var);
    }

    public final void c(w6 w6Var) {
        f7 f7Var = new f7(w6Var.f8242b, w6Var.f8241a);
        HashMap hashMap = this.f7821d;
        if (hashMap.containsKey(f7Var)) {
            x6 x6Var = (x6) hashMap.get(f7Var);
            if (!x6Var.equals(w6Var) || !w6Var.equals(x6Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(f7Var.toString()));
            }
            return;
        }
        hashMap.put(f7Var, w6Var);
    }

    public final void d(y6 y6Var) {
        g7 g7Var = new g7(y6Var.f8290a, y6Var.f8291b);
        HashMap hashMap = this.f7820c;
        if (hashMap.containsKey(g7Var)) {
            z6 z6Var = (z6) hashMap.get(g7Var);
            if (!z6Var.equals(y6Var) || !y6Var.equals(z6Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(g7Var.toString()));
            }
            return;
        }
        hashMap.put(g7Var, y6Var);
    }

    public e7(h7 h7Var) {
        this.f7818a = new HashMap(h7Var.f7874a);
        this.f7819b = new HashMap(h7Var.f7875b);
        this.f7820c = new HashMap(h7Var.f7876c);
        this.f7821d = new HashMap(h7Var.f7877d);
    }
}
