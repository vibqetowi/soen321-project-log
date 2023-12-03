package com.google.protobuf;

import com.google.protobuf.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static volatile n f10000b;

    /* renamed from: c  reason: collision with root package name */
    public static final n f10001c = new n(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, v.e<?, ?>> f10002a;

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f10003a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10004b;

        public a(int i6, Object obj) {
            this.f10003a = obj;
            this.f10004b = i6;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f10003a != aVar.f10003a || this.f10004b != aVar.f10004b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f10003a) * 65535) + this.f10004b;
        }
    }

    public n() {
        this.f10002a = new HashMap();
    }

    public static n a() {
        n nVar = f10000b;
        if (nVar == null) {
            synchronized (n.class) {
                nVar = f10000b;
                if (nVar == null) {
                    Class<?> cls = m.f9999a;
                    n nVar2 = null;
                    if (cls != null) {
                        try {
                            nVar2 = (n) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (nVar2 == null) {
                        nVar2 = f10001c;
                    }
                    f10000b = nVar2;
                    nVar = nVar2;
                }
            }
        }
        return nVar;
    }

    public n(int i6) {
        this.f10002a = Collections.emptyMap();
    }
}
