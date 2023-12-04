package com.ifriend.chat.presentation.ui.chat;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.presentation.ui.rateApp.RateAppScreen;
import com.ifriend.data.toggle.IsRateAppDialogEnabledToggle;
import com.ifriend.data.toggle.RateAndReviewUsToggle;
import com.ifriend.ui.base.modalMessage.RateAppPopupDelegate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ShowRateAppDialog.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/ShowRateAppDialog;", "", "rateAndReviewUsToggle", "Lcom/ifriend/data/toggle/RateAndReviewUsToggle;", "isRateAppDialogEnabledToggle", "Lcom/ifriend/data/toggle/IsRateAppDialogEnabledToggle;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "rateAppPopupDelegate", "Lcom/ifriend/ui/base/modalMessage/RateAppPopupDelegate;", "(Lcom/ifriend/data/toggle/RateAndReviewUsToggle;Lcom/ifriend/data/toggle/IsRateAppDialogEnabledToggle;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/ui/base/modalMessage/RateAppPopupDelegate;)V", "show", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShowRateAppDialog {
    public static final int $stable = 8;
    private final IsRateAppDialogEnabledToggle isRateAppDialogEnabledToggle;
    private final RateAndReviewUsToggle rateAndReviewUsToggle;
    private final RateAppPopupDelegate rateAppPopupDelegate;
    private final RouterProvider router;

    @Inject
    public ShowRateAppDialog(RateAndReviewUsToggle rateAndReviewUsToggle, IsRateAppDialogEnabledToggle isRateAppDialogEnabledToggle, RouterProvider router, RateAppPopupDelegate rateAppPopupDelegate) {
        Intrinsics.checkNotNullParameter(rateAndReviewUsToggle, "rateAndReviewUsToggle");
        Intrinsics.checkNotNullParameter(isRateAppDialogEnabledToggle, "isRateAppDialogEnabledToggle");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(rateAppPopupDelegate, "rateAppPopupDelegate");
        this.rateAndReviewUsToggle = rateAndReviewUsToggle;
        this.isRateAppDialogEnabledToggle = isRateAppDialogEnabledToggle;
        this.router = router;
        this.rateAppPopupDelegate = rateAppPopupDelegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object show(Continuation<? super Unit> continuation) {
        ShowRateAppDialog$show$1 showRateAppDialog$show$1;
        Object obj;
        int i;
        ShowRateAppDialog showRateAppDialog;
        ShowRateAppDialog showRateAppDialog2;
        if (continuation instanceof ShowRateAppDialog$show$1) {
            showRateAppDialog$show$1 = (ShowRateAppDialog$show$1) continuation;
            if ((showRateAppDialog$show$1.label & Integer.MIN_VALUE) != 0) {
                showRateAppDialog$show$1.label -= Integer.MIN_VALUE;
                obj = showRateAppDialog$show$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = showRateAppDialog$show$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IsRateAppDialogEnabledToggle isRateAppDialogEnabledToggle = this.isRateAppDialogEnabledToggle;
                    showRateAppDialog$show$1.L$0 = this;
                    showRateAppDialog$show$1.label = 1;
                    obj = isRateAppDialogEnabledToggle.isEnabled(showRateAppDialog$show$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    showRateAppDialog = this;
                } else if (i != 1) {
                    if (i == 2) {
                        showRateAppDialog2 = (ShowRateAppDialog) showRateAppDialog$show$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
                            AppRouter chatRouter = showRateAppDialog2.router.getChatRouter();
                            if (chatRouter != null) {
                                chatRouter.forwardIfNotInStack(new RateAppScreen());
                            }
                        } else {
                            showRateAppDialog2.rateAppPopupDelegate.showRateUs();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    showRateAppDialog = (ShowRateAppDialog) showRateAppDialog$show$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                RateAndReviewUsToggle rateAndReviewUsToggle = showRateAppDialog.rateAndReviewUsToggle;
                showRateAppDialog$show$1.L$0 = showRateAppDialog;
                showRateAppDialog$show$1.label = 2;
                obj = rateAndReviewUsToggle.isEnabled(showRateAppDialog$show$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                showRateAppDialog2 = showRateAppDialog;
                if (!((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
                }
                return Unit.INSTANCE;
            }
        }
        showRateAppDialog$show$1 = new ShowRateAppDialog$show$1(this, continuation);
        obj = showRateAppDialog$show$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = showRateAppDialog$show$1.label;
        if (i != 0) {
        }
        if (((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
        }
    }
}
