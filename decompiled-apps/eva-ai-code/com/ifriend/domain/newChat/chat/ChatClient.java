package com.ifriend.domain.newChat.chat;

import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.EventHandler;
import com.ifriend.common_entities_engine.System;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatClient.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/ifriend/domain/newChat/chat/ChatClient;", "Lcom/ifriend/common_entities_engine/EventHandler;", "expandWithSystemsChain", "", "chain", "", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "getState", "Lkotlinx/coroutines/flow/StateFlow;", "launch", "pause", "refresh", "resume", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatClient extends EventHandler {
    void expandWithSystemsChain(List<? extends System<EntitiesState>> list);

    StateFlow<EntitiesState> getState();

    void launch();

    void pause();

    void refresh();

    void resume();
}
