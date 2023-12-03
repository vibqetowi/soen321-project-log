package io.grpc;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: Attributes.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f20426b = new a(new IdentityHashMap());

    /* renamed from: a  reason: collision with root package name */
    public final IdentityHashMap<b<?>, Object> f20427a;

    /* compiled from: Attributes.java */
    /* renamed from: io.grpc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0307a {

        /* renamed from: a  reason: collision with root package name */
        public a f20428a;

        /* renamed from: b  reason: collision with root package name */
        public IdentityHashMap<b<?>, Object> f20429b;

        public C0307a(a aVar) {
            this.f20428a = aVar;
        }

        public final a a() {
            if (this.f20429b != null) {
                for (Map.Entry<b<?>, Object> entry : this.f20428a.f20427a.entrySet()) {
                    if (!this.f20429b.containsKey(entry.getKey())) {
                        this.f20429b.put(entry.getKey(), entry.getValue());
                    }
                }
                this.f20428a = new a(this.f20429b);
                this.f20429b = null;
            }
            return this.f20428a;
        }

        public final void b(b bVar) {
            if (this.f20428a.f20427a.containsKey(bVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f20428a.f20427a);
                identityHashMap.remove(bVar);
                this.f20428a = new a(identityHashMap);
            }
            IdentityHashMap<b<?>, Object> identityHashMap2 = this.f20429b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(bVar);
            }
        }

        public final void c(b bVar, Object obj) {
            if (this.f20429b == null) {
                this.f20429b = new IdentityHashMap<>(1);
            }
            this.f20429b.put(bVar, obj);
        }
    }

    /* compiled from: Attributes.java */
    /* loaded from: classes2.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f20430a;

        public b(String str) {
            this.f20430a = str;
        }

        public final String toString() {
            return this.f20430a;
        }
    }

    public /* synthetic */ a() {
        throw null;
    }

    public a(IdentityHashMap<b<?>, Object> identityHashMap) {
        this.f20427a = identityHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        IdentityHashMap<b<?>, Object> identityHashMap = this.f20427a;
        if (identityHashMap.size() != aVar.f20427a.size()) {
            return false;
        }
        for (Map.Entry<b<?>, Object> entry : identityHashMap.entrySet()) {
            b<?> key = entry.getKey();
            IdentityHashMap<b<?>, Object> identityHashMap2 = aVar.f20427a;
            if (!identityHashMap2.containsKey(key) || !f6.b.v0(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
            while (r2.hasNext()) {
            }
        }
        return true;
    }

    public final int hashCode() {
        int i6 = 0;
        for (Map.Entry<b<?>, Object> entry : this.f20427a.entrySet()) {
            i6 += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i6;
    }

    public final String toString() {
        return this.f20427a.toString();
    }
}
