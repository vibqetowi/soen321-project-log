package com.ifriend.domain.newChat.chat;

import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.System;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatClientImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/newChat/chat/TriggerStateUpdateSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "()V", "triggerStateUpdate", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TriggerStateUpdateSystem extends System<EntitiesState> {
    public final void triggerStateUpdate() {
        reportUpdateState();
    }
}
