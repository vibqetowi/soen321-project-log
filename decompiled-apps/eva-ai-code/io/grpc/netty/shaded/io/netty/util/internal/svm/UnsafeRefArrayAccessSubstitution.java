package io.grpc.netty.shaded.io.netty.util.internal.svm;

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.RecomputeFieldValue;
import com.oracle.svm.core.annotate.TargetClass;
@TargetClass(className = "io.grpc.netty.shaded.io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess")
/* loaded from: classes4.dex */
final class UnsafeRefArrayAccessSubstitution {
    @RecomputeFieldValue(declClass = Object[].class, kind = RecomputeFieldValue.Kind.ArrayIndexShift)
    @Alias
    public static int REF_ELEMENT_SHIFT;

    private UnsafeRefArrayAccessSubstitution() {
    }
}
