package com.ifriend.ui.components.dialogs;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppMessageInfoPopup.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.ui.components.dialogs.ComposableSingletons$AppMessageInfoPopupKt$lambda-2$1$4$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$AppMessageInfoPopupKt$lambda2$1$4$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Boolean> $openDialog;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$AppMessageInfoPopupKt$lambda2$1$4$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$openDialog = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$openDialog.setValue(false);
    }
}
