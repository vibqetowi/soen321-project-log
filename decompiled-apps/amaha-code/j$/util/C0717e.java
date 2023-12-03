package j$.util;

import java.io.Serializable;
import java.util.function.Function;
/* renamed from: j$.util.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0717e implements java.util.Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21196a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f21197b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f21198c;

    public /* synthetic */ C0717e(java.util.Comparator comparator, Object obj, int i6) {
        this.f21196a = i6;
        this.f21197b = comparator;
        this.f21198c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i6 = this.f21196a;
        java.util.Comparator comparator = this.f21197b;
        Object obj3 = this.f21198c;
        switch (i6) {
            case 0:
                java.util.Comparator comparator2 = (java.util.Comparator) obj3;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Function function = (Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
