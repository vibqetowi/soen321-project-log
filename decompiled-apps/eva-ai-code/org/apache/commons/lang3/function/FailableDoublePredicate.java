package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableDoublePredicate;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableDoublePredicate<E extends Throwable> {
    public static final FailableDoublePredicate FALSE = new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda2
        @Override // org.apache.commons.lang3.function.FailableDoublePredicate
        public /* synthetic */ FailableDoublePredicate and(FailableDoublePredicate failableDoublePredicate) {
            return Objects.requireNonNull(failableDoublePredicate);
        }

        @Override // org.apache.commons.lang3.function.FailableDoublePredicate
        public /* synthetic */ FailableDoublePredicate negate() {
            return FailableDoublePredicate.CC.$default$negate(this);
        }

        @Override // org.apache.commons.lang3.function.FailableDoublePredicate
        public /* synthetic */ FailableDoublePredicate or(FailableDoublePredicate failableDoublePredicate) {
            return Objects.requireNonNull(failableDoublePredicate);
        }

        @Override // org.apache.commons.lang3.function.FailableDoublePredicate
        public final boolean test(double d) {
            return FailableDoublePredicate.CC.lambda$static$0(d);
        }
    };
    public static final FailableDoublePredicate TRUE = new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda3
        @Override // org.apache.commons.lang3.function.FailableDoublePredicate
        public /* synthetic */ FailableDoublePredicate and(FailableDoublePredicate failableDoublePredicate) {
            return Objects.requireNonNull(failableDoublePredicate);
        }

        @Override // org.apache.commons.lang3.function.FailableDoublePredicate
        public /* synthetic */ FailableDoublePredicate negate() {
            return FailableDoublePredicate.CC.$default$negate(this);
        }

        @Override // org.apache.commons.lang3.function.FailableDoublePredicate
        public /* synthetic */ FailableDoublePredicate or(FailableDoublePredicate failableDoublePredicate) {
            return Objects.requireNonNull(failableDoublePredicate);
        }

        @Override // org.apache.commons.lang3.function.FailableDoublePredicate
        public final boolean test(double d) {
            return FailableDoublePredicate.CC.lambda$static$1(d);
        }
    };

    FailableDoublePredicate<E> and(FailableDoublePredicate<E> failableDoublePredicate);

    FailableDoublePredicate<E> negate();

    FailableDoublePredicate<E> or(FailableDoublePredicate<E> failableDoublePredicate);

    boolean test(double d) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableDoublePredicate$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableDoublePredicate failableDoublePredicate = FailableDoublePredicate.FALSE;
        }

        public static /* synthetic */ boolean lambda$static$0(double d) throws Throwable {
            return false;
        }

        public static /* synthetic */ boolean lambda$static$1(double d) throws Throwable {
            return true;
        }

        public static <E extends Throwable> FailableDoublePredicate<E> falsePredicate() {
            return FailableDoublePredicate.FALSE;
        }

        public static <E extends Throwable> FailableDoublePredicate<E> truePredicate() {
            return FailableDoublePredicate.TRUE;
        }

        public static /* synthetic */ boolean $private$lambda$and$2(FailableDoublePredicate _this, FailableDoublePredicate failableDoublePredicate, double d) throws Throwable {
            return _this.test(d) && failableDoublePredicate.test(d);
        }

        public static FailableDoublePredicate $default$negate(final FailableDoublePredicate _this) {
            return new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda1
                @Override // org.apache.commons.lang3.function.FailableDoublePredicate
                public /* synthetic */ FailableDoublePredicate and(FailableDoublePredicate failableDoublePredicate) {
                    return Objects.requireNonNull(failableDoublePredicate);
                }

                @Override // org.apache.commons.lang3.function.FailableDoublePredicate
                public /* synthetic */ FailableDoublePredicate negate() {
                    return FailableDoublePredicate.CC.$default$negate(this);
                }

                @Override // org.apache.commons.lang3.function.FailableDoublePredicate
                public /* synthetic */ FailableDoublePredicate or(FailableDoublePredicate failableDoublePredicate) {
                    return Objects.requireNonNull(failableDoublePredicate);
                }

                @Override // org.apache.commons.lang3.function.FailableDoublePredicate
                public final boolean test(double d) {
                    return FailableDoublePredicate.CC.$private$lambda$negate$3(FailableDoublePredicate.this, d);
                }
            };
        }

        public static /* synthetic */ boolean $private$lambda$negate$3(FailableDoublePredicate _this, double d) throws Throwable {
            return !_this.test(d);
        }

        public static /* synthetic */ boolean $private$lambda$or$4(FailableDoublePredicate _this, FailableDoublePredicate failableDoublePredicate, double d) throws Throwable {
            return _this.test(d) || failableDoublePredicate.test(d);
        }
    }
}
