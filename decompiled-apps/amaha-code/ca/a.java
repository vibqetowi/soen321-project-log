package ca;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.support.v4.media.MediaMetadataCompat;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.work.c;
import androidx.work.u;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.r;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.internal.measurement.l8;
import com.theinnerhour.b2b.R;
import dt.n;
import et.c;
import f0.a;
import fd.p;
import ft.c;
import fu.d;
import fu.g;
import gt.a0;
import gt.d0;
import gt.e;
import gt.j;
import gt.q0;
import gt.u0;
import gt.z0;
import hs.f;
import ht.h;
import ht.k;
import is.e0;
import is.u;
import is.w;
import is.y;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.r1;
import kt.h0;
import kt.v0;
import ku.l;
import ls.e;
import ls.f;
import r0.b;
import s1.f0;
import ss.q;
import su.t;
import ta.h2;
import ta.j2;
import v2.s;
import v9.o;
import vr.o3;
import vr.p1;
import vr.t2;
import wu.b0;
import wu.c0;
import wu.d1;
import wu.f1;
import wu.g1;
import wu.h1;
import wu.i0;
import wu.j1;
import wu.l0;
import wu.l1;
import wu.m1;
import wu.n1;
import wu.t0;
import wu.v;
import wu.v0;
import wu.x;
import wu.x0;
import wu.y0;
import wu.z;
import wu.z0;
import xu.a;
import yt.m;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public class a implements n, t, sv.t, h2, o3 {
    public static String[] E;

    /* renamed from: u  reason: collision with root package name */
    public static Context f5216u;

    /* renamed from: v  reason: collision with root package name */
    public static Boolean f5217v;

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f5218w = {R.attr.lottie_autoPlay, R.attr.lottie_cacheComposition, R.attr.lottie_colorFilter, R.attr.lottie_enableMergePathsForKitKatAndAbove, R.attr.lottie_fallbackRes, R.attr.lottie_fileName, R.attr.lottie_imageAssetsFolder, R.attr.lottie_loop, R.attr.lottie_progress, R.attr.lottie_rawRes, R.attr.lottie_renderMode, R.attr.lottie_repeatCount, R.attr.lottie_repeatMode, R.attr.lottie_scale, R.attr.lottie_speed, R.attr.lottie_url};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f5219x = {R.attr.elevation};

    /* renamed from: y  reason: collision with root package name */
    public static final a f5220y = new a();

    /* renamed from: z  reason: collision with root package name */
    public static final a f5221z = new a();
    public static final a A = new a();
    public static final a B = new a();
    public static final a C = new a();
    public static final a D = new a();
    public static final int[] F = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};
    public static final int[] G = {16842960, 16843161};
    public static final int[] H = {16843161, 16843849, 16843850, 16843851};
    public static final a I = new a();
    public static final r J = new r("NO_DECISION");
    public static final a K = new a();
    public static final int[] L = {16843071, 16843072, R.attr.externalRouteEnabledDrawable, R.attr.externalRouteEnabledDrawableStatic, R.attr.mediaRouteButtonTint};
    public static final /* synthetic */ a M = new a();

    public static final List A(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                arrayList.trimToSize();
                return arrayList;
            }
            return O0(u.g2(arrayList));
        }
        return w.f20676u;
    }

    public static LinkedHashSet A0(String str, String... strArr) {
        return y0("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i0 A1(b0 b0Var) {
        i.g(b0Var, "<this>");
        m1 R0 = b0Var.R0();
        if (R0 instanceof v) {
            return ((v) R0).f37299w;
        }
        if (R0 instanceof i0) {
            return (i0) R0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final h B(h first, h second) {
        i.g(first, "first");
        i.g(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        if (!second.isEmpty()) {
            return new k(first, second);
        }
        return first;
    }

    public static final m1 B0(m1 m1Var, b0 origin) {
        i.g(m1Var, "<this>");
        i.g(origin, "origin");
        return C1(m1Var, h0(origin));
    }

    public static void B1(String str, String str2, Throwable th2) {
        Log.w(str, i(str2, th2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r1.f15931v == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String C(e klass, yt.u typeMappingConfiguration) {
        e eVar;
        i.g(klass, "klass");
        i.g(typeMappingConfiguration, "typeMappingConfiguration");
        typeMappingConfiguration.b(klass);
        j c10 = klass.c();
        i.f(c10, "klass.containingDeclaration");
        fu.e name = klass.getName();
        if (name != null) {
            fu.e eVar2 = g.f15933a;
        }
        name = g.f15935c;
        String h10 = name.h();
        i.f(h10, "safeIdentifier(klass.name).identifier");
        if (c10 instanceof d0) {
            fu.c e10 = ((d0) c10).e();
            if (!e10.d()) {
                return gv.n.E0(e10.b(), '.', '/') + '/' + h10;
            }
            return h10;
        }
        if (c10 instanceof e) {
            eVar = (e) c10;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            typeMappingConfiguration.a(eVar);
            String C2 = C(eVar, typeMappingConfiguration);
            return C2 + '$' + h10;
        }
        throw new IllegalArgumentException("Unexpected container: " + c10 + " for " + klass);
    }

    public static final int C0(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(defpackage.c.q("Could not convert ", i6, " to BackoffPolicy"));
    }

    public static final m1 C1(m1 m1Var, b0 b0Var) {
        i.g(m1Var, "<this>");
        if (m1Var instanceof l1) {
            return C1(((l1) m1Var).I0(), b0Var);
        }
        if (b0Var != null && !i.b(b0Var, m1Var)) {
            if (m1Var instanceof i0) {
                return new l0((i0) m1Var, b0Var);
            }
            if (m1Var instanceof v) {
                return new x((v) m1Var, b0Var);
            }
            throw new NoWhenBranchMatchedException();
        }
        return m1Var;
    }

    public static String[] D(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public static final int D0(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                return 3;
            }
            if (i6 != 3) {
                if (i6 == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT >= 30 && i6 == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(defpackage.c.q("Could not convert ", i6, " to NetworkType"));
            }
            return 4;
        }
        return 2;
    }

    public static void D1(File file, String text) {
        Charset charset = gv.a.f16927b;
        i.g(file, "<this>");
        i.g(text, "text");
        i.g(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        i.f(bytes, "this as java.lang.String).getBytes(charset)");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes);
            hs.k kVar = hs.k.f19476a;
            z(fileOutputStream, null);
        } finally {
        }
    }

    public static final boolean E(String str, String str2) {
        if (str != null && str2 != null) {
            Locale locale = Locale.getDefault();
            i.f(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Locale locale2 = Locale.getDefault();
            i.f(locale2, "getDefault()");
            String lowerCase2 = str2.toLowerCase(locale2);
            i.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            return gv.r.J0(lowerCase, lowerCase2);
        }
        return i.b(str, str2);
    }

    public static final int E0(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(defpackage.c.q("Could not convert ", i6, " to OutOfQuotaPolicy"));
    }

    public static int E1(int i6) {
        switch (i6) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static final int F(b0 b0Var) {
        i.g(b0Var, "<this>");
        ht.c l2 = b0Var.getAnnotations().l(n.a.f13412q);
        if (l2 == null) {
            return 0;
        }
        ku.g gVar = (ku.g) e0.r0(l2.b(), dt.n.f13384c);
        i.e(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((l) gVar).f23941a).intValue();
    }

    public static final u.a F0(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                return u.a.CANCELLED;
                            }
                            throw new IllegalArgumentException(defpackage.c.q("Could not convert ", i6, " to State"));
                        }
                        return u.a.BLOCKED;
                    }
                    return u.a.FAILED;
                }
                return u.a.SUCCEEDED;
            }
            return u.a.RUNNING;
        }
        return u.a.ENQUEUED;
    }

    public static com.google.android.gms.internal.p000firebaseauthapi.j F1(fd.b bVar, String str) {
        o.h(bVar);
        if (fd.i.class.isAssignableFrom(bVar.getClass())) {
            fd.i iVar = (fd.i) bVar;
            return new com.google.android.gms.internal.p000firebaseauthapi.j(iVar.f14957u, iVar.f14958v, "google.com", null, null, str, null, null);
        } else if (fd.e.class.isAssignableFrom(bVar.getClass())) {
            return new com.google.android.gms.internal.p000firebaseauthapi.j(null, ((fd.e) bVar).f14953u, "facebook.com", null, null, str, null, null);
        } else {
            if (p.class.isAssignableFrom(bVar.getClass())) {
                p pVar = (p) bVar;
                return new com.google.android.gms.internal.p000firebaseauthapi.j(null, pVar.f14970u, "twitter.com", pVar.f14971v, null, str, null, null);
            } else if (fd.h.class.isAssignableFrom(bVar.getClass())) {
                return new com.google.android.gms.internal.p000firebaseauthapi.j(null, ((fd.h) bVar).f14956u, "github.com", null, null, str, null, null);
            } else {
                if (fd.o.class.isAssignableFrom(bVar.getClass())) {
                    return new com.google.android.gms.internal.p000firebaseauthapi.j(null, null, "playgames.google.com", null, ((fd.o) bVar).f14969u, str, null, null);
                }
                if (fd.x.class.isAssignableFrom(bVar.getClass())) {
                    fd.x xVar = (fd.x) bVar;
                    com.google.android.gms.internal.p000firebaseauthapi.j jVar = xVar.f14975x;
                    if (jVar == null) {
                        return new com.google.android.gms.internal.p000firebaseauthapi.j(xVar.f14973v, xVar.f14974w, xVar.f14972u, xVar.f14977z, null, str, xVar.f14976y, xVar.A);
                    }
                    return jVar;
                }
                throw new IllegalArgumentException("Unsupported credential type.");
            }
        }
    }

    public static e G(e eVar) {
        d g5 = iu.g.g(eVar);
        String str = ft.c.f15851a;
        fu.c cVar = ft.c.f15860k.get(g5);
        if (cVar != null) {
            return mu.a.e(eVar).j(cVar);
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a read-only collection");
    }

    public static final ls.d G0(ls.d dVar) {
        ns.c cVar;
        ls.d<Object> intercepted;
        i.g(dVar, "<this>");
        if (dVar instanceof ns.c) {
            cVar = (ns.c) dVar;
        } else {
            cVar = null;
        }
        if (cVar != null && (intercepted = cVar.intercepted()) != null) {
            return intercepted;
        }
        return dVar;
    }

    public static final Collection H(Collection collection, Set set) {
        boolean z10;
        i.g(collection, "<this>");
        if (!(collection instanceof Set) && set.size() >= 2) {
            if (is.n.f20672a && collection.size() > 2 && (collection instanceof ArrayList)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return is.u.G2(collection);
            }
            return collection;
        }
        return collection;
    }

    public static final boolean H0(b0 b0Var) {
        boolean z10;
        i.g(b0Var, "<this>");
        gt.g a10 = b0Var.O0().a();
        if (a10 == null) {
            return false;
        }
        et.c i02 = i0(a10);
        if (i02 != et.c.f14549x && i02 != et.c.f14550y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public static final void I(int i6, int i10) {
        if (i6 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is greater than size (" + i10 + ").");
    }

    public static boolean I0(char c10) {
        if (c10 >= 128 && c10 <= 255) {
            return true;
        }
        return false;
    }

    public static void J(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[8192];
        int read = fileInputStream.read(bArr);
        while (read >= 0) {
            fileOutputStream.write(bArr, 0, read);
            read = fileInputStream.read(bArr);
        }
    }

    public static final boolean J0(b0 b0Var) {
        i.g(b0Var, "<this>");
        return b0Var.R0() instanceof v;
    }

    public static final ArrayList K(ArrayList arrayList, List oldValueParameters, gt.a newOwner) {
        b0 b0Var;
        i.g(oldValueParameters, "oldValueParameters");
        i.g(newOwner, "newOwner");
        arrayList.size();
        oldValueParameters.size();
        ArrayList O2 = is.u.O2(arrayList, oldValueParameters);
        ArrayList arrayList2 = new ArrayList(is.i.H1(O2, 10));
        Iterator it = O2.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            b0 b0Var2 = (b0) fVar.f19464u;
            z0 z0Var = (z0) fVar.f19465v;
            int index = z0Var.getIndex();
            h annotations = z0Var.getAnnotations();
            fu.e name = z0Var.getName();
            i.f(name, "oldParameter.name");
            boolean v02 = z0Var.v0();
            boolean b02 = z0Var.b0();
            boolean Y = z0Var.Y();
            if (z0Var.j0() != null) {
                b0Var = mu.a.j(newOwner).o().g(b0Var2);
            } else {
                b0Var = null;
            }
            q0 g5 = z0Var.g();
            i.f(g5, "oldParameter.source");
            arrayList2.add(new v0(newOwner, null, index, annotations, name, b0Var2, v02, b02, Y, b0Var, g5));
        }
        return arrayList2;
    }

    public static synchronized boolean K0(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f5216u;
            if (context2 != null && (bool = f5217v) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f5217v = null;
            if (aa.g.a()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f5217v = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f5217v = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f5217v = Boolean.FALSE;
                }
            }
            f5216u = applicationContext;
            return f5217v.booleanValue();
        }
    }

    public static p1 L() {
        boolean z10;
        if (t2.f35966y == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new t2();
        }
        return new gd.d(11);
    }

    public static boolean L0(char c10) {
        boolean z10;
        if (c10 != '\r' && c10 != '*' && c10 != '>') {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && c10 != ' ' && ((c10 < '0' || c10 > '9') && (c10 < 'A' || c10 > 'Z'))) {
            return false;
        }
        return true;
    }

    public static final ls.d M(Object obj, ls.d completion, ss.p pVar) {
        i.g(pVar, "<this>");
        i.g(completion, "completion");
        if (pVar instanceof ns.a) {
            return ((ns.a) pVar).create(obj, completion);
        }
        ls.f context = completion.getContext();
        if (context == ls.g.f24521u) {
            return new ms.b(obj, completion, pVar);
        }
        return new ms.c(completion, context, pVar, obj);
    }

    public static final boolean M0(b0 b0Var) {
        et.c cVar;
        i.g(b0Var, "<this>");
        gt.g a10 = b0Var.O0().a();
        if (a10 != null) {
            cVar = i0(a10);
        } else {
            cVar = null;
        }
        if (cVar == et.c.f14550y) {
            return true;
        }
        return false;
    }

    public static final i0 N(dt.j jVar, h hVar, b0 b0Var, List list, ArrayList arrayList, b0 b0Var2, boolean z10) {
        int i6;
        f1 f1Var;
        e k10;
        int size = list.size() + arrayList.size();
        int i10 = 0;
        if (b0Var != null) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        ArrayList arrayList2 = new ArrayList(size + i6 + 1);
        ArrayList arrayList3 = new ArrayList(is.i.H1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(hc.d.g((b0) it.next()));
        }
        arrayList2.addAll(arrayList3);
        if (b0Var != null) {
            f1Var = hc.d.g(b0Var);
        } else {
            f1Var = null;
        }
        g(f1Var, arrayList2);
        Iterator it2 = arrayList.iterator();
        int i11 = 0;
        while (true) {
            boolean hasNext = it2.hasNext();
            h hVar2 = h.a.f19495a;
            if (hasNext) {
                Object next = it2.next();
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    arrayList2.add(hc.d.g((b0) next));
                    i11 = i12;
                } else {
                    t1();
                    throw null;
                }
            } else {
                arrayList2.add(hc.d.g(b0Var2));
                int size2 = list.size() + arrayList.size();
                if (b0Var != null) {
                    i10 = 1;
                }
                int i13 = size2 + i10;
                if (z10) {
                    k10 = jVar.w(i13);
                } else {
                    fu.e eVar = dt.n.f13382a;
                    k10 = jVar.k("Function" + i13);
                }
                i.f(k10, "if (isSuspendFunction) b…tFunction(parameterCount)");
                if (b0Var != null) {
                    fu.c cVar = n.a.f13411p;
                    if (!hVar.H(cVar)) {
                        ArrayList t22 = is.u.t2(hVar, new ht.j(jVar, cVar, is.x.f20677u));
                        if (t22.isEmpty()) {
                            hVar = hVar2;
                        } else {
                            hVar = new ht.i(t22);
                        }
                    }
                }
                if (!list.isEmpty()) {
                    int size3 = list.size();
                    fu.c cVar2 = n.a.f13412q;
                    if (hVar.H(cVar2)) {
                        hVar2 = hVar;
                    } else {
                        ArrayList t23 = is.u.t2(hVar, new ht.j(jVar, cVar2, sp.b.Q(new f(dt.n.f13384c, new l(size3)))));
                        if (!t23.isEmpty()) {
                            hVar2 = new ht.i(t23);
                        }
                    }
                    hVar = hVar2;
                }
                return c0.e(v1(hVar), k10, arrayList2);
            }
        }
    }

    public static final boolean N0(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }

    public static ke.p O(String str) {
        boolean z10;
        List list;
        boolean z11;
        int length = str.length();
        if (length >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0(z10, "Invalid path \"%s\"", str);
        if (length == 2) {
            if (str.charAt(0) == 1 && str.charAt(1) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            u0(z11, "Non-empty path \"%s\" had length 2", str);
            list = Collections.emptyList();
        } else {
            int length2 = str.length() - 2;
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            int i6 = 0;
            while (i6 < length) {
                int indexOf = str.indexOf(1, i6);
                if (indexOf >= 0 && indexOf <= length2) {
                    int i10 = indexOf + 1;
                    char charAt = str.charAt(i10);
                    if (charAt != 1) {
                        if (charAt != 16) {
                            if (charAt == 17) {
                                sb2.append(str.substring(i6, i10));
                            } else {
                                throw new IllegalArgumentException(defpackage.b.m("Invalid encoded resource path: \"", str, "\""));
                            }
                        } else {
                            sb2.append(str.substring(i6, indexOf));
                            sb2.append((char) 0);
                        }
                    } else {
                        String substring = str.substring(i6, indexOf);
                        if (sb2.length() != 0) {
                            sb2.append(substring);
                            substring = sb2.toString();
                            sb2.setLength(0);
                        }
                        arrayList.add(substring);
                    }
                    i6 = indexOf + 2;
                } else {
                    throw new IllegalArgumentException(defpackage.b.m("Invalid encoded resource path: \"", str, "\""));
                }
            }
            list = arrayList;
        }
        ke.p pVar = ke.p.f23292v;
        if (list.isEmpty()) {
            return ke.p.f23292v;
        }
        return new ke.p(list);
    }

    public static final List O0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i.f(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final Object P(long j10, ls.d dVar) {
        j0 j0Var;
        if (j10 <= 0) {
            return hs.k.f19476a;
        }
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, G0(dVar));
        kVar.u();
        if (j10 < Long.MAX_VALUE) {
            f.b e10 = kVar.f23631y.e(e.a.f24519u);
            if (e10 instanceof j0) {
                j0Var = (j0) e10;
            } else {
                j0Var = null;
            }
            if (j0Var == null) {
                j0Var = g0.f23577a;
            }
            j0Var.J(j10, kVar);
        }
        Object s10 = kVar.s();
        if (s10 == ms.a.COROUTINE_SUSPENDED) {
            return s10;
        }
        return hs.k.f19476a;
    }

    public static final List P0(Object... elements) {
        i.g(elements, "elements");
        if (elements.length > 0) {
            return is.i.G1(elements);
        }
        return w.f20676u;
    }

    public static void Q(String str, String str2, Throwable th2) {
        Log.e(str, i(str2, th2));
    }

    public static final List Q0(Object obj) {
        if (obj != null) {
            return O0(obj);
        }
        return w.f20676u;
    }

    public static String R(ke.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        int p10 = eVar.p();
        for (int i6 = 0; i6 < p10; i6++) {
            if (sb2.length() > 0) {
                sb2.append((char) 1);
                sb2.append((char) 1);
            }
            String l2 = eVar.l(i6);
            int length = l2.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = l2.charAt(i10);
                if (charAt != 0) {
                    if (charAt != 1) {
                        sb2.append(charAt);
                    } else {
                        sb2.append((char) 1);
                        sb2.append((char) 17);
                    }
                } else {
                    sb2.append((char) 1);
                    sb2.append((char) 16);
                }
            }
        }
        sb2.append((char) 1);
        sb2.append((char) 1);
        return sb2.toString();
    }

    public static final void R0(String str, String str2) {
        if (str2.length() > 4000) {
            String substring = str2.substring(0, 4000);
            i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.d(str, substring);
            String substring2 = str2.substring(4000);
            i.f(substring2, "this as java.lang.String).substring(startIndex)");
            R0(str, substring2);
            return;
        }
        Log.d(str, str2);
    }

    public static final boolean S(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static final void S0(int i6, String tag, String subTag, String message, Throwable th2) {
        String str;
        i.g(tag, "tag");
        i.g(subTag, "subTag");
        i.g(message, "message");
        if (!gv.n.B0(subTag)) {
            str = subTag + ' ' + message;
        } else {
            str = message;
        }
        if (gv.n.B0(message)) {
            return;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 == 5) {
                            T0(tag, str);
                            return;
                        }
                        return;
                    }
                    R0(tag, str);
                    return;
                }
                Log.i(tag, str);
                return;
            }
            Log.w(tag, str);
        } else if (th2 != null) {
            Log.e(tag, str, th2);
        } else {
            Log.e(tag, str);
        }
    }

    public static final fu.e T(b0 b0Var) {
        ku.u uVar;
        String str;
        ht.c l2 = b0Var.getAnnotations().l(n.a.r);
        if (l2 == null) {
            return null;
        }
        Object z22 = is.u.z2(l2.b().values());
        if (z22 instanceof ku.u) {
            uVar = (ku.u) z22;
        } else {
            uVar = null;
        }
        if (uVar != null && (str = (String) uVar.f23941a) != null) {
            if (!fu.e.k(str)) {
                str = null;
            }
            if (str != null) {
                return fu.e.j(str);
            }
        }
        return null;
    }

    public static final void T0(String str, String str2) {
        if (str2.length() > 4000) {
            String substring = str2.substring(0, 4000);
            i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.v(str, substring);
            String substring2 = str2.substring(4000);
            i.f(substring2, "this as java.lang.String).substring(startIndex)");
            T0(str, substring2);
            return;
        }
        Log.v(str, str2);
    }

    public static void U(String str, Exception exc, Object... objArr) {
        AssertionError assertionError = new AssertionError("INTERNAL ASSERTION FAILED: " + String.format(str, objArr));
        assertionError.initCause(exc);
        throw assertionError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x01ef, code lost:
        return 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int U0(String str, int i6, int i10) {
        float[] fArr;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        if (i6 >= str.length()) {
            return i10;
        }
        if (i10 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i10] = 0.0f;
        }
        int i12 = 0;
        while (true) {
            int i13 = i6 + i12;
            if (i13 == str.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int W = W(fArr, iArr, bArr);
                int i14 = 0;
                for (int i15 = 0; i15 < 6; i15++) {
                    i14 += bArr[i15];
                }
                if (iArr[0] == W) {
                    return 0;
                }
                if (i14 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i14 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i14 == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (i14 != 1 || bArr[3] <= 0) {
                    return 1;
                }
                return 3;
            }
            char charAt = str.charAt(i13);
            i12++;
            if (charAt >= '0' && charAt <= '9') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (I0(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (charAt != ' ' && ((charAt < '0' || charAt > '9') && (charAt < 'A' || charAt > 'Z'))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (I0(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (charAt != ' ' && ((charAt < '0' || charAt > '9') && (charAt < 'a' || charAt > 'z'))) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (I0(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (L0(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (I0(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt >= ' ' && charAt <= '^') {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                i11 = 4;
                fArr[4] = fArr[4] + 0.75f;
            } else {
                i11 = 4;
                if (I0(charAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i12 >= i11) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                W(fArr, iArr2, bArr2);
                int i16 = 0;
                for (int i17 = 0; i17 < 6; i17++) {
                    i16 += bArr2[i17];
                }
                int i18 = iArr2[0];
                int i19 = iArr2[5];
                if (i18 < i19 && i18 < iArr2[1] && i18 < iArr2[2] && i18 < iArr2[3] && i18 < iArr2[4]) {
                    return 0;
                }
                if (i19 < i18) {
                    break;
                }
                byte b10 = bArr2[1];
                byte b11 = bArr2[2];
                byte b12 = bArr2[3];
                byte b13 = bArr2[4];
                if (b10 + b11 + b12 + b13 == 0) {
                    break;
                } else if (i16 == 1 && b13 > 0) {
                    return 4;
                } else {
                    if (i16 == 1 && b11 > 0) {
                        return 2;
                    }
                    if (i16 == 1 && b12 > 0) {
                        return 3;
                    }
                    int i20 = iArr2[1];
                    int i21 = i20 + 1;
                    if (i21 < i18 && i21 < i19 && i21 < iArr2[4] && i21 < iArr2[2]) {
                        int i22 = iArr2[3];
                        if (i20 < i22) {
                            return 1;
                        }
                        if (i20 == i22) {
                            for (int i23 = i6 + i12 + 1; i23 < str.length(); i23++) {
                                char charAt2 = str.charAt(i23);
                                if (charAt2 != '\r' && charAt2 != '*' && charAt2 != '>') {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                if (z14) {
                                    return 3;
                                }
                                if (!L0(charAt2)) {
                                    break;
                                }
                            }
                            return 1;
                        }
                    }
                }
            }
        }
    }

    public static void V(String str, Object... objArr) {
        throw new AssertionError("INTERNAL ASSERTION FAILED: " + String.format(str, objArr));
    }

    public static final i0 V0(b0 b0Var) {
        i.g(b0Var, "<this>");
        m1 R0 = b0Var.R0();
        if (R0 instanceof v) {
            return ((v) R0).f37298v;
        }
        if (R0 instanceof i0) {
            return (i0) R0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int W(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i6 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (int i10 = 0; i10 < 6; i10++) {
            int ceil = (int) Math.ceil(fArr[i10]);
            iArr[i10] = ceil;
            if (i6 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i6 = ceil;
            }
            if (i6 == ceil) {
                bArr[i10] = (byte) (bArr[i10] + 1);
            }
        }
        return i6;
    }

    public static gt.e W0(a aVar, fu.c cVar, dt.j builtIns) {
        aVar.getClass();
        i.g(builtIns, "builtIns");
        String str = ft.c.f15851a;
        fu.b f = ft.c.f(cVar);
        if (f != null) {
            return builtIns.j(f.b());
        }
        return null;
    }

    public static final s1.i X(Activity activity) {
        View findViewById;
        i.g(activity, "<this>");
        int i6 = f0.a.f14598c;
        if (Build.VERSION.SDK_INT >= 28) {
            findViewById = (View) a.e.a(activity, R.id.parentFragmentContainer);
        } else {
            findViewById = activity.findViewById(R.id.parentFragmentContainer);
            if (findViewById == null) {
                throw new IllegalArgumentException("ID does not reference a View inside this Activity");
            }
        }
        i.f(findViewById, "requireViewById<View>(activity, viewId)");
        s1.i iVar = (s1.i) fv.t.D0(fv.t.H0(fv.k.x0(s1.e0.f31113u, findViewById), f0.f31123u));
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on 2131365245");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0168, code lost:
        if (r8 != false) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a7  */
    /* JADX WARN: Type inference failed for: r5v31, types: [yt.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X0(b0 kotlinType, yt.v vVar, q writeGenericType) {
        m.c cVar;
        m.b x10;
        b0 b0Var;
        yt.v vVar2;
        Object X0;
        int ordinal;
        boolean z10;
        boolean z11;
        kc.f fVar = kc.f.f23230t0;
        t0.l0 l0Var = t0.l0.f32339x;
        i.g(kotlinType, "kotlinType");
        i.g(writeGenericType, "writeGenericType");
        if (M0(kotlinType)) {
            h0 h0Var = dt.o.f13421a;
            M0(kotlinType);
            dt.j F2 = hc.d.F(kotlinType);
            h annotations = kotlinType.getAnnotations();
            b0 o02 = o0(kotlinType);
            List e0 = e0(kotlinType);
            List<d1> t02 = t0(kotlinType);
            ArrayList arrayList = new ArrayList(is.i.H1(t02, 10));
            for (d1 d1Var : t02) {
                arrayList.add(d1Var.a());
            }
            wu.v0.f37300v.getClass();
            wu.v0 v0Var = wu.v0.f37301w;
            x0 l2 = dt.o.f13421a.l();
            H0(kotlinType);
            b0 a10 = ((d1) is.u.o2(kotlinType.M0())).a();
            i.f(a10, "arguments.last().type");
            ArrayList v22 = is.u.v2(c0.f(v0Var, l2, O0(hc.d.g(a10)), false, null), arrayList);
            i0 p10 = hc.d.F(kotlinType).p();
            i.f(p10, "suspendFunType.builtIns.nullableAnyType");
            return X0(N(F2, annotations, o02, e0, v22, p10, false).S0(kotlinType.P0()), vVar, writeGenericType);
        }
        zu.l l02 = a.C0645a.l0(f6.b.M, kotlinType);
        if (a.C0645a.H(l02)) {
            dt.k u10 = a.C0645a.u(l02);
            if (u10 != null) {
                m.c possiblyPrimitiveType = fVar.y(u10);
                if (!a.C0645a.R(kotlinType)) {
                    fu.c ENHANCED_NULLABILITY_ANNOTATION = pt.d0.f28884p;
                    i.f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (!a.C0645a.D(kotlinType, ENHANCED_NULLABILITY_ANNOTATION)) {
                        z11 = false;
                        i.g(possiblyPrimitiveType, "possiblyPrimitiveType");
                        cVar = possiblyPrimitiveType;
                        if (z11) {
                            nu.c cVar2 = possiblyPrimitiveType.f39052i;
                            cVar = possiblyPrimitiveType;
                            if (cVar2 != null) {
                                String e10 = nu.b.c(cVar2.j()).e();
                                i.f(e10, "byFqNameWithoutInnerClas…apperFqName).internalName");
                                cVar = new m.b(e10);
                            }
                        }
                    }
                }
                z11 = true;
                i.g(possiblyPrimitiveType, "possiblyPrimitiveType");
                cVar = possiblyPrimitiveType;
                if (z11) {
                }
            } else {
                dt.k t3 = a.C0645a.t(l02);
                if (t3 != null) {
                    StringBuilder sb2 = new StringBuilder("[");
                    nu.c cVar3 = (nu.c) nu.c.I.get(t3);
                    if (cVar3 != null) {
                        sb2.append(cVar3.h());
                        cVar = kc.f.w(sb2.toString());
                    } else {
                        nu.c.d(4);
                        throw null;
                    }
                } else if (a.C0645a.X(l02)) {
                    d q10 = a.C0645a.q(l02);
                    String str = ft.c.f15851a;
                    fu.b g5 = ft.c.g(q10);
                    if (g5 != null) {
                        if (!vVar.f39065g) {
                            List<c.a> list = ft.c.f15863n;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                for (c.a aVar : list) {
                                    if (i.b(aVar.f15864a, g5)) {
                                        z10 = true;
                                        break;
                                    }
                                }
                            }
                            z10 = false;
                        }
                        String e11 = nu.b.b(g5).e();
                        i.f(e11, "byClassId(classId).internalName");
                        cVar = fVar.x(e11);
                    }
                }
            }
            if (cVar == null) {
                m.b bVar = cVar;
                if (vVar.f39060a) {
                    boolean z12 = cVar instanceof m.c;
                    bVar = cVar;
                    if (z12) {
                        nu.c cVar4 = cVar.f39052i;
                        bVar = cVar;
                        if (cVar4 != null) {
                            String e12 = nu.b.c(cVar4.j()).e();
                            i.f(e12, "byFqNameWithoutInnerClas…apperFqName).internalName");
                            bVar = new m.b(e12);
                        }
                    }
                }
                writeGenericType.invoke(kotlinType, bVar, vVar);
                return bVar;
            }
            x0 O0 = kotlinType.O0();
            if (O0 instanceof z) {
                z zVar = (z) O0;
                b0 b0Var2 = zVar.f37320a;
                if (b0Var2 != null) {
                    return X0(hc.d.g0(b0Var2), vVar, writeGenericType);
                }
                l0Var.f(zVar.f37321b);
                throw null;
            }
            gt.g a11 = O0.a();
            if (a11 != null) {
                if (yu.i.f(a11)) {
                    gt.e eVar = (gt.e) a11;
                    return fVar.x("error/NonExistentClass");
                }
                boolean z13 = a11 instanceof gt.e;
                boolean z14 = vVar.f39062c;
                if (z13 && dt.j.z(kotlinType)) {
                    if (kotlinType.M0().size() == 1) {
                        d1 d1Var2 = kotlinType.M0().get(0);
                        b0 a12 = d1Var2.a();
                        i.f(a12, "memberProjection.type");
                        if (d1Var2.b() == n1.IN_VARIANCE) {
                            X0 = fVar.x("java/lang/Object");
                        } else {
                            n1 b10 = d1Var2.b();
                            i.f(b10, "memberProjection.projectionKind");
                            if (z14 || ((ordinal = b10.ordinal()) == 0 ? (vVar2 = vVar.f39067i) == null : !(ordinal == 1 ? (vVar2 = vVar.f39066h) != null : (vVar2 = vVar.f) != null))) {
                                vVar2 = vVar;
                            }
                            X0 = X0(a12, vVar2, writeGenericType);
                        }
                        return kc.f.w("[" + fVar.a0(X0));
                    }
                    throw new UnsupportedOperationException("arrays must have one type argument");
                } else if (z13) {
                    if (iu.i.b(a11) && !vVar.f39061b && (b0Var = (b0) kotlin.jvm.internal.h.o(kotlinType, new HashSet())) != null) {
                        return X0(b0Var, new yt.v(vVar.f39060a, true, vVar.f39062c, vVar.f39063d, vVar.f39064e, vVar.f, vVar.f39065g, vVar.f39066h, vVar.f39067i, false, 512), writeGenericType);
                    }
                    if (z14 && dt.j.c((gt.e) a11, n.a.P)) {
                        x10 = fVar.E();
                    } else {
                        gt.e eVar2 = (gt.e) a11;
                        i.f(eVar2.b(), "descriptor.original");
                        if (eVar2.j() == 4) {
                            j c10 = eVar2.c();
                            i.e(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            eVar2 = (gt.e) c10;
                        }
                        gt.e b11 = eVar2.b();
                        i.f(b11, "enumClassIfEnumEntry.original");
                        x10 = fVar.x(C(b11, l0Var));
                    }
                    writeGenericType.invoke(kotlinType, x10, vVar);
                    return x10;
                } else if (a11 instanceof gt.v0) {
                    b0 M2 = hc.d.M((gt.v0) a11);
                    if (kotlinType.P0()) {
                        M2 = hc.d.Y(M2);
                    }
                    return X0(M2, vVar, dv.c.f13507b);
                } else if ((a11 instanceof u0) && vVar.f39068j) {
                    return X0(((u0) a11).W(), vVar, writeGenericType);
                } else {
                    throw new UnsupportedOperationException("Unknown type " + kotlinType);
                }
            }
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        cVar = null;
        if (cVar == null) {
        }
    }

    public static final HashSet Y(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<fu.e> e10 = ((pu.i) it.next()).e();
            if (e10 == null) {
                return null;
            }
            is.q.R1(e10, hashSet);
        }
        return hashSet;
    }

    public static final ArrayList Y0(Object... elements) {
        i.g(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new is.f(elements, true));
    }

    public static final Spanned Z(String str) {
        i.g(str, "<this>");
        Spanned a10 = r0.b.a(str, 63);
        i.f(a10, "fromHtml(this, HtmlCompat.FROM_HTML_MODE_COMPACT)");
        return a10;
    }

    public static final void Z0(Bundle pushPayload) {
        boolean z10;
        i.g(pushPayload, "pushPayload");
        ng.a.f26311a.getClass();
        String a10 = ng.a.a(pushPayload);
        if (a10 == null) {
            return;
        }
        if (qg.g0.b(a10) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            bh.a.f4292a.getClass();
            ei.b bVar = (ei.b) bh.a.f4295d.get(a10);
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public static final v2.l a0(s sVar) {
        i.g(sVar, "<this>");
        return new v2.l(sVar.f34734a, sVar.f34751t);
    }

    public static final List a1(List list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return O0(list.get(0));
            }
            return list;
        }
        return w.f20676u;
    }

    public static final int b0(bt.e eVar) {
        i.g(eVar, "<this>");
        return eVar.a().size();
    }

    public static final au.p b1(au.p pVar, cu.e typeTable) {
        boolean z10;
        i.g(pVar, "<this>");
        i.g(typeTable, "typeTable");
        int i6 = pVar.f3807w;
        boolean z11 = true;
        if ((i6 & 256) == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return pVar.G;
        }
        if ((i6 & 512) != 512) {
            z11 = false;
        }
        if (z11) {
            return typeTable.a(pVar.H);
        }
        return null;
    }

    public static final int c0(Cursor c10, String str) {
        boolean z10;
        i.g(c10, "c");
        int columnIndex = c10.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c10.getColumnIndex("`" + str + '`');
        if (columnIndex2 < 0) {
            if (Build.VERSION.SDK_INT <= 25) {
                if (str.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    String[] columnNames = c10.getColumnNames();
                    i.f(columnNames, "columnNames");
                    String concat = ".".concat(str);
                    String str2 = "." + str + '`';
                    int length = columnNames.length;
                    int i6 = 0;
                    int i10 = 0;
                    while (i6 < length) {
                        String str3 = columnNames[i6];
                        int i11 = i10 + 1;
                        if (str3.length() >= str.length() + 2 && (gv.n.z0(str3, concat) || (str3.charAt(0) == '`' && gv.n.z0(str3, str2)))) {
                            return i10;
                        }
                        i6++;
                        i10 = i11;
                    }
                }
            }
            return -1;
        }
        return columnIndex2;
    }

    public static final String c1(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        i.f(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    public static final int d0(Cursor c10, String str) {
        String str2;
        i.g(c10, "c");
        int c0 = c0(c10, str);
        if (c0 >= 0) {
            return c0;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            i.f(columnNames, "c.columnNames");
            str2 = is.k.Z1(columnNames, null, null, null, null, 63);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static final au.p d1(au.h hVar, cu.e typeTable) {
        boolean z10;
        i.g(hVar, "<this>");
        i.g(typeTable, "typeTable");
        int i6 = hVar.f3740w;
        boolean z11 = true;
        if ((i6 & 32) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return hVar.D;
        }
        if ((i6 & 64) != 64) {
            z11 = false;
        }
        if (z11) {
            return typeTable.a(hVar.E);
        }
        return null;
    }

    public static /* synthetic */ void e(int i6) {
        String str;
        int i10;
        if (i6 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 4) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i6 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i6 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i6 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static final List e0(b0 b0Var) {
        i.g(b0Var, "<this>");
        H0(b0Var);
        int F2 = F(b0Var);
        if (F2 == 0) {
            return w.f20676u;
        }
        List<d1> subList = b0Var.M0().subList(0, F2);
        ArrayList arrayList = new ArrayList(is.i.H1(subList, 10));
        for (d1 d1Var : subList) {
            b0 a10 = d1Var.a();
            i.f(a10, "it.type");
            arrayList.add(a10);
        }
        return arrayList;
    }

    public static final Object e1(Object obj) {
        if (obj instanceof kotlinx.coroutines.u) {
            return sp.b.j(((kotlinx.coroutines.u) obj).f23703a);
        }
        return obj;
    }

    public static final fu.c f(d dVar, String str) {
        fu.c h10 = dVar.b(fu.e.j(str)).h();
        i.f(h10, "child(Name.identifier(name)).toSafe()");
        return h10;
    }

    public static final pj.a f0(ih.p sdkInstance) {
        i.g(sdkInstance, "sdkInstance");
        sdkInstance.f20103b.f12858d.f28417b.getClass();
        return new pj.a("general", false, false, false, false, true, -1L, false, "", false);
    }

    public static void f1(File file) {
        File[] listFiles;
        try {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    f1(file2);
                }
            }
            if (file.getName().contains("MixpanelAPI.Images.") || file.getName().contains("MP_IMG_")) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    public static final void g(Object obj, AbstractCollection abstractCollection) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final SpannableStringBuilder g0(int i6, Spanned spanned) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        BulletSpan[] bulletSpans = (BulletSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), BulletSpan.class);
        i.f(bulletSpans, "bulletSpans");
        for (BulletSpan bulletSpan : bulletSpans) {
            int spanStart = spannableStringBuilder.getSpanStart(bulletSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(bulletSpan);
            spannableStringBuilder.removeSpan(bulletSpan);
            spannableStringBuilder.setSpan(new BulletSpan(i6), spanStart, spanEnd, 17);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final wu.v0 g1(wu.v0 v0Var, h hVar) {
        wu.v0 v0Var2;
        i.g(v0Var, "<this>");
        if (wu.j.a(v0Var) == hVar) {
            return v0Var;
        }
        wu.i b10 = wu.j.b(v0Var);
        boolean z10 = true;
        if (b10 != null) {
            if (!v0Var.isEmpty()) {
                Iterable iterable = v0Var.f12057u;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!i.b((t0) obj, b10)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != v0Var.f12057u.g()) {
                    wu.v0.f37300v.getClass();
                    v0Var2 = v0.a.c(arrayList);
                    if (v0Var2 != null) {
                        v0Var = v0Var2;
                    }
                }
            }
            v0Var2 = v0Var;
            if (v0Var2 != null) {
            }
        }
        if (!hVar.iterator().hasNext() && hVar.isEmpty()) {
            return v0Var;
        }
        wu.i iVar = new wu.i(hVar);
        if (v0Var.f12057u.get(wu.v0.f37300v.b(iVar.b())) == null) {
            z10 = false;
        }
        if (!z10) {
            if (v0Var.isEmpty()) {
                return new wu.v0(O0(iVar));
            }
            return v0.a.c(is.u.v2(iVar, is.u.I2(v0Var)));
        }
        return v0Var;
    }

    public static final void h(Throwable th2, Throwable exception) {
        i.g(th2, "<this>");
        i.g(exception, "exception");
        if (th2 != exception) {
            os.b.f27779a.a(th2, exception);
        }
    }

    public static final b0 h0(b0 b0Var) {
        i.g(b0Var, "<this>");
        if (b0Var instanceof l1) {
            return ((l1) b0Var).I();
        }
        return null;
    }

    public static final void h1(int i6, int i10, Object[] objArr) {
        i.g(objArr, "<this>");
        while (i6 < i10) {
            objArr[i6] = null;
            i6++;
        }
    }

    public static String i(String str, Throwable th2) {
        boolean z10;
        String replace;
        if (th2 == null) {
            replace = null;
        } else {
            Throwable th3 = th2;
            while (true) {
                if (th3 != null) {
                    if (th3 instanceof UnknownHostException) {
                        z10 = true;
                        break;
                    }
                    th3 = th3.getCause();
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                replace = "UnknownHostException (no network)";
            } else {
                replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            String valueOf = String.valueOf(str);
            String replace2 = replace.replace("\n", "\n  ");
            StringBuilder sb2 = new StringBuilder(ri.e.c(replace2, valueOf.length() + 4));
            sb2.append(valueOf);
            sb2.append("\n  ");
            sb2.append(replace2);
            sb2.append('\n');
            return sb2.toString();
        }
        return str;
    }

    public static final et.c i0(gt.g gVar) {
        if (!(gVar instanceof gt.e) || !dt.j.L(gVar)) {
            return null;
        }
        d h10 = mu.a.h(gVar);
        if (!h10.e() || h10.d()) {
            return null;
        }
        c.a aVar = et.c.f14548w;
        String f = h10.g().f();
        i.f(f, "shortName().asString()");
        fu.c e10 = h10.h().e();
        i.f(e10, "toSafe().parent()");
        aVar.getClass();
        c.a.C0224a a10 = c.a.a(f, e10);
        if (a10 == null) {
            return null;
        }
        return a10.f14554a;
    }

    public static final gt.e i1(a0 a0Var, fu.c fqName) {
        gt.e eVar;
        gt.g gVar;
        pu.i A0;
        ot.c cVar = ot.c.FROM_BUILTINS;
        i.g(a0Var, "<this>");
        i.g(fqName, "fqName");
        if (fqName.d()) {
            return null;
        }
        fu.c e10 = fqName.e();
        i.f(e10, "fqName.parent()");
        pu.i p10 = a0Var.H(e10).p();
        fu.e f = fqName.f();
        i.f(f, "fqName.shortName()");
        gt.g g5 = p10.g(f, cVar);
        if (g5 instanceof gt.e) {
            eVar = (gt.e) g5;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        fu.c e11 = fqName.e();
        i.f(e11, "fqName.parent()");
        gt.e i12 = i1(a0Var, e11);
        if (i12 != null && (A0 = i12.A0()) != null) {
            fu.e f2 = fqName.f();
            i.f(f2, "fqName.shortName()");
            gVar = A0.g(f2, cVar);
        } else {
            gVar = null;
        }
        if (!(gVar instanceof gt.e)) {
            return null;
        }
        return (gt.e) gVar;
    }

    public static int j(jg.b bVar, boolean z10) {
        int i6;
        int i10;
        byte b10;
        if (z10) {
            i6 = bVar.f22015c;
        } else {
            i6 = bVar.f22014b;
        }
        if (z10) {
            i10 = bVar.f22014b;
        } else {
            i10 = bVar.f22015c;
        }
        byte[][] bArr = (byte[][]) bVar.f22016d;
        int i11 = 0;
        for (int i12 = 0; i12 < i6; i12++) {
            byte b11 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                if (z10) {
                    b10 = bArr[i12][i14];
                } else {
                    b10 = bArr[i14][i12];
                }
                if (b10 == b11) {
                    i13++;
                } else {
                    if (i13 >= 5) {
                        i11 += (i13 - 5) + 3;
                    }
                    b11 = b10;
                    i13 = 1;
                }
            }
            if (i13 >= 5) {
                i11 = (i13 - 5) + 3 + i11;
            }
        }
        return i11;
    }

    public static final Field j0(ys.m mVar) {
        i.g(mVar, "<this>");
        at.g0<?> c10 = at.t0.c(mVar);
        if (c10 != null) {
            return c10.C.invoke();
        }
        return null;
    }

    public static final au.p j1(au.h hVar, cu.e typeTable) {
        boolean z10;
        i.g(hVar, "<this>");
        i.g(typeTable, "typeTable");
        int i6 = hVar.f3740w;
        boolean z11 = true;
        if ((i6 & 8) == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            au.p returnType = hVar.A;
            i.f(returnType, "returnType");
            return returnType;
        }
        if ((i6 & 16) != 16) {
            z11 = false;
        }
        if (z11) {
            return typeTable.a(hVar.B);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final ArrayList k(Object... elements) {
        i.g(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new is.f(elements, true));
    }

    public static final Method k0(ys.g gVar) {
        Object obj;
        bt.e<?> o10;
        i.g(gVar, "<this>");
        at.e<?> a10 = at.t0.a(gVar);
        if (a10 != null && (o10 = a10.o()) != null) {
            obj = o10.b();
        } else {
            obj = null;
        }
        if (!(obj instanceof Method)) {
            return null;
        }
        return (Method) obj;
    }

    public static final au.p k1(au.m mVar, cu.e typeTable) {
        boolean z10;
        i.g(mVar, "<this>");
        i.g(typeTable, "typeTable");
        int i6 = mVar.f3768w;
        boolean z11 = true;
        if ((i6 & 8) == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            au.p returnType = mVar.A;
            i.f(returnType, "returnType");
            return returnType;
        }
        if ((i6 & 16) != 16) {
            z11 = false;
        }
        if (z11) {
            return typeTable.a(mVar.B);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final Object[] l(int i6) {
        boolean z10;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new Object[i6];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final int l0(List list) {
        i.g(list, "<this>");
        return list.size() - 1;
    }

    public static final Set l1(Object obj) {
        Set singleton = Collections.singleton(obj);
        i.f(singleton, "singleton(element)");
        return singleton;
    }

    public static final v m(b0 b0Var) {
        i.g(b0Var, "<this>");
        m1 R0 = b0Var.R0();
        i.e(R0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (v) R0;
    }

    public static final LifecycleCoroutineScopeImpl m0(androidx.lifecycle.p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z10;
        i.g(pVar, "<this>");
        androidx.lifecycle.j lifecycle = pVar.getLifecycle();
        i.f(lifecycle, "lifecycle");
        while (true) {
            AtomicReference<Object> atomicReference = lifecycle.f2417a;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl == null) {
                r1 a10 = sp.b.a();
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, a10.h(kotlinx.coroutines.internal.k.f23608a.L0()));
                while (true) {
                    if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReference.get() != null) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
                if (z10) {
                    kotlinx.coroutines.scheduling.c cVar2 = o0.f23640a;
                    ta.v.H(lifecycleCoroutineScopeImpl, kotlinx.coroutines.internal.k.f23608a.L0(), 0, new androidx.lifecycle.l(lifecycleCoroutineScopeImpl, null), 2);
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static final Set m1(Object... objArr) {
        if (objArr.length > 0) {
            return is.k.k2(objArr);
        }
        return y.f20678u;
    }

    public static final Object n(List list, ls.d dVar) {
        if (list.isEmpty()) {
            return w.f20676u;
        }
        Object[] array = list.toArray(new kotlinx.coroutines.h0[0]);
        if (array != null) {
            return new kotlinx.coroutines.c((kotlinx.coroutines.h0[]) array).a(dVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final tt.x n0(gt.e eVar) {
        tt.x xVar;
        gt.e eVar2;
        i.g(eVar, "<this>");
        int i6 = mu.a.f25746a;
        Iterator<b0> it = eVar.r().O0().c().iterator();
        while (true) {
            xVar = null;
            if (it.hasNext()) {
                b0 next = it.next();
                if (!dt.j.y(next)) {
                    gt.g a10 = next.O0().a();
                    boolean z10 = true;
                    if (!iu.g.n(a10, 1) && !iu.g.n(a10, 3)) {
                        z10 = false;
                    }
                    if (z10) {
                        i.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        eVar2 = (gt.e) a10;
                        break;
                    }
                }
            } else {
                eVar2 = null;
                break;
            }
        }
        if (eVar2 == null) {
            return null;
        }
        pu.i S = eVar2.S();
        if (S instanceof tt.x) {
            xVar = (tt.x) S;
        }
        if (xVar == null) {
            return n0(eVar2);
        }
        return xVar;
    }

    public static final String n1(gt.e classDescriptor, String jvmDescriptor) {
        String internalName;
        i.g(classDescriptor, "classDescriptor");
        i.g(jvmDescriptor, "jvmDescriptor");
        String str = ft.c.f15851a;
        d i6 = mu.a.g(classDescriptor).i();
        i.f(i6, "fqNameSafe.toUnsafe()");
        fu.b g5 = ft.c.g(i6);
        if (g5 != null) {
            internalName = nu.b.b(g5).e();
            i.f(internalName, "byClassId(it).internalName");
        } else {
            internalName = C(classDescriptor, t0.l0.f32339x);
        }
        i.g(internalName, "internalName");
        return internalName + '.' + jvmDescriptor;
    }

    public static final js.a o(js.a aVar) {
        if (aVar.f22600y == null) {
            aVar.r();
            aVar.f22599x = true;
            return aVar;
        }
        throw new IllegalStateException();
    }

    public static final b0 o0(b0 b0Var) {
        boolean z10;
        i.g(b0Var, "<this>");
        H0(b0Var);
        if (b0Var.getAnnotations().l(n.a.f13411p) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        return b0Var.M0().get(F(b0Var)).a();
    }

    public static final String o1(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        i.f(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    public static String p0(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }

    public static final int p1(u.a state) {
        i.g(state, "state");
        int ordinal = state.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 1;
            }
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal == 3) {
                return 3;
            }
            if (ordinal == 4) {
                return 4;
            }
            if (ordinal == 5) {
                return 5;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }

    public static final js.g q(js.g gVar) {
        js.b<E, ?> bVar = gVar.f22622u;
        bVar.b();
        bVar.F = true;
        return gVar;
    }

    public static final String q0(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        i.f(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    public static j1 q1(List list, g1 g1Var, j jVar, List list2) {
        if (g1Var != null) {
            if (jVar != null) {
                if (list2 != null) {
                    j1 r12 = r1(list, g1Var, jVar, list2, null);
                    if (r12 != null) {
                        return r12;
                    }
                    throw new AssertionError("Substitution failed");
                }
                e(3);
                throw null;
            }
            e(2);
            throw null;
        }
        e(1);
        throw null;
    }

    public static void r(Object obj, StringBuilder sb2) {
        int lastIndexOf;
        if (obj == null) {
            sb2.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static final gt.g r0(j jVar) {
        i.g(jVar, "<this>");
        j c10 = jVar.c();
        if (c10 == null || (jVar instanceof d0)) {
            return null;
        }
        if (!(c10.c() instanceof d0)) {
            return r0(c10);
        }
        if (!(c10 instanceof gt.g)) {
            return null;
        }
        return (gt.g) c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j1 r1(List list, g1 g1Var, j jVar, List list2, boolean[] zArr) {
        j1 j1Var;
        b0 k10;
        if (g1Var != null) {
            if (jVar != null) {
                if (list2 != null) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    Iterator it = list.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        gt.v0 v0Var = (gt.v0) it.next();
                        kt.t0 P0 = kt.t0.P0(jVar, v0Var.getAnnotations(), v0Var.D(), v0Var.O(), v0Var.getName(), i6, v0Var.h0());
                        hashMap.put(v0Var.l(), new f1(P0.r()));
                        hashMap2.put(v0Var, P0);
                        list2.add(P0);
                        i6++;
                    }
                    z0.a aVar = wu.z0.f37326b;
                    y0 y0Var = new y0(hashMap, false);
                    j1 f = j1.f(g1Var, y0Var);
                    j1 f2 = j1.f(new h1(g1Var), y0Var);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        gt.v0 v0Var2 = (gt.v0) it2.next();
                        kt.t0 t0Var = (kt.t0) hashMap2.get(v0Var2);
                        for (b0 b0Var : v0Var2.getUpperBounds()) {
                            gt.g a10 = b0Var.O0().a();
                            if (a10 instanceof gt.v0) {
                                gt.v0 typeParameter = (gt.v0) a10;
                                i.g(typeParameter, "typeParameter");
                                if (hc.d.R(typeParameter, null, null)) {
                                    j1Var = f;
                                    k10 = j1Var.k(b0Var, n1.OUT_VARIANCE);
                                    if (k10 != null) {
                                        return null;
                                    }
                                    if (k10 != b0Var && zArr != null) {
                                        zArr[0] = true;
                                    }
                                    t0Var.O0();
                                    if (!ta.v.E(k10)) {
                                        t0Var.F.add(k10);
                                    }
                                }
                            }
                            j1Var = f2;
                            k10 = j1Var.k(b0Var, n1.OUT_VARIANCE);
                            if (k10 != null) {
                            }
                        }
                        t0Var.O0();
                        t0Var.G = true;
                    }
                    return f;
                }
                e(8);
                throw null;
            }
            e(7);
            throw null;
        }
        e(6);
        throw null;
    }

    public static final Bundle s(hs.f... fVarArr) {
        Bundle bundle = new Bundle(fVarArr.length);
        for (hs.f fVar : fVarArr) {
            String str = (String) fVar.f19464u;
            B b10 = fVar.f19465v;
            if (b10 == 0) {
                bundle.putString(str, null);
            } else if (b10 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Byte) {
                bundle.putByte(str, ((Number) b10).byteValue());
            } else if (b10 instanceof Character) {
                bundle.putChar(str, ((Character) b10).charValue());
            } else if (b10 instanceof Double) {
                bundle.putDouble(str, ((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                bundle.putFloat(str, ((Number) b10).floatValue());
            } else if (b10 instanceof Integer) {
                bundle.putInt(str, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                bundle.putLong(str, ((Number) b10).longValue());
            } else if (b10 instanceof Short) {
                bundle.putShort(str, ((Number) b10).shortValue());
            } else if (b10 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b10);
            } else if (b10 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b10);
            } else if (b10 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b10);
            } else if (b10 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b10);
            } else if (b10 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b10);
            } else if (b10 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b10);
            } else if (b10 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b10);
            } else if (b10 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b10);
            } else if (b10 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b10);
            } else if (b10 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b10);
            } else if (b10 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b10);
            } else if (b10 instanceof Object[]) {
                Class<?> componentType = b10.getClass().getComponentType();
                i.d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b10);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b10);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b10);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) b10);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (b10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b10);
            } else if (b10 instanceof IBinder) {
                o0.b.a(bundle, str, (IBinder) b10);
            } else if (b10 instanceof Size) {
                o0.c.a(bundle, str, (Size) b10);
            } else if (b10 instanceof SizeF) {
                o0.c.b(bundle, str, (SizeF) b10);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b10.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static SimpleDateFormat s0(int i6, int i10) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        str = "M/d/yy";
                    } else {
                        throw new IllegalArgumentException(defpackage.c.p("Unknown DateFormat style: ", i6));
                    }
                } else {
                    str = "MMM d, yyyy";
                }
            } else {
                str = "MMMM d, yyyy";
            }
        } else {
            str = "EEEE, MMMM d, yyyy";
        }
        sb2.append(str);
        sb2.append(" ");
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str2 = "h:mm a";
                } else {
                    throw new IllegalArgumentException(defpackage.c.p("Unknown DateFormat style: ", i10));
                }
            } else {
                str2 = "h:mm:ss a";
            }
        } else {
            str2 = "h:mm:ss a z";
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }

    public static final void s1() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final LinkedHashSet t(byte[] bytes) {
        boolean z10;
        i.g(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i6 = 0; i6 < readInt; i6++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        i.f(uri, "uri");
                        linkedHashSet.add(new c.a(readBoolean, uri));
                    }
                    hs.k kVar = hs.k.f19476a;
                    z(objectInputStream, null);
                } finally {
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            hs.k kVar2 = hs.k.f19476a;
            z(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                z(byteArrayInputStream, th2);
                throw th3;
            }
        }
    }

    public static final List t0(b0 b0Var) {
        boolean z10;
        i.g(b0Var, "<this>");
        H0(b0Var);
        List<d1> M0 = b0Var.M0();
        int F2 = F(b0Var);
        int i6 = 0;
        if (H0(b0Var)) {
            if (b0Var.getAnnotations().l(n.a.f13411p) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i6 = 1;
            }
        }
        return M0.subList(i6 + F2, M0.size() - 1);
    }

    public static final void t1() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void u(boolean z10, String str, Object... objArr) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void u0(boolean z10, String str, Object... objArr) {
        if (z10) {
            return;
        }
        V(str, objArr);
        throw null;
    }

    public static ut.a u1(int i6, boolean z10, boolean z11, kt.k kVar, int i10) {
        boolean z12;
        boolean z13;
        Set set;
        if ((i10 & 1) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i10 & 2) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i10 & 4) != 0) {
            kVar = null;
        }
        d.j(i6, "<this>");
        if (kVar != null) {
            set = l1(kVar);
        } else {
            set = null;
        }
        return new ut.a(i6, z13, z12, set, 34);
    }

    public static void v(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void v0(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return;
        }
        V(str, objArr);
        throw null;
    }

    public static final wu.v0 v1(h hVar) {
        i.g(hVar, "<this>");
        if (hVar.isEmpty()) {
            wu.v0.f37300v.getClass();
            return wu.v0.f37301w;
        }
        v0.a aVar = wu.v0.f37300v;
        List O0 = O0(new wu.i(hVar));
        aVar.getClass();
        return v0.a.c(O0);
    }

    public static void w(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static final HashSet w0(Object... objArr) {
        HashSet hashSet = new HashSet(sp.b.P(objArr.length));
        is.k.h2(hashSet, objArr);
        return hashSet;
    }

    public static final String w1(Editable editable) {
        String html;
        if (Build.VERSION.SDK_INT >= 24) {
            html = b.a.c(editable, 0);
        } else {
            html = Html.toHtml(editable);
        }
        i.f(html, "toHtml(this, HtmlCompat.…AGRAPH_LINES_CONSECUTIVE)");
        return html;
    }

    public static final void x(int i6) {
        if (new xs.f(2, 36).m(i6)) {
            return;
        }
        StringBuilder u10 = defpackage.c.u("radix ", i6, " was not in valid range ");
        u10.append(new xs.f(2, 36));
        throw new IllegalArgumentException(u10.toString());
    }

    public static void x0(char c10) {
        String hexString;
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c10)) + ')');
    }

    public static final com.google.android.exoplayer2.q x1(MediaMetadataCompat mediaMetadataCompat) {
        i.g(mediaMetadataCompat, "<this>");
        q.a aVar = new q.a();
        String uri = y1(mediaMetadataCompat.d("android.media.metadata.MEDIA_URI")).toString();
        uri.getClass();
        aVar.f6689a = uri;
        aVar.f6690b = y1(mediaMetadataCompat.d("android.media.metadata.MEDIA_URI"));
        aVar.f6691c = "audio/mpeg";
        r.a aVar2 = new r.a();
        aVar2.f6759a = mediaMetadataCompat.d("android.media.metadata.TITLE");
        aVar2.f6763e = mediaMetadataCompat.d("android.media.metadata.DISPLAY_TITLE");
        aVar2.f6762d = mediaMetadataCompat.d("android.media.metadata.ARTIST");
        aVar2.f6761c = mediaMetadataCompat.d("android.media.metadata.ALBUM");
        aVar2.f6781y = mediaMetadataCompat.d("android.media.metadata.COMPOSER");
        aVar2.f6771n = Integer.valueOf((int) mediaMetadataCompat.c("android.media.metadata.TRACK_NUMBER"));
        aVar2.f6772o = Integer.valueOf((int) mediaMetadataCompat.c("android.media.metadata.NUM_TRACKS"));
        aVar2.A = Integer.valueOf((int) mediaMetadataCompat.c("android.media.metadata.DISC_NUMBER"));
        aVar2.f6780x = mediaMetadataCompat.d("android.media.metadata.WRITER");
        aVar2.f6770m = y1(mediaMetadataCompat.d("android.media.metadata.ALBUM_ART_URI"));
        Bundle bundle = new Bundle();
        if (mediaMetadataCompat.d("com.theinnerhour.b2b.JSON_ARTWORK_URI") != null) {
            bundle.putString("com.theinnerhour.b2b.JSON_ARTWORK_URI", mediaMetadataCompat.d("com.theinnerhour.b2b.JSON_ARTWORK_URI"));
        }
        bundle.putLong("android.media.metadata.DURATION", mediaMetadataCompat.c("android.media.metadata.DURATION"));
        aVar2.E = bundle;
        aVar.f6697j = new com.google.android.exoplayer2.r(aVar2);
        return aVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int y(Context context, String str) {
        String str2;
        boolean z10;
        int i6;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            str2 = f0.h.d(str);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            int i11 = 1;
            if (myUid2 == myUid && s0.b.a(packageName2, packageName)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i10 >= 29) {
                    AppOpsManager c10 = f0.i.c(context);
                    i6 = f0.i.a(c10, str2, Binder.getCallingUid(), packageName);
                    if (i6 == 0) {
                        i6 = f0.i.a(c10, str2, myUid, f0.i.b(context));
                    }
                    if (i6 == 0) {
                        return -2;
                    }
                } else if (i10 >= 23) {
                    i11 = f0.h.c((AppOpsManager) f0.h.a(context, AppOpsManager.class), str2, packageName);
                }
            } else if (i10 >= 23) {
                i11 = f0.h.c((AppOpsManager) f0.h.a(context, AppOpsManager.class), str2, packageName);
            }
            i6 = i11;
            if (i6 == 0) {
            }
        }
        return 0;
    }

    public static LinkedHashSet y0(String internalName, String... signatures) {
        i.g(internalName, "internalName");
        i.g(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public static final Uri y1(String str) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        if (uri == null) {
            Uri EMPTY = Uri.EMPTY;
            i.f(EMPTY, "EMPTY");
            return EMPTY;
        }
        return uri;
    }

    public static final void z(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                h(th2, th3);
            }
        }
    }

    public static LinkedHashSet z0(String str, String... signatures) {
        i.g(signatures, "signatures");
        return y0("java/lang/".concat(str), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static final au.p z1(au.t tVar, cu.e typeTable) {
        boolean z10;
        i.g(typeTable, "typeTable");
        int i6 = tVar.f3861w;
        boolean z11 = true;
        if ((i6 & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            au.p type = tVar.f3864z;
            i.f(type, "type");
            return type;
        }
        if ((i6 & 8) != 8) {
            z11 = false;
        }
        if (z11) {
            return typeTable.a(tVar.A);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    @Override // ta.h2
    public Object a() {
        List list = j2.f32639a;
        return Long.valueOf(l8.f8459v.a().e());
    }

    @Override // su.t
    public void b(kt.b descriptor, ArrayList arrayList) {
        i.g(descriptor, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + arrayList);
    }

    @Override // su.t
    public void c(gt.b descriptor) {
        i.g(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // vr.o3
    public wr.n d(int i6) {
        return new wr.n(new zv.e(), Math.min(1048576, Math.max(4096, i6)));
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void p(a.e eVar, Object obj) {
        p9.b bVar = k9.f0.G;
        p9.e eVar2 = (p9.e) ((p9.z) eVar).y();
        eVar2.S1(eVar2.z(), 1);
        ((ya.i) obj).b(null);
    }
}
