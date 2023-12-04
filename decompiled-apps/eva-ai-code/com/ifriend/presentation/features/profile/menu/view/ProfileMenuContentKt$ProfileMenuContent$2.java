package com.ifriend.presentation.features.profile.menu.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfileMenuContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileMenuContentKt$ProfileMenuContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ ProfileMenuNavigator $navigator;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ ProfileMenuUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMenuContentKt$ProfileMenuContent$2(ProfileMenuUiState profileMenuUiState, Function0<Unit> function0, ProfileMenuNavigator profileMenuNavigator, long j, long j2, int i, int i2) {
        super(2);
        this.$state = profileMenuUiState;
        this.$onDismiss = function0;
        this.$navigator = profileMenuNavigator;
        this.$backgroundColor = j;
        this.$scrimColor = j2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ProfileMenuContentKt.m6951ProfileMenuContentjA1GFJw(this.$state, this.$onDismiss, this.$navigator, this.$backgroundColor, this.$scrimColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
