package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d2  reason: invalid package */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f7769a;

    static {
        char[] cArr = new char[80];
        f7769a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i6, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb2, i6, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb2, i6, str, entry);
            }
        } else {
            sb2.append('\n');
            b(i6, sb2);
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
                g0 g0Var = h0.f7869v;
                sb2.append(r.A(new g0(((String) obj).getBytes(i1.f7886a))));
                sb2.append('\"');
            } else if (obj instanceof h0) {
                sb2.append(": \"");
                sb2.append(r.A((h0) obj));
                sb2.append('\"');
            } else if (obj instanceof e1) {
                sb2.append(" {");
                c((e1) obj, sb2, i6 + 2);
                sb2.append("\n");
                b(i6, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i11 = i6 + 2;
                a(sb2, i11, "key", entry2.getKey());
                a(sb2, i11, "value", entry2.getValue());
                sb2.append("\n");
                b(i6, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    public static void b(int i6, StringBuilder sb2) {
        while (i6 > 0) {
            int i10 = 80;
            if (i6 <= 80) {
                i10 = i6;
            }
            sb2.append(f7769a, 0, i10);
            i6 -= i10;
        }
    }

    public static void c(b2 b2Var, StringBuilder sb2, int i6) {
        int i10;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = b2Var.getClass().getDeclaredMethods();
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
                a(sb2, i6, substring.substring(0, substring.length() - 4), e1.c(b2Var, method2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i6, substring.substring(0, substring.length() - 3), e1.c(b2Var, method, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object c10 = e1.c(b2Var, method4, new Object[0]);
                    if (method5 == null) {
                        if (c10 instanceof Boolean) {
                            if (!((Boolean) c10).booleanValue()) {
                            }
                            a(sb2, i6, substring, c10);
                        } else if (c10 instanceof Integer) {
                            if (((Integer) c10).intValue() == 0) {
                            }
                            a(sb2, i6, substring, c10);
                        } else if (c10 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) c10).floatValue()) == 0) {
                            }
                            a(sb2, i6, substring, c10);
                        } else if (c10 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) c10).doubleValue()) == 0) {
                            }
                            a(sb2, i6, substring, c10);
                        } else {
                            if (c10 instanceof String) {
                                equals = c10.equals("");
                            } else if (c10 instanceof h0) {
                                equals = c10.equals(h0.f7869v);
                            } else if (c10 instanceof b2) {
                                if (c10 == ((b2) c10).a()) {
                                }
                                a(sb2, i6, substring, c10);
                            } else {
                                if ((c10 instanceof Enum) && ((Enum) c10).ordinal() == 0) {
                                }
                                a(sb2, i6, substring, c10);
                            }
                            if (equals) {
                            }
                            a(sb2, i6, substring, c10);
                        }
                    } else {
                        if (!((Boolean) e1.c(b2Var, method5, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i6, substring, c10);
                    }
                }
            }
            i10 = 3;
        }
        if (!(b2Var instanceof c1)) {
            y2 y2Var = ((e1) b2Var).zzc;
            if (y2Var != null) {
                for (int i12 = 0; i12 < y2Var.f8252a; i12++) {
                    a(sb2, i6, String.valueOf(y2Var.f8253b[i12] >>> 3), y2Var.f8254c[i12]);
                }
                return;
            }
            return;
        }
        c1 c1Var = (c1) b2Var;
        throw null;
    }
}
