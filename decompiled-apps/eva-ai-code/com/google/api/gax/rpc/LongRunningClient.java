package com.google.api.gax.rpc;

import com.google.api.core.BetaApi;
import com.google.api.gax.longrunning.OperationSnapshot;
@BetaApi("The surface for long-running operations is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public interface LongRunningClient {
    UnaryCallable<String, Void> cancelOperationCallable();

    UnaryCallable<String, Void> deleteOperationCallable();

    UnaryCallable<String, OperationSnapshot> getOperationCallable();
}
