package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import io.sentry.protocol.App;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: RemoteConfig.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\f\u001a\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012\u001a\u0015\u0010\u0013\u001a\u00020\u0014*\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0001H\u0086\u0002\u001a\u0012\u0010\b\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"LIBRARY_NAME", "", "configUpdates", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getConfigUpdates", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)Lkotlinx/coroutines/flow/Flow;", "remoteConfig", "Lcom/google/firebase/ktx/Firebase;", "getRemoteConfig", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "remoteConfigSettings", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "init", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings$Builder;", "", "Lkotlin/ExtensionFunctionType;", "get", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "key", App.TYPE, "Lcom/google/firebase/FirebaseApp;", "com.google.firebase-firebase-config-ktx"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoteConfigKt {
    public static final String LIBRARY_NAME = "fire-cfg-ktx";

    public static final FirebaseRemoteConfig getRemoteConfig(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance()");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfig remoteConfig(Firebase firebase, FirebaseApp app) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(app);
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(app)");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfigValue get(FirebaseRemoteConfig firebaseRemoteConfig, String key) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(key);
        Intrinsics.checkNotNullExpressionValue(value, "this.getValue(key)");
        return value;
    }

    public static final FirebaseRemoteConfigSettings remoteConfigSettings(Function1<? super FirebaseRemoteConfigSettings.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        init.invoke(builder);
        FirebaseRemoteConfigSettings build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public static final Flow<ConfigUpdate> getConfigUpdates(FirebaseRemoteConfig firebaseRemoteConfig) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        return FlowKt.callbackFlow(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }
}
