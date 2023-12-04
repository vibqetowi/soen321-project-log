package com.ifriend.chat.presentation.ui.menu.botProfile;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BotProfileViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BotProfileViewModel$disableAvatarFeature$1 extends Lambda implements Function1<BotProfileState, BotProfileState> {
    final /* synthetic */ BotProfileViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotProfileViewModel$disableAvatarFeature$1(BotProfileViewModel botProfileViewModel) {
        super(1);
        this.this$0 = botProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BotProfileState invoke(BotProfileState it) {
        BotProfileState copy;
        Intrinsics.checkNotNullParameter(it, "it");
        copy = r0.copy((r18 & 1) != 0 ? r0.name : null, (r18 & 2) != 0 ? r0.age : null, (r18 & 4) != 0 ? r0.gender : null, (r18 & 8) != 0 ? r0.ethnicity : null, (r18 & 16) != 0 ? r0.personality : null, (r18 & 32) != 0 ? r0.avatarState : null, (r18 & 64) != 0 ? r0.voice : null, (r18 & 128) != 0 ? this.this$0.currentState().levelInfo : null);
        return copy;
    }
}
