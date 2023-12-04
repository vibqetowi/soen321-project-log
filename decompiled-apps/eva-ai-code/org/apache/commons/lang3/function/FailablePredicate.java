package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailablePredicate;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailablePredicate<T, E extends Throwable> {
    public static final FailablePredicate FALSE = new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda3
        @Override // org.apache.commons.lang3.function.FailablePredicate
        public /* synthetic */ FailablePredicate and(FailablePredicate failablePredicate) {
            return Objects.requireNonNull(failablePredicate);
        }

        @Override // org.apache.commons.lang3.function.FailablePredicate
        public /* synthetic */ FailablePredicate negate() {
            return FailablePredicate.CC.$default$negate(this);
        }

        @Override // org.apache.commons.lang3.function.FailablePredicate
        public /* synthetic */ FailablePredicate or(FailablePredicate failablePredicate) {
            return Objects.requireNonNull(failablePredicate);
        }

        @Override // org.apache.commons.lang3.function.FailablePredicate
        public final boolean test(Object obj) {
            return FailablePredicate.CC.lambda$static$0(obj);
        }
    };
    public static final FailablePredicate TRUE = new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda4
        @Override // org.apache.commons.lang3.function.FailablePredicate
        public /* synthetic */ FailablePredicate and(FailablePredicate failablePredicate) {
            return Objects.requireNonNull(failablePredicate);
        }

        @Override // org.apache.commons.lang3.function.FailablePredicate
        public /* synthetic */ FailablePredicate negate() {
            return FailablePredicate.CC.$default$negate(this);
        }

        @Override // org.apache.commons.lang3.function.FailablePredicate
        public /* synthetic */ FailablePredicate or(FailablePredicate failablePredicate) {
            return Objects.requireNonNull(failablePredicate);
        }

        @Override // org.apache.commons.lang3.function.FailablePredicate
        public final boolean test(Object obj) {
            return FailablePredicate.CC.lambda$static$1(obj);
        }
    };

    FailablePredicate<T, E> and(FailablePredicate<? super T, E> failablePredicate);

    FailablePredicate<T, E> negate();

    FailablePredicate<T, E> or(FailablePredicate<? super T, E> failablePredicate);

    boolean test(T t) throws Throwable;

    /* renamed from: org.apache.commons.lang3.function.FailablePredicate$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            FailablePredicate failablePredicate = FailablePredicate.FALSE;
        }

        public static /* synthetic */ boolean lambda$static$0(Object obj) throws Throwable {
            return false;
        }

        public static /* synthetic */ boolean lambda$static$1(Object obj) throws Throwable {
            return true;
        }

        public static <T, E extends Throwable> FailablePredicate<T, E> falsePredicate() {
            return FailablePredicate.FALSE;
        }

        public static <T, E extends Throwable> FailablePredicate<T, E> truePredicate() {
            return FailablePredicate.TRUE;
        }

        public static /* synthetic */ boolean $private$lambda$and$2(FailablePredicate _this, FailablePredicate failablePredicate, Object obj) throws Throwable {
            return _this.test(obj) && failablePredicate.test(obj);
        }

        public static FailablePredicate $default$negate(final FailablePredicate _this) {
            return new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda2
                @Override // org.apache.commons.lang3.function.FailablePredicate
                public /* synthetic */ FailablePredicate and(FailablePredicate failablePredicate) {
                    return Objects.requireNonNull(failablePredicate);
                }

                @Override // org.apache.commons.lang3.function.FailablePredicate
                public /* synthetic */ FailablePredicate negate() {
                    return FailablePredicate.CC.$default$negate(this);
                }

                @Override // org.apache.commons.lang3.function.FailablePredicate
                public /* synthetic */ FailablePredicate or(FailablePredicate failablePredicate) {
                    return Objects.requireNonNull(failablePredicate);
                }

                @Override // org.apache.commons.lang3.function.FailablePredicate
                public final boolean test(Object obj) {
                    return FailablePredicate.CC.$private$lambda$negate$3(FailablePredicate.this, obj);
                }
            };
        }

        public static /* synthetic */ boolean $private$lambda$negate$3(FailablePredicate _this, Object obj) throws Throwable {
            return !_this.test(obj);
        }

        public static /* synthetic */ boolean $private$lambda$or$4(FailablePredicate _this, FailablePredicate failablePredicate, Object obj) throws Throwable {
            return _this.test(obj) || failablePredicate.test(obj);
        }
    }
}
