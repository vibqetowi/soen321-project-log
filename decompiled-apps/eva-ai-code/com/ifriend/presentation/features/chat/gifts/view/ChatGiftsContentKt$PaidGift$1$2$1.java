package com.ifriend.presentation.features.chat.gifts.view;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatGiftsContent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "size", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsContentKt$PaidGift$1$2$1 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ MutableState<IntSize> $cardSize$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsContentKt$PaidGift$1$2$1(MutableState<IntSize> mutableState) {
        super(1);
        this.$cardSize$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m6899invokeozmzZPI(intSize.m5771unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m6899invokeozmzZPI(long j) {
        ChatGiftsContentKt.PaidGift$lambda$7$lambda$3(this.$cardSize$delegate, j);
    }
}
