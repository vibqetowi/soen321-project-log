package com.ifriend.presentation.features.update.view;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppUpdatePopup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppUpdatePopupKt$InAppUpdatesPopupPreview$1$1$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MutableState<Boolean> $canClose$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdatePopupKt$InAppUpdatesPopupPreview$1$1$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$canClose$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        InAppUpdatePopupKt.InAppUpdatesPopupPreview$lambda$7(this.$canClose$delegate, z);
    }
}
