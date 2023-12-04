package com.ifriend.presentation.features.chat.background.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatImageBackgroundContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatImageBackgroundContentKt$ChatImageBackgroundContent$1$1 extends Lambda implements Function1<Modifier, Modifier> {
    final /* synthetic */ long $gradientColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatImageBackgroundContentKt$ChatImageBackgroundContent$1$1(long j) {
        super(1);
        this.$gradientColor = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Modifier conditional) {
        Intrinsics.checkNotNullParameter(conditional, "$this$conditional");
        return BackgroundKt.background$default(conditional, Brush.Companion.m3249verticalGradient8A3gB4$default(Brush.Companion, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m3281boximpl(this.$gradientColor)), TuplesKt.to(Float.valueOf(0.4f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()))}, Float.POSITIVE_INFINITY, 0.0f, 0, 8, (Object) null), null, 0.0f, 6, null);
    }
}
