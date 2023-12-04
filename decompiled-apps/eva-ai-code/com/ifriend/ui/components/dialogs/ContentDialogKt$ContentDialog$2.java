package com.ifriend.ui.components.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Brush;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContentDialog.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentDialogKt$ContentDialog$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $bottomPadding;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ Brush $contentScrimColor;
    final /* synthetic */ boolean $isCancelable;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Brush $scrimColor;
    final /* synthetic */ float $topPadding;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContentDialogKt$ContentDialog$2(Alignment alignment, float f, float f2, Function0<Unit> function0, Brush brush, Brush brush2, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.$contentAlignment = alignment;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onDismiss = function0;
        this.$scrimColor = brush;
        this.$contentScrimColor = brush2;
        this.$isCancelable = z;
        this.$content = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ContentDialogKt.m7039ContentDialogeWuZFaY(this.$contentAlignment, this.$topPadding, this.$bottomPadding, this.$onDismiss, this.$scrimColor, this.$contentScrimColor, this.$isCancelable, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
