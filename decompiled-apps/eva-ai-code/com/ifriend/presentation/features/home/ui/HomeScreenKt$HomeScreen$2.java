package com.ifriend.presentation.features.home.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.home.navigation.HomeNavigator;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeScreenKt$HomeScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ HomeNavigator $homeNavigator;
    final /* synthetic */ boolean $isConfirmEmailVisible;
    final /* synthetic */ HomeViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$HomeScreen$2(HomeViewModel homeViewModel, boolean z, HomeNavigator homeNavigator, int i) {
        super(2);
        this.$viewModel = homeViewModel;
        this.$isConfirmEmailVisible = z;
        this.$homeNavigator = homeNavigator;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        HomeScreenKt.HomeScreen(this.$viewModel, this.$isConfirmEmailVisible, this.$homeNavigator, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
