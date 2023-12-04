package com.ifriend.domain.newChat.chat.systems.dateSeparator;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.newChat.chat.systems.distinct.UniqueComponent;
import com.ifriend.domain.newChat.chat.systems.sorting.SortComponent;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: DateSeparatorSystem.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"createDateSeparatorEntity", "Lcom/ifriend/common_entities_engine/Entity;", AnalyticsConstants.TIMESTAMP, "", "decoratableItemSortComponent", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent;", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateSeparatorSystemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Entity createDateSeparatorEntity(long j, SortComponent sortComponent) {
        return new Entity(SetsKt.mutableSetOf(new DateSeparatorComponent(j), new UniqueComponent("DateSeparatorComponent " + j), new SortComponent.TopDecorator(sortComponent)));
    }
}
