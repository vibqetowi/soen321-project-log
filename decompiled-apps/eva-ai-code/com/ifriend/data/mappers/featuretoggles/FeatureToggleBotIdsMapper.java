package com.ifriend.data.mappers.featuretoggles;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.data.repository.experiments.model.FeatureToggleBotIdsData;
import com.ifriend.domain.models.experiments.common.FeatureToggleChatIds;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FeatureToggleBotIdsMapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/mappers/featuretoggles/FeatureToggleBotIdsMapper;", "", "()V", "map", "Lcom/ifriend/domain/models/experiments/common/FeatureToggleChatIds;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/data/repository/experiments/model/FeatureToggleBotIdsData;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureToggleBotIdsMapper {
    public final FeatureToggleChatIds map(FeatureToggleBotIdsData model) {
        Intrinsics.checkNotNullParameter(model, "model");
        boolean orFalse = ommonKt.orFalse(model.getInclude());
        List<String> ids = model.getIds();
        if (ids == null) {
            ids = CollectionsKt.emptyList();
        }
        return new FeatureToggleChatIds(ids, orFalse);
    }
}
