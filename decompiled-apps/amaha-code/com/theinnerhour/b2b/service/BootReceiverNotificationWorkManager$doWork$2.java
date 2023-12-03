package com.theinnerhour.b2b.service;

import androidx.work.p;
import com.appsflyer.R;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
import hs.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import ls.d;
import ms.a;
import ns.e;
import ns.i;
import sp.b;
import ss.p;
import ta.v;
/* compiled from: BootReceiverNotificationWorkManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Landroidx/work/p$a;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@e(c = "com.theinnerhour.b2b.service.BootReceiverNotificationWorkManager$doWork$2", f = "BootReceiverNotificationWorkManager.kt", l = {R.styleable.AppCompatTheme_colorError}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BootReceiverNotificationWorkManager$doWork$2 extends i implements p<d0, d<? super p.a>, Object> {
    final /* synthetic */ boolean $disableNotification;
    final /* synthetic */ String $listStr;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BootReceiverNotificationWorkManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BootReceiverNotificationWorkManager$doWork$2(String str, BootReceiverNotificationWorkManager bootReceiverNotificationWorkManager, boolean z10, d<? super BootReceiverNotificationWorkManager$doWork$2> dVar) {
        super(2, dVar);
        this.$listStr = str;
        this.this$0 = bootReceiverNotificationWorkManager;
        this.$disableNotification = z10;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        BootReceiverNotificationWorkManager$doWork$2 bootReceiverNotificationWorkManager$doWork$2 = new BootReceiverNotificationWorkManager$doWork$2(this.$listStr, this.this$0, this.$disableNotification, dVar);
        bootReceiverNotificationWorkManager$doWork$2.L$0 = obj;
        return bootReceiverNotificationWorkManager$doWork$2;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        boolean b10;
        i0 g5;
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
            d0 d0Var = (d0) this.L$0;
            Object c10 = new sf.i().c(this.$listStr, new TypeToken<ArrayList<NotificationGoal>>() { // from class: com.theinnerhour.b2b.service.BootReceiverNotificationWorkManager$doWork$2$typeToken$1
            }.getType());
            kotlin.jvm.internal.i.f(c10, "Gson().fromJson(listStr, typeToken)");
            ArrayList<NotificationGoal> arrayList = (ArrayList) c10;
            BootReceiverNotificationWorkManager bootReceiverNotificationWorkManager = this.this$0;
            boolean z10 = this.$disableNotification;
            ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
            for (NotificationGoal notificationGoal : arrayList) {
                String notificationType = notificationGoal.getNotificationType();
                if (kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_RA)) {
                    b10 = true;
                } else {
                    b10 = kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_DYNAMIC_RA);
                }
                if (b10) {
                    g5 = v.g(d0Var, null, new BootReceiverNotificationWorkManager$doWork$2$1$1(bootReceiverNotificationWorkManager, notificationGoal, z10, null), 3);
                } else {
                    g5 = v.g(d0Var, null, new BootReceiverNotificationWorkManager$doWork$2$1$2(bootReceiverNotificationWorkManager, notificationGoal, z10, null), 3);
                }
                arrayList2.add(g5);
            }
            this.label = 1;
            obj = ca.a.n(arrayList2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        boolean z11 = this.$disableNotification;
        List list = (List) obj;
        ApplicationPersistence.getInstance().deleteKey(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT);
        if (z11) {
            MyApplication.V.a().b().clearPersistence();
        }
        return new p.a.c();
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super p.a> dVar) {
        return ((BootReceiverNotificationWorkManager$doWork$2) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }
}
