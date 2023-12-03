package dw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: RequestFactory.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Method f13662a;

    /* renamed from: b  reason: collision with root package name */
    public final lv.t f13663b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13664c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13665d;

    /* renamed from: e  reason: collision with root package name */
    public final lv.s f13666e;
    public final lv.v f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13667g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13668h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f13669i;

    /* renamed from: j  reason: collision with root package name */
    public final v<?>[] f13670j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f13671k;

    /* compiled from: RequestFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final Pattern f13672x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f13673y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final a0 f13674a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f13675b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f13676c;

        /* renamed from: d  reason: collision with root package name */
        public final Annotation[][] f13677d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f13678e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f13679g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f13680h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f13681i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f13682j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f13683k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f13684l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f13685m;

        /* renamed from: n  reason: collision with root package name */
        public String f13686n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f13687o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f13688p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f13689q;
        public String r;

        /* renamed from: s  reason: collision with root package name */
        public lv.s f13690s;

        /* renamed from: t  reason: collision with root package name */
        public lv.v f13691t;

        /* renamed from: u  reason: collision with root package name */
        public LinkedHashSet f13692u;

        /* renamed from: v  reason: collision with root package name */
        public v<?>[] f13693v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f13694w;

        public a(a0 a0Var, Method method) {
            this.f13674a = a0Var;
            this.f13675b = method;
            this.f13676c = method.getAnnotations();
            this.f13678e = method.getGenericParameterTypes();
            this.f13677d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f13686n;
            Method method = this.f13675b;
            if (str3 == null) {
                this.f13686n = str;
                this.f13687o = z10;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                Pattern pattern = f13672x;
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (pattern.matcher(substring).find()) {
                        throw e0.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.r = str2;
                Matcher matcher = pattern.matcher(str2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (matcher.find()) {
                    linkedHashSet.add(matcher.group(1));
                }
                this.f13692u = linkedHashSet;
                return;
            }
            throw e0.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i6, Type type) {
            if (!e0.g(type)) {
                return;
            }
            throw e0.j(this.f13675b, i6, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    public y(a aVar) {
        this.f13662a = aVar.f13675b;
        this.f13663b = aVar.f13674a.f13535c;
        this.f13664c = aVar.f13686n;
        this.f13665d = aVar.r;
        this.f13666e = aVar.f13690s;
        this.f = aVar.f13691t;
        this.f13667g = aVar.f13687o;
        this.f13668h = aVar.f13688p;
        this.f13669i = aVar.f13689q;
        this.f13670j = aVar.f13693v;
        this.f13671k = aVar.f13694w;
    }
}
