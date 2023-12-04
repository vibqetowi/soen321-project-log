package com.google.api.gax.retrying;

import com.google.api.core.BetaApi;
import com.google.common.base.Preconditions;
import java.util.concurrent.CancellationException;
/* loaded from: classes7.dex */
public class RetryAlgorithm<ResponseT> {
    private final ResultRetryAlgorithm<ResponseT> resultAlgorithm;
    private final TimedRetryAlgorithm timedAlgorithm;

    public RetryAlgorithm(ResultRetryAlgorithm<ResponseT> resultRetryAlgorithm, TimedRetryAlgorithm timedRetryAlgorithm) {
        this.resultAlgorithm = (ResultRetryAlgorithm) Preconditions.checkNotNull(resultRetryAlgorithm);
        this.timedAlgorithm = (TimedRetryAlgorithm) Preconditions.checkNotNull(timedRetryAlgorithm);
    }

    public TimedAttemptSettings createFirstAttempt() {
        return this.timedAlgorithm.createFirstAttempt();
    }

    public TimedAttemptSettings createNextAttempt(Throwable th, ResponseT responset, TimedAttemptSettings timedAttemptSettings) {
        if (this.resultAlgorithm.shouldRetry(th, responset)) {
            TimedAttemptSettings createNextAttempt = this.resultAlgorithm.createNextAttempt(th, responset, timedAttemptSettings);
            return createNextAttempt == null ? this.timedAlgorithm.createNextAttempt(timedAttemptSettings) : createNextAttempt;
        }
        return null;
    }

    public boolean shouldRetry(Throwable th, ResponseT responset, TimedAttemptSettings timedAttemptSettings) throws CancellationException {
        return this.resultAlgorithm.shouldRetry(th, responset) && timedAttemptSettings != null && this.timedAlgorithm.shouldRetry(timedAttemptSettings);
    }

    @BetaApi("Surface for inspecting the a RetryAlgorithm is not yet stable")
    public ResultRetryAlgorithm<ResponseT> getResultAlgorithm() {
        return this.resultAlgorithm;
    }

    @BetaApi("Surface for inspecting the a RetryAlgorithm is not yet stable")
    public TimedRetryAlgorithm getTimedAlgorithm() {
        return this.timedAlgorithm;
    }
}
