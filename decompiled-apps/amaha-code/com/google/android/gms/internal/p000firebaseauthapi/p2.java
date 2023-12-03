package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthMultiFactorException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import fd.f;
import fd.j;
import fd.m;
import fd.n;
import g.x;
import gd.g;
import gd.k0;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.h;
import sc.e;
import tr.r;
import v9.o;
import y9.a;
import ya.i;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p2  reason: invalid package */
/* loaded from: classes.dex */
public final class p2 implements p3, se {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8037u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f8038v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f8039w;

    public p2(m3 m3Var) {
        this.f8037u = 2;
        this.f8038v = m3Var;
        this.f8039w = null;
    }

    public static p2 b() {
        int i6 = zd.f8295a;
        jd jdVar = new jd(Pattern.compile("[.-]"));
        Matcher matcher = jdVar.f7921u.matcher("");
        matcher.getClass();
        if (!matcher.matches()) {
            return new p2(new x(14, jdVar));
        }
        throw new IllegalArgumentException(r.K("The pattern may not match the empty string: %s", jdVar));
    }

    public final void a(Object obj, Status status) {
        String str;
        FirebaseException firebaseAuthUserCollisionException;
        f fVar;
        i iVar = (i) this.f8039w;
        o.i(iVar, "completion source cannot be null");
        if (status != null) {
            pe peVar = (pe) this.f8038v;
            if (peVar.f8066j != null) {
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(peVar.f8060c);
                md mdVar = peVar.f8066j;
                if (!"reauthenticateWithCredential".equals(peVar.a()) && !"reauthenticateWithCredentialWithData".equals(peVar.a())) {
                    fVar = null;
                } else {
                    fVar = peVar.f8061d;
                }
                SparseArray sparseArray = be.f7733a;
                firebaseAuth.getClass();
                mdVar.getClass();
                Pair pair = (Pair) be.f7733a.get(17078);
                String str2 = (String) pair.first;
                String str3 = (String) pair.second;
                List list = mdVar.f7984v;
                ArrayList s02 = h.s0(list);
                ArrayList arrayList = new ArrayList();
                Iterator it = s02.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar instanceof n) {
                        arrayList.add((n) jVar);
                    }
                }
                ArrayList s03 = h.s0(list);
                String str4 = mdVar.f7983u;
                o.e(str4);
                g gVar = new g();
                gVar.f16414w = new ArrayList();
                Iterator it2 = s03.iterator();
                while (it2.hasNext()) {
                    j jVar2 = (j) it2.next();
                    if (jVar2 instanceof n) {
                        gVar.f16414w.add((n) jVar2);
                    }
                }
                gVar.f16413v = str4;
                e eVar = firebaseAuth.f9536a;
                eVar.b();
                new gd.e(arrayList, gVar, eVar.f31433b, mdVar.f7985w, (k0) fVar);
                iVar.a(new FirebaseAuthMultiFactorException(str2, str3));
                return;
            } else if (peVar.f8065i != null) {
                SparseArray sparseArray2 = be.f7733a;
                int i6 = status.f7298v;
                if (i6 != 17012 && i6 != 17007 && i6 != 17025) {
                    firebaseAuthUserCollisionException = be.a(status);
                } else {
                    Pair pair2 = (Pair) be.f7733a.get(i6);
                    if (pair2 != null) {
                        str = (String) pair2.second;
                    } else {
                        str = "An internal error has occurred.";
                    }
                    firebaseAuthUserCollisionException = new FirebaseAuthUserCollisionException(be.b(i6), be.c(str, status));
                }
                iVar.a(firebaseAuthUserCollisionException);
                return;
            } else {
                iVar.a(be.a(status));
                return;
            }
        }
        iVar.b(obj);
    }

    public final byte[] c() {
        Object obj = this.f8039w;
        try {
            String string = ((SharedPreferences) this.f8038v).getString((String) obj, null);
            if (string != null) {
                if (string.length() % 2 == 0) {
                    int length = string.length() / 2;
                    byte[] bArr = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        int i10 = i6 + i6;
                        int digit = Character.digit(string.charAt(i10), 16);
                        int digit2 = Character.digit(string.charAt(i10 + 1), 16);
                        if (digit != -1 && digit2 != -1) {
                            bArr[i6] = (byte) ((digit * 16) + digit2);
                        } else {
                            throw new IllegalArgumentException("input is not hexadecimal");
                        }
                    }
                    return bArr;
                }
                throw new IllegalArgumentException("Expected a string of even length");
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", (String) obj));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", (String) obj));
        }
    }

    public final List d(CharSequence charSequence) {
        l lVar;
        charSequence.getClass();
        x xVar = (x) ((r1) this.f8039w);
        switch (xVar.f16142u) {
            case 13:
                lVar = new l(xVar, this, charSequence);
                break;
            default:
                lVar = new l(this, charSequence, new yc(((jd) ((ec) xVar.f16143v)).f7921u.matcher(charSequence)));
                break;
        }
        ArrayList arrayList = new ArrayList();
        while (lVar.hasNext()) {
            arrayList.add((String) lVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void e(String str) {
        int i6 = this.f8037u;
        Object obj = this.f8038v;
        switch (i6) {
            case 4:
                ((se) obj).e(str);
                return;
            default:
                ((se) obj).e(str);
                return;
        }
    }

    public final void f(md mdVar) {
        try {
            ((yd) this.f8038v).e(mdVar);
        } catch (RemoteException e10) {
            ((a) this.f8039w).b("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void g(Status status) {
        try {
            ((yd) this.f8038v).c(status);
        } catch (RemoteException e10) {
            ((a) this.f8039w).b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void j(ke keVar) {
        int i6 = this.f8037u;
        Object obj = this.f8039w;
        switch (i6) {
            case 4:
                t tVar = (t) keVar;
                if (!TextUtils.isEmpty(tVar.f8142y)) {
                    Status status = new Status(17025, null);
                    p2 p2Var = (p2) ((q) obj).f8072w;
                    m mVar = new m(null, null, tVar.f8143z, tVar.f8142y, null, false, true);
                    p2Var.getClass();
                    try {
                        ((yd) p2Var.f8038v).a(status, mVar);
                        return;
                    } catch (RemoteException e10) {
                        ((a) p2Var.f8039w).b("RemoteException when sending failure result.", e10, new Object[0]);
                        return;
                    }
                }
                q qVar = (q) obj;
                ((x) qVar.f8073x).z(new jf(tVar.f8139v, tVar.f8138u, Long.valueOf(tVar.f8140w), "Bearer"), null, "phone", Boolean.valueOf(tVar.f8141x), null, (p2) qVar.f8072w, (se) this.f8038v);
                return;
            default:
                q qVar2 = (q) obj;
                x.D((x) qVar2.f8073x, (m) keVar, (p2) qVar2.f8072w, this);
                return;
        }
    }

    public p2(n3 n3Var) {
        this.f8037u = 2;
        this.f8038v = null;
        this.f8039w = n3Var;
    }

    public p2(pe peVar, i iVar) {
        this.f8037u = 7;
        this.f8038v = peVar;
        this.f8039w = iVar;
    }

    public /* synthetic */ p2(se seVar, se seVar2, int i6) {
        this.f8037u = i6;
        this.f8039w = seVar;
        this.f8038v = seVar2;
    }

    public p2(x xVar) {
        this.f8037u = 0;
        z9 z9Var = z9.f8293b;
        this.f8039w = xVar;
        this.f8038v = z9Var;
    }

    public p2(Context context, String str) {
        this.f8037u = 3;
        this.f8039w = "GenericIdpKeyset";
        Context applicationContext = context.getApplicationContext();
        if (str == null) {
            this.f8038v = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f8038v = applicationContext.getSharedPreferences(str, 0);
        }
    }

    public p2(e4 e4Var) {
        this.f8037u = 1;
        this.f8038v = e4Var;
        boolean c10 = e4Var.c();
        d7 d7Var = h.G;
        if (c10) {
            c8 a10 = u6.f8172b.a();
            h.n0(e4Var);
            a10.a();
        }
        this.f8039w = d7Var;
    }

    public p2(oe oeVar, a aVar) {
        this.f8037u = 6;
        o.h(oeVar);
        this.f8038v = oeVar;
        o.h(aVar);
        this.f8039w = aVar;
    }
}
