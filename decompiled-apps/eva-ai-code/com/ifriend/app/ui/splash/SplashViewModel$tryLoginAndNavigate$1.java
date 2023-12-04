package com.ifriend.app.ui.splash;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.app.ui.splash.SplashViewModel", f = "SplashViewModel.kt", i = {0, 0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, 69, 73}, m = "tryLoginAndNavigate", n = {"this", "activity"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class SplashViewModel$tryLoginAndNavigate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SplashViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashViewModel$tryLoginAndNavigate$1(SplashViewModel splashViewModel, Continuation<? super SplashViewModel$tryLoginAndNavigate$1> continuation) {
        super(continuation);
        this.this$0 = splashViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object tryLoginAndNavigate;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryLoginAndNavigate = this.this$0.tryLoginAndNavigate(null, null, this);
        return tryLoginAndNavigate;
    }
}
