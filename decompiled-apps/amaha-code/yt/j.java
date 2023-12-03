package yt;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kt.i0;
import zt.a;
/* compiled from: DeserializedDescriptorResolver.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<a.EnumC0686a> f39033b = ca.a.l1(a.EnumC0686a.CLASS);

    /* renamed from: c  reason: collision with root package name */
    public static final Set<a.EnumC0686a> f39034c = ca.a.m1(a.EnumC0686a.FILE_FACADE, a.EnumC0686a.MULTIFILE_CLASS_PART);

    /* renamed from: d  reason: collision with root package name */
    public static final eu.e f39035d;

    /* renamed from: e  reason: collision with root package name */
    public static final eu.e f39036e;

    /* renamed from: a  reason: collision with root package name */
    public su.l f39037a;

    static {
        new eu.e(new int[]{1, 1, 2}, false);
        f39035d = new eu.e(new int[]{1, 1, 11}, false);
        f39036e = new eu.e(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (yt.j.f39034c.contains(r1.f39838a) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uu.j a(i0 descriptor, o kotlinClass) {
        String[] strArr;
        hs.f<eu.f, au.k> fVar;
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        kotlin.jvm.internal.i.g(kotlinClass, "kotlinClass");
        zt.a a10 = kotlinClass.a();
        String[] strArr2 = a10.f39840c;
        if (strArr2 == null) {
            strArr2 = a10.f39841d;
        }
        if (strArr2 != null) {
        }
        strArr2 = null;
        if (strArr2 == null || (strArr = kotlinClass.a().f39842e) == null) {
            return null;
        }
        try {
            try {
                fVar = eu.h.h(strArr2, strArr);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.d(), e10);
            }
        } catch (Throwable th2) {
            c().f32046c.d();
            if (!kotlinClass.a().f39839b.c()) {
                fVar = null;
            } else {
                throw th2;
            }
        }
        if (fVar == null) {
            return null;
        }
        eu.f fVar2 = fVar.f19464u;
        au.k kVar = fVar.f19465v;
        d(kotlinClass);
        e(kotlinClass);
        l lVar = new l(kotlinClass, kVar, fVar2, b(kotlinClass));
        return new uu.j(descriptor, kVar, fVar2, kotlinClass.a().f39839b, lVar, c(), "scope for " + lVar + " in " + descriptor, i.f39032u);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(o oVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        c().f32046c.b();
        int i6 = oVar.a().f39843g;
        boolean z15 = false;
        if ((i6 & 64) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((i6 & 32) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                z11 = true;
                if (!z11) {
                    return 2;
                }
                int i10 = oVar.a().f39843g;
                if ((i10 & 16) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if ((i10 & 32) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        z15 = true;
                    }
                }
                if (!z15) {
                    return 1;
                }
                return 3;
            }
        }
        z11 = false;
        if (!z11) {
        }
    }

    public final su.l c() {
        su.l lVar = this.f39037a;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.i.q("components");
        throw null;
    }

    public final su.v<eu.e> d(o oVar) {
        c().f32046c.d();
        if (oVar.a().f39839b.c()) {
            return null;
        }
        return new su.v<>(oVar.a().f39839b, eu.e.f14563g, oVar.d(), oVar.g());
    }

    public final boolean e(o oVar) {
        boolean z10;
        boolean z11;
        c().f32046c.e();
        c().f32046c.c();
        if ((oVar.a().f39843g & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && kotlin.jvm.internal.i.b(oVar.a().f39839b, f39035d)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (yt.j.f39033b.contains(r1.f39838a) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final su.h f(o oVar) {
        String[] strArr;
        hs.f<eu.f, au.b> fVar;
        zt.a a10 = oVar.a();
        String[] strArr2 = a10.f39840c;
        if (strArr2 == null) {
            strArr2 = a10.f39841d;
        }
        if (strArr2 != null) {
        }
        strArr2 = null;
        if (strArr2 == null || (strArr = oVar.a().f39842e) == null) {
            return null;
        }
        try {
            try {
                fVar = eu.h.f(strArr2, strArr);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + oVar.d(), e10);
            }
        } catch (Throwable th2) {
            c().f32046c.d();
            if (!oVar.a().f39839b.c()) {
                fVar = null;
            } else {
                throw th2;
            }
        }
        if (fVar == null) {
            return null;
        }
        d(oVar);
        e(oVar);
        return new su.h(fVar.f19464u, fVar.f19465v, oVar.a().f39839b, new q(oVar, b(oVar)));
    }
}
