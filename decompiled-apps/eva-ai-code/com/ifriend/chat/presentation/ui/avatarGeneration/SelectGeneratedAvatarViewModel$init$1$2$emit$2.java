package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.domain.models.avatar.GeneratedAvatar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SelectGeneratedAvatarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SelectGeneratedAvatarViewModel$init$1$2$emit$2 extends Lambda implements Function1<SelectGeneratedAvatarState, SelectGeneratedAvatarState> {
    final /* synthetic */ List<GeneratedAvatar> $it;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGeneratedAvatarViewModel$init$1$2$emit$2(List<GeneratedAvatar> list) {
        super(1);
        this.$it = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SelectGeneratedAvatarState invoke(SelectGeneratedAvatarState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return SelectGeneratedAvatarState.copy$default(state, this.$it, null, null, false, 14, null);
    }
}
