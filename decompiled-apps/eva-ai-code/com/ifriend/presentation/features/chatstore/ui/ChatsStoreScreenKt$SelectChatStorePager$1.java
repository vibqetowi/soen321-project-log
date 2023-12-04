package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsStoreScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsStoreScreenKt$SelectChatStorePager$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Float, Unit> $onAvatarOffsetChanged;
    final /* synthetic */ Function1<Integer, Unit> $onPageChanged;
    final /* synthetic */ ChatsStoreViewModel.UiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatsStoreScreenKt$SelectChatStorePager$1(Modifier modifier, ChatsStoreViewModel.UiState uiState, Function1<? super Integer, Unit> function1, Function1<? super Float, Unit> function12, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$state = uiState;
        this.$onPageChanged = function1;
        this.$onAvatarOffsetChanged = function12;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatsStoreScreenKt.SelectChatStorePager(this.$modifier, this.$state, this.$onPageChanged, this.$onAvatarOffsetChanged, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
