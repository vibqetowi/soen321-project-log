package com.android.volley.toolbox;

import android.graphics.Path;
import android.graphics.Typeface;
import com.google.android.gms.internal.p000firebaseauthapi.af;
import com.google.android.gms.internal.p000firebaseauthapi.d7;
import com.google.android.gms.internal.p000firebaseauthapi.od;
import com.google.android.gms.internal.p000firebaseauthapi.pd;
import com.google.android.gms.internal.p000firebaseauthapi.q;
import com.google.android.gms.internal.p000firebaseauthapi.s;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.gms.internal.p000firebaseauthapi.se;
import g.x;
import java.util.Collection;
import java.util.Map;
import tr.i0;
import wu.m1;
import yf.a;
/* compiled from: BaseHttpStack.java */
/* loaded from: classes.dex */
public abstract class a implements bg.d {

    /* renamed from: u  reason: collision with root package name */
    public static a.C0651a f5871u;

    public static int b(boolean[] zArr, int i6, int[] iArr, boolean z10) {
        int i10 = 0;
        for (int i11 : iArr) {
            int i12 = 0;
            while (i12 < i11) {
                zArr[i6] = z10;
                i12++;
                i6++;
            }
            i10 += i11;
            z10 = !z10;
        }
        return i10;
    }

    public abstract void A(byte[] bArr, int i6);

    public abstract void B(af afVar, od odVar);

    public abstract void C(com.google.android.gms.internal.p000firebaseauthapi.n nVar, x xVar);

    public abstract void D(s5 s5Var, se seVar);

    public abstract void E(j7.k kVar, pd pdVar);

    public abstract void F(com.google.android.gms.internal.p000firebaseauthapi.j jVar, se seVar);

    public abstract void G(com.google.android.gms.internal.p000firebaseauthapi.n nVar, od odVar);

    public abstract void H(q qVar, od odVar);

    public abstract void I(s sVar, se seVar);

    @Override // bg.d
    public dg.b O(String str, bg.a aVar, int i6, int i10, Map map) {
        if (!str.isEmpty()) {
            if (i6 >= 0 && i10 >= 0) {
                int e10 = e();
                if (map != null) {
                    bg.c cVar = bg.c.MARGIN;
                    if (map.containsKey(cVar)) {
                        e10 = Integer.parseInt(map.get(cVar).toString());
                    }
                }
                boolean[] c10 = c(str);
                int length = c10.length;
                int i11 = e10 + length;
                int max = Math.max(i6, i11);
                int max2 = Math.max(1, i10);
                int i12 = max / i11;
                int i13 = (max - (length * i12)) / 2;
                dg.b bVar = new dg.b(max, max2);
                int i14 = 0;
                while (i14 < length) {
                    if (c10[i14]) {
                        bVar.c(i13, 0, i12, max2);
                    }
                    i14++;
                    i13 += i12;
                }
                return bVar;
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i6 + 'x' + i10);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public abstract void a(gt.b bVar);

    public abstract boolean[] c(String str);

    public abstract f d(e4.j jVar, Map map);

    public int e() {
        return 10;
    }

    public String f() {
        return null;
    }

    public String g() {
        return null;
    }

    public abstract Path h(float f, float f2, float f10, float f11);

    public String i() {
        return null;
    }

    public abstract ya.h j();

    public abstract void k(gt.b bVar, gt.b bVar2);

    public abstract void l();

    public abstract void m(int i6);

    public abstract void n(Typeface typeface, boolean z10);

    public abstract m1 p(zu.h hVar);

    public abstract void q(oe.j jVar);

    public void r(gt.b member, Collection collection) {
        kotlin.jvm.internal.i.g(member, "member");
        member.y0(collection);
    }

    public abstract void t(com.google.protobuf.h hVar);

    public abstract void u(double d10);

    public abstract void v();

    public abstract void w(int i6, byte[] bArr, int i10);

    public abstract void x(long j10);

    public abstract void y(String str);

    public abstract d7 z();

    public void o(long j10) {
    }

    public void s(i0 i0Var) {
    }
}
