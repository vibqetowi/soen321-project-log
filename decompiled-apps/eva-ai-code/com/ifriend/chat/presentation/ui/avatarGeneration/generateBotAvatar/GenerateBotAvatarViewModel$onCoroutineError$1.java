package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: GenerateBotAvatarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class GenerateBotAvatarViewModel$onCoroutineError$1 extends Lambda implements Function1<GenerateBotAvatarState, GenerateBotAvatarState> {
    public static final GenerateBotAvatarViewModel$onCoroutineError$1 INSTANCE = new GenerateBotAvatarViewModel$onCoroutineError$1();

    GenerateBotAvatarViewModel$onCoroutineError$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GenerateBotAvatarState invoke(GenerateBotAvatarState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return GenerateBotAvatarState.copy$default(it, null, null, null, null, false, false, 31, null);
    }
}
