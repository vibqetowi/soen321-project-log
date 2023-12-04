package com.google.api.gax.retrying;

import com.google.api.core.InternalApi;
@InternalApi
/* loaded from: classes7.dex */
public class ServerStreamingAttemptException extends RuntimeException {
    private final boolean canResume;
    private final boolean seenResponses;

    public ServerStreamingAttemptException(Throwable th, boolean z, boolean z2) {
        super(th.getMessage(), th);
        this.canResume = z;
        this.seenResponses = z2;
    }

    public boolean canResume() {
        return this.canResume;
    }

    public boolean hasSeenResponses() {
        return this.seenResponses;
    }
}
