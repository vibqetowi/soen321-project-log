package h1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import g.v;
import is.u;
import is.y;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.i;
/* compiled from: FragmentStrictMode.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16999a = b.f17006c;

    /* compiled from: FragmentStrictMode.kt */
    /* renamed from: h1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0268a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f17006c = new b();

        /* renamed from: a  reason: collision with root package name */
        public final Set<EnumC0268a> f17007a = y.f20678u;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedHashMap f17008b = new LinkedHashMap();
    }

    public static b a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                i.f(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f16999a;
    }

    public static void b(b bVar, Violation violation) {
        Fragment fragment = violation.f2277u;
        String name = fragment.getClass().getName();
        EnumC0268a enumC0268a = EnumC0268a.PENALTY_LOG;
        Set<EnumC0268a> set = bVar.f17007a;
        if (set.contains(enumC0268a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(EnumC0268a.PENALTY_DEATH)) {
            v vVar = new v(name, 4, violation);
            if (fragment.isAdded()) {
                Handler handler = fragment.getParentFragmentManager().f2324v.f2293w;
                i.f(handler, "fragment.parentFragmentManager.host.handler");
                if (i.b(handler.getLooper(), Looper.myLooper())) {
                    vVar.run();
                    return;
                } else {
                    handler.post(vVar);
                    return;
                }
            }
            vVar.run();
        }
    }

    public static void c(Violation violation) {
        if (androidx.fragment.app.y.P(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.f2277u.getClass().getName()), violation);
        }
    }

    public static final void d(Fragment fragment, String previousFragmentId) {
        i.g(fragment, "fragment");
        i.g(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        c(fragmentReuseViolation);
        b a10 = a(fragment);
        if (a10.f17007a.contains(EnumC0268a.DETECT_FRAGMENT_REUSE) && e(a10, fragment.getClass(), FragmentReuseViolation.class)) {
            b(a10, fragmentReuseViolation);
        }
    }

    public static boolean e(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f17008b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!i.b(cls2.getSuperclass(), Violation.class) && u.Z1(set, cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
