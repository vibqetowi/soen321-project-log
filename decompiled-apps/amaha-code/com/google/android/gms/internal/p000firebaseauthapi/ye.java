package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import t.b;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ye  reason: invalid package */
/* loaded from: classes.dex */
public final class ye {

    /* renamed from: a  reason: collision with root package name */
    public static final b f8261a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final b f8262b = new b();

    public static void a(String str) {
        we weVar;
        b bVar = f8261a;
        synchronized (bVar) {
            weVar = (we) bVar.getOrDefault(str, null);
        }
        if (weVar == null) {
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
        }
        throw null;
    }

    public static String b(String str) {
        we weVar;
        b bVar = f8261a;
        synchronized (bVar) {
            weVar = (we) bVar.getOrDefault(str, null);
        }
        if (weVar == null) {
            return "https://".concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
        }
        throw null;
    }

    public static String c(String str) {
        we weVar;
        b bVar = f8261a;
        synchronized (bVar) {
            weVar = (we) bVar.getOrDefault(str, null);
        }
        if (weVar == null) {
            return "https://".concat("identitytoolkit.googleapis.com/v2");
        }
        throw null;
    }

    public static void d(String str, xe xeVar) {
        b bVar = f8262b;
        synchronized (bVar) {
            try {
                if (bVar.containsKey(str)) {
                    ((List) bVar.getOrDefault(str, null)).add(new WeakReference(xeVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(xeVar));
                    bVar.put(str, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
