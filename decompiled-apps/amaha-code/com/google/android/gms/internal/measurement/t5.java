package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.w5;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public class t5<MessageType extends w5<MessageType, BuilderType>, BuilderType extends t5<MessageType, BuilderType>> extends q4<MessageType, BuilderType> {

    /* renamed from: u  reason: collision with root package name */
    public final w5 f8612u;

    /* renamed from: v  reason: collision with root package name */
    public w5 f8613v;

    public t5(MessageType messagetype) {
        this.f8612u = messagetype;
        if (!messagetype.p()) {
            this.f8613v = (w5) messagetype.t(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final void e(byte[] bArr, int i6, i5 i5Var) {
        if (!this.f8613v.p()) {
            w5 w5Var = (w5) this.f8612u.t(4);
            d7.f8338c.a(w5Var.getClass()).f(w5Var, this.f8613v);
            this.f8613v = w5Var;
        }
        try {
            d7.f8338c.a(this.f8613v.getClass()).h(this.f8613v, bArr, 0, i6, new com.google.android.gms.internal.p000firebaseauthapi.z(i5Var));
        } catch (zzkp e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkp.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r1 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType f() {
        MessageType h10 = h();
        byte byteValue = ((Byte) h10.t(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean c10 = d7.f8338c.a(h10.getClass()).c(h10);
                h10.t(2);
            }
            throw new zzmn();
        }
        return h10;
    }

    public final MessageType h() {
        if (!this.f8613v.p()) {
            return (MessageType) this.f8613v;
        }
        this.f8613v.l();
        return (MessageType) this.f8613v;
    }

    public final void i() {
        if (!this.f8613v.p()) {
            w5 w5Var = (w5) this.f8612u.t(4);
            d7.f8338c.a(w5Var.getClass()).f(w5Var, this.f8613v);
            this.f8613v = w5Var;
        }
    }

    /* renamed from: j */
    public final t5 clone() {
        t5 t5Var = (t5) this.f8612u.t(5);
        t5Var.f8613v = h();
        return t5Var;
    }
}
