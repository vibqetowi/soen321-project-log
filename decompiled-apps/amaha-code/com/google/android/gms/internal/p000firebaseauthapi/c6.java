package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;
import v.h;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c6  reason: invalid package */
/* loaded from: classes.dex */
public final class c6 {

    /* renamed from: e  reason: collision with root package name */
    public a4 f7756e;
    public p2 f = null;

    /* renamed from: a  reason: collision with root package name */
    public g6 f7752a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f7753b = null;

    /* renamed from: c  reason: collision with root package name */
    public e6 f7754c = null;

    /* renamed from: d  reason: collision with root package name */
    public x3 f7755d = null;

    @Deprecated
    public final void a(ab abVar) {
        String A = abVar.A();
        byte[] K = abVar.z().K();
        int y10 = abVar.y();
        int i6 = d6.f7771c;
        int d10 = h.d(y10);
        int i10 = 1;
        if (d10 != 1) {
            i10 = 2;
            if (d10 != 2) {
                i10 = 3;
                if (d10 != 3) {
                    i10 = 4;
                    if (d10 != 4) {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                }
            }
        }
        this.f7755d = x3.a(i10, A, K);
    }

    public final void b(Context context, String str) {
        if (context != null) {
            this.f = new p2(context, str);
            this.f7752a = new g6(context, str);
            return;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public final synchronized d6 c() {
        a4 a4Var;
        if (this.f7753b != null) {
            this.f7754c = d();
        }
        try {
            a4Var = e();
        } catch (FileNotFoundException e10) {
            int i6 = d6.f7771c;
            if (Log.isLoggable("d6", 4)) {
                int i10 = d6.f7771c;
                Log.i("d6", String.format("keyset not found, will generate a new one. %s", e10.getMessage()));
            }
            if (this.f7755d != null) {
                a4Var = new a4(fb.x());
                a4Var.c(this.f7755d);
                a4Var.d(l4.a(a4Var.b().f8273a).w().v());
                if (this.f7754c != null) {
                    a4Var.b().c(this.f7752a, this.f7754c);
                } else {
                    this.f7752a.b(a4Var.b().f8273a);
                }
            } else {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }
        this.f7756e = a4Var;
        return new d6(this);
    }

    public final e6 d() {
        if (Build.VERSION.SDK_INT >= 23) {
            f6 f6Var = new f6();
            boolean a10 = f6Var.a(this.f7753b);
            if (!a10) {
                try {
                    String str = this.f7753b;
                    if (!new f6().a(str)) {
                        String a11 = mc.a(str);
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        keyGenerator.init(new KeyGenParameterSpec.Builder(a11, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                        keyGenerator.generateKey();
                    } else {
                        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
                    }
                } catch (GeneralSecurityException | ProviderException e10) {
                    int i6 = d6.f7771c;
                    Log.w("d6", "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            }
            try {
                return f6Var.e(this.f7753b);
            } catch (GeneralSecurityException | ProviderException e11) {
                if (!a10) {
                    int i10 = d6.f7771c;
                    Log.w("d6", "cannot use Android Keystore, it'll be disabled", e11);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f7753b), e11);
            }
        }
        int i11 = d6.f7771c;
        Log.w("d6", "Android Keystore requires at least Android M");
        return null;
    }

    public final a4 e() {
        e6 e6Var = this.f7754c;
        if (e6Var != null) {
            try {
                fb fbVar = z3.e(this.f, e6Var).f8273a;
                b1 b1Var = (b1) fbVar.m(5);
                b1Var.b(fbVar);
                return new a4((cb) b1Var);
            } catch (zzadn | GeneralSecurityException e10) {
                int i6 = d6.f7771c;
                Log.w("d6", "cannot decrypt keyset: ", e10);
            }
        }
        fb A = fb.A(this.f.c(), r0.f8101b);
        if (A.v() > 0) {
            b8 b8Var = b8.f7729b;
            b1 b1Var2 = (b1) A.m(5);
            b1Var2.b(A);
            return new a4((cb) b1Var2);
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
