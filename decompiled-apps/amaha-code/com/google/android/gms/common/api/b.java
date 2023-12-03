package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.w0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import ka.d;
import kotlinx.coroutines.e0;
import v9.c;
import ya.i;
import ya.v;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class b<O extends a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7306a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7307b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.gms.common.api.a<O> f7308c;

    /* renamed from: d  reason: collision with root package name */
    public final O f7309d;

    /* renamed from: e  reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.a<O> f7310e;
    public final Looper f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7311g;

    /* renamed from: h  reason: collision with root package name */
    public final f0 f7312h;

    /* renamed from: i  reason: collision with root package name */
    public final e0 f7313i;

    /* renamed from: j  reason: collision with root package name */
    public final f f7314j;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f7315c = new a(new e0(5), Looper.getMainLooper());

        /* renamed from: a  reason: collision with root package name */
        public final e0 f7316a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f7317b;

        public a(e0 e0Var, Looper looper) {
            this.f7316a = e0Var;
            this.f7317b = looper;
        }
    }

    public b() {
        throw null;
    }

    public b(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        String str;
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (aVar == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (aVar2 != null) {
            this.f7306a = context.getApplicationContext();
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                this.f7307b = str;
                this.f7308c = aVar;
                this.f7309d = o10;
                this.f = aVar2.f7317b;
                this.f7310e = new com.google.android.gms.common.api.internal.a<>(aVar, o10, str);
                this.f7312h = new f0(this);
                f f = f.f(this.f7306a);
                this.f7314j = f;
                this.f7311g = f.B.getAndIncrement();
                this.f7313i = aVar2.f7316a;
                d dVar = f.G;
                dVar.sendMessage(dVar.obtainMessage(7, this));
                return;
            }
            str = null;
            this.f7307b = str;
            this.f7308c = aVar;
            this.f7309d = o10;
            this.f = aVar2.f7317b;
            this.f7310e = new com.google.android.gms.common.api.internal.a<>(aVar, o10, str);
            this.f7312h = new f0(this);
            f f2 = f.f(this.f7306a);
            this.f7314j = f2;
            this.f7311g = f2.B.getAndIncrement();
            this.f7313i = aVar2.f7316a;
            d dVar2 = f2.G;
            dVar2.sendMessage(dVar2.obtainMessage(7, this));
            return;
        }
        throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    }

    public final c.a a() {
        Account M;
        Collection<? extends Scope> emptySet;
        GoogleSignInAccount K;
        c.a aVar = new c.a();
        O o10 = this.f7309d;
        boolean z10 = o10 instanceof a.c.b;
        if (z10 && (K = ((a.c.b) o10).K()) != null) {
            String str = K.f7219x;
            if (str != null) {
                M = new Account(str, "com.google");
            }
            M = null;
        } else {
            if (o10 instanceof a.c.InterfaceC0143a) {
                M = ((a.c.InterfaceC0143a) o10).M();
            }
            M = null;
        }
        aVar.f34861a = M;
        if (z10) {
            GoogleSignInAccount K2 = ((a.c.b) o10).K();
            if (K2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = K2.f0();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        if (aVar.f34862b == null) {
            aVar.f34862b = new t.d<>();
        }
        aVar.f34862b.addAll(emptySet);
        Context context = this.f7306a;
        aVar.f34864d = context.getClass().getName();
        aVar.f34863c = context.getPackageName();
        return aVar;
    }

    public final v b(int i6, p pVar) {
        i iVar = new i();
        f fVar = this.f7314j;
        fVar.getClass();
        fVar.e(iVar, pVar.f7417c, this);
        w0 w0Var = new w0(i6, pVar, iVar, this.f7313i);
        d dVar = fVar.G;
        dVar.sendMessage(dVar.obtainMessage(4, new k0(w0Var, fVar.C.get(), this)));
        return iVar.f38392a;
    }
}
