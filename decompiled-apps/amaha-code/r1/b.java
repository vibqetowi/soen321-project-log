package r1;

import android.media.MediaRoute2Info;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30213a;

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f30213a) {
            case 0:
                return Objects.requireNonNull(predicate);
            case 1:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f30213a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f30213a) {
            case 0:
                return Objects.requireNonNull(predicate);
            case 1:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean isSystemRoute;
        switch (this.f30213a) {
            case 0:
                isSystemRoute = ((MediaRoute2Info) obj).isSystemRoute();
                return !isSystemRoute;
            case 1:
                return Objects.nonNull((e) obj);
            default:
                return Objects.nonNull((MediaRoute2Info) obj);
        }
    }
}
