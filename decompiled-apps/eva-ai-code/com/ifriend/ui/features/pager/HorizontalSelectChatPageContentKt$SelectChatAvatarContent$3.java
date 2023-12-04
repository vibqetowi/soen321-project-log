package com.ifriend.ui.features.pager;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HorizontalSelectChatPageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HorizontalSelectChatPageContentKt$SelectChatAvatarContent$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $avatarUrl;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalSelectChatPageContentKt$SelectChatAvatarContent$3(Modifier modifier, String str, int i) {
        super(2);
        this.$modifier = modifier;
        this.$avatarUrl = str;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        HorizontalSelectChatPageContentKt.SelectChatAvatarContent(this.$modifier, this.$avatarUrl, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
