package com.ifriend.presentation.features.email.confirm;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: EmailConfirmDelegate.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&R\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/presentation/features/email/confirm/EmailConfirmDelegate;", "", "getEmailConfirmNeededFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/flow/StateFlow;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EmailConfirmDelegate {
    StateFlow<Boolean> getEmailConfirmNeededFlow(ViewModel viewModel);
}
