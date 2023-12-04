package com.ifriend.presentation.features.chat.panel.ui.topics;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PremiumTopicPopupContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PremiumTopicPopupContentKt$PremiumTopicPopupContent$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<Boolean, Unit> $onPermissionGranted;
    final /* synthetic */ Function0<Unit> $onRemindClick;
    final /* synthetic */ ChatTopicsUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PremiumTopicPopupContentKt$PremiumTopicPopupContent$3(ChatTopicsUiState chatTopicsUiState, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, int i) {
        super(2);
        this.$state = chatTopicsUiState;
        this.$onRemindClick = function0;
        this.$onPermissionGranted = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        PremiumTopicPopupContentKt.PremiumTopicPopupContent(this.$state, this.$onRemindClick, this.$onPermissionGranted, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
