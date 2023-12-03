package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.v;
import com.google.android.gms.internal.p000firebaseauthapi.w;
import java.io.IOException;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w  reason: invalid package */
/* loaded from: classes.dex */
public abstract class w<MessageType extends w<MessageType, BuilderType>, BuilderType extends v<MessageType, BuilderType>> implements b2 {
    protected int zza = 0;

    public int b(m2 m2Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.b2
    public final g0 n() {
        try {
            e1 e1Var = (e1) this;
            int j10 = e1Var.j();
            g0 g0Var = h0.f7869v;
            byte[] bArr = new byte[j10];
            Logger logger = n0.f7994w;
            l0 l0Var = new l0(bArr, j10);
            e1Var.h(l0Var);
            if (j10 - l0Var.A == 0) {
                return new g0(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(b.m("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.b2
    public final byte[] p() {
        try {
            e1 e1Var = (e1) this;
            int j10 = e1Var.j();
            byte[] bArr = new byte[j10];
            Logger logger = n0.f7994w;
            l0 l0Var = new l0(bArr, j10);
            e1Var.h(l0Var);
            if (j10 - l0Var.A == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(b.m("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
