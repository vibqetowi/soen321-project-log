package i5;

import android.content.Context;
import android.os.Bundle;
import h5.g0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import w5.e0;
/* compiled from: InternalAppEventsLogger.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final i f19878a;

    /* compiled from: InternalAppEventsLogger.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(HashMap hashMap) {
            String[] strArr;
            boolean z10;
            int i6;
            boolean z11;
            s sVar = s.f19889a;
            if (!b6.a.b(s.class)) {
                try {
                    boolean z12 = s.f19892d.get();
                    s sVar2 = s.f19889a;
                    if (!z12) {
                        sVar2.b();
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        ConcurrentHashMap<String, String> concurrentHashMap = s.f;
                        if (hasNext) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String str = (String) entry.getKey();
                            String str2 = (String) entry.getValue();
                            e0 e0Var = e0.f36453a;
                            int i10 = 1;
                            int length = str2.length() - 1;
                            int i11 = 0;
                            boolean z13 = false;
                            while (i11 <= length) {
                                if (!z13) {
                                    i6 = i11;
                                } else {
                                    i6 = length;
                                }
                                if (kotlin.jvm.internal.i.i(str2.charAt(i6), 32) <= 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z13) {
                                    if (!z11) {
                                        z13 = true;
                                    } else {
                                        i11++;
                                    }
                                } else if (!z11) {
                                    break;
                                } else {
                                    length--;
                                }
                            }
                            String K = e0.K(sVar2.c(str, str2.subSequence(i11, length + 1).toString()));
                            if (concurrentHashMap.containsKey(str)) {
                                String str3 = concurrentHashMap.get(str);
                                if (str3 == null) {
                                    strArr = null;
                                } else {
                                    Object[] array = new gv.e(",").c(str3).toArray(new String[0]);
                                    if (array != null) {
                                        strArr = (String[]) array;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                    }
                                }
                                if (strArr == null) {
                                    strArr = new String[0];
                                }
                                Object[] elements = Arrays.copyOf(strArr, strArr.length);
                                kotlin.jvm.internal.i.g(elements, "elements");
                                LinkedHashSet linkedHashSet = new LinkedHashSet(sp.b.P(elements.length));
                                is.k.h2(linkedHashSet, elements);
                                if (!linkedHashSet.contains(K)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (strArr.length == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        sb2.append(K);
                                    } else if (strArr.length < 5) {
                                        sb2.append(str3);
                                        sb2.append(",");
                                        sb2.append(K);
                                    } else {
                                        while (true) {
                                            int i12 = i10 + 1;
                                            sb2.append(strArr[i10]);
                                            sb2.append(",");
                                            if (i12 >= 5) {
                                                break;
                                            }
                                            i10 = i12;
                                        }
                                        sb2.append(K);
                                        linkedHashSet.remove(strArr[0]);
                                    }
                                    concurrentHashMap.put(str, sb2.toString());
                                } else {
                                    return;
                                }
                            } else {
                                concurrentHashMap.put(str, K);
                            }
                        } else {
                            String E = e0.E(concurrentHashMap);
                            sVar2.getClass();
                            if (!b6.a.b(sVar2)) {
                                h5.p.c().execute(new r("com.facebook.appevents.UserDataStore.internalUserData", E, 0));
                                return;
                            }
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    b6.a.a(s.class, th2);
                }
            }
        }
    }

    public o(Context context) {
        this.f19878a = new i(context, (String) null);
    }

    public final void a(Bundle bundle, String str) {
        h5.p pVar = h5.p.f17269a;
        if (g0.b()) {
            this.f19878a.f(str, bundle);
        }
    }

    public o(Context context, String str) {
        this.f19878a = new i(context, str);
    }
}
