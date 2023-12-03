package com.google.protobuf;

import com.google.protobuf.h;
import com.google.protobuf.v;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: MessageLiteToString.java */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f10035a;

    static {
        char[] cArr = new char[80];
        f10035a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i6, StringBuilder sb2) {
        while (i6 > 0) {
            int i10 = 80;
            if (i6 <= 80) {
                i10 = i6;
            }
            sb2.append(f10035a, 0, i10);
            i6 -= i10;
        }
    }

    public static void b(StringBuilder sb2, int i6, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb2, i6, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb2, i6, str, entry);
            }
        } else {
            sb2.append('\n');
            a(i6, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i10 = 1; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                h.C0164h c0164h = h.f9922v;
                sb2.append(hc.d.t(new h.C0164h(((String) obj).getBytes(y.f10086a))));
                sb2.append('\"');
            } else if (obj instanceof h) {
                sb2.append(": \"");
                sb2.append(hc.d.t((h) obj));
                sb2.append('\"');
            } else if (obj instanceof v) {
                sb2.append(" {");
                c((v) obj, sb2, i6 + 2);
                sb2.append("\n");
                a(i6, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i11 = i6 + 2;
                b(sb2, i11, "key", entry2.getKey());
                b(sb2, i11, "value", entry2.getValue());
                sb2.append("\n");
                a(i6, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0198, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01aa, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f4, code lost:
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(q0 q0Var, StringBuilder sb2, int i6) {
        int i10;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = q0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb2, i6, substring.substring(0, substring.length() - 4), v.B(q0Var, method2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i6, substring.substring(0, substring.length() - 3), v.B(q0Var, method, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object B = v.B(q0Var, method4, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (B instanceof Boolean) {
                            equals = !((Boolean) B).booleanValue();
                        } else if (!(B instanceof Integer)) {
                            if (!(B instanceof Float)) {
                                if (!(B instanceof Double)) {
                                    if (B instanceof String) {
                                        equals = B.equals("");
                                    } else if (B instanceof h) {
                                        equals = B.equals(h.f9922v);
                                    } else {
                                        equals = !(B instanceof q0) ? false : false;
                                    }
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) v.B(q0Var, method5, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb2, i6, substring, B);
                    }
                }
            }
            i10 = 3;
        }
        if (q0Var instanceof v.c) {
            Iterator<Map.Entry<v.d, Object>> k10 = ((v.c) q0Var).extensions.k();
            while (k10.hasNext()) {
                Map.Entry<v.d, Object> next = k10.next();
                next.getKey().getClass();
                b(sb2, i6, "[0]", next.getValue());
            }
        }
        n1 n1Var = ((v) q0Var).unknownFields;
        if (n1Var != null) {
            for (int i12 = 0; i12 < n1Var.f10007a; i12++) {
                b(sb2, i6, String.valueOf(n1Var.f10008b[i12] >>> 3), n1Var.f10009c[i12]);
            }
        }
    }
}
