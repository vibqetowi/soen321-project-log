package s1;

import java.util.LinkedHashMap;
import s1.g0;
/* compiled from: NavigatorProvider.kt */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f31177b = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f31178a = new LinkedHashMap();

    /* compiled from: NavigatorProvider.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = i0.f31177b;
            String str = (String) linkedHashMap.get(cls);
            if (str == null) {
                g0.b bVar = (g0.b) cls.getAnnotation(g0.b.class);
                if (bVar != null) {
                    str = bVar.value();
                } else {
                    str = null;
                }
                if (b(str)) {
                    linkedHashMap.put(cls, str);
                } else {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
            }
            kotlin.jvm.internal.i.d(str);
            return str;
        }

        public static boolean b(String str) {
            boolean z10;
            if (str == null) {
                return false;
            }
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            return true;
        }
    }

    public final void a(g0 g0Var) {
        boolean z10;
        String a10 = a.a(g0Var.getClass());
        if (a.b(a10)) {
            LinkedHashMap linkedHashMap = this.f31178a;
            g0 g0Var2 = (g0) linkedHashMap.get(a10);
            if (!kotlin.jvm.internal.i.b(g0Var2, g0Var)) {
                if (g0Var2 != null && g0Var2.f31129b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (!g0Var.f31129b) {
                        g0 g0Var3 = (g0) linkedHashMap.put(a10, g0Var);
                        return;
                    }
                    throw new IllegalStateException(("Navigator " + g0Var + " is already attached to another NavController").toString());
                }
                throw new IllegalStateException(("Navigator " + g0Var + " is replacing an already attached " + g0Var2).toString());
            }
            return;
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    public final <T extends g0<?>> T b(String name) {
        kotlin.jvm.internal.i.g(name, "name");
        if (a.b(name)) {
            T t3 = (T) this.f31178a.get(name);
            if (t3 != null) {
                return t3;
            }
            throw new IllegalStateException(defpackage.b.m("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
