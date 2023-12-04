package io.opencensus.trace.unsafe;

import io.grpc.Context;
import io.opencensus.internal.Utils;
import io.opencensus.trace.BlankSpan;
import io.opencensus.trace.Span;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public final class ContextUtils {
    private static final Context.Key<Span> CONTEXT_SPAN_KEY = Context.key("opencensus-trace-span-key");

    private ContextUtils() {
    }

    public static Context withValue(Context context, @Nullable Span span) {
        return ((Context) Utils.checkNotNull(context, "context")).withValue(CONTEXT_SPAN_KEY, span);
    }

    public static Span getValue(Context context) {
        Span span = CONTEXT_SPAN_KEY.get((Context) Utils.checkNotNull(context, "context"));
        return span == null ? BlankSpan.INSTANCE : span;
    }
}
