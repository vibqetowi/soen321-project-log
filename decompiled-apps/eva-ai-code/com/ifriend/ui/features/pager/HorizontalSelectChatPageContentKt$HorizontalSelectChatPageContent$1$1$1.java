package com.ifriend.ui.features.pager;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: HorizontalSelectChatPageContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HorizontalSelectChatPageContentKt$HorizontalSelectChatPageContent$1$1$1 extends Lambda implements Function1<Modifier, Modifier> {
    final /* synthetic */ long $borderColor;
    final /* synthetic */ RoundedCornerShape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalSelectChatPageContentKt$HorizontalSelectChatPageContent$1$1$1(long j, RoundedCornerShape roundedCornerShape) {
        super(1);
        this.$borderColor = j;
        this.$shape = roundedCornerShape;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Modifier conditional) {
        Intrinsics.checkNotNullParameter(conditional, "$this$conditional");
        return BorderKt.m432borderxT4_qwU(conditional, Dp.m5607constructorimpl(1), this.$borderColor, this.$shape);
    }
}
