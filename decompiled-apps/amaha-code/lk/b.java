package lk;

import hs.f;
import is.k;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class b<T> implements Comparator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String[] f24398u;

    public b(String[] strArr) {
        this.f24398u = strArr;
    }

    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        B b10 = ((f) t3).f19465v;
        String[] strArr = this.f24398u;
        return sp.b.g(Integer.valueOf(k.W1(b10, strArr)), Integer.valueOf(k.W1(((f) t10).f19465v, strArr)));
    }
}
