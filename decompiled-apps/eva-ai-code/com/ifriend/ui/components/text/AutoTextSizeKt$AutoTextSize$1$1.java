package com.ifriend.ui.components.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoTextSize.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutoTextSizeKt$AutoTextSize$1$1 extends Lambda implements Function1<TextLayoutResult, Unit> {
    final /* synthetic */ MutableState<TextUnit> $lineHeight$delegate;
    final /* synthetic */ MutableState<TextUnit> $textSize$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTextSizeKt$AutoTextSize$1$1(MutableState<TextUnit> mutableState, MutableState<TextUnit> mutableState2) {
        super(1);
        this.$textSize$delegate = mutableState;
        this.$lineHeight$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
        invoke2(textLayoutResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TextLayoutResult textLayoutResult) {
        long AutoTextSize_toyU4E8$lambda$1;
        long AutoTextSize_toyU4E8$lambda$4;
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (textLayoutResult.isLineEllipsized(textLayoutResult.getLineCount() - 1)) {
            MutableState<TextUnit> mutableState = this.$textSize$delegate;
            AutoTextSize_toyU4E8$lambda$1 = AutoTextSizeKt.AutoTextSize_toyU4E8$lambda$1(mutableState);
            TextUnitKt.m5801checkArithmeticR2X_6o(AutoTextSize_toyU4E8$lambda$1);
            AutoTextSizeKt.AutoTextSize_toyU4E8$lambda$2(mutableState, TextUnitKt.pack(TextUnit.m5786getRawTypeimpl(AutoTextSize_toyU4E8$lambda$1), TextUnit.m5788getValueimpl(AutoTextSize_toyU4E8$lambda$1) * 0.9f));
            MutableState<TextUnit> mutableState2 = this.$lineHeight$delegate;
            AutoTextSize_toyU4E8$lambda$4 = AutoTextSizeKt.AutoTextSize_toyU4E8$lambda$4(mutableState2);
            TextUnitKt.m5801checkArithmeticR2X_6o(AutoTextSize_toyU4E8$lambda$4);
            AutoTextSizeKt.AutoTextSize_toyU4E8$lambda$5(mutableState2, TextUnitKt.pack(TextUnit.m5786getRawTypeimpl(AutoTextSize_toyU4E8$lambda$4), TextUnit.m5788getValueimpl(AutoTextSize_toyU4E8$lambda$4) * 0.9f));
        }
    }
}
