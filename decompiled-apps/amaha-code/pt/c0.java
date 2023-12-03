package pt;

import com.appsflyer.R;
/* compiled from: JvmAbi.kt */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final fu.c f28861a;

    /* renamed from: b  reason: collision with root package name */
    public static final fu.b f28862b;

    static {
        fu.c cVar = new fu.c("kotlin.jvm.JvmField");
        f28861a = cVar;
        fu.b.l(cVar);
        fu.b.l(new fu.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f28862b = fu.b.f("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String propertyName) {
        kotlin.jvm.internal.i.g(propertyName, "propertyName");
        if (!c(propertyName)) {
            return "get" + ta.v.l(propertyName);
        }
        return propertyName;
    }

    public static final String b(String str) {
        String l2;
        StringBuilder sb2 = new StringBuilder("set");
        if (c(str)) {
            l2 = str.substring(2);
            kotlin.jvm.internal.i.f(l2, "this as java.lang.String).substring(startIndex)");
        } else {
            l2 = ta.v.l(str);
        }
        sb2.append(l2);
        return sb2.toString();
    }

    public static final boolean c(String name) {
        kotlin.jvm.internal.i.g(name, "name");
        if (!gv.n.H0(name, "is") || name.length() == 2) {
            return false;
        }
        char charAt = name.charAt(2);
        if (kotlin.jvm.internal.i.i(97, charAt) <= 0 && kotlin.jvm.internal.i.i(charAt, R.styleable.AppCompatTheme_windowFixedWidthMajor) <= 0) {
            return false;
        }
        return true;
    }
}
