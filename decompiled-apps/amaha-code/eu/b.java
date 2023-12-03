package eu;

import gv.n;
import is.u;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.i;
import r1.b0;
/* compiled from: ClassMapperLite.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14556a = u.m2(ca.a.P0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f14557b;

    static {
        int i6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List P0 = ca.a.P0("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int F = sp.b.F(0, P0.size() - 1, 2);
        if (F >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f14556a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) P0.get(i10));
                linkedHashMap.put(sb2.toString(), P0.get(i10 + 1));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(b0.b(sb3, (String) P0.get(i10), "Array"), "[" + ((String) P0.get(i6)));
                if (i10 == F) {
                    break;
                }
                i10 += 2;
            }
        }
        linkedHashMap.put(f14556a + "/Unit", "V");
        a("Any", "java/lang/Object", linkedHashMap);
        a("Nothing", "java/lang/Void", linkedHashMap);
        a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : ca.a.P0("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(str2, "java/lang/" + str2, linkedHashMap);
        }
        for (String str3 : ca.a.P0("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(defpackage.c.r("collections/", str3), "java/util/" + str3, linkedHashMap);
            a("collections/Mutable" + str3, "java/util/" + str3, linkedHashMap);
        }
        a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i11 = 0; i11 < 23; i11++) {
            String p10 = defpackage.c.p("Function", i11);
            StringBuilder sb4 = new StringBuilder();
            String str4 = f14556a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i11);
            a(p10, sb4.toString(), linkedHashMap);
            a("reflect/KFunction" + i11, str4 + "/reflect/KFunction", linkedHashMap);
        }
        for (String str5 : ca.a.P0("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(pl.a.f(str5, ".Companion"), f14556a + "/jvm/internal/" + str5 + "CompanionObject", linkedHashMap);
        }
        f14557b = linkedHashMap;
    }

    public static final void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(f14556a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String classId) {
        i.g(classId, "classId");
        String str = (String) f14557b.get(classId);
        if (str == null) {
            return "L" + n.E0(classId, '.', '$') + ';';
        }
        return str;
    }
}
