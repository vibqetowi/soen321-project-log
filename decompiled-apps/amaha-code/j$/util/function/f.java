package j$.util.function;

import java.util.function.Predicate;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21220a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Predicate f21221b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Predicate f21222c;

    public /* synthetic */ f(Predicate predicate, Predicate predicate2, int i6) {
        this.f21220a = i6;
        this.f21221b = predicate;
        this.f21222c = predicate2;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f21220a) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f21220a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f21220a) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i6 = this.f21220a;
        Predicate predicate = this.f21222c;
        Predicate predicate2 = this.f21221b;
        switch (i6) {
            case 0:
                return predicate2.test(obj) && predicate.test(obj);
            default:
                return predicate2.test(obj) || predicate.test(obj);
        }
    }
}
