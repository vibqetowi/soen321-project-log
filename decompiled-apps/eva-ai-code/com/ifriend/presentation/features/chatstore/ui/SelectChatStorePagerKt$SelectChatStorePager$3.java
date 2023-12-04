package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.chatstore.models.ChatStoreUi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectChatStorePager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectChatStorePagerKt$SelectChatStorePager$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<ChatStoreUi> $chats;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ PagerState $pagerState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectChatStorePagerKt$SelectChatStorePager$3(Modifier modifier, PagerState pagerState, List<ChatStoreUi> list, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$pagerState = pagerState;
        this.$chats = list;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SelectChatStorePagerKt.SelectChatStorePager(this.$modifier, this.$pagerState, this.$chats, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
