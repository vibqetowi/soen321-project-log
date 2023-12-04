package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: GenerateBotAvatarFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class GenerateBotAvatarFragment$viewModel$2 extends Lambda implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ GenerateBotAvatarFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarFragment$viewModel$2(GenerateBotAvatarFragment generateBotAvatarFragment) {
        super(0);
        this.this$0 = generateBotAvatarFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModelProvider.Factory invoke() {
        return this.this$0.getViewModelFactory();
    }
}
