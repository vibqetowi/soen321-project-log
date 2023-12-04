package com.ifriend.ui.components.popup;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ModalTopSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.ui.components.popup.ComposableSingletons$ModalTopSheetKt$lambda-3$1$1$1  reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ModalTopSheetKt$lambda3$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Boolean> $isVisible$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ModalTopSheetKt$lambda3$1$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$isVisible$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposableSingletons$ModalTopSheetKt$lambda3$1.invoke$lambda$2(this.$isVisible$delegate, false);
    }
}
