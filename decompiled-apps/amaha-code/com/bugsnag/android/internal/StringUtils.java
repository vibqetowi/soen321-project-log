package com.bugsnag.android.internal;

import hs.k;
import is.e0;
import is.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.i;
import pl.a;
import ss.q;
/* compiled from: StringUtils.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\bJ\u000e\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u0001H\u0002J\u000e\u0010\u000b\u001a\u00020\t*\u0004\u0018\u00010\u0001H\u0002J\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bugsnag/android/internal/StringUtils;", "", "", "maxStringLength", "value", "Lkotlin/Function3;", "Lhs/k;", "update", "trimValue", "", "isDefinitelyMutableMap", "isDefinitelyMutableList", "maxLength", "", "str", "stringTrimmedTo", "", "list", "Lcom/bugsnag/android/internal/TrimMetrics;", "trimStringValuesTo", "", "map", "trimMessageLength", "I", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StringUtils {
    public static final StringUtils INSTANCE = new StringUtils();
    private static final int trimMessageLength = 25;

    private StringUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDefinitelyMutableList(Object obj) {
        if (!(obj instanceof ArrayList) && !(obj instanceof LinkedList) && !(obj instanceof CopyOnWriteArrayList) && !(obj instanceof Vector)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDefinitelyMutableMap(Object obj) {
        if (!(obj instanceof HashMap) && !(obj instanceof TreeMap) && !(obj instanceof ConcurrentMap) && !(obj instanceof EnumMap) && !(obj instanceof Hashtable) && !(obj instanceof WeakHashMap)) {
            return false;
        }
        return true;
    }

    private final void trimValue(int i6, Object obj, q<Object, ? super Integer, ? super Integer, k> qVar) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() > i6) {
                qVar.invoke(stringTrimmedTo(i6, str), 1, Integer.valueOf(str.length() - i6));
                return;
            }
        }
        if (isDefinitelyMutableMap(obj)) {
            if (obj != null) {
                TrimMetrics trimStringValuesTo = trimStringValuesTo(i6, c0.c(obj));
                qVar.invoke(obj, Integer.valueOf(trimStringValuesTo.component1()), Integer.valueOf(trimStringValuesTo.component2()));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
        } else if (isDefinitelyMutableList(obj)) {
            if (obj != null) {
                TrimMetrics trimStringValuesTo2 = trimStringValuesTo(i6, c0.b(obj));
                qVar.invoke(obj, Integer.valueOf(trimStringValuesTo2.component1()), Integer.valueOf(trimStringValuesTo2.component2()));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
        } else if (obj instanceof Map) {
            Map<String, Object> c10 = c0.c(e0.z0((Map) obj));
            TrimMetrics trimStringValuesTo3 = trimStringValuesTo(i6, c10);
            qVar.invoke(c10, Integer.valueOf(trimStringValuesTo3.component1()), Integer.valueOf(trimStringValuesTo3.component2()));
        } else if (obj instanceof Collection) {
            ArrayList J2 = u.J2((Collection) obj);
            TrimMetrics trimStringValuesTo4 = trimStringValuesTo(i6, J2);
            qVar.invoke(J2, Integer.valueOf(trimStringValuesTo4.component1()), Integer.valueOf(trimStringValuesTo4.component2()));
        }
    }

    public final String stringTrimmedTo(int i6, String str) {
        i.h(str, "str");
        int length = str.length() - i6;
        if (length >= 25) {
            StringBuilder sb2 = new StringBuilder();
            String substring = str.substring(0, i6);
            i.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb2.append(substring);
            sb2.append("***<");
            return a.g(sb2, length, "> CHARS TRUNCATED***");
        }
        return str;
    }

    public final TrimMetrics trimStringValuesTo(int i6, List<Object> list) {
        int component1;
        int component2;
        ArrayList arrayList;
        i.h(list, "list");
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            StringUtils stringUtils = INSTANCE;
            Object obj = list.get(i12);
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() > i6) {
                    list.set(i12, stringUtils.stringTrimmedTo(i6, str));
                    i10++;
                    i11 += str.length() - i6;
                }
            }
            if (stringUtils.isDefinitelyMutableMap(obj)) {
                if (obj != null) {
                    TrimMetrics trimStringValuesTo = stringUtils.trimStringValuesTo(i6, c0.c(obj));
                    component1 = trimStringValuesTo.component1();
                    component2 = trimStringValuesTo.component2();
                    arrayList = obj;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
            } else if (stringUtils.isDefinitelyMutableList(obj)) {
                if (obj != null) {
                    TrimMetrics trimStringValuesTo2 = stringUtils.trimStringValuesTo(i6, c0.b(obj));
                    component1 = trimStringValuesTo2.component1();
                    component2 = trimStringValuesTo2.component2();
                    arrayList = obj;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                }
            } else if (obj instanceof Map) {
                Map<String, Object> c10 = c0.c(e0.z0((Map) obj));
                TrimMetrics trimStringValuesTo3 = stringUtils.trimStringValuesTo(i6, c10);
                component1 = trimStringValuesTo3.component1();
                component2 = trimStringValuesTo3.component2();
                arrayList = c10;
            } else if (obj instanceof Collection) {
                ArrayList J2 = u.J2((Collection) obj);
                TrimMetrics trimStringValuesTo4 = stringUtils.trimStringValuesTo(i6, J2);
                component1 = trimStringValuesTo4.component1();
                component2 = trimStringValuesTo4.component2();
                arrayList = J2;
            }
            list.set(i12, arrayList);
            i10 += component1;
            i11 += component2;
        }
        return new TrimMetrics(i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TrimMetrics trimStringValuesTo(int i6, Map<String, Object> map) {
        int component1;
        int component2;
        Map<String, Object> map2;
        i.h(map, "map");
        Iterator<T> it = map.entrySet().iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            StringUtils stringUtils = INSTANCE;
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.length() > i6) {
                    entry.setValue(stringUtils.stringTrimmedTo(i6, str));
                    i10++;
                    i11 += str.length() - i6;
                }
            }
            if (stringUtils.isDefinitelyMutableMap(value)) {
                if (value != 0) {
                    TrimMetrics trimStringValuesTo = stringUtils.trimStringValuesTo(i6, c0.c(value));
                    component1 = trimStringValuesTo.component1();
                    component2 = trimStringValuesTo.component2();
                    map2 = value;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
            } else if (stringUtils.isDefinitelyMutableList(value)) {
                if (value != 0) {
                    TrimMetrics trimStringValuesTo2 = stringUtils.trimStringValuesTo(i6, c0.b(value));
                    component1 = trimStringValuesTo2.component1();
                    component2 = trimStringValuesTo2.component2();
                    map2 = value;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                }
            } else if (value instanceof Map) {
                Map<String, Object> c10 = c0.c(e0.z0((Map) value));
                TrimMetrics trimStringValuesTo3 = stringUtils.trimStringValuesTo(i6, c10);
                component1 = trimStringValuesTo3.component1();
                component2 = trimStringValuesTo3.component2();
                map2 = c10;
            } else if (value instanceof Collection) {
                List<Object> J2 = u.J2((Collection) value);
                TrimMetrics trimStringValuesTo4 = stringUtils.trimStringValuesTo(i6, J2);
                component1 = trimStringValuesTo4.component1();
                component2 = trimStringValuesTo4.component2();
                map2 = J2;
            }
            entry.setValue(map2);
            i10 += component1;
            i11 += component2;
        }
        return new TrimMetrics(i10, i11);
    }
}
