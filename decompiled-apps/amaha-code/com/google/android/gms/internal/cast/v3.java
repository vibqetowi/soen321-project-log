package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class v3 {

    /* renamed from: b  reason: collision with root package name */
    public static final t3 f7664b = new t3();

    /* renamed from: a  reason: collision with root package name */
    public final u3 f7665a;

    public v3() {
        b4 b4Var;
        b4[] b4VarArr = new b4[2];
        b4VarArr[0] = z2.f7688a;
        try {
            b4Var = (b4) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            b4Var = f7664b;
        }
        b4VarArr[1] = b4Var;
        u3 u3Var = new u3(b4VarArr);
        Charset charset = k3.f7570a;
        this.f7665a = u3Var;
    }
}
