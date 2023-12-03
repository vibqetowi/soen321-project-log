package com.google.protobuf;

import com.google.protobuf.s1;
/* compiled from: MapEntryLite.java */
/* loaded from: classes.dex */
public final class j0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f9971a;

    /* renamed from: b  reason: collision with root package name */
    public final K f9972b = "";

    /* renamed from: c  reason: collision with root package name */
    public final V f9973c;

    /* compiled from: MapEntryLite.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final s1 f9974a;

        /* renamed from: b  reason: collision with root package name */
        public final K f9975b = "";

        /* renamed from: c  reason: collision with root package name */
        public final s1 f9976c;

        /* renamed from: d  reason: collision with root package name */
        public final V f9977d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(s1.a aVar, s1 s1Var, Object obj) {
            this.f9974a = aVar;
            this.f9976c = s1Var;
            this.f9977d = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(s1.a aVar, s1 s1Var, Object obj) {
        this.f9971a = new a<>(aVar, s1Var, obj);
        this.f9973c = obj;
    }

    public static <K, V> int a(a<K, V> aVar, K k10, V v10) {
        return r.b(aVar.f9976c, 2, v10) + r.b(aVar.f9974a, 1, k10);
    }

    public static <K, V> void b(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) {
        r.p(codedOutputStream, aVar.f9974a, 1, k10);
        r.p(codedOutputStream, aVar.f9976c, 2, v10);
    }
}
