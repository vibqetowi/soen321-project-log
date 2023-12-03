package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class o6 {

    /* renamed from: b  reason: collision with root package name */
    public static final m6 f8537b = new m6();

    /* renamed from: a  reason: collision with root package name */
    public final n6 f8538a;

    public o6() {
        u6 u6Var;
        u6[] u6VarArr = new u6[2];
        u6VarArr[0] = s5.f8592a;
        try {
            u6Var = (u6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            u6Var = f8537b;
        }
        u6VarArr[1] = u6Var;
        n6 n6Var = new n6(u6VarArr);
        Charset charset = c6.f8318a;
        this.f8538a = n6Var;
    }
}
