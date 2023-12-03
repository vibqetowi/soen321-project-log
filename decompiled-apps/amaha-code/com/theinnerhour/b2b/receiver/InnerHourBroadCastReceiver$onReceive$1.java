package com.theinnerhour.b2b.receiver;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.R;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import hs.k;
import java.io.Serializable;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import ls.d;
import ms.a;
import ns.e;
import ns.i;
import sp.b;
import ss.p;
/* compiled from: InnerHourBroadCastReceiver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@e(c = "com.theinnerhour.b2b.receiver.InnerHourBroadCastReceiver$onReceive$1", f = "InnerHourBroadCastReceiver.kt", l = {R.styleable.AppCompatTheme_colorSwitchThumbNormal}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InnerHourBroadCastReceiver$onReceive$1 extends i implements p<d0, d<? super k>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerHourBroadCastReceiver$onReceive$1(Intent intent, Context context, d<? super InnerHourBroadCastReceiver$onReceive$1> dVar) {
        super(2, dVar);
        this.$intent = intent;
        this.$context = context;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new InnerHourBroadCastReceiver$onReceive$1(this.$intent, this.$context, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        NotificationGoal notificationGoal;
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
            Serializable serializableExtra = this.$intent.getSerializableExtra("model");
            if (serializableExtra instanceof NotificationGoal) {
                notificationGoal = (NotificationGoal) serializableExtra;
            } else {
                notificationGoal = null;
            }
            if (notificationGoal != null) {
                em.d dVar = new em.d(this.$context);
                this.label = 1;
                if (dVar.f(notificationGoal, false, this) == aVar) {
                    return aVar;
                }
            }
        }
        return k.f19476a;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((InnerHourBroadCastReceiver$onReceive$1) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }
}
