package com.ifriend.presentation.features.purchases.chatsubscription.common.mappers;

import androidx.compose.ui.text.font.FontWeight;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.domain.logic.chat.subscription.models.ChatSubscriptionBenefits;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsGroupUiParams;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsUiParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ExtensionsKt;
/* compiled from: SubscriptionBenefitsMapper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\r"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/common/mappers/SubscriptionBenefitsMapper;", "", "()V", "map", "Lcom/ifriend/presentation/features/purchases/common/model/SubscriptionBenefitsGroupUiParams;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "chatName", "", "mapBenefit", "Lcom/ifriend/presentation/features/purchases/common/model/SubscriptionBenefitsUiParams;", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits$Benefit;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubscriptionBenefitsMapper {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String BOT_NAME_KEY = "{BotName}";

    /* compiled from: SubscriptionBenefitsMapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/common/mappers/SubscriptionBenefitsMapper$Companion;", "", "()V", "BOT_NAME_KEY", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final SubscriptionBenefitsGroupUiParams map(ChatSubscriptionBenefits model, String chatName) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        String title = model.getTitle();
        List<ChatSubscriptionBenefits.Benefit> benefits = model.getBenefits();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(benefits, 10));
        for (ChatSubscriptionBenefits.Benefit benefit : benefits) {
            arrayList.add(mapBenefit(benefit, chatName));
        }
        return new SubscriptionBenefitsGroupUiParams(title, ExtensionsKt.toImmutableList(arrayList));
    }

    private final SubscriptionBenefitsUiParams mapBenefit(ChatSubscriptionBenefits.Benefit benefit, String str) {
        return new SubscriptionBenefitsUiParams(StringsKt.replace$default(benefit.getTitle(), BOT_NAME_KEY, str, false, 4, (Object) null), FontWeight.Companion.getBold(), benefit.getDescription(), FontWeight.Companion.getNormal());
    }
}
