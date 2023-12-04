package com.ifriend.presentation.features.home.ui.chatitem;

import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: HomeActiveChatContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HomeActiveChatContentKt$activeChatsItems$2$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ HomeChatUi $chat;
    final /* synthetic */ Function1<HomeChatUi, Unit> $onChatClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeActiveChatContentKt$activeChatsItems$2$3(Function1<? super HomeChatUi, Unit> function1, HomeChatUi homeChatUi) {
        super(0);
        this.$onChatClick = function1;
        this.$chat = homeChatUi;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onChatClick.invoke(this.$chat);
    }
}
