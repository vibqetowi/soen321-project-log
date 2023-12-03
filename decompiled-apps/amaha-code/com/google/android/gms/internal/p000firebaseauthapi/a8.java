package com.google.android.gms.internal.p000firebaseauthapi;

import com.android.volley.toolbox.a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import r1.b0;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a8  reason: invalid package */
/* loaded from: classes.dex */
public final class a8 implements h4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7707a = Logger.getLogger(a8.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7708b = {0};

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h4
    public final Class a() {
        return d4.class;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h4
    public final Class b() {
        return d4.class;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h4
    public final Object c(e4 e4Var) {
        byte[] copyOf;
        for (List<f4> list : e4Var.f7813a.values()) {
            for (f4 f4Var : list) {
                a aVar = f4Var.f7848e;
                if (aVar instanceof x7) {
                    x7 x7Var = (x7) aVar;
                    byte[] bArr = f4Var.f7845b;
                    if (bArr == null) {
                        copyOf = null;
                    } else {
                        copyOf = Arrays.copyOf(bArr, bArr.length);
                    }
                    nc a10 = nc.a(copyOf);
                    if (!a10.equals(x7Var.K())) {
                        String valueOf = String.valueOf(x7Var.J());
                        String ncVar = x7Var.K().toString();
                        String ncVar2 = a10.toString();
                        StringBuilder sb2 = new StringBuilder("Mac Key with parameters ");
                        sb2.append(valueOf);
                        sb2.append(" has wrong output prefix (");
                        sb2.append(ncVar);
                        sb2.append(") instead of (");
                        throw new GeneralSecurityException(b0.b(sb2, ncVar2, ")"));
                    }
                }
            }
        }
        return new z7(e4Var);
    }
}
