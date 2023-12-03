package com.google.android.gms.internal.cast;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class f4 {
    public static final void a(StringBuilder sb2, int i6, String str, Object obj) {
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
            int i10 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                m2 m2Var = n2.f7604v;
                sb2.append(g.a(new m2(((String) obj).getBytes(k3.f7570a))));
                sb2.append('\"');
            } else if (obj instanceof n2) {
                sb2.append(": \"");
                sb2.append(g.a((n2) obj));
                sb2.append('\"');
            } else if (obj instanceof c3) {
                sb2.append(" {");
                b((c3) obj, sb2, i6 + 2);
                sb2.append("\n");
                while (i10 < i6) {
                    sb2.append(' ');
                    i10++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i12 = i6 + 2;
                a(sb2, i12, "key", entry2.getKey());
                a(sb2, i12, "value", entry2.getValue());
                sb2.append("\n");
                while (i10 < i6) {
                    sb2.append(' ');
                    i10++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    public static void b(c4 c4Var, StringBuilder sb2, int i6) {
        Method[] declaredMethods;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean equals;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : c4Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str9 = (String) it.next();
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb2, i6, c(str8), c3.g(c4Var, method2, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb2, i6, c(str7), c3.g(c4Var, method3, new Object[0]));
                }
            }
            if (str.length() != 0) {
                str2 = "set".concat(str);
            } else {
                str2 = new String("set");
            }
            if (((Method) hashMap2.get(str2)) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf5.length() != 0) {
                        str6 = "get".concat(valueOf5);
                    } else {
                        str6 = new String("get");
                    }
                    if (!hashMap.containsKey(str6)) {
                    }
                }
                String valueOf6 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(str.substring(1));
                if (valueOf7.length() != 0) {
                    str3 = valueOf6.concat(valueOf7);
                } else {
                    str3 = new String(valueOf6);
                }
                if (str.length() != 0) {
                    str4 = "get".concat(str);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                if (str.length() != 0) {
                    str5 = "has".concat(str);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object g5 = c3.g(c4Var, method4, new Object[0]);
                    if (method5 == null) {
                        if (g5 instanceof Boolean) {
                            if (((Boolean) g5).booleanValue()) {
                                a(sb2, i6, c(str3), g5);
                            }
                        } else if (g5 instanceof Integer) {
                            if (((Integer) g5).intValue() != 0) {
                                a(sb2, i6, c(str3), g5);
                            }
                        } else if (g5 instanceof Float) {
                            if (((Float) g5).floatValue() != 0.0f) {
                                a(sb2, i6, c(str3), g5);
                            }
                        } else if (g5 instanceof Double) {
                            if (((Double) g5).doubleValue() != 0.0d) {
                                a(sb2, i6, c(str3), g5);
                            }
                        } else {
                            if (g5 instanceof String) {
                                equals = g5.equals("");
                            } else if (g5 instanceof n2) {
                                equals = g5.equals(n2.f7604v);
                            } else if (g5 instanceof c4) {
                                if (g5 != ((c4) g5).j()) {
                                    a(sb2, i6, c(str3), g5);
                                }
                            } else {
                                if ((g5 instanceof Enum) && ((Enum) g5).ordinal() == 0) {
                                }
                                a(sb2, i6, c(str3), g5);
                            }
                            if (!equals) {
                                a(sb2, i6, c(str3), g5);
                            }
                        }
                    } else if (((Boolean) c3.g(c4Var, method5, new Object[0])).booleanValue()) {
                        a(sb2, i6, c(str3), g5);
                    }
                }
            }
        }
        if (!(c4Var instanceof b3)) {
            c3 c3Var = (c3) c4Var;
        } else {
            b3 b3Var = (b3) c4Var;
            throw null;
        }
    }

    public static final String c(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i6 = 0; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }
}
