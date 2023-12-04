package com.ifriend.domain.newChat.chat.systems.messages.history.loadMore;

import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.newChat.chat.systems.distinct.UniqueComponent;
import com.ifriend.domain.newChat.chat.systems.sorting.SortComponent;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LoadMoreSystem.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"createLoadMoreEntity", "Lcom/ifriend/common_entities_engine/Entity;", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadMoreSystemKt {
    public static final Entity createLoadMoreEntity() {
        return new Entity(SetsKt.mutableSetOf(LoadMoreComponent.INSTANCE, new UniqueComponent("LoadMoreComponent"), SortComponent.LoadMore.INSTANCE));
    }
}
