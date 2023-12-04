package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$SendButton$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ RowScope $this_SendButton;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$SendButton$2(RowScope rowScope, boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$this_SendButton = rowScope;
        this.$isVisible = z;
        this.$onClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatInputContentKt.SendButton(this.$this_SendButton, this.$isVisible, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
