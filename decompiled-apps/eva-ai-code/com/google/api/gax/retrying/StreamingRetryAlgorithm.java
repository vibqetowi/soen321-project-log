package com.google.api.gax.retrying;

import com.google.api.core.InternalApi;
import java.util.concurrent.CancellationException;
@InternalApi("For internal use only")
/* loaded from: classes7.dex */
public final class StreamingRetryAlgorithm<ResponseT> extends RetryAlgorithm<ResponseT> {
    public StreamingRetryAlgorithm(ResultRetryAlgorithm<ResponseT> resultRetryAlgorithm, TimedRetryAlgorithm timedRetryAlgorithm) {
        super(resultRetryAlgorithm, timedRetryAlgorithm);
    }

    @Override // com.google.api.gax.retrying.RetryAlgorithm
    public TimedAttemptSettings createNextAttempt(Throwable th, ResponseT responset, TimedAttemptSettings timedAttemptSettings) {
        if (th instanceof ServerStreamingAttemptException) {
            ServerStreamingAttemptException serverStreamingAttemptException = (ServerStreamingAttemptException) th;
            th = th.getCause();
            if (serverStreamingAttemptException.hasSeenResponses()) {
                timedAttemptSettings = createFirstAttempt().toBuilder().setFirstAttemptStartTimeNanos(timedAttemptSettings.getFirstAttemptStartTimeNanos()).setOverallAttemptCount(timedAttemptSettings.getOverallAttemptCount()).build();
            }
        }
        return super.createNextAttempt(th, responset, timedAttemptSettings);
    }

    @Override // com.google.api.gax.retrying.RetryAlgorithm
    public boolean shouldRetry(Throwable th, ResponseT responset, TimedAttemptSettings timedAttemptSettings) throws CancellationException {
        if (th instanceof ServerStreamingAttemptException) {
            ServerStreamingAttemptException serverStreamingAttemptException = (ServerStreamingAttemptException) th;
            th = th.getCause();
            if (!serverStreamingAttemptException.canResume()) {
                return false;
            }
        }
        return super.shouldRetry(th, responset, timedAttemptSettings);
    }
}
