package com.ifriend.data.networking.api.topics.models;

import com.ifriend.data.networking.api.topics.models.InitiateTopicRemote;
import com.ifriend.domain.logic.topics.models.PremiumTopicPopup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InitiateTopicRemote.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDomain", "Lcom/ifriend/domain/logic/topics/models/PremiumTopicPopup;", "Lcom/ifriend/data/networking/api/topics/models/InitiateTopicRemote$PopupData;", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitiateTopicRemoteKt {
    public static final PremiumTopicPopup toDomain(InitiateTopicRemote.PopupData popupData) {
        Intrinsics.checkNotNullParameter(popupData, "<this>");
        return new PremiumTopicPopup(popupData.getIcon(), popupData.getTitle(), popupData.getMessage(), popupData.getCallToAction());
    }
}
