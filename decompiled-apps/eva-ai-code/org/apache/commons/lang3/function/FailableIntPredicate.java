package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableIntPredicate;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableIntPredicate<E extends Throwable> {
    public static final FailableIntPredicate FALSE = new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda1
        @Override // org.apache.commons.lang3.function.FailableIntPredicate
        public /* synthetic */ FailableIntPredicate and(FailableIntPredicate failableIntPredicate) {
            return Objects.requireNonNull(failableIntPredicate);
        }

        @Override // org.apache.commons.lang3.function.FailableIntPredicate
        public /* synthetic */ FailableIntPredicate negate() {
            return FailableIntPredicate.CC.$default$negate(this);
        }

        @Override // org.apache.commons.lang3.function.FailableIntPredicate
        public /* synthetic */ FailableIntPredicate or(FailableIntPredicate failableIntPredicate) {
            return Objects.requireNonNull(failableIntPredicate);
        }

        @Override // org.apache.commons.lang3.function.FailableIntPredicate
        public final boolean test(int i) {
            return FailableIntPredicate.CC.lambda$static$0(i);
        }
    };
    public static final FailableIntPredicate TRUE = new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda2
        @Override // org.apache.commons.lang3.function.FailableIntPredicate
        public /* synthetic */ FailableIntPredicate and(FailableIntPredicate failableIntPredicate) {
            return Objects.requireNonNull(failableIntPredicate);
        }

        @Override // org.apache.commons.lang3.function.FailableIntPredicate
        public /* synthetic */ FailableIntPredicate negate() {
            return FailableIntPredicate.CC.$default$negate(this);
        }

        @Override // org.apache.commons.lang3.function.FailableIntPredicate
        public /* synthetic */ FailableIntPredicate or(FailableIntPredicate failableIntPredicate) {
            return Objects.requireNonNull(failableIntPredicate);
        }

        @Override // org.apache.commons.lang3.function.FailableIntPredicate
        public final boolean test(int i) {
            return FailableIntPredicate.CC.lambda$static$1(i);
        }
    };

    FailableIntPredicate<E> and(FailableIntPredicate<E> failableIntPredicate);

    FailableIntPredicate<E> negate();

    FailableIntPredicate<E> or(FailableIntPredicate<E> failableIntPredicate);

    boolean test(int i) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailableIntPredicate$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailableIntPredicate failableIntPredicate = FailableIntPredicate.FALSE;
        }

        public static /* synthetic */ boolean lambda$static$0(int i) throws Throwable {
            return false;
        }

        public static /* synthetic */ boolean lambda$static$1(int i) throws Throwable {
            return true;
        }

        public static <E extends Throwable> FailableIntPredicate<E> falsePredicate() {
            return FailableIntPredicate.FALSE;
        }

        public static <E extends Throwable> FailableIntPredicate<E> truePredicate() {
            return FailableIntPredicate.TRUE;
        }

        public static /* synthetic */ boolean $private$lambda$and$2(FailableIntPredicate _this, FailableIntPredicate failableIntPredicate, int i) throws Throwable {
            return _this.test(i) && failableIntPredicate.test(i);
        }

        public static FailableIntPredicate $default$negate(final FailableIntPredicate _this) {
            return new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda0
                @Override // org.apache.commons.lang3.function.FailableIntPredicate
                public /* synthetic */ FailableIntPredicate and(FailableIntPredicate failableIntPredicate) {
                    return Objects.requireNonNull(failableIntPredicate);
                }

                @Override // org.apache.commons.lang3.function.FailableIntPredicate
                public /* synthetic */ FailableIntPredicate negate() {
                    return FailableIntPredicate.CC.$default$negate(this);
                }

                @Override // org.apache.commons.lang3.function.FailableIntPredicate
                public /* synthetic */ FailableIntPredicate or(FailableIntPredicate failableIntPredicate) {
                    return Objects.requireNonNull(failableIntPredicate);
                }

                @Override // org.apache.commons.lang3.function.FailableIntPredicate
                public final boolean test(int i) {
                    return FailableIntPredicate.CC.$private$lambda$negate$3(FailableIntPredicate.this, i);
                }
            };
        }

        public static /* synthetic */ boolean $private$lambda$negate$3(FailableIntPredicate _this, int i) throws Throwable {
            return !_this.test(i);
        }

        public static /* synthetic */ boolean $private$lambda$or$4(FailableIntPredicate _this, FailableIntPredicate failableIntPredicate, int i) throws Throwable {
            return _this.test(i) || failableIntPredicate.test(i);
        }
    }
}
