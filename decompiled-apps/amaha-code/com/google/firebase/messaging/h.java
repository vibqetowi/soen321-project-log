package com.google.firebase.messaging;

import android.content.Intent;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9718a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9719b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9720c;

    public /* synthetic */ h(Object obj, int i6, Object obj2) {
        this.f9718a = i6;
        this.f9719b = obj;
        this.f9720c = obj2;
    }

    @Override // ya.d
    public final void a(ya.h it) {
        int i6 = this.f9718a;
        Object obj = this.f9720c;
        Object obj2 = this.f9719b;
        switch (i6) {
            case 0:
                ((i) obj2).lambda$onStartCommand$1((Intent) obj, it);
                return;
            case 1:
                nf.b firebaseRemoteConfig = (nf.b) obj2;
                jl.e this$0 = (jl.e) obj;
                kotlin.jvm.internal.i.g(firebaseRemoteConfig, "$firebaseRemoteConfig");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(it, "it");
                HashMap<String, Object> appConfig = FirebasePersistence.getInstance().getUser().getAppConfig();
                kotlin.jvm.internal.i.f(appConfig, "appConfig");
                appConfig.put(Constants.FIRESTORE_GOALS_EXPERIMENT, Boolean.valueOf(firebaseRemoteConfig.d(Constants.FIRESTORE_GOALS_EXPERIMENT)));
                FirebasePersistence.getInstance().updateUserOnFirebase();
                if (firebaseRemoteConfig.d(Constants.FIRESTORE_GOALS_EXPERIMENT)) {
                    ((androidx.lifecycle.w) this$0.K.getValue()).l(new SingleUseEvent(Boolean.TRUE));
                    return;
                }
                return;
            case 2:
                nf.b firebaseRemoteConfig2 = (nf.b) obj2;
                NotV4DashboardViewModel this$02 = (NotV4DashboardViewModel) obj;
                kotlin.jvm.internal.i.g(firebaseRemoteConfig2, "$firebaseRemoteConfig");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(it, "it");
                HashMap<String, Object> appConfig2 = FirebasePersistence.getInstance().getUser().getAppConfig();
                kotlin.jvm.internal.i.f(appConfig2, "appConfig");
                appConfig2.put(Constants.FIRESTORE_GOALS_EXPERIMENT, Boolean.valueOf(firebaseRemoteConfig2.d(Constants.FIRESTORE_GOALS_EXPERIMENT)));
                FirebasePersistence.getInstance().updateUserOnFirebase();
                if (firebaseRemoteConfig2.d(Constants.FIRESTORE_GOALS_EXPERIMENT)) {
                    ((androidx.lifecycle.w) this$02.f10865n0.getValue()).l(new SingleUseEvent(Boolean.TRUE));
                    return;
                }
                return;
            default:
                nf.b firebaseRemoteConfig3 = (nf.b) obj2;
                ml.c0 this$03 = (ml.c0) obj;
                kotlin.jvm.internal.i.g(firebaseRemoteConfig3, "$firebaseRemoteConfig");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(it, "it");
                HashMap<String, Object> appConfig3 = FirebasePersistence.getInstance().getUser().getAppConfig();
                kotlin.jvm.internal.i.f(appConfig3, "appConfig");
                appConfig3.put(Constants.FIRESTORE_GOALS_EXPERIMENT, Boolean.valueOf(firebaseRemoteConfig3.d(Constants.FIRESTORE_GOALS_EXPERIMENT)));
                FirebasePersistence.getInstance().updateUserOnFirebase();
                if (firebaseRemoteConfig3.d(Constants.FIRESTORE_GOALS_EXPERIMENT)) {
                    ((androidx.lifecycle.w) this$03.f25365b0.getValue()).l(new SingleUseEvent(Boolean.TRUE));
                    return;
                }
                return;
        }
    }
}
