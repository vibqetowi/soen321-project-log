package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.Status;
import fd.b;
import fd.f;
import gd.m;
import java.util.ArrayList;
import sc.e;
import ya.i;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pe  reason: invalid package */
/* loaded from: classes.dex */
public abstract class pe {

    /* renamed from: a  reason: collision with root package name */
    public final int f8058a;

    /* renamed from: b  reason: collision with root package name */
    public final oe f8059b = new oe(this);

    /* renamed from: c  reason: collision with root package name */
    public e f8060c;

    /* renamed from: d  reason: collision with root package name */
    public f f8061d;

    /* renamed from: e  reason: collision with root package name */
    public Object f8062e;
    public m f;

    /* renamed from: g  reason: collision with root package name */
    public jf f8063g;

    /* renamed from: h  reason: collision with root package name */
    public ef f8064h;

    /* renamed from: i  reason: collision with root package name */
    public b f8065i;

    /* renamed from: j  reason: collision with root package name */
    public md f8066j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8067k;

    /* renamed from: l  reason: collision with root package name */
    public Object f8068l;

    /* renamed from: m  reason: collision with root package name */
    public p2 f8069m;

    public pe(int i6) {
        new ArrayList();
        this.f8058a = i6;
    }

    public abstract String a();

    public abstract void b();

    public abstract void c(i iVar, ae aeVar);

    public final void d(Object obj) {
        if (obj != null) {
            this.f8062e = obj;
            return;
        }
        throw new NullPointerException("external callback cannot be null");
    }

    public final void e(e eVar) {
        if (eVar != null) {
            this.f8060c = eVar;
            return;
        }
        throw new NullPointerException("firebaseApp cannot be null");
    }

    public final void f(f fVar) {
        if (fVar != null) {
            this.f8061d = fVar;
            return;
        }
        throw new NullPointerException("firebaseUser cannot be null");
    }

    public final void g(Status status) {
        this.f8067k = true;
        this.f8069m.a(null, status);
    }

    public final void h(Object obj) {
        this.f8067k = true;
        this.f8068l = obj;
        this.f8069m.a(obj, null);
    }
}
