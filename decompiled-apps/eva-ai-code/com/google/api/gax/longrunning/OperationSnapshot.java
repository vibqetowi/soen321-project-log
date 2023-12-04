package com.google.api.gax.longrunning;

import com.google.api.core.BetaApi;
import com.google.api.gax.rpc.StatusCode;
@BetaApi("The surface for long-running operations is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public interface OperationSnapshot {
    StatusCode getErrorCode();

    String getErrorMessage();

    Object getMetadata();

    String getName();

    Object getResponse();

    boolean isDone();
}
