package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.domain.models.avatar.GeneratedAvatar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SelectGeneratedAvatarFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "position", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SelectGeneratedAvatarFragment$adapter$1 extends Lambda implements Function2<GeneratedAvatar, Integer, Unit> {
    final /* synthetic */ SelectGeneratedAvatarFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGeneratedAvatarFragment$adapter$1(SelectGeneratedAvatarFragment selectGeneratedAvatarFragment) {
        super(2);
        this.this$0 = selectGeneratedAvatarFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(GeneratedAvatar generatedAvatar, Integer num) {
        invoke(generatedAvatar, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(GeneratedAvatar generatedAvatar, int i) {
        Intrinsics.checkNotNullParameter(generatedAvatar, "<anonymous parameter 0>");
        this.this$0.getViewModel().avatarChosen(i);
    }
}
