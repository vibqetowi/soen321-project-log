package io.grpc.internal;

import java.io.InputStream;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public interface StreamListener {

    /* loaded from: classes4.dex */
    public interface MessageProducer {
        @Nullable
        InputStream next();
    }

    void messagesAvailable(MessageProducer messageProducer);

    void onReady();
}
