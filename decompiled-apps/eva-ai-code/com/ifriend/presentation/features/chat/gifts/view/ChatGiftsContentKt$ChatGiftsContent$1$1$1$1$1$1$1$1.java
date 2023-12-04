package com.ifriend.presentation.features.chat.gifts.view;

import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: ChatGiftsContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ PersistentList<ChatGiftUi> $gifts;
    final /* synthetic */ int $index;
    final /* synthetic */ Function1<ChatGiftUi, Unit> $onGiftClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1$1$1$1(Function1<? super ChatGiftUi, Unit> function1, PersistentList<ChatGiftUi> persistentList, int i) {
        super(0);
        this.$onGiftClick = function1;
        this.$gifts = persistentList;
        this.$index = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onGiftClick.invoke(this.$gifts.get(this.$index));
    }
}
