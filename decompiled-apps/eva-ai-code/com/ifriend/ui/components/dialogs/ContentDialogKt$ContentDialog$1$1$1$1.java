package com.ifriend.ui.components.dialogs;

import androidx.compose.ui.Modifier;
import com.ifriend.ui.components.modifier.ClickableModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ContentDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ContentDialogKt$ContentDialog$1$1$1$1 extends Lambda implements Function1<Modifier, Modifier> {
    final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentDialogKt$ContentDialog$1$1$1$1(Function0<Unit> function0) {
        super(1);
        this.$onDismiss = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Modifier conditional) {
        Intrinsics.checkNotNullParameter(conditional, "$this$conditional");
        return ClickableModifierKt.noIndicationClickable$default(conditional, false, this.$onDismiss, 1, null);
    }
}
