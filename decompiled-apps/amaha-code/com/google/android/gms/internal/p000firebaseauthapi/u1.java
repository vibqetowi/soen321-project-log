package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u1  reason: invalid package */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: b  reason: collision with root package name */
    public static final s1 f8162b = new s1();

    /* renamed from: a  reason: collision with root package name */
    public final t1 f8163a;

    public u1() {
        a2 a2Var;
        a2[] a2VarArr = new a2[2];
        a2VarArr[0] = a1.f7699a;
        try {
            a2Var = (a2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            a2Var = f8162b;
        }
        a2VarArr[1] = a2Var;
        t1 t1Var = new t1(a2VarArr);
        Charset charset = i1.f7886a;
        this.f8163a = t1Var;
    }
}
