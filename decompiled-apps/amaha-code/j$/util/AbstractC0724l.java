package j$.util;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
/* renamed from: j$.util.l  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0724l {
    public static Optional a(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.d(optional.get()) : Optional.a();
    }

    public static C0725m b(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C0725m.d(optionalDouble.getAsDouble()) : C0725m.a();
    }

    public static C0726n c(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? C0726n.d(optionalInt.getAsInt()) : C0726n.a();
    }

    public static C0727o d(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C0727o.d(optionalLong.getAsLong()) : C0727o.a();
    }

    public static java.util.Optional e(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.c() ? java.util.Optional.of(optional.b()) : java.util.Optional.empty();
    }

    public static OptionalDouble f(C0725m c0725m) {
        if (c0725m == null) {
            return null;
        }
        return c0725m.c() ? OptionalDouble.of(c0725m.b()) : OptionalDouble.empty();
    }

    public static OptionalInt g(C0726n c0726n) {
        if (c0726n == null) {
            return null;
        }
        return c0726n.c() ? OptionalInt.of(c0726n.b()) : OptionalInt.empty();
    }

    public static OptionalLong h(C0727o c0727o) {
        if (c0727o == null) {
            return null;
        }
        return c0727o.c() ? OptionalLong.of(c0727o.b()) : OptionalLong.empty();
    }
}
