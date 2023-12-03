package com.theinnerhour.b2b.service;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.p;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import em.d;
import gv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.scheduling.c;
import ms.a;
import sp.b;
import ta.v;
/* compiled from: BootReceiverNotificationWorkManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/theinnerhour/b2b/service/BootReceiverNotificationWorkManager;", "Landroidx/work/CoroutineWorker;", "Landroidx/work/p$a;", "doWork", "(Lls/d;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", "TAG", "Ljava/lang/String;", "Lem/d;", "goalsNotificationUtils", "Lem/d;", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BootReceiverNotificationWorkManager extends CoroutineWorker {
    private final String TAG;
    private final Context context;
    private final d goalsNotificationUtils;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BootReceiverNotificationWorkManager(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        i.g(context, "context");
        i.g(workerParams, "workerParams");
        this.context = context;
        this.TAG = LogHelper.INSTANCE.makeLogTag("BootReceiverNotificationWM");
        this.goalsNotificationUtils = new d(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(ls.d<? super p.a> dVar) {
        BootReceiverNotificationWorkManager$doWork$1 bootReceiverNotificationWorkManager$doWork$1;
        int i6;
        BootReceiverNotificationWorkManager bootReceiverNotificationWorkManager;
        boolean z10;
        if (dVar instanceof BootReceiverNotificationWorkManager$doWork$1) {
            bootReceiverNotificationWorkManager$doWork$1 = (BootReceiverNotificationWorkManager$doWork$1) dVar;
            int i10 = bootReceiverNotificationWorkManager$doWork$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bootReceiverNotificationWorkManager$doWork$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bootReceiverNotificationWorkManager$doWork$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i6 = bootReceiverNotificationWorkManager$doWork$1.label;
                if (i6 == 0) {
                    if (i6 == 1) {
                        bootReceiverNotificationWorkManager = (BootReceiverNotificationWorkManager) bootReceiverNotificationWorkManager$doWork$1.L$0;
                        try {
                            b.d0(obj);
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(bootReceiverNotificationWorkManager.TAG, e);
                            return new p.a.C0043a();
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    b.d0(obj);
                    try {
                        Object obj2 = getInputData().f3236a.get("disableNotification");
                        boolean z11 = false;
                        if (obj2 instanceof Boolean) {
                            z10 = ((Boolean) obj2).booleanValue();
                        } else {
                            z10 = false;
                        }
                        String string = this.context.getSharedPreferences(GoalsNotificationPersistence.GOALS_NOTIF_PERSISTENCE_KEY, 0).getString(GoalsNotificationPersistence.GOALS_NOTIF_JSON_KEY, "");
                        if ((string == null || n.B0(string)) ? true : true) {
                            ApplicationPersistence.getInstance().deleteKey(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT);
                            MyApplication.V.a().b().clearPersistence();
                            return new p.a.c();
                        }
                        c cVar = o0.f23640a;
                        BootReceiverNotificationWorkManager$doWork$2 bootReceiverNotificationWorkManager$doWork$2 = new BootReceiverNotificationWorkManager$doWork$2(string, this, z10, null);
                        bootReceiverNotificationWorkManager$doWork$1.L$0 = this;
                        bootReceiverNotificationWorkManager$doWork$1.label = 1;
                        obj = v.S(cVar, bootReceiverNotificationWorkManager$doWork$2, bootReceiverNotificationWorkManager$doWork$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                        bootReceiverNotificationWorkManager = this;
                    } catch (Exception e11) {
                        e = e11;
                        bootReceiverNotificationWorkManager = this;
                        LogHelper.INSTANCE.e(bootReceiverNotificationWorkManager.TAG, e);
                        return new p.a.C0043a();
                    }
                }
                return (p.a) obj;
            }
        }
        bootReceiverNotificationWorkManager$doWork$1 = new BootReceiverNotificationWorkManager$doWork$1(this, dVar);
        Object obj3 = bootReceiverNotificationWorkManager$doWork$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i6 = bootReceiverNotificationWorkManager$doWork$1.label;
        if (i6 == 0) {
        }
        return (p.a) obj3;
    }

    public final Context getContext() {
        return this.context;
    }
}
