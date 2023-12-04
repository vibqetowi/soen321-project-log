package com.ifriend.registration.presentation.ui.email;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmailRegistrationViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "text", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmailRegistrationViewModel$passwordChangedWatcher$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ EmailRegistrationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRegistrationViewModel$passwordChangedWatcher$1(EmailRegistrationViewModel emailRegistrationViewModel) {
        super(1);
        this.this$0 = emailRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.this$0.getPassword().setValue(text);
        this.this$0.checkIsValid();
    }
}
