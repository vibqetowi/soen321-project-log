package fv;

import java.util.Iterator;
/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public class k extends kotlin.jvm.internal.h {

    /* compiled from: Sequences.kt */
    /* loaded from: classes2.dex */
    public static final class a implements h<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterator f15983a;

        public a(Iterator it) {
            this.f15983a = it;
        }

        @Override // fv.h
        public final Iterator<T> iterator() {
            return this.f15983a;
        }
    }

    public static final <T> h<T> u0(Iterator<? extends T> it) {
        kotlin.jvm.internal.i.g(it, "<this>");
        return v0(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> h<T> v0(h<? extends T> hVar) {
        if (!(hVar instanceof fv.a)) {
            return new fv.a(hVar);
        }
        return hVar;
    }

    public static final f w0(h hVar) {
        boolean z10 = hVar instanceof v;
        l iterator = l.f15984u;
        if (z10) {
            v vVar = (v) hVar;
            kotlin.jvm.internal.i.g(iterator, "iterator");
            return new f(vVar.f15997a, vVar.f15998b, iterator);
        }
        return new f(hVar, m.f15985u, iterator);
    }

    public static final h x0(ss.l nextFunction, Object obj) {
        kotlin.jvm.internal.i.g(nextFunction, "nextFunction");
        if (obj == null) {
            return d.f15960a;
        }
        return new g(new o(obj), nextFunction);
    }

    public static final <T> h<T> y0(T... tArr) {
        boolean z10;
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return d.f15960a;
        }
        return is.k.P1(tArr);
    }
}
