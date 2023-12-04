package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.common.collect.ImmutableList;
import io.opencensus.contrib.http.util.HttpPropagationUtil;
import io.opencensus.trace.BlankSpan;
import io.opencensus.trace.EndSpanOptions;
import io.opencensus.trace.MessageEvent;
import io.opencensus.trace.Span;
import io.opencensus.trace.Status;
import io.opencensus.trace.Tracer;
import io.opencensus.trace.Tracing;
import io.opencensus.trace.propagation.TextFormat;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
/* loaded from: classes7.dex */
public class OpenCensusUtils {
    @Nullable
    static volatile TextFormat propagationTextFormat;
    @Nullable
    static volatile TextFormat.Setter propagationTextFormatSetter;
    private static final Logger logger = Logger.getLogger(OpenCensusUtils.class.getName());
    public static final String SPAN_NAME_HTTP_REQUEST_EXECUTE = "Sent." + HttpRequest.class.getName() + ".execute";
    private static final Tracer tracer = Tracing.getTracer();
    private static final AtomicLong idGenerator = new AtomicLong();
    private static volatile boolean isRecordEvent = true;

    static {
        propagationTextFormat = null;
        propagationTextFormatSetter = null;
        try {
            propagationTextFormat = HttpPropagationUtil.getCloudTraceFormat();
            propagationTextFormatSetter = new TextFormat.Setter<HttpHeaders>() { // from class: com.google.api.client.http.OpenCensusUtils.1
                @Override // io.opencensus.trace.propagation.TextFormat.Setter
                public void put(HttpHeaders httpHeaders, String str, String str2) {
                    httpHeaders.set(str, (Object) str2);
                }
            };
        } catch (Exception e) {
            logger.log(Level.WARNING, "Cannot initialize default OpenCensus HTTP propagation text format.", (Throwable) e);
        }
        try {
            Tracing.getExportComponent().getSampledSpanStore().registerSpanNamesForCollection(ImmutableList.of(SPAN_NAME_HTTP_REQUEST_EXECUTE));
        } catch (Exception e2) {
            logger.log(Level.WARNING, "Cannot register default OpenCensus span names for collection.", (Throwable) e2);
        }
    }

    public static void setPropagationTextFormat(@Nullable TextFormat textFormat) {
        propagationTextFormat = textFormat;
    }

    public static void setPropagationTextFormatSetter(@Nullable TextFormat.Setter setter) {
        propagationTextFormatSetter = setter;
    }

    public static void setIsRecordEvent(boolean z) {
        isRecordEvent = z;
    }

    public static Tracer getTracer() {
        return tracer;
    }

    public static boolean isRecordEvent() {
        return isRecordEvent;
    }

    public static void propagateTracingContext(Span span, HttpHeaders httpHeaders) {
        Preconditions.checkArgument(span != null, "span should not be null.");
        Preconditions.checkArgument(httpHeaders != null, "headers should not be null.");
        if (propagationTextFormat == null || propagationTextFormatSetter == null || span.equals(BlankSpan.INSTANCE)) {
            return;
        }
        propagationTextFormat.inject(span.getContext(), httpHeaders, propagationTextFormatSetter);
    }

    public static EndSpanOptions getEndSpanOptions(@Nullable Integer num) {
        EndSpanOptions.Builder builder = EndSpanOptions.builder();
        if (num == null) {
            builder.setStatus(Status.UNKNOWN);
        } else if (!HttpStatusCodes.isSuccess(num.intValue())) {
            int intValue = num.intValue();
            if (intValue == 400) {
                builder.setStatus(Status.INVALID_ARGUMENT);
            } else if (intValue == 401) {
                builder.setStatus(Status.UNAUTHENTICATED);
            } else if (intValue == 403) {
                builder.setStatus(Status.PERMISSION_DENIED);
            } else if (intValue == 404) {
                builder.setStatus(Status.NOT_FOUND);
            } else if (intValue == 412) {
                builder.setStatus(Status.FAILED_PRECONDITION);
            } else if (intValue == 500) {
                builder.setStatus(Status.UNAVAILABLE);
            } else {
                builder.setStatus(Status.UNKNOWN);
            }
        } else {
            builder.setStatus(Status.OK);
        }
        return builder.build();
    }

    public static void recordSentMessageEvent(Span span, long j) {
        recordMessageEvent(span, j, MessageEvent.Type.SENT);
    }

    public static void recordReceivedMessageEvent(Span span, long j) {
        recordMessageEvent(span, j, MessageEvent.Type.RECEIVED);
    }

    static void recordMessageEvent(Span span, long j, MessageEvent.Type type) {
        Preconditions.checkArgument(span != null, "span should not be null.");
        if (j < 0) {
            j = 0;
        }
        span.addMessageEvent(MessageEvent.builder(type, idGenerator.getAndIncrement()).setUncompressedMessageSize(j).build());
    }

    private OpenCensusUtils() {
    }
}
