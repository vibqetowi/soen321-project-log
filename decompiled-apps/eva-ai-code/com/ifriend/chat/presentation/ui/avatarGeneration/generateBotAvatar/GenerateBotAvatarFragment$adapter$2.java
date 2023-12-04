package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
/* compiled from: GenerateBotAvatarFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/AvatarGenerationDescriptionOptionsAdapter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class GenerateBotAvatarFragment$adapter$2 extends Lambda implements Function0<AvatarGenerationDescriptionOptionsAdapter> {
    final /* synthetic */ GenerateBotAvatarFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarFragment$adapter$2(GenerateBotAvatarFragment generateBotAvatarFragment) {
        super(0);
        this.this$0 = generateBotAvatarFragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GenerateBotAvatarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarFragment$adapter$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, GenerateBotAvatarViewModel.class, "onDescriptionOptionClicked", "onDescriptionOptionClicked(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((GenerateBotAvatarViewModel) this.receiver).onDescriptionOptionClicked(i);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AvatarGenerationDescriptionOptionsAdapter invoke() {
        return new AvatarGenerationDescriptionOptionsAdapter(new AnonymousClass1(this.this$0.getViewModel()));
    }
}
