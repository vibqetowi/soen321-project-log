package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.logging.Logging;
/* loaded from: classes2.dex */
public final class ForcedSender {
    private static final String LOG_TAG = "ForcedSender";

    public static void sendBlocking(Transport<?> transport, Priority priority) {
        if (transport instanceof TransportImpl) {
            TransportRuntime.getInstance().getUploader().logAndUpdateState(((TransportImpl) transport).getTransportContext().withPriority(priority), 1);
            return;
        }
        Logging.w(LOG_TAG, "Expected instance of `TransportImpl`, got `%s`.", transport);
    }

    private ForcedSender() {
    }
}
