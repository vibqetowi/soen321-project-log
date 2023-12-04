package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatStoreLevelPopup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatStoreLevelPopupKt$ChatStoreLevelCard$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatStoreLevelPopupKt$ChatStoreLevelCard$2(Modifier modifier, Function0<Unit> function0, int i) {
        super(2);
        this.$modifier = modifier;
        this.$onDismiss = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatStoreLevelPopupKt.ChatStoreLevelCard(this.$modifier, this.$onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
