package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonWithImageUiParams;
import com.ifriend.presentation.features.onboarding.steps.view.grid.OnboardingGridState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
/* compiled from: OnboardingFavoriteTopicsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/grid/OnboardingGridState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingFavoriteTopicsViewModel$onButtonClick$2 extends Lambda implements Function1<OnboardingGridState, OnboardingGridState> {
    final /* synthetic */ String $id;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingFavoriteTopicsViewModel$onButtonClick$2(String str) {
        super(1);
        this.$id = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnboardingGridState invoke(OnboardingGridState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ImmutableList<SelectButtonWithImageUiParams> buttons = state.getButtons();
        String str = this.$id;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
        for (SelectButtonWithImageUiParams selectButtonWithImageUiParams : buttons) {
            arrayList.add(SelectButtonWithImageUiParams.copy$default(selectButtonWithImageUiParams, null, null, Intrinsics.areEqual(selectButtonWithImageUiParams.getId(), str), null, 11, null));
        }
        return OnboardingGridState.copy$default(state, null, ExtensionsKt.toImmutableList(arrayList), 1, null);
    }
}
