package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.cast.g2;
import java.io.IOException;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class g2<MessageType extends g2<MessageType, BuilderType>, BuilderType extends f2<MessageType, BuilderType>> implements c4 {
    protected int zza = 0;

    public int a() {
        throw null;
    }

    public void b(int i6) {
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.c4
    public final m2 r() {
        try {
            c3 c3Var = (c3) this;
            int m10 = c3Var.m();
            m2 m2Var = n2.f7604v;
            byte[] bArr = new byte[m10];
            Logger logger = q2.f7626u0;
            p2 p2Var = new p2(bArr, m10);
            o4 a10 = l4.f7583c.a(c3Var.getClass());
            r2 r2Var = p2Var.f7628t0;
            if (r2Var == null) {
                r2Var = new r2(p2Var);
            }
            a10.e(c3Var, r2Var);
            if (m10 - p2Var.f7619y0 == 0) {
                return new m2(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }
}
