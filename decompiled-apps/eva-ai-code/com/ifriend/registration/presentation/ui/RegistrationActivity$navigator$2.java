package com.ifriend.registration.presentation.ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: RegistrationActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/registration/presentation/ui/RegistrationNavigator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RegistrationActivity$navigator$2 extends Lambda implements Function0<RegistrationNavigator> {
    final /* synthetic */ RegistrationActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationActivity$navigator$2(RegistrationActivity registrationActivity) {
        super(0);
        this.this$0 = registrationActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RegistrationNavigator invoke() {
        int i;
        RegistrationActivity registrationActivity = this.this$0;
        i = registrationActivity.navigationContainerId;
        return new RegistrationNavigator(registrationActivity, i);
    }
}
