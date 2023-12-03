package at;

import java.util.Comparator;
/* compiled from: KDeclarationContainerImpl.kt */
/* loaded from: classes2.dex */
public final class r<T> implements Comparator {

    /* renamed from: u  reason: collision with root package name */
    public static final r<T> f3596u = new r<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer b10 = gt.p.b((gt.q) obj, (gt.q) obj2);
        if (b10 == null) {
            return 0;
        }
        return b10.intValue();
    }
}
