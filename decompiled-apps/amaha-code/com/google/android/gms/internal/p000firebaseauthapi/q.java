package com.google.android.gms.internal.p000firebaseauthapi;

import com.android.volley.toolbox.a;
import com.theinnerhour.b2b.utils.SessionManager;
import fd.d;
import g.x;
import gd.i;
import j7.k;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import sc.b;
import tr.r;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q  reason: invalid package */
/* loaded from: classes.dex */
public final class q implements je, f8, se {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8070u;

    /* renamed from: v  reason: collision with root package name */
    public Object f8071v;

    /* renamed from: w  reason: collision with root package name */
    public Object f8072w;

    /* renamed from: x  reason: collision with root package name */
    public Object f8073x;

    public /* synthetic */ q(x xVar, Object obj, p2 p2Var, int i6) {
        this.f8070u = i6;
        this.f8073x = xVar;
        this.f8071v = obj;
        this.f8072w = p2Var;
    }

    public static Cipher b() {
        if (r.F(1)) {
            return (Cipher) dc.f7781e.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.je
    public final String S() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SessionManager.KEY_EMAIL, (String) this.f8071v);
        jSONObject.put(SessionManager.KEY_PASS, (String) this.f8072w);
        jSONObject.put("returnSecureToken", true);
        String str = (String) this.f8073x;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f8
    public final byte[] a(byte[] bArr, int i6) {
        byte[] S;
        if (i6 <= 16) {
            Cipher b10 = b();
            b10.init(1, (SecretKey) this.f8071v);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            if (max * 16 == length) {
                S = r.U((max - 1) * 16, 0, 16, bArr, (byte[]) this.f8072w);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = Byte.MIN_VALUE;
                    S = r.S(copyOf, (byte[]) this.f8073x);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr2 = new byte[16];
            for (int i10 = 0; i10 < max - 1; i10++) {
                bArr2 = b10.doFinal(r.U(0, i10 * 16, 16, bArr2, bArr));
            }
            return Arrays.copyOf(b10.doFinal(r.S(S, bArr2)), i6);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    public final e8 c() {
        if (((ArrayList) this.f8071v) != null) {
            Integer num = (Integer) this.f8073x;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = (ArrayList) this.f8071v;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    int i10 = i6 + 1;
                    if (((d8) arrayList.get(i6)).f7776b != intValue) {
                        i6 = i10;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            e8 e8Var = new e8((b8) this.f8072w, Collections.unmodifiableList((ArrayList) this.f8071v), (Integer) this.f8073x);
            this.f8071v = null;
            return e8Var;
        }
        throw new IllegalStateException("cannot call build() twice");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void e(String str) {
        switch (this.f8070u) {
            case 3:
                ((p2) this.f8072w).g(i.a(str));
                return;
            case 4:
                ((p2) this.f8072w).g(i.a(str));
                return;
            case 5:
                ((p2) this.f8072w).g(i.a(str));
                return;
            default:
                ((p2) this.f8072w).g(i.a(str));
                return;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void j(ke keVar) {
        switch (this.f8070u) {
            case 3:
                af afVar = new af((d) this.f8071v, ((jf) keVar).f7923v);
                x xVar = (x) this.f8073x;
                p2 p2Var = (p2) this.f8072w;
                xVar.getClass();
                o.h(p2Var);
                ((a) xVar.f16143v).B(afVar, new od(xVar, p2Var, 1));
                return;
            case 4:
                s sVar = (s) this.f8071v;
                sVar.f8119z = ((jf) keVar).f7923v;
                ((a) ((x) this.f8073x).f16143v).I(sVar, new p2(this, this, 4));
                return;
            case 5:
                j jVar = (j) this.f8071v;
                jVar.I = true;
                String str = ((jf) keVar).f7923v;
                o.e(str);
                jVar.f7895v = str;
                ((a) ((x) this.f8073x).f16143v).F((j) this.f8071v, new p2(this, this, 5));
                return;
            default:
                jf jfVar = (jf) keVar;
                k kVar = new k();
                String str2 = jfVar.f7923v;
                o.e(str2);
                kVar.f21732u = str2;
                String str3 = (String) this.f8071v;
                if (str3 == null) {
                    ((h) kVar.A).f7868v.add("EMAIL");
                } else {
                    kVar.f21734w = str3;
                }
                x.E((x) this.f8073x, kVar, (p2) this.f8072w, this, jfVar);
                return;
        }
    }

    public q() {
        this.f8070u = 1;
        this.f8071v = new ArrayList();
        this.f8072w = b8.f7729b;
        this.f8073x = null;
    }

    public q(String str, String str2, String str3) {
        this.f8070u = 0;
        o.e(str);
        this.f8071v = str;
        o.e(str2);
        this.f8072w = str2;
        this.f8073x = str3;
    }

    public q(byte[] bArr) {
        this.f8070u = 2;
        mc.b(bArr.length);
        this.f8071v = new SecretKeySpec(bArr, "AES");
        Cipher b10 = b();
        b10.init(1, (SecretKey) this.f8071v);
        byte[] r02 = b.r0(b10.doFinal(new byte[16]));
        this.f8072w = r02;
        this.f8073x = b.r0(r02);
    }
}
