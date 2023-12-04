package io.grpc.netty.shaded.io.netty.util.internal.svm;

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.RecomputeFieldValue;
import com.oracle.svm.core.annotate.TargetClass;
@TargetClass(className = "io.grpc.netty.shaded.io.netty.util.internal.CleanerJava6")
/* loaded from: classes4.dex */
final class CleanerJava6Substitution {
    @RecomputeFieldValue(declClassName = "java.nio.DirectByteBuffer", kind = RecomputeFieldValue.Kind.FieldOffset, name = "cleaner")
    @Alias
    private static long CLEANER_FIELD_OFFSET;

    private CleanerJava6Substitution() {
    }
}
