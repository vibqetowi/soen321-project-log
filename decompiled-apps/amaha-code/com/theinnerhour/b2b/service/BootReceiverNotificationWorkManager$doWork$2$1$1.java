package com.theinnerhour.b2b.service;

import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import hs.k;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import ls.d;
import ms.a;
import ns.e;
import ns.i;
import sp.b;
import ss.p;
/* compiled from: BootReceiverNotificationWorkManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@e(c = "com.theinnerhour.b2b.service.BootReceiverNotificationWorkManager$doWork$2$1$1", f = "BootReceiverNotificationWorkManager.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BootReceiverNotificationWorkManager$doWork$2$1$1 extends i implements p<d0, d<? super Boolean>, Object> {
    final /* synthetic */ boolean $disableNotification;
    final /* synthetic */ NotificationGoal $tt;
    int label;
    final /* synthetic */ BootReceiverNotificationWorkManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BootReceiverNotificationWorkManager$doWork$2$1$1(BootReceiverNotificationWorkManager bootReceiverNotificationWorkManager, NotificationGoal notificationGoal, boolean z10, d<? super BootReceiverNotificationWorkManager$doWork$2$1$1> dVar) {
        super(2, dVar);
        this.this$0 = bootReceiverNotificationWorkManager;
        this.$tt = notificationGoal;
        this.$disableNotification = z10;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new BootReceiverNotificationWorkManager$doWork$2$1$1(this.this$0, this.$tt, this.$disableNotification, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        em.d dVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.d0(obj);
            dVar = this.this$0.goalsNotificationUtils;
            NotificationGoal notificationGoal = this.$tt;
            boolean z10 = this.$disableNotification;
            this.label = 1;
            obj = dVar.f(notificationGoal, z10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super Boolean> dVar) {
        return ((BootReceiverNotificationWorkManager$doWork$2$1$1) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }
}
