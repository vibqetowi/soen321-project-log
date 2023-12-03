package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.a3;
import com.google.android.gms.internal.cast.c3;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public class a3<MessageType extends c3<MessageType, BuilderType>, BuilderType extends a3<MessageType, BuilderType>> extends f2<MessageType, BuilderType> {

    /* renamed from: u  reason: collision with root package name */
    public final MessageType f7476u;

    /* renamed from: v  reason: collision with root package name */
    public MessageType f7477v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7478w = false;

    public a3(MessageType messagetype) {
        this.f7476u = messagetype;
        this.f7477v = (MessageType) messagetype.c(null, 4);
    }

    public static final void a(MessageType messagetype, MessageType messagetype2) {
        l4.f7583c.a(messagetype.getClass()).c(messagetype, messagetype2);
    }

    public final void b() {
        MessageType messagetype = (MessageType) this.f7477v.c(null, 4);
        a(messagetype, this.f7477v);
        this.f7477v = messagetype;
    }

    public final MessageType c() {
        if (this.f7478w) {
            return this.f7477v;
        }
        MessageType messagetype = this.f7477v;
        l4.f7583c.a(messagetype.getClass()).f(messagetype);
        this.f7478w = true;
        return this.f7477v;
    }

    public final Object clone() {
        a3 a3Var = (a3) this.f7476u.c(null, 5);
        a3Var.e(c());
        return a3Var;
    }

    public final MessageType d() {
        MessageType c10 = c();
        c3 c3Var = null;
        boolean z10 = true;
        byte byteValue = ((Byte) c10.c(null, 1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                boolean a10 = l4.f7583c.a(c10.getClass()).a(c10);
                if (true == a10) {
                    c3Var = c10;
                }
                c10.c(c3Var, 2);
                z10 = a10;
            }
        }
        if (z10) {
            return c10;
        }
        throw new zzqw();
    }

    public final void e(c3 c3Var) {
        if (this.f7478w) {
            b();
            this.f7478w = false;
        }
        a(this.f7477v, c3Var);
    }

    @Override // com.google.android.gms.internal.cast.d4
    public final /* bridge */ /* synthetic */ c3 j() {
        return this.f7476u;
    }
}
