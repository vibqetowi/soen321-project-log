package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarViewModel$createAvatar$updateLoadingState$1 extends Lambda implements Function1<GenerateBotAvatarState, GenerateBotAvatarState> {
    final /* synthetic */ boolean $isLoading;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarViewModel$createAvatar$updateLoadingState$1(boolean z) {
        super(1);
        this.$isLoading = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final GenerateBotAvatarState invoke(GenerateBotAvatarState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = this.$isLoading;
        return GenerateBotAvatarState.copy$default(it, null, null, null, null, !z, z, 15, null);
    }
}
