package com.ifriend.presentation.features.update.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppUpdatePopup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppUpdatePopupKt$InAppUpdatesPopup$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $canClose;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function0<Unit> $onUpdateClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdatePopupKt$InAppUpdatesPopup$5(boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$isVisible = z;
        this.$canClose = z2;
        this.$onUpdateClick = function0;
        this.$onDismiss = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        InAppUpdatePopupKt.InAppUpdatesPopup(this.$isVisible, this.$canClose, this.$onUpdateClick, this.$onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
