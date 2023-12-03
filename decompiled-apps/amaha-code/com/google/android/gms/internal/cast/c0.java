package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
import java.math.BigInteger;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: d  reason: collision with root package name */
    public static final p9.b f7491d = new p9.b("ApplicationAnalyticsUtils");

    /* renamed from: e  reason: collision with root package name */
    public static final String f7492e = "20.0.0";

    /* renamed from: a  reason: collision with root package name */
    public final String f7493a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, Integer> f7494b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, Integer> f7495c;

    public c0(Bundle bundle, String str) {
        this.f7493a = str;
        this.f7494b = z1.a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.f7495c = z1.a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r0 a(b0 b0Var, int i6) {
        int i10;
        Map<Integer, Integer> map;
        int i11;
        q0 b10 = b(b0Var);
        l0 i12 = m0.i(((r0) b10.f7477v).h());
        Map<Integer, Integer> map2 = this.f7495c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i6);
            if (map2.containsKey(valueOf)) {
                Integer num = map2.get(valueOf);
                v9.o.h(num);
                i10 = num.intValue();
                if (i12.f7478w) {
                    i12.b();
                    i12.f7478w = false;
                }
                m0.q((m0) i12.f7477v, i10);
                map = this.f7494b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i6);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = map.get(valueOf2);
                        v9.o.h(num2);
                        i11 = num2.intValue();
                        if (i12.f7478w) {
                            i12.b();
                            i12.f7478w = false;
                        }
                        m0.s((m0) i12.f7477v, i11);
                        m0 d10 = i12.d();
                        if (b10.f7478w) {
                            b10.b();
                            b10.f7478w = false;
                        }
                        r0.s((r0) b10.f7477v, d10);
                        return b10.d();
                    }
                }
                i11 = i6 + Constants.TIMEOUT_MS;
                if (i12.f7478w) {
                }
                m0.s((m0) i12.f7477v, i11);
                m0 d102 = i12.d();
                if (b10.f7478w) {
                }
                r0.s((r0) b10.f7477v, d102);
                return b10.d();
            }
        }
        i10 = i6 + Constants.TIMEOUT_MS;
        if (i12.f7478w) {
        }
        m0.q((m0) i12.f7477v, i10);
        map = this.f7494b;
        if (map != null) {
        }
        i11 = i6 + Constants.TIMEOUT_MS;
        if (i12.f7478w) {
        }
        m0.s((m0) i12.f7477v, i11);
        m0 d1022 = i12.d();
        if (b10.f7478w) {
        }
        r0.s((r0) b10.f7477v, d1022);
        return b10.d();
    }

    public final q0 b(b0 b0Var) {
        long j10;
        q0 i6 = r0.i();
        long j11 = b0Var.f7486c;
        if (i6.f7478w) {
            i6.b();
            i6.f7478w = false;
        }
        r0.n((r0) i6.f7477v, j11);
        int i10 = b0Var.f7487d;
        b0Var.f7487d = i10 + 1;
        if (i6.f7478w) {
            i6.b();
            i6.f7478w = false;
        }
        r0.q((r0) i6.f7477v, i10);
        String str = b0Var.f7485b;
        if (str != null) {
            if (i6.f7478w) {
                i6.b();
                i6.f7478w = false;
            }
            r0.p((r0) i6.f7477v, str);
        }
        j0 h10 = k0.h();
        if (h10.f7478w) {
            h10.b();
            h10.f7478w = false;
        }
        k0.l((k0) h10.f7477v, f7492e);
        if (h10.f7478w) {
            h10.b();
            h10.f7478w = false;
        }
        k0.k((k0) h10.f7477v, this.f7493a);
        k0 d10 = h10.d();
        if (i6.f7478w) {
            i6.b();
            i6.f7478w = false;
        }
        r0.t((r0) i6.f7477v, d10);
        l0 h11 = m0.h();
        if (b0Var.f7484a != null) {
            w0 h12 = x0.h();
            String str2 = b0Var.f7484a;
            if (h12.f7478w) {
                h12.b();
                h12.f7478w = false;
            }
            x0.k((x0) h12.f7477v, str2);
            x0 d11 = h12.d();
            if (h11.f7478w) {
                h11.b();
                h11.f7478w = false;
            }
            m0.n((m0) h11.f7477v, d11);
        }
        if (h11.f7478w) {
            h11.b();
            h11.f7478w = false;
        }
        m0.o((m0) h11.f7477v, false);
        String str3 = b0Var.f;
        if (str3 != null) {
            try {
                String replace = str3.replace("-", "");
                j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e10) {
                Object[] objArr = {str3};
                p9.b bVar = f7491d;
                Log.w(bVar.f28035a, bVar.f("receiverSessionId %s is not valid for hash", objArr), e10);
                j10 = 0;
            }
            if (h11.f7478w) {
                h11.b();
                h11.f7478w = false;
            }
            m0.p((m0) h11.f7477v, j10);
        }
        int i11 = b0Var.f7488e;
        if (h11.f7478w) {
            h11.b();
            h11.f7478w = false;
        }
        m0.t((m0) h11.f7477v, i11);
        if (i6.f7478w) {
            i6.b();
            i6.f7478w = false;
        }
        r0.s((r0) i6.f7477v, h11.d());
        return i6;
    }
}
