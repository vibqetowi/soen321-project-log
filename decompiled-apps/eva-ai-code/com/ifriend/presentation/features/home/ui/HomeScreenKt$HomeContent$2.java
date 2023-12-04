package com.ifriend.presentation.features.home.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeScreenKt$HomeContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $goToConfirmEmail;
    final /* synthetic */ boolean $isConfirmEmailVisible;
    final /* synthetic */ HomeViewModel.UiState $state;
    final /* synthetic */ HomeViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$HomeContent$2(HomeViewModel homeViewModel, HomeViewModel.UiState uiState, boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$viewModel = homeViewModel;
        this.$state = uiState;
        this.$isConfirmEmailVisible = z;
        this.$goToConfirmEmail = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        HomeScreenKt.HomeContent(this.$viewModel, this.$state, this.$isConfirmEmailVisible, this.$goToConfirmEmail, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
