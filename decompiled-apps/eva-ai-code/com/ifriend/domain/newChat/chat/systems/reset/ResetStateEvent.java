package com.ifriend.domain.newChat.chat.systems.reset;

import com.ifriend.common_entities_engine.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ResetStateEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/reset/ResetStateEvent;", "Lcom/ifriend/common_entities_engine/Event;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetStateEvent implements Event {
    private final String reason;

    public ResetStateEvent(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
    }

    public final String getReason() {
        return this.reason;
    }
}
