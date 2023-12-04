package com.google.api.gax.batching;

import com.google.api.core.BetaApi;
import com.google.common.base.Preconditions;
import javax.annotation.Nullable;
@BetaApi("The surface for batching is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public class FlowController {
    @Nullable
    private final Long maxOutstandingElementCount;
    @Nullable
    private final Long maxOutstandingRequestBytes;
    @Nullable
    private final Semaphore64 outstandingByteCount;
    @Nullable
    private final Semaphore64 outstandingElementCount;

    @BetaApi
    /* loaded from: classes7.dex */
    public enum LimitExceededBehavior {
        ThrowException,
        Block,
        Ignore
    }

    /* loaded from: classes7.dex */
    public static abstract class FlowControlException extends Exception {
        /* synthetic */ FlowControlException(AnonymousClass1 anonymousClass1) {
            this();
        }

        private FlowControlException() {
        }
    }

    @BetaApi
    /* loaded from: classes7.dex */
    public static class FlowControlRuntimeException extends RuntimeException {
        private FlowControlRuntimeException(FlowControlException flowControlException) {
            super(flowControlException);
        }

        public static FlowControlRuntimeException fromFlowControlException(FlowControlException flowControlException) {
            return new FlowControlRuntimeException(flowControlException);
        }
    }

    @BetaApi
    /* loaded from: classes7.dex */
    public static final class MaxOutstandingElementCountReachedException extends FlowControlException {
        private final long currentMaxElementCount;

        public MaxOutstandingElementCountReachedException(long j) {
            super(null);
            this.currentMaxElementCount = j;
        }

        public long getCurrentMaxBatchElementCount() {
            return this.currentMaxElementCount;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return String.format("The maximum number of batch elements: %d have been reached.", Long.valueOf(this.currentMaxElementCount));
        }
    }

    @BetaApi
    /* loaded from: classes7.dex */
    public static final class MaxOutstandingRequestBytesReachedException extends FlowControlException {
        private final long currentMaxBytes;

        public MaxOutstandingRequestBytesReachedException(long j) {
            super(null);
            this.currentMaxBytes = j;
        }

        public long getCurrentMaxBatchBytes() {
            return this.currentMaxBytes;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return String.format("The maximum number of batch bytes: %d have been reached.", Long.valueOf(this.currentMaxBytes));
        }
    }

    public FlowController(FlowControlSettings flowControlSettings) {
        int i = AnonymousClass1.$SwitchMap$com$google$api$gax$batching$FlowController$LimitExceededBehavior[flowControlSettings.getLimitExceededBehavior().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                this.maxOutstandingElementCount = null;
                this.maxOutstandingRequestBytes = null;
                this.outstandingElementCount = null;
                this.outstandingByteCount = null;
                return;
            }
            throw new IllegalArgumentException("Unknown LimitBehaviour: " + flowControlSettings.getLimitExceededBehavior());
        }
        Long maxOutstandingElementCount = flowControlSettings.getMaxOutstandingElementCount();
        this.maxOutstandingElementCount = maxOutstandingElementCount;
        if (maxOutstandingElementCount == null) {
            this.outstandingElementCount = null;
        } else if (flowControlSettings.getLimitExceededBehavior() == LimitExceededBehavior.Block) {
            this.outstandingElementCount = new BlockingSemaphore(maxOutstandingElementCount.longValue());
        } else {
            this.outstandingElementCount = new NonBlockingSemaphore(maxOutstandingElementCount.longValue());
        }
        Long maxOutstandingRequestBytes = flowControlSettings.getMaxOutstandingRequestBytes();
        this.maxOutstandingRequestBytes = maxOutstandingRequestBytes;
        if (maxOutstandingRequestBytes == null) {
            this.outstandingByteCount = null;
        } else if (flowControlSettings.getLimitExceededBehavior() == LimitExceededBehavior.Block) {
            this.outstandingByteCount = new BlockingSemaphore(maxOutstandingRequestBytes.longValue());
        } else {
            this.outstandingByteCount = new NonBlockingSemaphore(maxOutstandingRequestBytes.longValue());
        }
    }

    /* renamed from: com.google.api.gax.batching.FlowController$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$api$gax$batching$FlowController$LimitExceededBehavior;

        static {
            int[] iArr = new int[LimitExceededBehavior.values().length];
            $SwitchMap$com$google$api$gax$batching$FlowController$LimitExceededBehavior = iArr;
            try {
                iArr[LimitExceededBehavior.ThrowException.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$api$gax$batching$FlowController$LimitExceededBehavior[LimitExceededBehavior.Block.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$api$gax$batching$FlowController$LimitExceededBehavior[LimitExceededBehavior.Ignore.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void reserve(long j, long j2) throws FlowControlException {
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkArgument(j2 >= 0);
        Semaphore64 semaphore64 = this.outstandingElementCount;
        if (semaphore64 != null && !semaphore64.acquire(j)) {
            throw new MaxOutstandingElementCountReachedException(this.maxOutstandingElementCount.longValue());
        }
        if (this.outstandingByteCount != null) {
            if (this.outstandingByteCount.acquire(Math.min(j2, this.maxOutstandingRequestBytes.longValue()))) {
                return;
            }
            Semaphore64 semaphore642 = this.outstandingElementCount;
            if (semaphore642 != null) {
                semaphore642.release(j);
            }
            throw new MaxOutstandingRequestBytesReachedException(this.maxOutstandingRequestBytes.longValue());
        }
    }

    public void release(long j, long j2) {
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkArgument(j2 >= 0);
        Semaphore64 semaphore64 = this.outstandingElementCount;
        if (semaphore64 != null) {
            semaphore64.release(j);
        }
        if (this.outstandingByteCount != null) {
            this.outstandingByteCount.release(Math.min(j2, this.maxOutstandingRequestBytes.longValue()));
        }
    }
}
