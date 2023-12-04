package com.ifriend.presentation.features.purchases.common.mapper;

import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsGroupUiParams;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsUiParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
/* compiled from: SubscriptionBenefitsUiMapper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006¨\u0006\t"}, d2 = {"Lcom/ifriend/presentation/features/purchases/common/mapper/SubscriptionBenefitsUiMapper;", "", "()V", "map", "Lcom/ifriend/presentation/features/purchases/common/model/SubscriptionBenefitsGroupUiParams;", "group", "Lkotlin/Pair;", "", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubscriptionBenefitsUiMapper {
    public static final int $stable = 0;

    public final SubscriptionBenefitsGroupUiParams map(Pair<String, ? extends List<String>> group) {
        Intrinsics.checkNotNullParameter(group, "group");
        String first = group.getFirst();
        List<String> second = group.getSecond();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(second, 10));
        for (String str : second) {
            arrayList.add(new SubscriptionBenefitsUiParams(str, null, null, null, 14, null));
        }
        return new SubscriptionBenefitsGroupUiParams(first, ExtensionsKt.toImmutableList(arrayList));
    }
}
