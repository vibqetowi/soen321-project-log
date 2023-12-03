package com.google.common.collect;
/* compiled from: ComparisonChain.java */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9415a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f9416b = new b(-1);

    /* renamed from: c  reason: collision with root package name */
    public static final b f9417c = new b(1);

    /* compiled from: ComparisonChain.java */
    /* loaded from: classes.dex */
    public class a extends m {
        public static m f(int i6) {
            if (i6 < 0) {
                return m.f9416b;
            }
            if (i6 > 0) {
                return m.f9417c;
            }
            return m.f9415a;
        }

        @Override // com.google.common.collect.m
        public final m a(int i6, int i10) {
            int i11;
            if (i6 < i10) {
                i11 = -1;
            } else if (i6 > i10) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            return f(i11);
        }

        @Override // com.google.common.collect.m
        public final m b(Object obj, Object obj2, k0 k0Var) {
            return f(k0Var.compare(obj, obj2));
        }

        @Override // com.google.common.collect.m
        public final m c(boolean z10, boolean z11) {
            int i6;
            if (z10 == z11) {
                i6 = 0;
            } else if (z10) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            return f(i6);
        }

        @Override // com.google.common.collect.m
        public final m d(boolean z10, boolean z11) {
            int i6;
            if (z11 == z10) {
                i6 = 0;
            } else if (z11) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            return f(i6);
        }

        @Override // com.google.common.collect.m
        public final int e() {
            return 0;
        }
    }

    public abstract m a(int i6, int i10);

    public abstract m b(Object obj, Object obj2, k0 k0Var);

    public abstract m c(boolean z10, boolean z11);

    public abstract m d(boolean z10, boolean z11);

    public abstract int e();

    /* compiled from: ComparisonChain.java */
    /* loaded from: classes.dex */
    public static final class b extends m {

        /* renamed from: d  reason: collision with root package name */
        public final int f9418d;

        public b(int i6) {
            this.f9418d = i6;
        }

        @Override // com.google.common.collect.m
        public final int e() {
            return this.f9418d;
        }

        @Override // com.google.common.collect.m
        public final m a(int i6, int i10) {
            return this;
        }

        @Override // com.google.common.collect.m
        public final m c(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.m
        public final m d(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.m
        public final m b(Object obj, Object obj2, k0 k0Var) {
            return this;
        }
    }
}
