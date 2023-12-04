package com.ifriend.presentation.features.chatsettings.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatSettingsActionTagsContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSettingsActionTagsContentKt$ChatSettingsActionTagsContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ImmutableList<ChatSettingsViewModel.UiState.ActionTag> $actionTags;
    final /* synthetic */ Function1<ChatSettingsViewModel.UiState.ActionTag, Unit> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatSettingsActionTagsContentKt$ChatSettingsActionTagsContent$2(ImmutableList<ChatSettingsViewModel.UiState.ActionTag> immutableList, Function1<? super ChatSettingsViewModel.UiState.ActionTag, Unit> function1, int i) {
        super(2);
        this.$actionTags = immutableList;
        this.$onClick = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatSettingsActionTagsContentKt.ChatSettingsActionTagsContent(this.$actionTags, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
