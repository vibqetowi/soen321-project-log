package com.ifriend.presentation.features.profile.confirmemail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfirmUserEmailScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmUserEmailScreenKt$ConfirmUserEmailScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onCheckEmailBoxClick;
    final /* synthetic */ Function0<Unit> $onConfirmationEmailClick;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ ConfirmEmailViewModel.UiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmUserEmailScreenKt$ConfirmUserEmailScreen$2(ConfirmEmailViewModel.UiState uiState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
        super(2);
        this.$state = uiState;
        this.$onDismiss = function0;
        this.$onCheckEmailBoxClick = function02;
        this.$onConfirmationEmailClick = function03;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ConfirmUserEmailScreenKt.ConfirmUserEmailScreen(this.$state, this.$onDismiss, this.$onCheckEmailBoxClick, this.$onConfirmationEmailClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
