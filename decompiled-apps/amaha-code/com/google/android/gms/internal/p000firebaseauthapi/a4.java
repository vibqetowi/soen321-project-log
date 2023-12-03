package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a4  reason: invalid package */
/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: a  reason: collision with root package name */
    public final cb f7701a;

    public a4(cb cbVar) {
        this.f7701a = cbVar;
    }

    @Deprecated
    public final synchronized void a(ab abVar) {
        eb g5 = g(abVar);
        cb cbVar = this.f7701a;
        cbVar.e();
        fb.D((fb) cbVar.f7723v, g5);
    }

    public final synchronized z3 b() {
        fb fbVar;
        fbVar = (fb) this.f7701a.c();
        if (fbVar.v() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
        return new z3(fbVar);
    }

    public final synchronized void c(x3 x3Var) {
        a(x3Var.f8239a);
    }

    public final synchronized void d(int i6) {
        for (int i10 = 0; i10 < ((fb) this.f7701a.f7723v).v(); i10++) {
            eb y10 = ((fb) this.f7701a.f7723v).y(i10);
            if (y10.v() == i6) {
                if (y10.E() == 3) {
                    cb cbVar = this.f7701a;
                    cbVar.e();
                    ((fb) cbVar.f7723v).zzd = i6;
                } else {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i6);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i6);
    }

    public final synchronized int e() {
        int a10;
        a10 = i7.a();
        while (h(a10)) {
            a10 = i7.a();
        }
        return a10;
    }

    public final synchronized eb f(ya yaVar, int i6) {
        db x10;
        int e10 = e();
        if (i6 != 1) {
            x10 = eb.x();
            x10.e();
            eb.A((eb) x10.f7723v, yaVar);
            x10.e();
            ((eb) x10.f7723v).zzf = e10;
            x10.e();
            eb.F((eb) x10.f7723v);
            x10.e();
            ((eb) x10.f7723v).zzg = c.d(i6);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (eb) x10.c();
    }

    public final synchronized eb g(ab abVar) {
        return f(k4.a(abVar), abVar.y());
    }

    public final synchronized boolean h(int i6) {
        for (eb ebVar : Collections.unmodifiableList(((fb) this.f7701a.f7723v).B())) {
            if (ebVar.v() == i6) {
                return true;
            }
        }
        return false;
    }
}
