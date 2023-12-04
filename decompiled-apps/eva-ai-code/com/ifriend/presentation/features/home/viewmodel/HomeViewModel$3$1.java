package com.ifriend.presentation.features.home.viewmodel;

import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HomeViewModel$3$1 extends Lambda implements Function1<HomeViewModel.UiState, HomeViewModel.UiState> {
    final /* synthetic */ ProfileMenuUiState $profileState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$3$1(ProfileMenuUiState profileMenuUiState) {
        super(1);
        this.$profileState = profileMenuUiState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final HomeViewModel.UiState invoke(HomeViewModel.UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return HomeViewModel.UiState.copy$default(state, false, null, null, null, this.$profileState.isConfirmEmailVisible(), null, false, false, 239, null);
    }
}
