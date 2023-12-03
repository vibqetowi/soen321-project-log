package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class x6 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f8690a;

    static {
        char[] cArr = new char[80];
        f8690a = cArr;
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
                a5 a5Var = b5.f8311v;
                sb2.append(sp.b.n0(new a5(((String) obj).getBytes(c6.f8318a))));
                sb2.append('\"');
            } else if (obj instanceof b5) {
                sb2.append(": \"");
                sb2.append(sp.b.n0((b5) obj));
                sb2.append('\"');
            } else if (obj instanceof w5) {
                sb2.append(" {");
                c((w5) obj, sb2, i6 + 2);
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
            sb2.append(f8690a, 0, i10);
            i6 -= i10;
        }
    }

    public static void c(v6 v6Var, StringBuilder sb2, int i6) {
        int i10;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = v6Var.getClass().getDeclaredMethods();
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
                a(sb2, i6, substring.substring(0, substring.length() - 4), w5.k(v6Var, method2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i6, substring.substring(0, substring.length() - 3), w5.k(v6Var, method, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object k10 = w5.k(v6Var, method4, new Object[0]);
                    if (method5 == null) {
                        if (k10 instanceof Boolean) {
                            if (!((Boolean) k10).booleanValue()) {
                            }
                            a(sb2, i6, substring, k10);
                        } else if (k10 instanceof Integer) {
                            if (((Integer) k10).intValue() == 0) {
                            }
                            a(sb2, i6, substring, k10);
                        } else if (k10 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) k10).floatValue()) == 0) {
                            }
                            a(sb2, i6, substring, k10);
                        } else if (k10 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) k10).doubleValue()) == 0) {
                            }
                            a(sb2, i6, substring, k10);
                        } else {
                            if (k10 instanceof String) {
                                equals = k10.equals("");
                            } else if (k10 instanceof b5) {
                                equals = k10.equals(b5.f8311v);
                            } else if (k10 instanceof v6) {
                                if (k10 == ((v6) k10).d()) {
                                }
                                a(sb2, i6, substring, k10);
                            } else {
                                if ((k10 instanceof Enum) && ((Enum) k10).ordinal() == 0) {
                                }
                                a(sb2, i6, substring, k10);
                            }
                            if (equals) {
                            }
                            a(sb2, i6, substring, k10);
                        }
                    } else {
                        if (!((Boolean) w5.k(v6Var, method5, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i6, substring, k10);
                    }
                }
            }
            i10 = 3;
        }
        if (!(v6Var instanceof u5)) {
            s7 s7Var = ((w5) v6Var).zzc;
            if (s7Var != null) {
                for (int i12 = 0; i12 < s7Var.f8595a; i12++) {
                    a(sb2, i6, String.valueOf(s7Var.f8596b[i12] >>> 3), s7Var.f8597c[i12]);
                }
                return;
            }
            return;
        }
        u5 u5Var = (u5) v6Var;
        throw null;
    }
}
