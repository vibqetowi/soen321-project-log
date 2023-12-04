package com.ifriend.domain.newChat.chat.systems.resetAfterUpgrade;

import com.ifriend.domain.models.profile.user.Subscription;
import com.ifriend.domain.newChat.chat.systems.reset.ResetStateEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: ResetAfterUpgradeSystem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/user/Subscription;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.resetAfterUpgrade.ResetAfterUpgradeSystem$onStart$1", f = "ResetAfterUpgradeSystem.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ResetAfterUpgradeSystem$onStart$1 extends SuspendLambda implements Function2<Subscription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ResetAfterUpgradeSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetAfterUpgradeSystem$onStart$1(ResetAfterUpgradeSystem resetAfterUpgradeSystem, Continuation<? super ResetAfterUpgradeSystem$onStart$1> continuation) {
        super(2, continuation);
        this.this$0 = resetAfterUpgradeSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResetAfterUpgradeSystem$onStart$1 resetAfterUpgradeSystem$onStart$1 = new ResetAfterUpgradeSystem$onStart$1(this.this$0, continuation);
        resetAfterUpgradeSystem$onStart$1.L$0 = obj;
        return resetAfterUpgradeSystem$onStart$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Subscription subscription, Continuation<? super Unit> continuation) {
        return ((ResetAfterUpgradeSystem$onStart$1) create(subscription, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Subscription subscription;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Subscription subscription2 = (Subscription) this.L$0;
            subscription = this.this$0.lastSubscription;
            if (subscription == subscription2) {
                return Unit.INSTANCE;
            }
            this.this$0.lastSubscription = subscription2;
            this.this$0.postEvent(new ResetStateEvent("Reset After Upgrade"));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
