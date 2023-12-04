package com.ifriend.common_utils.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: сommon.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000b\u001a\u0011\u0010\t\u001a\u00020\u0002*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\f\u001a\u0011\u0010\t\u001a\u00020\u0004*\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\r\u001a\u0011\u0010\t\u001a\u00020\u000e*\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"isEmpty", "", "", "(Ljava/lang/Float;)Z", "", "(Ljava/lang/Integer;)Z", "orFalse", "(Ljava/lang/Boolean;)Z", "orTrue", "orZero", "", "(Ljava/lang/Double;)D", "(Ljava/lang/Float;)F", "(Ljava/lang/Integer;)I", "", "(Ljava/lang/Long;)J", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.common_utils.extensions.СommonKt  reason: invalid class name */
/* loaded from: classes6.dex */
public final class ommonKt {
    public static final boolean orFalse(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean orTrue(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final double orZero(Double d) {
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public static final int orZero(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final float orZero(Float f) {
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public static final long orZero(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final boolean isEmpty(Float f) {
        return f == null || Intrinsics.areEqual(f, 0.0f);
    }

    public static final boolean isEmpty(Integer num) {
        return num == null || num.intValue() == 0;
    }
}
