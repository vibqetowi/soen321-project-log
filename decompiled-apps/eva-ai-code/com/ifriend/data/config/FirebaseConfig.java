package com.ifriend.data.config;

import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.config.parser.FirebaseRemoteConfigParser;
import com.ifriend.domain.config.ConfigEntity;
import com.ifriend.domain.config.ConfigState;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.tasks.TasksKt;
/* compiled from: FirebaseConfig.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/data/config/FirebaseConfig;", "", "parser", "Lcom/ifriend/data/config/parser/FirebaseRemoteConfigParser;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/data/config/parser/FirebaseRemoteConfigParser;Lcom/ifriend/common_utils/Logger;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "remoteConfig$delegate", "Lkotlin/Lazy;", "loadConfig", "Lcom/ifriend/domain/config/ConfigState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preloadFirebaseConfig", "", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryGetFromCache", "", "Lcom/ifriend/domain/config/ConfigEntity;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseConfig {
    private final Logger logger;
    private final FirebaseRemoteConfigParser parser;
    private final Lazy remoteConfig$delegate;

    @Inject
    public FirebaseConfig(FirebaseRemoteConfigParser parser, Logger logger) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.parser = parser;
        this.logger = logger;
        this.remoteConfig$delegate = LazyKt.lazy(FirebaseConfig$remoteConfig$2.INSTANCE);
    }

    private final FirebaseRemoteConfig getRemoteConfig() {
        return (FirebaseRemoteConfig) this.remoteConfig$delegate.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(1:(1:(3:13|14|(2:16|17)(2:19|20))(2:21|22))(4:23|24|25|27))(6:28|29|30|(1:32)|25|27))(2:33|34))(4:38|39|40|(1:42)(1:43))|35|(1:37)|30|(0)|25|27))|52|6|7|(0)(0)|35|(0)|30|(0)|25|27) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        r8 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadConfig(Continuation<? super ConfigState> continuation) {
        FirebaseConfig$loadConfig$1 firebaseConfig$loadConfig$1;
        Object obj;
        Object coroutine_suspended;
        FirebaseConfig firebaseConfig;
        Exception exc;
        FirebaseConfig firebaseConfig2;
        List list;
        FirebaseConfig firebaseConfig3;
        Task<Boolean> fetchAndActivate;
        FirebaseConfig firebaseConfig4;
        if (continuation instanceof FirebaseConfig$loadConfig$1) {
            firebaseConfig$loadConfig$1 = (FirebaseConfig$loadConfig$1) continuation;
            if ((firebaseConfig$loadConfig$1.label & Integer.MIN_VALUE) != 0) {
                firebaseConfig$loadConfig$1.label -= Integer.MIN_VALUE;
                obj = firebaseConfig$loadConfig$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                firebaseConfig = firebaseConfig$loadConfig$1.label;
                if (firebaseConfig != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        FirebaseRemoteConfig remoteConfig = getRemoteConfig();
                        Intrinsics.checkNotNullExpressionValue(remoteConfig, "<get-remoteConfig>(...)");
                        firebaseConfig$loadConfig$1.L$0 = this;
                        firebaseConfig$loadConfig$1.label = 1;
                        if (preloadFirebaseConfig(remoteConfig, firebaseConfig$loadConfig$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        firebaseConfig3 = this;
                    } catch (Exception e) {
                        e = e;
                        firebaseConfig = this;
                        firebaseConfig$loadConfig$1.L$0 = firebaseConfig;
                        firebaseConfig$loadConfig$1.L$1 = e;
                        firebaseConfig$loadConfig$1.label = 4;
                        Object tryGetFromCache = firebaseConfig.tryGetFromCache(firebaseConfig$loadConfig$1);
                        if (tryGetFromCache == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        exc = e;
                        obj = tryGetFromCache;
                        firebaseConfig2 = firebaseConfig;
                        list = (List) obj;
                        if (list == null) {
                        }
                    }
                } else if (firebaseConfig != 1) {
                    if (firebaseConfig == 2) {
                        FirebaseConfig firebaseConfig5 = (FirebaseConfig) firebaseConfig$loadConfig$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        firebaseConfig4 = firebaseConfig5;
                        Map<String, FirebaseRemoteConfigValue> all = firebaseConfig4.getRemoteConfig().getAll();
                        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
                        FirebaseRemoteConfigParser firebaseRemoteConfigParser = firebaseConfig4.parser;
                        firebaseConfig$loadConfig$1.L$0 = firebaseConfig4;
                        firebaseConfig$loadConfig$1.label = 3;
                        obj = firebaseRemoteConfigParser.parse(all, firebaseConfig$loadConfig$1);
                        firebaseConfig = firebaseConfig4;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return new ConfigState.Loaded((List) obj);
                    } else if (firebaseConfig == 3) {
                        FirebaseConfig firebaseConfig6 = (FirebaseConfig) firebaseConfig$loadConfig$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        firebaseConfig = firebaseConfig6;
                        return new ConfigState.Loaded((List) obj);
                    } else if (firebaseConfig == 4) {
                        exc = (Exception) firebaseConfig$loadConfig$1.L$1;
                        firebaseConfig2 = (FirebaseConfig) firebaseConfig$loadConfig$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        if (list == null) {
                            return new ConfigState.Loaded(list);
                        }
                        Exception exc2 = exc;
                        firebaseConfig2.logger.logException(exc2);
                        return new ConfigState.Error(exc2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    FirebaseConfig firebaseConfig7 = (FirebaseConfig) firebaseConfig$loadConfig$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    firebaseConfig3 = firebaseConfig7;
                }
                fetchAndActivate = firebaseConfig3.getRemoteConfig().fetchAndActivate();
                Intrinsics.checkNotNullExpressionValue(fetchAndActivate, "fetchAndActivate(...)");
                firebaseConfig$loadConfig$1.L$0 = firebaseConfig3;
                firebaseConfig$loadConfig$1.label = 2;
                firebaseConfig4 = firebaseConfig3;
                if (TasksKt.await(fetchAndActivate, firebaseConfig$loadConfig$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Map<String, FirebaseRemoteConfigValue> all2 = firebaseConfig4.getRemoteConfig().getAll();
                Intrinsics.checkNotNullExpressionValue(all2, "getAll(...)");
                FirebaseRemoteConfigParser firebaseRemoteConfigParser2 = firebaseConfig4.parser;
                firebaseConfig$loadConfig$1.L$0 = firebaseConfig4;
                firebaseConfig$loadConfig$1.label = 3;
                obj = firebaseRemoteConfigParser2.parse(all2, firebaseConfig$loadConfig$1);
                firebaseConfig = firebaseConfig4;
                if (obj == coroutine_suspended) {
                }
                return new ConfigState.Loaded((List) obj);
            }
        }
        firebaseConfig$loadConfig$1 = new FirebaseConfig$loadConfig$1(this, continuation);
        obj = firebaseConfig$loadConfig$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        firebaseConfig = firebaseConfig$loadConfig$1.label;
        if (firebaseConfig != 0) {
        }
        fetchAndActivate = firebaseConfig3.getRemoteConfig().fetchAndActivate();
        Intrinsics.checkNotNullExpressionValue(fetchAndActivate, "fetchAndActivate(...)");
        firebaseConfig$loadConfig$1.L$0 = firebaseConfig3;
        firebaseConfig$loadConfig$1.label = 2;
        firebaseConfig4 = firebaseConfig3;
        if (TasksKt.await(fetchAndActivate, firebaseConfig$loadConfig$1) == coroutine_suspended) {
        }
        Map<String, FirebaseRemoteConfigValue> all22 = firebaseConfig4.getRemoteConfig().getAll();
        Intrinsics.checkNotNullExpressionValue(all22, "getAll(...)");
        FirebaseRemoteConfigParser firebaseRemoteConfigParser22 = firebaseConfig4.parser;
        firebaseConfig$loadConfig$1.L$0 = firebaseConfig4;
        firebaseConfig$loadConfig$1.label = 3;
        obj = firebaseRemoteConfigParser22.parse(all22, firebaseConfig$loadConfig$1);
        firebaseConfig = firebaseConfig4;
        if (obj == coroutine_suspended) {
        }
        return new ConfigState.Loaded((List) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object tryGetFromCache(Continuation<? super List<ConfigEntity>> continuation) {
        Map<String, FirebaseRemoteConfigValue> all = getRemoteConfig().getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        if (!all.isEmpty()) {
            return this.parser.parse(all, continuation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object preloadFirebaseConfig(FirebaseRemoteConfig firebaseRemoteConfig, Continuation<? super Unit> continuation) {
        FirebaseConfig$preloadFirebaseConfig$1 firebaseConfig$preloadFirebaseConfig$1;
        Object coroutine_suspended;
        int i;
        Task<Boolean> fetchAndActivate;
        if (continuation instanceof FirebaseConfig$preloadFirebaseConfig$1) {
            firebaseConfig$preloadFirebaseConfig$1 = (FirebaseConfig$preloadFirebaseConfig$1) continuation;
            if ((firebaseConfig$preloadFirebaseConfig$1.label & Integer.MIN_VALUE) != 0) {
                firebaseConfig$preloadFirebaseConfig$1.label -= Integer.MIN_VALUE;
                Object obj = firebaseConfig$preloadFirebaseConfig$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = firebaseConfig$preloadFirebaseConfig$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Task<Void> configSettingsAsync = firebaseRemoteConfig.setConfigSettingsAsync(RemoteConfigKt.remoteConfigSettings(FirebaseConfig$preloadFirebaseConfig$2.INSTANCE));
                    Intrinsics.checkNotNullExpressionValue(configSettingsAsync, "setConfigSettingsAsync(...)");
                    firebaseConfig$preloadFirebaseConfig$1.L$0 = firebaseRemoteConfig;
                    firebaseConfig$preloadFirebaseConfig$1.label = 1;
                    if (TasksKt.await(configSettingsAsync, firebaseConfig$preloadFirebaseConfig$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    firebaseRemoteConfig = (FirebaseRemoteConfig) firebaseConfig$preloadFirebaseConfig$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                fetchAndActivate = firebaseRemoteConfig.fetchAndActivate();
                Intrinsics.checkNotNullExpressionValue(fetchAndActivate, "fetchAndActivate(...)");
                firebaseConfig$preloadFirebaseConfig$1.L$0 = null;
                firebaseConfig$preloadFirebaseConfig$1.label = 2;
                if (TasksKt.await(fetchAndActivate, firebaseConfig$preloadFirebaseConfig$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        firebaseConfig$preloadFirebaseConfig$1 = new FirebaseConfig$preloadFirebaseConfig$1(this, continuation);
        Object obj2 = firebaseConfig$preloadFirebaseConfig$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = firebaseConfig$preloadFirebaseConfig$1.label;
        if (i != 0) {
        }
        fetchAndActivate = firebaseRemoteConfig.fetchAndActivate();
        Intrinsics.checkNotNullExpressionValue(fetchAndActivate, "fetchAndActivate(...)");
        firebaseConfig$preloadFirebaseConfig$1.L$0 = null;
        firebaseConfig$preloadFirebaseConfig$1.label = 2;
        if (TasksKt.await(fetchAndActivate, firebaseConfig$preloadFirebaseConfig$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
