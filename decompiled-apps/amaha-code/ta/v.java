package ta;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.measurement.l8;
import dt.n;
import iv.f;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import ls.e;
import xu.d;
import xu.e;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements h2, uf.l, vu.k, su.u {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ v f32900u = new v();

    /* renamed from: v  reason: collision with root package name */
    public static final v f32901v = new v();

    /* renamed from: w  reason: collision with root package name */
    public static final v f32902w = new v();

    public static int A(int i6, byte[] bArr, int i10) {
        byte b10 = bArr[i6 - 1];
        int i11 = i10 - i6;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    byte b11 = bArr[i6];
                    byte b12 = bArr[i6 + 1];
                    if (b10 > -12 || b11 > -65 || b12 > -65) {
                        return -1;
                    }
                    return ((b11 << 8) ^ b10) ^ (b12 << 16);
                }
                throw new AssertionError();
            }
            byte b13 = bArr[i6];
            if (b10 > -12 || b13 > -65) {
                return -1;
            }
            return b10 ^ (b13 << 8);
        } else if (b10 > -12) {
            return -1;
        } else {
            return b10;
        }
    }

    public static final wu.m1 B(ArrayList arrayList) {
        wu.i0 i0Var;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                Iterator it = arrayList.iterator();
                boolean z10 = false;
                boolean z11 = false;
                while (it.hasNext()) {
                    wu.m1 m1Var = (wu.m1) it.next();
                    if (!z10 && !E(m1Var)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (m1Var instanceof wu.i0) {
                        i0Var = (wu.i0) m1Var;
                    } else if (m1Var instanceof wu.v) {
                        if (D(m1Var)) {
                            return m1Var;
                        }
                        i0Var = ((wu.v) m1Var).f37298v;
                        z11 = true;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(i0Var);
                }
                if (z10) {
                    return yu.i.c(yu.h.R, arrayList.toString());
                }
                if (!z11) {
                    return xu.p.f38122a.b(arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(ca.a.A1((wu.m1) it2.next()));
                }
                xu.p pVar = xu.p.f38122a;
                return wu.c0.c(pVar.b(arrayList2), pVar.b(arrayList3));
            }
            return (wu.m1) is.u.y2(arrayList);
        }
        throw new IllegalStateException("Expected some types".toString());
    }

    public static final boolean C(AssertionError assertionError) {
        boolean J0;
        Logger logger = zv.p.f39906a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message == null) {
            J0 = false;
        } else {
            J0 = gv.r.J0(message, "getsockname failed");
        }
        if (!J0) {
            return false;
        }
        return true;
    }

    public static final boolean D(wu.b0 b0Var) {
        kotlin.jvm.internal.i.g(b0Var, "<this>");
        return b0Var.R0() instanceof wu.t;
    }

    public static final boolean E(wu.b0 b0Var) {
        kotlin.jvm.internal.i.g(b0Var, "<this>");
        wu.m1 R0 = b0Var.R0();
        if (!(R0 instanceof yu.f) && (!(R0 instanceof wu.v) || !(((wu.v) R0).V0() instanceof yu.f))) {
            return false;
        }
        return true;
    }

    public static final boolean F(Throwable th2) {
        Class<?> cls = th2.getClass();
        while (!kotlin.jvm.internal.i.b(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final boolean G(String str, int i6) {
        char charAt = str.charAt(i6);
        if ('A' <= charAt && charAt < '[') {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.q1, kotlinx.coroutines.a] */
    public static kotlinx.coroutines.q1 H(kotlinx.coroutines.d0 d0Var, kotlinx.coroutines.a0 a0Var, int i6, ss.p pVar, int i10) {
        boolean z10;
        kotlinx.coroutines.j1 j1Var;
        ls.f fVar = a0Var;
        if ((i10 & 1) != 0) {
            fVar = ls.g.f24521u;
        }
        if ((i10 & 2) != 0) {
            i6 = 1;
        }
        ls.f b10 = kotlinx.coroutines.y.b(d0Var, fVar);
        if (i6 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j1Var = new kotlinx.coroutines.j1(b10, pVar);
        } else {
            j1Var = new kotlinx.coroutines.q1(b10, true);
        }
        j1Var.s0(i6, j1Var, pVar);
        return j1Var;
    }

    public static final yt.m I(wu.b0 b0Var) {
        return (yt.m) ca.a.X0(b0Var, yt.v.f39059k, dv.c.f13507b);
    }

    public static int J(int i6, byte[] bArr, int i10) {
        while (i6 < i10 && bArr[i6] >= 0) {
            i6++;
        }
        if (i6 >= i10) {
            return 0;
        }
        while (i6 < i10) {
            int i11 = i6 + 1;
            byte b10 = bArr[i6];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i11 >= i10) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        i6 = i11 + 1;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (b10 < -16) {
                    if (i11 >= i10 - 1) {
                        return A(i11, bArr, i10);
                    }
                    int i12 = i11 + 1;
                    byte b11 = bArr[i11];
                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                        i6 = i12 + 1;
                        if (bArr[i12] > -65) {
                        }
                    }
                } else if (i11 >= i10 - 2) {
                    return A(i11, bArr, i10);
                } else {
                    int i13 = i11 + 1;
                    byte b12 = bArr[i11];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i14 = i13 + 1;
                            if (bArr[i13] <= -65) {
                                i11 = i14 + 1;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            i6 = i11;
        }
        return 0;
    }

    public static final void K(kotlinx.coroutines.m0 m0Var, ls.d dVar, boolean z10) {
        Object g5;
        kotlinx.coroutines.w1<?> w1Var;
        boolean t02;
        Object j10 = m0Var.j();
        Throwable f = m0Var.f(j10);
        if (f != null) {
            g5 = sp.b.j(f);
        } else {
            g5 = m0Var.g(j10);
        }
        if (z10) {
            kotlinx.coroutines.internal.d dVar2 = (kotlinx.coroutines.internal.d) dVar;
            ls.d<T> dVar3 = dVar2.f23589y;
            ls.f context = dVar3.getContext();
            Object c10 = kotlinx.coroutines.internal.t.c(context, dVar2.A);
            if (c10 != kotlinx.coroutines.internal.t.f23617a) {
                w1Var = kotlinx.coroutines.y.c(dVar3, context, c10);
            } else {
                w1Var = null;
            }
            try {
                dVar2.f23589y.resumeWith(g5);
                hs.k kVar = hs.k.f19476a;
                if (w1Var != null) {
                    if (!t02) {
                        return;
                    }
                }
                return;
            } finally {
                if (w1Var == null || w1Var.t0()) {
                    kotlinx.coroutines.internal.t.a(context, c10);
                }
            }
        }
        dVar.resumeWith(g5);
    }

    public static final Object L(Set set, Enum r22, Enum r32, Object obj, boolean z10) {
        Enum r12;
        if (z10) {
            if (set.contains(r22)) {
                r12 = r22;
            } else if (set.contains(r32)) {
                r12 = r32;
            } else {
                r12 = null;
            }
            if (kotlin.jvm.internal.i.b(r12, r22) && kotlin.jvm.internal.i.b(obj, r32)) {
                return null;
            }
            if (obj == null) {
                return r12;
            }
            return obj;
        }
        if (obj != null) {
            set = is.u.M2(is.h0.H1(set, obj));
        }
        return is.u.z2(set);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlinx.coroutines.internal.r, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(kotlinx.coroutines.flow.b bVar, ls.d dVar) {
        kotlinx.coroutines.flow.m mVar;
        Object obj;
        int i6;
        ?? r32;
        kotlin.jvm.internal.x xVar;
        if (dVar instanceof kotlinx.coroutines.flow.m) {
            mVar = (kotlinx.coroutines.flow.m) dVar;
            int i10 = mVar.f23543w;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mVar.f23543w = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = mVar.f23542v;
                obj = ms.a.COROUTINE_SUSPENDED;
                i6 = mVar.f23543w;
                r32 = kotlin.jvm.internal.b0.K;
                if (i6 == 0) {
                    if (i6 == 1) {
                        xVar = mVar.f23541u;
                        sp.b.d0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj2);
                    kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                    xVar2.f23469u = r32;
                    kotlinx.coroutines.flow.n nVar = new kotlinx.coroutines.flow.n(xVar2);
                    mVar.f23541u = xVar2;
                    mVar.f23543w = 1;
                    if (bVar.a(nVar, mVar) != obj) {
                        xVar = xVar2;
                    }
                    return obj;
                }
                obj = xVar.f23469u;
                if (obj == r32) {
                    throw new NoSuchElementException("Flow is empty");
                }
                return obj;
            }
        }
        mVar = new kotlinx.coroutines.flow.m(dVar);
        Object obj22 = mVar.f23542v;
        obj = ms.a.COROUTINE_SUSPENDED;
        i6 = mVar.f23543w;
        r32 = kotlin.jvm.internal.b0.K;
        if (i6 == 0) {
        }
        obj = xVar.f23469u;
        if (obj == r32) {
        }
        return obj;
    }

    public static final zv.b N(Socket socket) {
        Logger logger = zv.p.f39906a;
        zv.y yVar = new zv.y(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.i.f(outputStream, "getOutputStream()");
        return new zv.b(yVar, new zv.r(outputStream, yVar));
    }

    public static final zv.c O(Socket socket) {
        Logger logger = zv.p.f39906a;
        zv.y yVar = new zv.y(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.i.f(inputStream, "getInputStream()");
        return new zv.c(yVar, new zv.o(inputStream, yVar));
    }

    public static final zv.o P(InputStream inputStream) {
        Logger logger = zv.p.f39906a;
        kotlin.jvm.internal.i.g(inputStream, "<this>");
        return new zv.o(inputStream, new zv.a0());
    }

    public static final String Q(byte b10) {
        char[] cArr = sc.b.f31420u;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }

    public static final String R(String str) {
        boolean z10;
        kotlin.jvm.internal.i.g(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if ('A' <= charAt && charAt < '[') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "builder.toString()");
        return sb3;
    }

    public static final Object S(ls.f fVar, ss.p pVar, ls.d dVar) {
        ls.f a10;
        ls.f context = dVar.getContext();
        if (!((Boolean) fVar.s(Boolean.FALSE, kotlinx.coroutines.z.f23719u)).booleanValue()) {
            a10 = context.h(fVar);
        } else {
            a10 = kotlinx.coroutines.y.a(context, fVar, false);
        }
        sp.b.p(a10);
        if (a10 == context) {
            kotlinx.coroutines.internal.p pVar2 = new kotlinx.coroutines.internal.p(dVar, a10);
            return sp.b.Z(pVar2, pVar2, pVar);
        }
        e.a aVar = e.a.f24519u;
        if (kotlin.jvm.internal.i.b(a10.e(aVar), context.e(aVar))) {
            kotlinx.coroutines.w1 w1Var = new kotlinx.coroutines.w1(dVar, a10);
            Object c10 = kotlinx.coroutines.internal.t.c(a10, null);
            try {
                return sp.b.Z(w1Var, w1Var, pVar);
            } finally {
                kotlinx.coroutines.internal.t.a(a10, c10);
            }
        }
        kotlinx.coroutines.l0 l0Var = new kotlinx.coroutines.l0(dVar, a10);
        try {
            sc.b.d0(ca.a.G0(ca.a.M(l0Var, l0Var, pVar)), hs.k.f19476a, null);
            return l0Var.t0();
        } catch (Throwable th2) {
            l0Var.resumeWith(sp.b.j(th2));
            throw th2;
        }
    }

    public static final Object T(ls.f fVar, Object obj, Object obj2, ss.p pVar, ls.d frame) {
        Object c10 = kotlinx.coroutines.internal.t.c(fVar, obj2);
        try {
            jv.p pVar2 = new jv.p(frame, fVar);
            kotlin.jvm.internal.c0.e(2, pVar);
            Object invoke = pVar.invoke(obj, pVar2);
            kotlinx.coroutines.internal.t.a(fVar, c10);
            if (invoke == ms.a.COROUTINE_SUSPENDED) {
                kotlin.jvm.internal.i.g(frame, "frame");
            }
            return invoke;
        } catch (Throwable th2) {
            kotlinx.coroutines.internal.t.a(fVar, c10);
            throw th2;
        }
    }

    public static iv.a c(int i6, iv.e eVar, int i10) {
        boolean z10 = false;
        if ((i10 & 1) != 0) {
            i6 = 0;
        }
        int i11 = i10 & 2;
        iv.e eVar2 = iv.e.SUSPEND;
        if (i11 != 0) {
            eVar = eVar2;
        }
        int i12 = 1;
        if (i6 != -2) {
            if (i6 != -1) {
                if (i6 != 0) {
                    if (i6 != Integer.MAX_VALUE) {
                        if (i6 == 1 && eVar == iv.e.DROP_OLDEST) {
                            return new iv.l(null);
                        }
                        return new iv.d(i6, eVar, null);
                    }
                    return new iv.m(0, null);
                } else if (eVar == eVar2) {
                    return new iv.m(1, null);
                } else {
                    return new iv.d(1, eVar, null);
                }
            }
            if (eVar == eVar2) {
                z10 = true;
            }
            if (z10) {
                return new iv.l(null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (eVar == eVar2) {
            iv.f.f20741l.getClass();
            i12 = f.a.f20743b;
        }
        return new iv.d(i12, eVar, null);
    }

    public static final void d(ov.a aVar, ov.c cVar, String str) {
        ov.d.f27798h.getClass();
        Logger logger = ov.d.f27800j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f27794b);
        sb2.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.i.f(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.f27788a);
        logger.fine(sb2.toString());
    }

    public static final void e(int i6, StringBuilder sb2) {
        for (int i10 = 0; i10 < i6; i10++) {
            sb2.append("?");
            if (i10 < i6 - 1) {
                sb2.append(",");
            }
        }
    }

    public static final boolean f(int i6, int i10, int i11, byte[] a10, byte[] b10) {
        kotlin.jvm.internal.i.g(a10, "a");
        kotlin.jvm.internal.i.g(b10, "b");
        if (i11 > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (a10[i12 + i6] != b10[i12 + i10]) {
                    return false;
                }
                if (i13 < i11) {
                    i12 = i13;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlinx.coroutines.i0, kotlinx.coroutines.a] */
    public static kotlinx.coroutines.i0 g(kotlinx.coroutines.d0 d0Var, kotlinx.coroutines.a0 a0Var, ss.p pVar, int i6) {
        int i10;
        kotlinx.coroutines.i1 i1Var;
        ls.f fVar = a0Var;
        if ((i6 & 1) != 0) {
            fVar = ls.g.f24521u;
        }
        boolean z10 = false;
        if ((i6 & 2) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ls.f b10 = kotlinx.coroutines.y.b(d0Var, fVar);
        if (i10 == 2) {
            z10 = true;
        }
        if (z10) {
            i1Var = new kotlinx.coroutines.i1(b10, pVar);
        } else {
            i1Var = new kotlinx.coroutines.i0(b10, true);
        }
        i1Var.s0(i10, i1Var, pVar);
        return i1Var;
    }

    public static final zv.s h(zv.x xVar) {
        kotlin.jvm.internal.i.g(xVar, "<this>");
        return new zv.s(xVar);
    }

    public static final zv.t j(zv.z zVar) {
        kotlin.jvm.internal.i.g(zVar, "<this>");
        return new zv.t(zVar);
    }

    public static final kotlinx.coroutines.flow.b k(ss.p pVar) {
        return new kotlinx.coroutines.flow.b(pVar, ls.g.f24521u, -2, iv.e.SUSPEND);
    }

    public static final String l(String str) {
        boolean z10;
        kotlin.jvm.internal.i.g(str, "<this>");
        boolean z11 = false;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z11 = true;
        }
        if (z11) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }
        return str;
    }

    public static final void m(long j10, long j11, long j12) {
        if ((j11 | j12) >= 0 && j11 <= j10 && j10 - j11 >= j12) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
        if ((r6 instanceof gt.l0) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String n(gt.u uVar, int i6) {
        boolean z10;
        boolean z11;
        String f;
        boolean z12 = false;
        if ((i6 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i6 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        kotlin.jvm.internal.i.g(uVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (uVar instanceof gt.i) {
                f = "<init>";
            } else {
                f = uVar.getName().f();
                kotlin.jvm.internal.i.f(f, "name.asString()");
            }
            sb2.append(f);
        }
        sb2.append("(");
        gt.n0 k02 = uVar.k0();
        if (k02 != null) {
            wu.b0 a10 = k02.a();
            kotlin.jvm.internal.i.f(a10, "it.type");
            sb2.append(I(a10));
        }
        for (gt.z0 z0Var : uVar.i()) {
            wu.b0 a11 = z0Var.a();
            kotlin.jvm.internal.i.f(a11, "parameter.type");
            sb2.append(I(a11));
        }
        sb2.append(")");
        if (z10) {
            if (!(uVar instanceof gt.i)) {
                wu.b0 returnType = uVar.getReturnType();
                kotlin.jvm.internal.i.d(returnType);
                fu.e eVar = dt.j.f13360e;
                if (dt.j.E(returnType, n.a.f13400d)) {
                    wu.b0 returnType2 = uVar.getReturnType();
                    kotlin.jvm.internal.i.d(returnType2);
                    if (!wu.k1.g(returnType2)) {
                    }
                }
                if (!z12) {
                    sb2.append("V");
                } else {
                    wu.b0 returnType3 = uVar.getReturnType();
                    kotlin.jvm.internal.i.d(returnType3);
                    sb2.append(I(returnType3));
                }
            }
            z12 = true;
            if (!z12) {
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String o(gt.a aVar) {
        gt.e eVar;
        gt.p0 p0Var;
        kotlin.jvm.internal.i.g(aVar, "<this>");
        if (iu.g.o(aVar)) {
            return null;
        }
        gt.j c10 = aVar.c();
        if (c10 instanceof gt.e) {
            eVar = (gt.e) c10;
        } else {
            eVar = null;
        }
        if (eVar == null || eVar.getName().f15931v) {
            return null;
        }
        gt.a b10 = aVar.b();
        if (b10 instanceof gt.p0) {
            p0Var = (gt.p0) b10;
        } else {
            p0Var = null;
        }
        if (p0Var == null) {
            return null;
        }
        return ca.a.n1(eVar, n(p0Var, 3));
    }

    public static wu.w0 p(boolean z10, boolean z11, f6.b bVar, xu.d dVar, xu.e eVar, int i6) {
        boolean z12;
        if ((i6 & 2) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i6 & 4) != 0) {
            bVar = f6.b.M;
        }
        f6.b typeSystemContext = bVar;
        if ((i6 & 8) != 0) {
            dVar = d.a.f38096v;
        }
        xu.d kotlinTypePreparator = dVar;
        if ((i6 & 16) != 0) {
            eVar = e.a.f38097b;
        }
        xu.e kotlinTypeRefiner = eVar;
        kotlin.jvm.internal.i.g(typeSystemContext, "typeSystemContext");
        kotlin.jvm.internal.i.g(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new wu.w0(z10, z12, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static final String q(wu.x0 x0Var) {
        StringBuilder sb2 = new StringBuilder();
        r("type: " + x0Var, sb2);
        r("hashCode: " + x0Var.hashCode(), sb2);
        r("javaClass: " + x0Var.getClass().getCanonicalName(), sb2);
        for (gt.j a10 = x0Var.a(); a10 != null; a10 = a10.c()) {
            r("fqName: ".concat(hu.c.f19528a.G(a10)), sb2);
            r("javaClass: " + a10.getClass().getCanonicalName(), sb2);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final void r(String str, StringBuilder sb2) {
        kotlin.jvm.internal.i.g(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlinx.coroutines.internal.r, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(kotlinx.coroutines.flow.d dVar, ls.d dVar2) {
        kotlinx.coroutines.flow.k kVar;
        Object obj;
        int i6;
        ?? r32;
        kotlin.jvm.internal.x xVar;
        AbortFlowException e10;
        kotlinx.coroutines.flow.i iVar;
        if (dVar2 instanceof kotlinx.coroutines.flow.k) {
            kVar = (kotlinx.coroutines.flow.k) dVar2;
            int i10 = kVar.f23535x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kVar.f23535x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = kVar.f23534w;
                obj = ms.a.COROUTINE_SUSPENDED;
                i6 = kVar.f23535x;
                r32 = kotlin.jvm.internal.b0.K;
                if (i6 == 0) {
                    if (i6 == 1) {
                        iVar = kVar.f23533v;
                        xVar = kVar.f23532u;
                        try {
                            sp.b.d0(obj2);
                        } catch (AbortFlowException e11) {
                            e10 = e11;
                            if (e10.f23524u != iVar) {
                                throw e10;
                            }
                            obj = xVar.f23469u;
                            if (obj == r32) {
                            }
                            return obj;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj2);
                    kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                    xVar2.f23469u = r32;
                    kotlinx.coroutines.flow.i iVar2 = new kotlinx.coroutines.flow.i(xVar2);
                    try {
                        kVar.f23532u = xVar2;
                        kVar.f23533v = iVar2;
                        kVar.f23535x = 1;
                        if (dVar.a(iVar2, kVar) != obj) {
                            xVar = xVar2;
                        }
                    } catch (AbortFlowException e12) {
                        xVar = xVar2;
                        e10 = e12;
                        iVar = iVar2;
                        if (e10.f23524u != iVar) {
                        }
                        obj = xVar.f23469u;
                        if (obj == r32) {
                        }
                        return obj;
                    }
                    return obj;
                }
                obj = xVar.f23469u;
                if (obj == r32) {
                    throw new NoSuchElementException("Expected at least one element");
                }
                return obj;
            }
        }
        kVar = new kotlinx.coroutines.flow.k(dVar2);
        Object obj22 = kVar.f23534w;
        obj = ms.a.COROUTINE_SUSPENDED;
        i6 = kVar.f23535x;
        r32 = kotlin.jvm.internal.b0.K;
        if (i6 == 0) {
        }
        obj = xVar.f23469u;
        if (obj == r32) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r6.a(r2, r0) == r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlinx.coroutines.internal.r, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(kotlinx.coroutines.flow.r rVar, ss.p pVar, ls.d dVar) {
        kotlinx.coroutines.flow.l lVar;
        Object obj;
        int i6;
        ?? r32;
        kotlin.jvm.internal.x xVar;
        AbortFlowException abortFlowException;
        kotlinx.coroutines.flow.j jVar;
        ss.p pVar2;
        kotlin.jvm.internal.x xVar2;
        if (dVar instanceof kotlinx.coroutines.flow.l) {
            lVar = (kotlinx.coroutines.flow.l) dVar;
            int i10 = lVar.f23540y;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f23540y = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = lVar.f23539x;
                obj = ms.a.COROUTINE_SUSPENDED;
                i6 = lVar.f23540y;
                r32 = kotlin.jvm.internal.b0.K;
                if (i6 == 0) {
                    if (i6 == 1) {
                        jVar = lVar.f23538w;
                        xVar2 = lVar.f23537v;
                        pVar2 = lVar.f23536u;
                        try {
                            sp.b.d0(obj2);
                        } catch (AbortFlowException e10) {
                            xVar = xVar2;
                            pVar = pVar2;
                            abortFlowException = e10;
                        }
                        obj = xVar2.f23469u;
                        if (obj == r32) {
                            throw new NoSuchElementException("Expected at least one element matching the predicate " + pVar2);
                        }
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj2);
                xVar = new kotlin.jvm.internal.x();
                xVar.f23469u = r32;
                kotlinx.coroutines.flow.j jVar2 = new kotlinx.coroutines.flow.j(pVar, xVar);
                try {
                    lVar.f23536u = pVar;
                    lVar.f23537v = xVar;
                    lVar.f23538w = jVar2;
                    lVar.f23540y = 1;
                } catch (AbortFlowException e11) {
                    abortFlowException = e11;
                    jVar = jVar2;
                }
                if (abortFlowException.f23524u != jVar) {
                    throw abortFlowException;
                }
                pVar2 = pVar;
                xVar2 = xVar;
                obj = xVar2.f23469u;
                if (obj == r32) {
                }
                return obj;
            }
        }
        lVar = new kotlinx.coroutines.flow.l(dVar);
        Object obj22 = lVar.f23539x;
        obj = ms.a.COROUTINE_SUSPENDED;
        i6 = lVar.f23540y;
        r32 = kotlin.jvm.internal.b0.K;
        if (i6 == 0) {
        }
        if (abortFlowException.f23524u != jVar) {
        }
        pVar2 = pVar;
        xVar2 = xVar;
        obj = xVar2.f23469u;
        if (obj == r32) {
        }
        return obj;
    }

    public static final String u(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / 1000000) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - 500) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + 500) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / 1000000) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        return defpackage.b.o(new Object[]{str}, 1, "%6s", "format(format, *args)");
    }

    public static final kotlinx.coroutines.w0 v(Executor executor) {
        if (executor instanceof kotlinx.coroutines.n0) {
            kotlinx.coroutines.n0 n0Var = (kotlinx.coroutines.n0) executor;
        }
        return new kotlinx.coroutines.w0(executor);
    }

    public static final fu.b w(cu.c cVar, int i6) {
        kotlin.jvm.internal.i.g(cVar, "<this>");
        return fu.b.f(cVar.a(i6), cVar.b(i6));
    }

    public static final fu.e x(cu.c cVar, int i6) {
        kotlin.jvm.internal.i.g(cVar, "<this>");
        return fu.e.i(cVar.getString(i6));
    }

    public static final kotlinx.coroutines.k y(ls.d dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.d)) {
            return new kotlinx.coroutines.k(1, dVar);
        }
        kotlinx.coroutines.k l2 = ((kotlinx.coroutines.internal.d) dVar).l();
        if (l2 != null) {
            if (!l2.C()) {
                l2 = null;
            }
            if (l2 != null) {
                return l2;
            }
        }
        return new kotlinx.coroutines.k(2, dVar);
    }

    public static final void z(ls.f fVar, Throwable th2) {
        try {
            kotlinx.coroutines.b0 b0Var = (kotlinx.coroutines.b0) fVar.e(b0.a.f23486u);
            if (b0Var != null) {
                b0Var.R(fVar, th2);
            } else {
                kotlinx.coroutines.c0.a(fVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                ca.a.h(runtimeException, th2);
                th2 = runtimeException;
            }
            kotlinx.coroutines.c0.a(fVar, th2);
        }
    }

    @Override // ta.h2
    public Object a() {
        List list = j2.f32639a;
        return Long.valueOf(l8.f8459v.a().L());
    }

    @Override // su.u
    public wu.b0 b(au.p proto, String flexibleId, wu.i0 lowerBound, wu.i0 upperBound) {
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(flexibleId, "flexibleId");
        kotlin.jvm.internal.i.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.i.g(upperBound, "upperBound");
        if (!kotlin.jvm.internal.i.b(flexibleId, "kotlin.jvm.PlatformType")) {
            return yu.i.c(yu.h.G, flexibleId, lowerBound.toString(), upperBound.toString());
        }
        if (proto.l(du.a.f13441g)) {
            return new ut.g(lowerBound, upperBound);
        }
        return wu.c0.c(lowerBound, upperBound);
    }

    @Override // uf.l
    public Object i() {
        return new LinkedHashSet();
    }

    @Override // vu.k
    public void lock() {
    }

    @Override // vu.k
    public void unlock() {
    }
}
