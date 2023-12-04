package com.ifriend.ui.components.progress;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.ui.Modifier;
import com.ifriend.ui.progress.MultiPartProgressState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MultiPartProgressBarCompose.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MultiPartProgressBarComposeKt$MultiPartProgressBarCompose$1$1$1$2 extends Lambda implements Function1<Modifier, Modifier> {
    final /* synthetic */ MultiPartProgressState.Part $part;
    final /* synthetic */ RowScope $this_Row;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPartProgressBarComposeKt$MultiPartProgressBarCompose$1$1$1$2(RowScope rowScope, MultiPartProgressState.Part part) {
        super(1);
        this.$this_Row = rowScope;
        this.$part = part;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Modifier conditional) {
        Intrinsics.checkNotNullParameter(conditional, "$this$conditional");
        return RowScope.CC.weight$default(this.$this_Row, conditional, this.$part.getWeight(), false, 2, null);
    }
}
