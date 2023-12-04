package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.presentation.features.onboarding.steps.view.chip.OnboardingChipState;
import com.ifriend.presentation.features.onboarding.steps.view.common.ChipSelectButtonUiParams;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
/* compiled from: OnboardingUserInterestsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/chip/OnboardingChipState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingUserInterestsViewModel$onChipClick$1 extends Lambda implements Function1<OnboardingChipState, OnboardingChipState> {
    final /* synthetic */ ChipSelectButtonUiParams $chip;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUserInterestsViewModel$onChipClick$1(ChipSelectButtonUiParams chipSelectButtonUiParams) {
        super(1);
        this.$chip = chipSelectButtonUiParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnboardingChipState invoke(OnboardingChipState state) {
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        ImmutableList<ChipSelectButtonUiParams> chips = state.getChips();
        ChipSelectButtonUiParams chipSelectButtonUiParams = this.$chip;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(chips, 10));
        for (ChipSelectButtonUiParams chipSelectButtonUiParams2 : chips) {
            if (Intrinsics.areEqual(chipSelectButtonUiParams.getId(), chipSelectButtonUiParams2.getId())) {
                chipSelectButtonUiParams2 = ChipSelectButtonUiParams.copy$default(chipSelectButtonUiParams2, null, null, !chipSelectButtonUiParams2.getSelected(), 3, null);
            }
            arrayList.add(chipSelectButtonUiParams2);
        }
        ImmutableList immutableList = ExtensionsKt.toImmutableList(arrayList);
        ImmutableList<ChipSelectButtonUiParams> immutableList2 = immutableList;
        if ((immutableList2 instanceof Collection) && immutableList2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (ChipSelectButtonUiParams chipSelectButtonUiParams3 : immutableList2) {
                if (chipSelectButtonUiParams3.getSelected() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return OnboardingChipState.copy$default(state, null, immutableList, null, i >= 3, 5, null);
    }
}
