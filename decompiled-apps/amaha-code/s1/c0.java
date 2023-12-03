package s1;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
/* compiled from: NavType.kt */
/* loaded from: classes.dex */
public abstract class c0<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final f f31090b = new f();

    /* renamed from: c  reason: collision with root package name */
    public static final i f31091c = new i();

    /* renamed from: d  reason: collision with root package name */
    public static final e f31092d = new e();

    /* renamed from: e  reason: collision with root package name */
    public static final h f31093e = new h();
    public static final g f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final d f31094g = new d();

    /* renamed from: h  reason: collision with root package name */
    public static final c f31095h = new c();

    /* renamed from: i  reason: collision with root package name */
    public static final b f31096i = new b();

    /* renamed from: j  reason: collision with root package name */
    public static final a f31097j = new a();

    /* renamed from: k  reason: collision with root package name */
    public static final k f31098k = new k();

    /* renamed from: l  reason: collision with root package name */
    public static final j f31099l = new j();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31100a;

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class a extends c0<boolean[]> {
        public a() {
            super(true);
        }

        @Override // s1.c0
        public final boolean[] a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // s1.c0
        public final String b() {
            return "boolean[]";
        }

        @Override // s1.c0
        public final boolean[] c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, boolean[] zArr) {
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putBooleanArray(key, zArr);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class b extends c0<Boolean> {
        public b() {
            super(false);
        }

        @Override // s1.c0
        public final Boolean a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // s1.c0
        public final String b() {
            return "boolean";
        }

        @Override // s1.c0
        public final Boolean c(String value) {
            boolean z10;
            kotlin.jvm.internal.i.g(value, "value");
            if (kotlin.jvm.internal.i.b(value, "true")) {
                z10 = true;
            } else if (kotlin.jvm.internal.i.b(value, "false")) {
                z10 = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z10);
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putBoolean(key, booleanValue);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class c extends c0<float[]> {
        public c() {
            super(true);
        }

        @Override // s1.c0
        public final float[] a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // s1.c0
        public final String b() {
            return "float[]";
        }

        @Override // s1.c0
        public final float[] c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, float[] fArr) {
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putFloatArray(key, fArr);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class d extends c0<Float> {
        public d() {
            super(false);
        }

        @Override // s1.c0
        public final Float a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @Override // s1.c0
        public final String b() {
            return "float";
        }

        @Override // s1.c0
        public final Float c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, Float f) {
            float floatValue = f.floatValue();
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putFloat(key, floatValue);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class e extends c0<int[]> {
        public e() {
            super(true);
        }

        @Override // s1.c0
        public final int[] a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // s1.c0
        public final String b() {
            return "integer[]";
        }

        @Override // s1.c0
        public final int[] c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, int[] iArr) {
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putIntArray(key, iArr);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class f extends c0<Integer> {
        public f() {
            super(false);
        }

        @Override // s1.c0
        public final Integer a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // s1.c0
        public final String b() {
            return "integer";
        }

        @Override // s1.c0
        public final Integer c(String value) {
            int parseInt;
            kotlin.jvm.internal.i.g(value, "value");
            if (gv.n.H0(value, "0x")) {
                String substring = value.substring(2);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                ca.a.x(16);
                parseInt = Integer.parseInt(substring, 16);
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, Integer num) {
            int intValue = num.intValue();
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putInt(key, intValue);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class g extends c0<long[]> {
        public g() {
            super(true);
        }

        @Override // s1.c0
        public final long[] a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // s1.c0
        public final String b() {
            return "long[]";
        }

        @Override // s1.c0
        public final long[] c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, long[] jArr) {
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putLongArray(key, jArr);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class h extends c0<Long> {
        public h() {
            super(false);
        }

        @Override // s1.c0
        public final Long a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @Override // s1.c0
        public final String b() {
            return "long";
        }

        @Override // s1.c0
        public final Long c(String value) {
            String str;
            long parseLong;
            kotlin.jvm.internal.i.g(value, "value");
            if (gv.n.z0(value, "L")) {
                str = value.substring(0, value.length() - 1);
                kotlin.jvm.internal.i.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = value;
            }
            if (gv.n.H0(value, "0x")) {
                String substring = str.substring(2);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                ca.a.x(16);
                parseLong = Long.parseLong(substring, 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            return Long.valueOf(parseLong);
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, Long l2) {
            long longValue = l2.longValue();
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putLong(key, longValue);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class i extends c0<Integer> {
        public i() {
            super(false);
        }

        @Override // s1.c0
        public final Integer a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // s1.c0
        public final String b() {
            return "reference";
        }

        @Override // s1.c0
        public final Integer c(String value) {
            int parseInt;
            kotlin.jvm.internal.i.g(value, "value");
            if (gv.n.H0(value, "0x")) {
                String substring = value.substring(2);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                ca.a.x(16);
                parseInt = Integer.parseInt(substring, 16);
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, Integer num) {
            int intValue = num.intValue();
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putInt(key, intValue);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class j extends c0<String[]> {
        public j() {
            super(true);
        }

        @Override // s1.c0
        public final String[] a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // s1.c0
        public final String b() {
            return "string[]";
        }

        @Override // s1.c0
        public final String[] c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, String[] strArr) {
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putStringArray(key, strArr);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class k extends c0<String> {
        public k() {
            super(true);
        }

        @Override // s1.c0
        public final String a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // s1.c0
        public final String b() {
            return "string";
        }

        @Override // s1.c0
        public final String c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            return value;
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, String str) {
            kotlin.jvm.internal.i.g(key, "key");
            bundle.putString(key, str);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class l<D extends Enum<?>> extends p<D> {

        /* renamed from: n  reason: collision with root package name */
        public final Class<D> f31101n;

        public l(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f31101n = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // s1.c0.p, s1.c0
        public final String b() {
            return this.f31101n.getName();
        }

        @Override // s1.c0.p
        /* renamed from: f */
        public final D e(String value) {
            D d10;
            kotlin.jvm.internal.i.g(value, "value");
            Class<D> cls = this.f31101n;
            D[] enumConstants = cls.getEnumConstants();
            kotlin.jvm.internal.i.f(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    d10 = enumConstants[i6];
                    if (gv.n.A0(d10.name(), value, true)) {
                        break;
                    }
                    i6++;
                } else {
                    d10 = null;
                    break;
                }
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            StringBuilder g5 = defpackage.d.g("Enum value ", value, " not found for type ");
            g5.append(cls.getName());
            g5.append('.');
            throw new IllegalArgumentException(g5.toString());
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class m<D extends Parcelable> extends c0<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f31102m;

        public m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f31102m = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
                    return;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }

        @Override // s1.c0
        public final Object a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // s1.c0
        public final String b() {
            return this.f31102m.getName();
        }

        @Override // s1.c0
        public final Object c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            kotlin.jvm.internal.i.g(key, "key");
            this.f31102m.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && kotlin.jvm.internal.i.b(m.class, obj.getClass())) {
                return kotlin.jvm.internal.i.b(this.f31102m, ((m) obj).f31102m);
            }
            return false;
        }

        public final int hashCode() {
            return this.f31102m.hashCode();
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class n<D> extends c0<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f31103m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Class<D> cls) {
            super(true);
            boolean z10 = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z10 = false;
            }
            if (z10) {
                this.f31103m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // s1.c0
        public final D a(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // s1.c0
        public final String b() {
            return this.f31103m.getName();
        }

        @Override // s1.c0
        public final D c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, D d10) {
            kotlin.jvm.internal.i.g(key, "key");
            this.f31103m.cast(d10);
            if (d10 != null && !(d10 instanceof Parcelable)) {
                if (d10 instanceof Serializable) {
                    bundle.putSerializable(key, (Serializable) d10);
                    return;
                }
                return;
            }
            bundle.putParcelable(key, (Parcelable) d10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && kotlin.jvm.internal.i.b(n.class, obj.getClass())) {
                return kotlin.jvm.internal.i.b(this.f31103m, ((n) obj).f31103m);
            }
            return false;
        }

        public final int hashCode() {
            return this.f31103m.hashCode();
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class o<D extends Serializable> extends c0<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f31104m;

        public o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f31104m = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
                    return;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }

        @Override // s1.c0
        public final Object a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // s1.c0
        public final String b() {
            return this.f31104m.getName();
        }

        @Override // s1.c0
        public final Object c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        @Override // s1.c0
        public final void d(Bundle bundle, String key, Object obj) {
            ?? r42 = (Serializable[]) obj;
            kotlin.jvm.internal.i.g(key, "key");
            this.f31104m.cast(r42);
            bundle.putSerializable(key, r42);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && kotlin.jvm.internal.i.b(o.class, obj.getClass())) {
                return kotlin.jvm.internal.i.b(this.f31104m, ((o) obj).f31104m);
            }
            return false;
        }

        public final int hashCode() {
            return this.f31104m.hashCode();
        }
    }

    public c0(boolean z10) {
        this.f31100a = z10;
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public abstract T c(String str);

    public abstract void d(Bundle bundle, String str, T t3);

    public final String toString() {
        return b();
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static class p<D extends Serializable> extends c0<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f31105m;

        public p(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                if (true ^ cls.isEnum()) {
                    this.f31105m = cls;
                    return;
                }
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }

        @Override // s1.c0
        public final Object a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        @Override // s1.c0
        public String b() {
            return this.f31105m.getName();
        }

        @Override // s1.c0
        public final void d(Bundle bundle, String key, Object obj) {
            Serializable value = (Serializable) obj;
            kotlin.jvm.internal.i.g(key, "key");
            kotlin.jvm.internal.i.g(value, "value");
            this.f31105m.cast(value);
            bundle.putSerializable(key, value);
        }

        @Override // s1.c0
        /* renamed from: e */
        public D c(String value) {
            kotlin.jvm.internal.i.g(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return kotlin.jvm.internal.i.b(this.f31105m, ((p) obj).f31105m);
        }

        public final int hashCode() {
            return this.f31105m.hashCode();
        }

        public p(Class cls, int i6) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f31105m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
