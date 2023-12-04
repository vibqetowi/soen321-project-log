package com.ifriend.ui.components.text;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: TypewriterText.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TypewriterTextKt$TypewriterTextPreview$1$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $first;
    final /* synthetic */ MutableState<Boolean> $isFirst$delegate;
    final /* synthetic */ String $second;
    final /* synthetic */ MutableState<String> $typeText$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypewriterTextKt$TypewriterTextPreview$1$1$1$1(String str, String str2, MutableState<Boolean> mutableState, MutableState<String> mutableState2) {
        super(0);
        this.$second = str;
        this.$first = str2;
        this.$isFirst$delegate = mutableState;
        this.$typeText$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean TypewriterTextPreview$lambda$4;
        boolean TypewriterTextPreview$lambda$42;
        MutableState<String> mutableState = this.$typeText$delegate;
        TypewriterTextPreview$lambda$4 = TypewriterTextKt.TypewriterTextPreview$lambda$4(this.$isFirst$delegate);
        mutableState.setValue(TypewriterTextPreview$lambda$4 ? this.$second : this.$first);
        MutableState<Boolean> mutableState2 = this.$isFirst$delegate;
        TypewriterTextPreview$lambda$42 = TypewriterTextKt.TypewriterTextPreview$lambda$4(mutableState2);
        TypewriterTextKt.TypewriterTextPreview$lambda$5(mutableState2, !TypewriterTextPreview$lambda$42);
    }
}
