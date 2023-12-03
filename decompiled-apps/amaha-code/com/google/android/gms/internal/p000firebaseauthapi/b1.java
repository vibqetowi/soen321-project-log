package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.b1;
import com.google.android.gms.internal.p000firebaseauthapi.e1;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b1  reason: invalid package */
/* loaded from: classes.dex */
public class b1<MessageType extends e1<MessageType, BuilderType>, BuilderType extends b1<MessageType, BuilderType>> extends v<MessageType, BuilderType> {

    /* renamed from: u  reason: collision with root package name */
    public final e1 f7722u;

    /* renamed from: v  reason: collision with root package name */
    public e1 f7723v;

    public b1(MessageType messagetype) {
        this.f7722u = messagetype;
        if (!messagetype.k()) {
            this.f7723v = messagetype.s();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final void b(e1 e1Var) {
        e1 e1Var2 = this.f7722u;
        if (!e1Var2.equals(e1Var)) {
            if (!this.f7723v.k()) {
                e1 s10 = e1Var2.s();
                j2.f7908c.a(s10.getClass()).f(s10, this.f7723v);
                this.f7723v = s10;
            }
            e1 e1Var3 = this.f7723v;
            j2.f7908c.a(e1Var3.getClass()).f(e1Var3, e1Var);
        }
    }

    public final MessageType c() {
        MessageType d10 = d();
        if (d10.i()) {
            return d10;
        }
        throw new zzafm();
    }

    public final Object clone() {
        b1 b1Var = (b1) this.f7722u.m(5);
        b1Var.f7723v = d();
        return b1Var;
    }

    public final MessageType d() {
        if (!this.f7723v.k()) {
            return (MessageType) this.f7723v;
        }
        this.f7723v.d();
        return (MessageType) this.f7723v;
    }

    public final void e() {
        if (!this.f7723v.k()) {
            e1 s10 = this.f7722u.s();
            j2.f7908c.a(s10.getClass()).f(s10, this.f7723v);
            this.f7723v = s10;
        }
    }
}
