package com.ifriend.presentation.features.home.ui.chatitem;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeChatCommonContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeChatCommonContentKt$HomeChatAvatarBadge$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $avatarBadgeLabel;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ BoxScope $this_HomeChatAvatarBadge;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeChatCommonContentKt$HomeChatAvatarBadge$2(BoxScope boxScope, Modifier modifier, String str, int i) {
        super(2);
        this.$this_HomeChatAvatarBadge = boxScope;
        this.$modifier = modifier;
        this.$avatarBadgeLabel = str;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        HomeChatCommonContentKt.HomeChatAvatarBadge(this.$this_HomeChatAvatarBadge, this.$modifier, this.$avatarBadgeLabel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
