package gv;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: Strings.kt */
/* loaded from: classes2.dex */
public final class b implements fv.h<xs.f> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f16931a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16932b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16933c;

    /* renamed from: d  reason: collision with root package name */
    public final ss.p<CharSequence, Integer, hs.f<Integer, Integer>> f16934d;

    /* compiled from: Strings.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<xs.f>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public int f16935u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f16936v;

        /* renamed from: w  reason: collision with root package name */
        public int f16937w;

        /* renamed from: x  reason: collision with root package name */
        public xs.f f16938x;

        /* renamed from: y  reason: collision with root package name */
        public int f16939y;

        public a() {
            int i6 = b.this.f16932b;
            int length = b.this.f16931a.length();
            if (length >= 0) {
                if (i6 < 0) {
                    i6 = 0;
                } else if (i6 > length) {
                    i6 = length;
                }
                this.f16936v = i6;
                this.f16937w = i6;
                return;
            }
            throw new IllegalArgumentException(defpackage.c.q("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r6 < r3) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            int i6 = this.f16937w;
            int i10 = 0;
            if (i6 < 0) {
                this.f16935u = 0;
                this.f16938x = null;
                return;
            }
            b bVar = b.this;
            int i11 = bVar.f16933c;
            if (i11 > 0) {
                int i12 = this.f16939y + 1;
                this.f16939y = i12;
            }
            if (i6 <= bVar.f16931a.length()) {
                hs.f<Integer, Integer> invoke = bVar.f16934d.invoke(bVar.f16931a, Integer.valueOf(this.f16937w));
                if (invoke == null) {
                    this.f16938x = new xs.f(this.f16936v, r.K0(bVar.f16931a));
                    this.f16937w = -1;
                } else {
                    int intValue = invoke.f19464u.intValue();
                    int intValue2 = invoke.f19465v.intValue();
                    this.f16938x = kotlin.jvm.internal.h.k0(this.f16936v, intValue);
                    int i13 = intValue + intValue2;
                    this.f16936v = i13;
                    if (intValue2 == 0) {
                        i10 = 1;
                    }
                    this.f16937w = i13 + i10;
                }
                this.f16935u = 1;
            }
            this.f16938x = new xs.f(this.f16936v, r.K0(bVar.f16931a));
            this.f16937w = -1;
            this.f16935u = 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f16935u == -1) {
                a();
            }
            if (this.f16935u == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (this.f16935u == -1) {
                a();
            }
            if (this.f16935u != 0) {
                xs.f fVar = this.f16938x;
                kotlin.jvm.internal.i.e(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f16938x = null;
                this.f16935u = -1;
                return fVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence input, int i6, int i10, ss.p<? super CharSequence, ? super Integer, hs.f<Integer, Integer>> pVar) {
        kotlin.jvm.internal.i.g(input, "input");
        this.f16931a = input;
        this.f16932b = i6;
        this.f16933c = i10;
        this.f16934d = pVar;
    }

    @Override // fv.h
    public final java.util.Iterator<xs.f> iterator() {
        return new a();
    }
}
