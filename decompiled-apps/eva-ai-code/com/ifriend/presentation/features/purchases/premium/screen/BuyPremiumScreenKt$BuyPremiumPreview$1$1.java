package com.ifriend.presentation.features.purchases.premium.screen;

import androidx.compose.runtime.MutableState;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumScreenKt$BuyPremiumPreview$1$1", f = "BuyPremiumScreen.kt", i = {0}, l = {438}, m = "invokeSuspend", n = {FirebaseAnalytics.Param.INDEX}, s = {"I$0"})
/* loaded from: classes6.dex */
public final class BuyPremiumScreenKt$BuyPremiumPreview$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $benefits;
    final /* synthetic */ MutableState<String> $currentBenefit$delegate;
    int I$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumScreenKt$BuyPremiumPreview$1$1(List<String> list, MutableState<String> mutableState, Continuation<? super BuyPremiumScreenKt$BuyPremiumPreview$1$1> continuation) {
        super(2, continuation);
        this.$benefits = list;
        this.$currentBenefit$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyPremiumScreenKt$BuyPremiumPreview$1$1(this.$benefits, this.$currentBenefit$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyPremiumScreenKt$BuyPremiumPreview$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            i = 0;
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            int i3 = this.I$0;
            ResultKt.throwOnFailure(obj);
            i = i3;
        }
        do {
            i = (i + 1) % this.$benefits.size();
            this.$currentBenefit$delegate.setValue(this.$benefits.get(i));
            this.I$0 = i;
            this.label = 1;
        } while (DelayKt.delay(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
