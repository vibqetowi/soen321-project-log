package sp;

import android.content.Context;
import android.view.View;
import at.c;
import at.c0;
import at.d;
import at.g0;
import at.o;
import at.r0;
import at.s0;
import at.t0;
import bt.f;
import bt.h;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.l3;
import com.google.android.gms.internal.measurement.m4;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.o4;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import di.k;
import du.a;
import eu.d;
import gt.a1;
import gt.k0;
import gt.n0;
import gt.v0;
import gt.z0;
import gv.m;
import gv.n;
import gv.r;
import h5.p;
import h5.q;
import hs.e;
import hs.f;
import hs.g;
import hs.l;
import is.u;
import iv.i;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.r1;
import kotlinx.coroutines.y;
import kotlinx.coroutines.y0;
import ls.e;
import mi.t1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pt.j;
import ta.v;
import vs.c;
import w5.e0;
import wu.i0;
import wu.k1;
import wu.z0;
import ys.h;
import zv.w;
/* compiled from: TemplateActivityRepository.kt */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f31854a = {R.attr.keylines, R.attr.statusBarBackground};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f31855b = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f31856c = {16842755, R.attr.action, R.attr.data, R.attr.dataPattern, R.attr.targetPackage};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f31857d = {R.attr.navGraph};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f31858e = {R.attr.graph};

    public /* synthetic */ b() {
        LogHelper.INSTANCE.makeLogTag(b.class);
    }

    public static int A(String activity) {
        i.g(activity, "activity");
        switch (activity.hashCode()) {
            case -1984392349:
                if (activity.equals("Movies")) {
                    return R.drawable.ic_tracker_activity_movies;
                }
                break;
            case -1678124166:
                if (activity.equals("Cooking")) {
                    return R.drawable.ic_tracker_activity_cooking;
                }
                break;
            case -1618874832:
                if (activity.equals("Travelling")) {
                    return R.drawable.ic_tracker_activity_travelling;
                }
                break;
            case -1549900180:
                if (activity.equals("Reading")) {
                    return R.drawable.ic_tracker_activity_reading;
                }
                break;
            case -1321219637:
                if (activity.equals("Sleeping")) {
                    return R.drawable.ic_tracker_activity_sleeping;
                }
                break;
            case -1105149167:
                if (activity.equals("Working")) {
                    return R.drawable.ic_tracker_activity_working;
                }
                break;
            case -279816824:
                if (activity.equals("Shopping")) {
                    return R.drawable.ic_tracker_activity_shopping;
                }
                break;
            case 2122702:
                if (activity.equals("Date")) {
                    return R.drawable.ic_tracker_activity_date;
                }
                break;
            case 184158552:
                if (activity.equals("Meditating")) {
                    return R.drawable.ic_tracker_activity_meditating;
                }
                break;
            case 854832409:
                if (activity.equals("Cleaning")) {
                    return R.drawable.ic_tracker_activity_cleaning;
                }
                break;
            case 1052047729:
                if (activity.equals("Social Media")) {
                    return R.drawable.ic_tracker_activity_socialmedia;
                }
                break;
            case 1064558965:
                if (activity.equals("Friends")) {
                    return R.drawable.ic_tracker_activity_friends;
                }
                break;
            case 2096973700:
                if (activity.equals("Family")) {
                    return R.drawable.ic_tracker_activity_family;
                }
                break;
            case 2120967672:
                if (activity.equals("Exercise")) {
                    return R.drawable.ic_tracker_activity_exercise;
                }
                break;
        }
        return -1;
    }

    public static final File B() {
        File file = new File(p.a().getCacheDir(), "instrument");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static final Class C(ys.d dVar) {
        i.g(dVar, "<this>");
        Class<?> e10 = ((kotlin.jvm.internal.b) dVar).e();
        i.e(e10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return e10;
    }

    public static final Class D(ys.d dVar) {
        i.g(dVar, "<this>");
        Class<?> e10 = ((kotlin.jvm.internal.b) dVar).e();
        if (!e10.isPrimitive()) {
            return e10;
        }
        String name = e10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return e10;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return e10;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return e10;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return e10;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return e10;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return e10;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return e10;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return e10;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return e10;
            default:
                return e10;
        }
    }

    public static final Class E(ys.d dVar) {
        i.g(dVar, "<this>");
        Class<?> e10 = ((kotlin.jvm.internal.b) dVar).e();
        if (e10.isPrimitive()) {
            return e10;
        }
        String name = e10.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    public static final int F(int i6, int i10, int i11) {
        if (i11 > 0) {
            if (i6 < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i6 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
            return i10;
        } else if (i11 < 0) {
            if (i6 > i10) {
                int i15 = -i11;
                int i16 = i6 % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i10 + i18;
            }
            return i10;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final Method G(Class cls, gt.b descriptor) {
        i.g(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            i.f(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new e("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')', 2);
        }
    }

    public static boolean H(gt.b callableMemberDescriptor) {
        i.g(callableMemberDescriptor, "callableMemberDescriptor");
        if (!j.f28921d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (!u.Z1(j.f28920c, mu.a.c(callableMemberDescriptor)) || !callableMemberDescriptor.i().isEmpty()) {
            if (!dt.j.A(callableMemberDescriptor)) {
                return false;
            }
            Collection<? extends gt.b> overriddenDescriptors = callableMemberDescriptor.f();
            i.f(overriddenDescriptors, "overriddenDescriptors");
            if (overriddenDescriptors.isEmpty()) {
                return false;
            }
            for (gt.b it : overriddenDescriptors) {
                i.f(it, "it");
                if (H(it)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean I(c0 c0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (c0Var instanceof h) {
            Field j02 = ca.a.j0(c0Var);
            if (j02 != null) {
                z12 = j02.isAccessible();
            } else {
                z12 = true;
            }
            if (z12) {
                Method k02 = ca.a.k0(c0Var.B());
                if (k02 != null) {
                    z13 = k02.isAccessible();
                } else {
                    z13 = true;
                }
                if (z13) {
                    Method k03 = ca.a.k0(((h) c0Var).h());
                    if (k03 != null) {
                        z14 = k03.isAccessible();
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        return true;
                    }
                }
            }
        } else {
            Field j03 = ca.a.j0(c0Var);
            if (j03 != null) {
                z10 = j03.isAccessible();
            } else {
                z10 = true;
            }
            if (z10) {
                Method k04 = ca.a.k0(c0Var.B());
                if (k04 != null) {
                    z11 = k04.isAccessible();
                } else {
                    z11 = true;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean J(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        i.f(className, "element.className");
        if (!n.H0(className, "com.facebook")) {
            String className2 = stackTraceElement.getClassName();
            i.f(className2, "element.className");
            if (!n.H0(className2, "com.meta")) {
                return false;
            }
        }
        return true;
    }

    public static final boolean K() {
        boolean z10;
        Object obj;
        HashMap<String, Object> appConfig;
        HashMap<String, Object> appConfig2;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (appConfig2 = user.getAppConfig()) != null && appConfig2.containsKey(Constants.FIRESTORE_GOALS_EXPERIMENT)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                obj = appConfig.get(Constants.FIRESTORE_GOALS_EXPERIMENT);
            } else {
                obj = null;
            }
            i.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean L(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement element : stackTrace) {
                i.f(element, "element");
                if (J(element)) {
                    String className = element.getClassName();
                    i.f(className, "element.className");
                    if (!n.H0(className, "com.facebook.appevents.codeless")) {
                        String className2 = element.getClassName();
                        i.f(className2, "element.className");
                        if (!n.H0(className2, "com.facebook.appevents.suggestedevents")) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    i.f(methodName, "element.methodName");
                    if (n.H0(methodName, "onClick")) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        i.f(methodName2, "element.methodName");
                        if (n.H0(methodName2, "onItemClick")) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            i.f(methodName3, "element.methodName");
                            if (!n.H0(methodName3, "onTouch")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final String M(long j10) {
        String b10 = k.b(new Date(j10 * 1000));
        i.f(b10, "format(Date(seconds * 1000))");
        return b10;
    }

    public static final hs.d N(int i6, ss.a initializer) {
        defpackage.d.j(i6, "mode");
        i.g(initializer, "initializer");
        if (i6 != 0) {
            int i10 = i6 - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return new l(initializer);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return new hs.h(initializer);
            }
            return new hs.i(initializer);
        }
        throw null;
    }

    public static final hs.i O(ss.a initializer) {
        i.g(initializer, "initializer");
        return new hs.i(initializer);
    }

    public static final int P(int i6) {
        if (i6 >= 0) {
            if (i6 < 3) {
                return i6 + 1;
            }
            if (i6 < 1073741824) {
                return (int) ((i6 / 0.75f) + 1.0f);
            }
            return SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        return i6;
    }

    public static final Map Q(f pair) {
        i.g(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f19464u, pair.f19465v);
        i.f(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final int R(c.a aVar, xs.f fVar) {
        i.g(aVar, "<this>");
        if (!fVar.isEmpty()) {
            int i6 = fVar.f37996u;
            int i10 = fVar.f37997v;
            if (i10 < Integer.MAX_VALUE) {
                return aVar.d(i6, i10 + 1);
            }
            if (i6 > Integer.MIN_VALUE) {
                return aVar.d(i6 - 1, i10) + 1;
            }
            return aVar.b();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + fVar);
    }

    public static fu.e S(fu.e eVar, String str, String str2, int i6) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14 = false;
        if ((i6 & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i6 & 8) != 0) {
            str2 = null;
        }
        if (!eVar.f15931v) {
            String h10 = eVar.h();
            i.f(h10, "methodName.identifier");
            if (n.H0(h10, str) && h10.length() != str.length()) {
                char charAt = h10.charAt(str.length());
                if ('a' <= charAt && charAt < '{') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (str2 != null) {
                        return fu.e.j(str2.concat(r.V0(str, h10)));
                    }
                    if (z10) {
                        String V0 = r.V0(str, h10);
                        if (V0.length() == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12 && v.G(V0, 0)) {
                            if (V0.length() != 1 && v.G(V0, 1)) {
                                xs.e it = new xs.f(0, V0.length() - 1).iterator();
                                while (true) {
                                    if (it.f38001w) {
                                        obj = it.next();
                                        if (!v.G(V0, ((Number) obj).intValue())) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                Integer num = (Integer) obj;
                                if (num != null) {
                                    int intValue = num.intValue() - 1;
                                    String substring = V0.substring(0, intValue);
                                    i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    String R = v.R(substring);
                                    String substring2 = V0.substring(intValue);
                                    i.f(substring2, "this as java.lang.String).substring(startIndex)");
                                    V0 = R.concat(substring2);
                                } else {
                                    V0 = v.R(V0);
                                }
                            } else {
                                if (V0.length() == 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (!z13) {
                                    char charAt2 = V0.charAt(0);
                                    if ('A' <= charAt2 && charAt2 < '[') {
                                        z14 = true;
                                    }
                                    if (z14) {
                                        char lowerCase = Character.toLowerCase(charAt2);
                                        String substring3 = V0.substring(1);
                                        i.f(substring3, "this as java.lang.String).substring(startIndex)");
                                        V0 = lowerCase + substring3;
                                    }
                                }
                            }
                        }
                        if (fu.e.k(V0)) {
                            return fu.e.j(V0);
                        }
                    } else {
                        return eVar;
                    }
                }
            }
        }
        return null;
    }

    public static final JSONObject T(String str) {
        File B = B();
        if (B != null) {
            try {
                return new JSONObject(e0.I(new FileInputStream(new File(B, str))));
            } catch (Exception unused) {
                o(str);
                return null;
            }
        }
        return null;
    }

    public static final st.e U(q.f fVar, wt.d annotationsOwner) {
        i.g(fVar, "<this>");
        i.g(annotationsOwner, "annotationsOwner");
        return new st.e(fVar, annotationsOwner, false);
    }

    public static final long V(String str) {
        if (!n.z0(str, "Z")) {
            str = i.n("Z", str);
        }
        return k.d(str).getTime() / 1000;
    }

    public static final int W(w wVar, int i6) {
        int i10;
        i.g(wVar, "<this>");
        int i11 = i6 + 1;
        int length = wVar.f39927y.length;
        int[] iArr = wVar.f39928z;
        i.g(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = iArr[i10];
                if (i14 < i11) {
                    i13 = i10 + 1;
                } else if (i14 <= i11) {
                    break;
                } else {
                    i12 = i10 - 1;
                }
            } else {
                i10 = (-i13) - 1;
                break;
            }
        }
        if (i10 < 0) {
            return ~i10;
        }
        return i10;
    }

    public static final void X(String str, JSONArray jSONArray, q.b bVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject o10 = e0.o();
            if (o10 != null) {
                Iterator<String> keys = o10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, o10.get(next));
                }
            }
            String str2 = q.f17287j;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{p.b()}, 1));
            i.f(format, "java.lang.String.format(format, *args)");
            q.c.h(null, format, jSONObject, bVar).d();
        } catch (JSONException unused) {
        }
    }

    public static final void Y(int i6, View view) {
        i.g(view, "<this>");
        view.getLayoutParams().width = i6;
        view.requestLayout();
    }

    public static final Object Z(kotlinx.coroutines.internal.p pVar, kotlinx.coroutines.internal.p pVar2, ss.p pVar3) {
        Object uVar;
        Object W;
        try {
            kotlin.jvm.internal.c0.e(2, pVar3);
            uVar = pVar3.invoke(pVar2, pVar);
        } catch (Throwable th2) {
            uVar = new kotlinx.coroutines.u(th2, false);
        }
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        if (uVar != aVar && (W = pVar.W(uVar)) != b0.N) {
            if (!(W instanceof kotlinx.coroutines.u)) {
                return b0.s(W);
            }
            throw ((kotlinx.coroutines.u) W).f23703a;
        }
        return aVar;
    }

    public static r1 a() {
        return new r1(null);
    }

    public static final long a0(String str, long j10, long j11, long j12) {
        String str2;
        boolean z10;
        int i6 = s.f23616a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 != null) {
            Long x02 = m.x0(str2);
            if (x02 != null) {
                long longValue = x02.longValue();
                if (j11 <= longValue && longValue <= j12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final bt.e b(g0.a aVar, boolean z10) {
        c.e eVar;
        d.b bVar;
        Method method;
        bt.e dVar;
        a.b bVar2;
        bt.e c0097f;
        if (o.f3587u.b(aVar.A().A)) {
            return bt.i.f4707a;
        }
        fu.b bVar3 = r0.f3597a;
        at.d b10 = r0.b(aVar.A().t());
        if (b10 instanceof d.c) {
            d.c cVar = (d.c) b10;
            boolean z11 = true;
            Method method2 = null;
            a.c cVar2 = cVar.f3488c;
            if (z10) {
                if ((cVar2.f13468v & 4) != 4) {
                    z11 = false;
                }
                if (z11) {
                    bVar2 = cVar2.f13471y;
                    if (bVar2 != null) {
                        o oVar = aVar.A().f3507y;
                        int i6 = bVar2.f13460w;
                        cu.c cVar3 = cVar.f3489d;
                        method2 = oVar.m(cVar3.getString(i6), cVar3.getString(bVar2.f13461x));
                    }
                    if (method2 != null) {
                        if (iu.i.d(aVar.A().t()) && i.b(aVar.A().t().getVisibility(), gt.p.f16803d)) {
                            Class e0 = e0(aVar.A().t().c());
                            if (e0 != null) {
                                Method G = G(e0, aVar.A().t());
                                if (aVar.w()) {
                                    dVar = new h.a(G, t(aVar));
                                } else {
                                    dVar = new h.b(G);
                                }
                            } else {
                                throw new e("Underlying property of inline class " + aVar.A() + " should have a field", 2);
                            }
                        } else {
                            Field invoke = aVar.A().C.invoke();
                            if (invoke != null) {
                                dVar = h(aVar, z10, invoke);
                            } else {
                                throw new e("No accessors or field is found for property " + aVar.A(), 2);
                            }
                        }
                    } else {
                        if (!Modifier.isStatic(method2.getModifiers())) {
                            if (aVar.w()) {
                                c0097f = new f.g.a(method2, t(aVar));
                            } else {
                                c0097f = new f.g.d(method2);
                            }
                        } else if (aVar.A().t().getAnnotations().H(t0.f3605a)) {
                            if (aVar.w()) {
                                c0097f = new f.g.b(method2);
                            } else {
                                c0097f = new f.g.e(method2);
                            }
                        } else if (aVar.w()) {
                            c0097f = new f.g.c(method2, t(aVar));
                        } else {
                            c0097f = new f.g.C0097f(method2);
                        }
                        dVar = c0097f;
                    }
                }
                bVar2 = null;
                if (bVar2 != null) {
                }
                if (method2 != null) {
                }
            } else {
                if ((cVar2.f13468v & 8) != 8) {
                    z11 = false;
                }
                if (z11) {
                    bVar2 = cVar2.f13472z;
                    if (bVar2 != null) {
                    }
                    if (method2 != null) {
                    }
                }
                bVar2 = null;
                if (bVar2 != null) {
                }
                if (method2 != null) {
                }
            }
        } else if (b10 instanceof d.a) {
            dVar = h(aVar, z10, ((d.a) b10).f3483a);
        } else if (b10 instanceof d.b) {
            if (z10) {
                method = ((d.b) b10).f3484a;
            } else {
                method = ((d.b) b10).f3485b;
                if (method == null) {
                    throw new e("No source found for setter of Java method property: " + bVar.f3484a, 2);
                }
            }
            if (aVar.w()) {
                dVar = new f.g.a(method, t(aVar));
            } else {
                dVar = new f.g.d(method);
            }
        } else if (b10 instanceof d.C0055d) {
            if (z10) {
                eVar = ((d.C0055d) b10).f3491a;
            } else {
                eVar = ((d.C0055d) b10).f3492b;
                if (eVar == null) {
                    throw new e("No setter found for property " + aVar.A(), 2);
                }
            }
            o oVar2 = aVar.A().f3507y;
            d.b bVar4 = eVar.f3479a;
            Method m10 = oVar2.m(bVar4.f14561a, bVar4.f14562b);
            if (m10 != null) {
                Modifier.isStatic(m10.getModifiers());
                if (aVar.w()) {
                    return new f.g.a(m10, t(aVar));
                }
                return new f.g.d(m10);
            }
            throw new e("No accessor found for property " + aVar.A(), 2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return k(dVar, aVar.z(), false);
    }

    public static int b0(String str, int i6, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 1;
        }
        if ((i12 & 8) != 0) {
            i11 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        return (int) a0(str, i6, i10, i11);
    }

    public static final String c(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        i.f(parameterTypes, "parameterTypes");
        sb2.append(is.k.Z1(parameterTypes, "", "(", ")", s0.f3598u, 24));
        Class<?> returnType = method.getReturnType();
        i.f(returnType, "returnType");
        sb2.append(nt.d.b(returnType));
        return sb2.toString();
    }

    public static final fu.c c0(fu.c cVar, fu.c prefix) {
        boolean z10;
        i.g(cVar, "<this>");
        i.g(prefix, "prefix");
        if (!i.b(cVar, prefix) && !prefix.d()) {
            String b10 = cVar.b();
            String b11 = prefix.b();
            if (!n.H0(b10, b11) || b10.charAt(b11.length()) != '.') {
                z10 = false;
                if (!z10 && !prefix.d()) {
                    if (i.b(cVar, prefix)) {
                        fu.c ROOT = fu.c.f15921c;
                        i.f(ROOT, "ROOT");
                        return ROOT;
                    }
                    String substring = cVar.b().substring(prefix.b().length() + 1);
                    i.f(substring, "this as java.lang.String).substring(startIndex)");
                    return new fu.c(substring);
                }
            }
        }
        z10 = true;
        return !z10 ? cVar : cVar;
    }

    public static final void d(ls.f fVar, CancellationException cancellationException) {
        int i6 = c1.f23495m;
        c1 c1Var = (c1) fVar.e(c1.b.f23496u);
        if (c1Var != null) {
            c1Var.g(cancellationException);
        }
    }

    public static final void d0(Object obj) {
        if (!(obj instanceof g.a)) {
            return;
        }
        throw ((g.a) obj).f19466u;
    }

    public static final void e(iv.s sVar, Throwable th2) {
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th2);
            }
        }
        sVar.g(cancellationException);
    }

    public static final Class e0(gt.j jVar) {
        if ((jVar instanceof gt.e) && iu.i.b(jVar)) {
            gt.e eVar = (gt.e) jVar;
            Class<?> j10 = t0.j(eVar);
            if (j10 == null) {
                throw new e("Class object for the class " + eVar.getName() + " cannot be found (classId=" + mu.a.f((gt.g) jVar) + ')', 2);
            }
            return j10;
        }
        return null;
    }

    public static final Object f(Object obj, gt.b bVar) {
        Class f02;
        if ((bVar instanceof k0) && iu.i.d((a1) bVar)) {
            return obj;
        }
        wu.b0 x10 = x(bVar);
        if (x10 != null && (f02 = f0(x10)) != null) {
            return G(f02, bVar).invoke(obj, new Object[0]);
        }
        return obj;
    }

    public static final Class f0(wu.b0 b0Var) {
        i.g(b0Var, "<this>");
        Class e0 = e0(b0Var.O0().a());
        if (e0 == null) {
            return null;
        }
        if (!k1.g(b0Var)) {
            return e0;
        }
        i0 e10 = iu.i.e(b0Var);
        if (e10 == null || k1.g(e10) || dt.j.H(e10)) {
            return null;
        }
        return e0;
    }

    public static final int g(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final Map g0(Map map) {
        i.g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        i.f(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final bt.f h(g0.a aVar, boolean z10, Field field) {
        boolean z11;
        bt.f cVar;
        k0 t3 = aVar.A().t();
        gt.j containingDeclaration = t3.c();
        i.f(containingDeclaration, "containingDeclaration");
        if (iu.g.l(containingDeclaration)) {
            gt.j c10 = containingDeclaration.c();
            if ((!iu.g.n(c10, 2) && !iu.g.n(c10, 5)) || ((t3 instanceof uu.k) && eu.h.d(((uu.k) t3).V))) {
                z11 = true;
                if (z11 && Modifier.isStatic(field.getModifiers())) {
                    if (aVar.A().t().getAnnotations().H(t0.f3605a)) {
                        if (z10) {
                            if (aVar.w()) {
                                return new f.e.b(field);
                            }
                            return new f.e.d(field);
                        } else if (aVar.w()) {
                            cVar = new f.AbstractC0096f.b(field, i(aVar));
                        } else {
                            cVar = new f.AbstractC0096f.d(field, i(aVar));
                        }
                    } else if (z10) {
                        return new f.e.C0095e(field);
                    } else {
                        cVar = new f.AbstractC0096f.e(field, i(aVar));
                    }
                } else if (!z10) {
                    if (aVar.w()) {
                        cVar = new f.e.a(field, t(aVar));
                    } else {
                        return new f.e.c(field);
                    }
                } else if (aVar.w()) {
                    cVar = new f.AbstractC0096f.a(field, i(aVar), t(aVar));
                } else {
                    cVar = new f.AbstractC0096f.c(field, i(aVar));
                }
                return cVar;
            }
        }
        z11 = false;
        if (z11) {
        }
        if (!z10) {
        }
        return cVar;
    }

    public static final void h0(Context context, ih.p sdkInstance, s1.s sVar, Object obj) {
        i.g(sdkInstance, "sdkInstance");
        ng.c cVar = new ng.c();
        t1.a(cVar, (String) sVar.f31225w, (String) sVar.f31226x, (aj.a) sVar.f31224v);
        if (((obj instanceof Integer) && ((Number) obj).intValue() > 0) || ((obj instanceof String) && (!n.B0((CharSequence) obj)))) {
            cVar.a(obj, "widget_id");
        }
        String appId = (String) sdkInstance.f20102a.f5133c;
        i.g(appId, "appId");
        ih.p b10 = qg.g0.b(appId);
        if (b10 != null) {
            qg.w.f29578a.getClass();
            qg.w.d(b10).c(context, "MOE_IN_APP_CLICKED", cVar);
        }
    }

    public static final boolean i(g0.a aVar) {
        return !k1.g(aVar.A().t().a());
    }

    public static final void i0(Context context, s1.s sVar, ih.p sdkInstance) {
        i.g(sdkInstance, "sdkInstance");
        ng.c cVar = new ng.c();
        t1.a(cVar, (String) sVar.f31225w, (String) sVar.f31226x, (aj.a) sVar.f31224v);
        String appId = (String) sdkInstance.f20102a.f5133c;
        i.g(appId, "appId");
        ih.p b10 = qg.g0.b(appId);
        if (b10 != null) {
            qg.w.f29578a.getClass();
            qg.w.d(b10).c(context, "MOE_IN_APP_DISMISSED", cVar);
        }
    }

    public static final g.a j(Throwable exception) {
        i.g(exception, "exception");
        return new g.a(exception);
    }

    public static final void j0(iv.v vVar, Object obj) {
        long j10;
        Object q10 = vVar.q(obj);
        if (!(q10 instanceof i.b)) {
            hs.k kVar = (hs.k) q10;
            hs.k kVar2 = hs.k.f19476a;
            return;
        }
        kotlinx.coroutines.u uVar = null;
        ss.p jVar = new iv.j(vVar, obj, null);
        ls.g gVar = ls.g.f24521u;
        Thread currentThread = Thread.currentThread();
        e.a aVar = e.a.f24519u;
        kotlinx.coroutines.r0 a10 = kotlinx.coroutines.t1.a();
        ls.f a11 = y.a(gVar, a10, true);
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        if (a11 != cVar && a11.e(aVar) == null) {
            a11 = a11.h(cVar);
        }
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(a11, currentThread, a10);
        eVar.s0(1, eVar, jVar);
        kotlinx.coroutines.r0 r0Var = eVar.f23498x;
        if (r0Var != null) {
            int i6 = kotlinx.coroutines.r0.f23645z;
            r0Var.N0(false);
        }
        while (!Thread.interrupted()) {
            if (r0Var != null) {
                j10 = r0Var.O0();
            } else {
                j10 = Long.MAX_VALUE;
            }
            if (!(!(eVar.Q() instanceof y0))) {
                LockSupport.parkNanos(eVar, j10);
            } else {
                if (r0Var != null) {
                    int i10 = kotlinx.coroutines.r0.f23645z;
                    r0Var.L0(false);
                }
                Object s10 = b0.s(eVar.Q());
                if (s10 instanceof kotlinx.coroutines.u) {
                    uVar = (kotlinx.coroutines.u) s10;
                }
                if (uVar == null) {
                    Object obj2 = ((iv.i) s10).f20746a;
                    return;
                }
                throw uVar.f23703a;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        eVar.y(interruptedException);
        throw interruptedException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (r0 != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final bt.e k(bt.e eVar, gt.u descriptor, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        boolean z14 = true;
        if (!iu.i.a(descriptor)) {
            List<z0> i6 = descriptor.i();
            kotlin.jvm.internal.i.f(i6, "descriptor.valueParameters");
            if (!i6.isEmpty()) {
                for (z0 z0Var : i6) {
                    wu.b0 a10 = z0Var.a();
                    kotlin.jvm.internal.i.f(a10, "it.type");
                    if (iu.i.c(a10)) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            if (!z11) {
                wu.b0 returnType = descriptor.getReturnType();
                if (returnType != null && iu.i.c(returnType)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    if (!(eVar instanceof bt.d)) {
                        wu.b0 x10 = x(descriptor);
                        if (x10 != null && iu.i.c(x10)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    z14 = false;
                }
            }
        }
        if (z14) {
            return new bt.g(eVar, descriptor, z10);
        }
        return eVar;
    }

    public static final void k0(String str, String str2) {
        File B = B();
        if (B != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(B, str));
                byte[] bytes = str2.getBytes(gv.a.f16927b);
                kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static final wu.y0 l(gt.e eVar, kt.b to2) {
        kotlin.jvm.internal.i.g(to2, "to");
        eVar.t().size();
        to2.t().size();
        z0.a aVar = wu.z0.f37326b;
        List<v0> t3 = eVar.t();
        kotlin.jvm.internal.i.f(t3, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(is.i.H1(t3, 10));
        for (v0 v0Var : t3) {
            arrayList.add(v0Var.l());
        }
        List<v0> t10 = to2.t();
        kotlin.jvm.internal.i.f(t10, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(is.i.H1(t10, 10));
        for (v0 v0Var2 : t10) {
            i0 r = v0Var2.r();
            kotlin.jvm.internal.i.f(r, "it.defaultType");
            arrayList2.add(hc.d.g(r));
        }
        return new wu.y0(is.e0.w0(u.O2(arrayList, arrayList2)), false);
    }

    public static com.google.android.gms.internal.measurement.o l0(com.google.android.gms.internal.measurement.k kVar, com.google.android.gms.internal.measurement.r rVar, v.c cVar, ArrayList arrayList) {
        String str = rVar.f8576u;
        if (kVar.m(str)) {
            com.google.android.gms.internal.measurement.o r = kVar.r(str);
            if (r instanceof com.google.android.gms.internal.measurement.i) {
                return ((com.google.android.gms.internal.measurement.i) r).a(cVar, arrayList);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", str));
        } else if ("hasOwnProperty".equals(str)) {
            l3.h(1, "hasOwnProperty", arrayList);
            if (kVar.m(cVar.i((com.google.android.gms.internal.measurement.o) arrayList.get(0)).g())) {
                return com.google.android.gms.internal.measurement.o.f8524i;
            }
            return com.google.android.gms.internal.measurement.o.f8525j;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", str));
        }
    }

    public static final String m() {
        long currentTimeMillis = System.currentTimeMillis();
        Date date = new Date();
        date.setTime(currentTimeMillis);
        String b10 = k.b(date);
        kotlin.jvm.internal.i.f(b10, "format(currentDate)");
        return b10;
    }

    public static m4 m0(m4 m4Var) {
        if (!(m4Var instanceof o4) && !(m4Var instanceof n4)) {
            if (m4Var instanceof Serializable) {
                return new n4(m4Var);
            }
            return new o4(m4Var);
        }
        return m4Var;
    }

    public static final long n() {
        return System.currentTimeMillis() / 1000;
    }

    public static String n0(b5 b5Var) {
        StringBuilder sb2 = new StringBuilder(b5Var.m());
        for (int i6 = 0; i6 < b5Var.m(); i6++) {
            byte e10 = b5Var.e(i6);
            if (e10 != 34) {
                if (e10 != 39) {
                    if (e10 != 92) {
                        switch (e10) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (e10 >= 32 && e10 <= 126) {
                                    sb2.append((char) e10);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((e10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((e10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((e10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static final void o(String str) {
        File B = B();
        if (B != null && str != null) {
            new File(B, str).delete();
        }
    }

    public static com.google.android.gms.internal.measurement.e o0(com.google.android.gms.internal.measurement.e eVar, v.c cVar, com.google.android.gms.internal.measurement.n nVar, Boolean bool, Boolean bool2) {
        com.google.android.gms.internal.measurement.e eVar2 = new com.google.android.gms.internal.measurement.e();
        Iterator C = eVar.C();
        while (C.hasNext()) {
            int intValue = ((Integer) C.next()).intValue();
            if (eVar.L(intValue)) {
                com.google.android.gms.internal.measurement.o a10 = nVar.a(cVar, Arrays.asList(eVar.v(intValue), new com.google.android.gms.internal.measurement.h(Double.valueOf(intValue)), eVar));
                if (a10.i().equals(bool)) {
                    return eVar2;
                }
                if (bool2 == null || a10.i().equals(bool2)) {
                    eVar2.K(intValue, a10);
                }
            }
        }
        return eVar2;
    }

    public static final void p(ls.f fVar) {
        c1 c1Var = (c1) fVar.e(c1.b.f23496u);
        if (c1Var != null && !c1Var.a()) {
            throw c1Var.I();
        }
    }

    public static com.google.android.gms.internal.measurement.o p0(com.google.android.gms.internal.measurement.e eVar, v.c cVar, ArrayList arrayList, boolean z10) {
        com.google.android.gms.internal.measurement.o oVar;
        int i6;
        int i10;
        l3.i(1, "reduce", arrayList);
        l3.j(2, "reduce", arrayList);
        com.google.android.gms.internal.measurement.o i11 = cVar.i((com.google.android.gms.internal.measurement.o) arrayList.get(0));
        if (i11 instanceof com.google.android.gms.internal.measurement.i) {
            if (arrayList.size() == 2) {
                oVar = cVar.i((com.google.android.gms.internal.measurement.o) arrayList.get(1));
                if (oVar instanceof com.google.android.gms.internal.measurement.g) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (eVar.t() != 0) {
                oVar = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            com.google.android.gms.internal.measurement.i iVar = (com.google.android.gms.internal.measurement.i) i11;
            int t3 = eVar.t();
            if (z10) {
                i6 = 0;
            } else {
                i6 = t3 - 1;
            }
            int i12 = -1;
            if (z10) {
                i10 = t3 - 1;
            } else {
                i10 = 0;
            }
            if (true == z10) {
                i12 = 1;
            }
            if (oVar == null) {
                oVar = eVar.v(i6);
                i6 += i12;
            }
            while ((i10 - i6) * i12 >= 0) {
                if (eVar.L(i6)) {
                    oVar = iVar.a(cVar, Arrays.asList(oVar, eVar.v(i6), new com.google.android.gms.internal.measurement.h(Double.valueOf(i6)), eVar));
                    if (oVar instanceof com.google.android.gms.internal.measurement.g) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i6 += i12;
                } else {
                    i6 += i12;
                }
            }
            return oVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    public static final nt.e q(Annotation[] annotationArr, fu.c fqName) {
        Annotation annotation;
        kotlin.jvm.internal.i.g(annotationArr, "<this>");
        kotlin.jvm.internal.i.g(fqName, "fqName");
        int length = annotationArr.length;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                annotation = annotationArr[i6];
                if (kotlin.jvm.internal.i.b(nt.d.a(C(r(annotation))).b(), fqName)) {
                    break;
                }
                i6++;
            } else {
                annotation = null;
                break;
            }
        }
        if (annotation == null) {
            return null;
        }
        return new nt.e(annotation);
    }

    public static boolean q0(byte b10) {
        if (b10 > -65) {
            return true;
        }
        return false;
    }

    public static final ys.d r(Annotation annotation) {
        kotlin.jvm.internal.i.g(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        kotlin.jvm.internal.i.f(annotationType, "this as java.lang.annota…otation).annotationType()");
        ys.d a10 = kotlin.jvm.internal.y.a(annotationType);
        kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return a10;
    }

    public static final ArrayList s(Annotation[] annotationArr) {
        kotlin.jvm.internal.i.g(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new nt.e(annotation));
        }
        return arrayList;
    }

    public static final Object t(g0.a aVar) {
        kotlin.jvm.internal.i.g(aVar, "<this>");
        g0 A = aVar.A();
        return f(A.B, A.t());
    }

    public static HashMap u() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        defpackage.d.p(arrayList, "BB", "BM", "BS", "CA");
        defpackage.d.p(arrayList, "DM", "DO", "GD", "GU");
        defpackage.d.p(arrayList, "JM", "KN", "KY", "LC");
        defpackage.d.p(arrayList, "MP", "MS", "PR", "SX");
        defpackage.d.p(arrayList, "TC", "TT", "VC", "VG");
        ArrayList v10 = defpackage.c.v(arrayList, "VI", 1, hashMap, arrayList, 2);
        v10.add("RU");
        v10.add("KZ");
        hashMap.put(7, v10);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add("EG");
        hashMap.put(36, defpackage.b.p(34, hashMap, defpackage.b.p(33, hashMap, defpackage.b.p(32, hashMap, defpackage.b.p(31, hashMap, defpackage.b.p(30, hashMap, defpackage.b.p(27, hashMap, defpackage.b.p(20, hashMap, arrayList2, 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"));
        ArrayList arrayList3 = new ArrayList(2);
        arrayList3.add("IT");
        arrayList3.add("VA");
        hashMap.put(43, defpackage.b.p(41, hashMap, defpackage.b.p(40, hashMap, defpackage.b.p(39, hashMap, arrayList3, 1, "RO"), 1, "CH"), 1, "AT"));
        ArrayList arrayList4 = new ArrayList(4);
        arrayList4.add("GB");
        arrayList4.add("GG");
        arrayList4.add("IM");
        arrayList4.add("JE");
        hashMap.put(44, arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("DK");
        hashMap.put(46, defpackage.b.p(45, hashMap, arrayList5, 1, "SE"));
        ArrayList arrayList6 = new ArrayList(2);
        arrayList6.add("NO");
        arrayList6.add("SJ");
        hashMap.put(60, defpackage.b.p(58, hashMap, defpackage.b.p(57, hashMap, defpackage.b.p(56, hashMap, defpackage.b.p(55, hashMap, defpackage.b.p(54, hashMap, defpackage.b.p(53, hashMap, defpackage.b.p(52, hashMap, defpackage.b.p(51, hashMap, defpackage.b.p(49, hashMap, defpackage.b.p(48, hashMap, defpackage.b.p(47, hashMap, arrayList6, 1, "PL"), 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"));
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add("AU");
        arrayList7.add("CC");
        ArrayList v11 = defpackage.c.v(arrayList7, "CX", 61, hashMap, arrayList7, 1);
        ArrayList v12 = defpackage.c.v(v11, "ID", 62, hashMap, v11, 1);
        ArrayList v13 = defpackage.c.v(v12, "PH", 63, hashMap, v12, 1);
        ArrayList v14 = defpackage.c.v(v13, "NZ", 64, hashMap, v13, 1);
        ArrayList v15 = defpackage.c.v(v14, "SG", 65, hashMap, v14, 1);
        ArrayList v16 = defpackage.c.v(v15, "TH", 66, hashMap, v15, 1);
        ArrayList v17 = defpackage.c.v(v16, "JP", 81, hashMap, v16, 1);
        ArrayList v18 = defpackage.c.v(v17, "KR", 82, hashMap, v17, 1);
        ArrayList v19 = defpackage.c.v(v18, "VN", 84, hashMap, v18, 1);
        ArrayList v20 = defpackage.c.v(v19, "CN", 86, hashMap, v19, 1);
        ArrayList v21 = defpackage.c.v(v20, "TR", 90, hashMap, v20, 1);
        ArrayList v22 = defpackage.c.v(v21, "IN", 91, hashMap, v21, 1);
        ArrayList v23 = defpackage.c.v(v22, "PK", 92, hashMap, v22, 1);
        ArrayList v24 = defpackage.c.v(v23, "AF", 93, hashMap, v23, 1);
        ArrayList v25 = defpackage.c.v(v24, "LK", 94, hashMap, v24, 1);
        ArrayList v26 = defpackage.c.v(v25, "MM", 95, hashMap, v25, 1);
        ArrayList v27 = defpackage.c.v(v26, "IR", 98, hashMap, v26, 1);
        ArrayList v28 = defpackage.c.v(v27, "SS", 211, hashMap, v27, 2);
        v28.add("MA");
        v28.add("EH");
        hashMap.put(212, v28);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("DZ");
        hashMap.put(261, defpackage.b.p(260, hashMap, defpackage.b.p(258, hashMap, defpackage.b.p(257, hashMap, defpackage.b.p(256, hashMap, defpackage.b.p(255, hashMap, defpackage.b.p(254, hashMap, defpackage.b.p(253, hashMap, defpackage.b.p(252, hashMap, defpackage.b.p(251, hashMap, defpackage.b.p(250, hashMap, defpackage.b.p(249, hashMap, defpackage.b.p(248, hashMap, defpackage.b.p(247, hashMap, defpackage.b.p(246, hashMap, defpackage.b.p(245, hashMap, defpackage.b.p(244, hashMap, defpackage.b.p(243, hashMap, defpackage.b.p(242, hashMap, defpackage.b.p(241, hashMap, defpackage.b.p(240, hashMap, defpackage.b.p(239, hashMap, defpackage.b.p(238, hashMap, defpackage.b.p(237, hashMap, defpackage.b.p(236, hashMap, defpackage.b.p(235, hashMap, defpackage.b.p(234, hashMap, defpackage.b.p(233, hashMap, defpackage.b.p(232, hashMap, defpackage.b.p(231, hashMap, defpackage.b.p(230, hashMap, defpackage.b.p(229, hashMap, defpackage.b.p(228, hashMap, defpackage.b.p(227, hashMap, defpackage.b.p(226, hashMap, defpackage.b.p(225, hashMap, defpackage.b.p(224, hashMap, defpackage.b.p(223, hashMap, defpackage.b.p(222, hashMap, defpackage.b.p(221, hashMap, defpackage.b.p(220, hashMap, defpackage.b.p(218, hashMap, defpackage.b.p(216, hashMap, defpackage.b.p(213, hashMap, arrayList8, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"));
        ArrayList arrayList9 = new ArrayList(2);
        arrayList9.add("RE");
        arrayList9.add("YT");
        hashMap.put(269, defpackage.b.p(268, hashMap, defpackage.b.p(267, hashMap, defpackage.b.p(266, hashMap, defpackage.b.p(265, hashMap, defpackage.b.p(264, hashMap, defpackage.b.p(263, hashMap, defpackage.b.p(262, hashMap, arrayList9, 1, "ZW"), 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"));
        ArrayList arrayList10 = new ArrayList(2);
        arrayList10.add("SH");
        arrayList10.add("TA");
        hashMap.put(357, defpackage.b.p(356, hashMap, defpackage.b.p(355, hashMap, defpackage.b.p(354, hashMap, defpackage.b.p(353, hashMap, defpackage.b.p(352, hashMap, defpackage.b.p(351, hashMap, defpackage.b.p(350, hashMap, defpackage.b.p(299, hashMap, defpackage.b.p(298, hashMap, defpackage.b.p(297, hashMap, defpackage.b.p(291, hashMap, defpackage.b.p(290, hashMap, arrayList10, 1, "ER"), 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"));
        ArrayList arrayList11 = new ArrayList(2);
        arrayList11.add("FI");
        arrayList11.add("AX");
        hashMap.put(509, defpackage.b.p(508, hashMap, defpackage.b.p(507, hashMap, defpackage.b.p(506, hashMap, defpackage.b.p(505, hashMap, defpackage.b.p(504, hashMap, defpackage.b.p(503, hashMap, defpackage.b.p(502, hashMap, defpackage.b.p(501, hashMap, defpackage.b.p(500, hashMap, defpackage.b.p(423, hashMap, defpackage.b.p(421, hashMap, defpackage.b.p(420, hashMap, defpackage.b.p(389, hashMap, defpackage.b.p(387, hashMap, defpackage.b.p(386, hashMap, defpackage.b.p(385, hashMap, defpackage.b.p(383, hashMap, defpackage.b.p(382, hashMap, defpackage.b.p(381, hashMap, defpackage.b.p(380, hashMap, defpackage.b.p(378, hashMap, defpackage.b.p(377, hashMap, defpackage.b.p(376, hashMap, defpackage.b.p(375, hashMap, defpackage.b.p(374, hashMap, defpackage.b.p(373, hashMap, defpackage.b.p(372, hashMap, defpackage.b.p(371, hashMap, defpackage.b.p(370, hashMap, defpackage.b.p(359, hashMap, defpackage.b.p(358, hashMap, arrayList11, 1, "BG"), 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"));
        ArrayList arrayList12 = new ArrayList(3);
        arrayList12.add("GP");
        arrayList12.add("BL");
        ArrayList v29 = defpackage.c.v(arrayList12, "MF", 590, hashMap, arrayList12, 1);
        ArrayList v30 = defpackage.c.v(v29, "BO", 591, hashMap, v29, 1);
        ArrayList v31 = defpackage.c.v(v30, "GY", 592, hashMap, v30, 1);
        ArrayList v32 = defpackage.c.v(v31, "EC", 593, hashMap, v31, 1);
        ArrayList v33 = defpackage.c.v(v32, "GF", 594, hashMap, v32, 1);
        ArrayList v34 = defpackage.c.v(v33, "PY", 595, hashMap, v33, 1);
        ArrayList v35 = defpackage.c.v(v34, "MQ", 596, hashMap, v34, 1);
        ArrayList v36 = defpackage.c.v(v35, "SR", 597, hashMap, v35, 1);
        ArrayList v37 = defpackage.c.v(v36, "UY", 598, hashMap, v36, 2);
        v37.add("CW");
        v37.add("BQ");
        hashMap.put(599, v37);
        ArrayList arrayList13 = new ArrayList(1);
        arrayList13.add("TL");
        hashMap.put(998, defpackage.b.p(996, hashMap, defpackage.b.p(995, hashMap, defpackage.b.p(994, hashMap, defpackage.b.p(993, hashMap, defpackage.b.p(992, hashMap, defpackage.b.p(979, hashMap, defpackage.b.p(977, hashMap, defpackage.b.p(976, hashMap, defpackage.b.p(975, hashMap, defpackage.b.p(974, hashMap, defpackage.b.p(973, hashMap, defpackage.b.p(972, hashMap, defpackage.b.p(971, hashMap, defpackage.b.p(970, hashMap, defpackage.b.p(968, hashMap, defpackage.b.p(967, hashMap, defpackage.b.p(966, hashMap, defpackage.b.p(965, hashMap, defpackage.b.p(964, hashMap, defpackage.b.p(963, hashMap, defpackage.b.p(962, hashMap, defpackage.b.p(961, hashMap, defpackage.b.p(960, hashMap, defpackage.b.p(888, hashMap, defpackage.b.p(886, hashMap, defpackage.b.p(883, hashMap, defpackage.b.p(882, hashMap, defpackage.b.p(881, hashMap, defpackage.b.p(880, hashMap, defpackage.b.p(878, hashMap, defpackage.b.p(870, hashMap, defpackage.b.p(856, hashMap, defpackage.b.p(855, hashMap, defpackage.b.p(853, hashMap, defpackage.b.p(852, hashMap, defpackage.b.p(850, hashMap, defpackage.b.p(808, hashMap, defpackage.b.p(800, hashMap, defpackage.b.p(692, hashMap, defpackage.b.p(691, hashMap, defpackage.b.p(690, hashMap, defpackage.b.p(689, hashMap, defpackage.b.p(688, hashMap, defpackage.b.p(687, hashMap, defpackage.b.p(686, hashMap, defpackage.b.p(685, hashMap, defpackage.b.p(683, hashMap, defpackage.b.p(682, hashMap, defpackage.b.p(681, hashMap, defpackage.b.p(680, hashMap, defpackage.b.p(679, hashMap, defpackage.b.p(678, hashMap, defpackage.b.p(677, hashMap, defpackage.b.p(676, hashMap, defpackage.b.p(675, hashMap, defpackage.b.p(674, hashMap, defpackage.b.p(673, hashMap, defpackage.b.p(672, hashMap, defpackage.b.p(670, hashMap, arrayList13, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }

    public static ArrayList v(long j10) {
        ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(j10));
        int w10 = w(j10);
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        calendar.add(6, -w10);
        for (int i6 = 0; i6 < 7; i6++) {
            calendar.add(6, 1);
            long j11 = 1000;
            arrayList.add(new hs.f(LocalDateTime.ofEpochSecond(calendar.getTimeInMillis() / j11, 0, offset).format(DateTimeFormatter.ofPattern("yyyyMMdd").withLocale(Locale.ENGLISH)), Integer.valueOf((int) (calendar.getTimeInMillis() / j11))));
        }
        return arrayList;
    }

    public static int w(long j10) {
        String dayText = LocalDateTime.ofEpochSecond(j10 / 1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(j10))).format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ENGLISH));
        kotlin.jvm.internal.i.f(dayText, "dayText");
        String substring = dayText.substring(0, 3);
        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        switch (substring.hashCode()) {
            case 70909:
                if (!substring.equals("Fri")) {
                    return 0;
                }
                return 5;
            case 77548:
                if (!substring.equals("Mon")) {
                    return 0;
                }
                return 1;
            case 82886:
                if (!substring.equals("Sat")) {
                    return 0;
                }
                return 6;
            case 83500:
                if (!substring.equals("Sun")) {
                    return 0;
                }
                return 7;
            case 84065:
                if (!substring.equals("Thu")) {
                    return 0;
                }
                return 4;
            case 84452:
                if (!substring.equals("Tue")) {
                    return 0;
                }
                return 2;
            case 86838:
                if (!substring.equals("Wed")) {
                    return 0;
                }
                return 3;
            default:
                return 0;
        }
    }

    public static final wu.b0 x(gt.b bVar) {
        gt.e eVar;
        n0 k02 = bVar.k0();
        n0 f02 = bVar.f0();
        if (k02 != null) {
            return k02.a();
        }
        if (f02 != null) {
            if (bVar instanceof gt.i) {
                return f02.a();
            }
            gt.j c10 = bVar.c();
            if (c10 instanceof gt.e) {
                eVar = (gt.e) c10;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return eVar.r();
            }
        }
        return null;
    }

    public static String y(long j10) {
        String format = LocalDateTime.ofEpochSecond(j10 / 1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(j10))).format(DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.ENGLISH));
        kotlin.jvm.internal.i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
        return format;
    }

    public static final Object z(Object obj, List list) {
        if (K()) {
            return list;
        }
        return obj;
    }
}
