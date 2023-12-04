package com.ifriend.ui.components.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppMessageInfoPopup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppMessageInfoPopupKt$AppMessageInfoPopup$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $actionLabel;
    final /* synthetic */ String $description;
    final /* synthetic */ boolean $isVisibleActionButton;
    final /* synthetic */ boolean $isVisibleCancelButton;
    final /* synthetic */ Function0<Unit> $onCancelClick;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ String $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMessageInfoPopupKt$AppMessageInfoPopup$2(String str, String str2, String str3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$title = str;
        this.$description = str2;
        this.$actionLabel = str3;
        this.$onClick = function0;
        this.$onCancelClick = function02;
        this.$onDismiss = function03;
        this.$isVisibleActionButton = z;
        this.$isVisibleCancelButton = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AppMessageInfoPopupKt.AppMessageInfoPopup(this.$title, this.$description, this.$actionLabel, this.$onClick, this.$onCancelClick, this.$onDismiss, this.$isVisibleActionButton, this.$isVisibleCancelButton, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
