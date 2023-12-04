package com.ifriend.presentation.features.home.ui.chatitem;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.components.modifier.NeomorphicKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: HomeChatCommonContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HomeChatCommonContentKt$HomeActiveChatMessageInfo$1$1 extends Lambda implements Function1<Modifier, Modifier> {
    public static final HomeChatCommonContentKt$HomeActiveChatMessageInfo$1$1 INSTANCE = new HomeChatCommonContentKt$HomeActiveChatMessageInfo$1$1();

    HomeChatCommonContentKt$HomeActiveChatMessageInfo$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Modifier conditional) {
        Modifier m7048neomorphicIndicatorZs3qXj0;
        Intrinsics.checkNotNullParameter(conditional, "$this$conditional");
        m7048neomorphicIndicatorZs3qXj0 = NeomorphicKt.m7048neomorphicIndicatorZs3qXj0(conditional, (r19 & 1) != 0 ? RoundedCornerShapeKt.getCircleShape() : null, (r19 & 2) != 0 ? Dp.m5607constructorimpl(5) : 0.0f, (r19 & 4) != 0 ? Dp.m5607constructorimpl(20) : 0.0f, (r19 & 8) != 0 ? Dp.m5607constructorimpl(1) : 0.0f, (r19 & 16) != 0 ? Dp.m5607constructorimpl(3) : 0.0f, (r19 & 32) != 0 ? ColorKt.Color(3422552064L) : 0L, (r19 & 64) != 0 ? ColorKt.Color(3423209994L) : 0L);
        return m7048neomorphicIndicatorZs3qXj0;
    }
}
