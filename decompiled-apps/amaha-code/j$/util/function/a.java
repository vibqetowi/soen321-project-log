package j$.util.function;

import j$.time.AbstractC0689a;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements BinaryOperator, Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21209a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f21210b;

    public /* synthetic */ a(Object obj, int i6) {
        this.f21209a = i6;
        this.f21210b = obj;
    }

    public final /* synthetic */ BiFunction a(Function function) {
        switch (this.f21209a) {
            case 0:
                return AbstractC0689a.b(this, function);
            default:
                return AbstractC0689a.b(this, function);
        }
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i6 = this.f21209a;
        Object obj3 = this.f21210b;
        switch (i6) {
            case 0:
                return ((Comparator) obj3).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((Comparator) obj3).compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return !((Predicate) this.f21210b).test(obj);
    }
}
