package com.ifriend.chat.presentation.ui.avatarGeneration;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SelectGeneratedAvatarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SelectGeneratedAvatarViewModel$avatarChosen$1 extends Lambda implements Function1<SelectGeneratedAvatarState, SelectGeneratedAvatarState> {
    public static final SelectGeneratedAvatarViewModel$avatarChosen$1 INSTANCE = new SelectGeneratedAvatarViewModel$avatarChosen$1();

    SelectGeneratedAvatarViewModel$avatarChosen$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SelectGeneratedAvatarState invoke(SelectGeneratedAvatarState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SelectGeneratedAvatarState.copy$default(it, null, null, null, true, 7, null);
    }
}
