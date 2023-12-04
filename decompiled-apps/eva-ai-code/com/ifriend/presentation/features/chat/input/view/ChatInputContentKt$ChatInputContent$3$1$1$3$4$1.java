package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "change", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$ChatInputContent$3$1$1$3$4$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ MutableFloatState $cancelOffset$delegate;
    final /* synthetic */ MutableIntState $dragOffset$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$ChatInputContent$3$1$1$3$4$1(MutableIntState mutableIntState, MutableFloatState mutableFloatState) {
        super(1);
        this.$dragOffset$delegate = mutableIntState;
        this.$cancelOffset$delegate = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        float lerp = MathHelpersKt.lerp(1.0f, 0.5f, Math.abs(ChatInputContentKt$ChatInputContent$3$1$1.invoke$lambda$4(this.$dragOffset$delegate)) / ChatInputContentKt$ChatInputContent$3$1$1.invoke$lambda$2(this.$cancelOffset$delegate));
        MutableIntState mutableIntState = this.$dragOffset$delegate;
        mutableIntState.setIntValue(RangesKt.coerceAtMost(MathKt.roundToInt(ChatInputContentKt$ChatInputContent$3$1$1.invoke$lambda$4(mutableIntState) + (i * lerp)), 0));
    }
}
