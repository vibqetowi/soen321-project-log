package com.ifriend.data.mappers.subscription;

import com.ifriend.data.networking.api.chat.models.response.benefits.ChatSubscriptionBenefitRemote;
import com.ifriend.domain.logic.chat.subscription.models.ChatSubscriptionBenefits;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSubscriptionBenefitsMapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/mappers/subscription/ChatSubscriptionBenefitsMapper;", "", "()V", "map", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "benefit", "Lcom/ifriend/data/networking/api/chat/models/response/benefits/ChatSubscriptionBenefitRemote;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionBenefitsMapper {
    public final ChatSubscriptionBenefits map(ChatSubscriptionBenefitRemote benefit) {
        Intrinsics.checkNotNullParameter(benefit, "benefit");
        String title = benefit.getTitle();
        if (title == null) {
            title = "";
        }
        List<ChatSubscriptionBenefitRemote.Benefit> items = benefit.getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        List<ChatSubscriptionBenefitRemote.Benefit> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ChatSubscriptionBenefitRemote.Benefit benefit2 : list) {
            String title2 = benefit2.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            String description = benefit2.getDescription();
            if (description == null) {
                description = "";
            }
            arrayList.add(new ChatSubscriptionBenefits.Benefit(title2, description));
        }
        return new ChatSubscriptionBenefits(title, arrayList);
    }
}
