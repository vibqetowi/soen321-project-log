package com.ifriend.data.repository.config;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.config.FirebaseConfig;
import com.ifriend.data.config.LocalDefaultsConfig;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.storages.tags.TagsLocalDataSource;
import com.ifriend.domain.config.ConfigEntity;
import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.domain.models.Tag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: AppConfigRepositoryImpl.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0013J@\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014¢\u0006\u0002\b\u0017H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001b\u0010#\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ#\u0010#\u001a\u0004\u0018\u00010\u001d2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001f\u0010)\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\u0018\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001bH\u0002J\u001f\u00101\u001a\u0002022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010-R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/ifriend/data/repository/config/AppConfigRepositoryImpl;", "Lcom/ifriend/domain/data/config/AppConfigRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "localDefaultsConfig", "Lcom/ifriend/data/config/LocalDefaultsConfig;", "firebaseConfig", "Lcom/ifriend/data/config/FirebaseConfig;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "tagsLocalDataSource", "Lcom/ifriend/data/storages/tags/TagsLocalDataSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/data/config/LocalDefaultsConfig;Lcom/ifriend/data/config/FirebaseConfig;Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Lcom/ifriend/data/storages/tags/TagsLocalDataSource;Lkotlinx/coroutines/CoroutineScope;)V", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfigStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/config/ConfigState;", "getFeatureEndpointValue", "", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeatureLinkValue", "getFeatureLongValue", "", "getFeatureStringValue", "scope", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVersionLongValue", "isFeatureEnabled", "", "loadConfig", "tags", "", "Lcom/ifriend/domain/models/Tag;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeConfigs", "leftConfig", "rightConfig", "tryRefreshConfig", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppConfigRepositoryImpl implements AppConfigRepository, CoreExecuteCatching {
    private final AppConfigLocalDataSource appConfigLocalDataSource;
    private final CoreExecuteCatching coreExecuteCatching;
    private final FirebaseConfig firebaseConfig;
    private final LocalDefaultsConfig localDefaultsConfig;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public AppConfigRepositoryImpl(CoreExecuteCatching coreExecuteCatching, LocalDefaultsConfig localDefaultsConfig, FirebaseConfig firebaseConfig, AppConfigLocalDataSource appConfigLocalDataSource, TagsLocalDataSource tagsLocalDataSource, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(localDefaultsConfig, "localDefaultsConfig");
        Intrinsics.checkNotNullParameter(firebaseConfig, "firebaseConfig");
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(tagsLocalDataSource, "tagsLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coreExecuteCatching = coreExecuteCatching;
        this.localDefaultsConfig = localDefaultsConfig;
        this.firebaseConfig = firebaseConfig;
        this.appConfigLocalDataSource = appConfigLocalDataSource;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.m8846catch(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(tagsLocalDataSource.getTagsFlow())), new AnonymousClass1(null)), new AnonymousClass2(null)), coroutineScope);
    }

    /* compiled from: AppConfigRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/ifriend/domain/models/Tag;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.config.AppConfigRepositoryImpl$1", f = "AppConfigRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.config.AppConfigRepositoryImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends Tag>>, Throwable, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends Tag>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<Tag>>) flowCollector, th, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<Tag>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return new AnonymousClass1(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AppConfigRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/models/Tag;", "tags", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.config.AppConfigRepositoryImpl$2", f = "AppConfigRepositoryImpl.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.config.AppConfigRepositoryImpl$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends Tag>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends Tag> list, Continuation<? super Unit> continuation) {
            return invoke2((List<Tag>) list, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(List<Tag> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppConfigRepositoryImpl appConfigRepositoryImpl = AppConfigRepositoryImpl.this;
                this.label = 1;
                if (appConfigRepositoryImpl.tryRefreshConfig((List) this.L$0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.ifriend.domain.data.config.AppConfigRepository
    public Flow<ConfigState> getConfigStateFlow() {
        return this.appConfigLocalDataSource.getConfigStateFlow();
    }

    @Override // com.ifriend.domain.data.config.AppConfigRepository
    public Object loadConfig(List<Tag> list, Continuation<? super ConfigState> continuation) {
        return executeInBackground(new AppConfigRepositoryImpl$loadConfig$2(this, list, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(7:20|21|22|(2:24|(1:26))|13|14|15))(3:27|28|29))(3:33|34|(1:36)(1:37))|30|(1:32)|22|(0)|13|14|15))|40|6|7|(0)(0)|30|(0)|22|(0)|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
        r8 = kotlin.Result.Companion;
        kotlin.Result.m7271constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:13:0x002c, B:36:0x0091, B:18:0x0040, B:31:0x0075, B:33:0x007b, B:21:0x0048, B:28:0x0063, B:24:0x0050), top: B:42:0x0024 }] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryRefreshConfig(List<Tag> list, Continuation<? super Unit> continuation) {
        AppConfigRepositoryImpl$tryRefreshConfig$1 appConfigRepositoryImpl$tryRefreshConfig$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        AppConfigRepositoryImpl appConfigRepositoryImpl;
        ConfigState.Loaded loaded;
        ConfigState configState;
        if (continuation instanceof AppConfigRepositoryImpl$tryRefreshConfig$1) {
            appConfigRepositoryImpl$tryRefreshConfig$1 = (AppConfigRepositoryImpl$tryRefreshConfig$1) continuation;
            if ((appConfigRepositoryImpl$tryRefreshConfig$1.label & Integer.MIN_VALUE) != 0) {
                appConfigRepositoryImpl$tryRefreshConfig$1.label -= Integer.MIN_VALUE;
                obj = appConfigRepositoryImpl$tryRefreshConfig$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appConfigRepositoryImpl$tryRefreshConfig$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    AppConfigRepositoryImpl appConfigRepositoryImpl2 = this;
                    LocalDefaultsConfig localDefaultsConfig = this.localDefaultsConfig;
                    appConfigRepositoryImpl$tryRefreshConfig$1.L$0 = this;
                    appConfigRepositoryImpl$tryRefreshConfig$1.label = 1;
                    obj = localDefaultsConfig.loadConfig(list, appConfigRepositoryImpl$tryRefreshConfig$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appConfigRepositoryImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            Result.m7271constructorimpl(Unit.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    loaded = (ConfigState.Loaded) appConfigRepositoryImpl$tryRefreshConfig$1.L$1;
                    appConfigRepositoryImpl = (AppConfigRepositoryImpl) appConfigRepositoryImpl$tryRefreshConfig$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    configState = (ConfigState) obj;
                    if (configState instanceof ConfigState.Loaded) {
                        ConfigState mergeConfigs = appConfigRepositoryImpl.mergeConfigs(loaded, configState);
                        AppConfigLocalDataSource appConfigLocalDataSource = appConfigRepositoryImpl.appConfigLocalDataSource;
                        appConfigRepositoryImpl$tryRefreshConfig$1.L$0 = null;
                        appConfigRepositoryImpl$tryRefreshConfig$1.L$1 = null;
                        appConfigRepositoryImpl$tryRefreshConfig$1.label = 3;
                        if (appConfigLocalDataSource.updateState(mergeConfigs, appConfigRepositoryImpl$tryRefreshConfig$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    Result.m7271constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                } else {
                    AppConfigRepositoryImpl appConfigRepositoryImpl3 = (AppConfigRepositoryImpl) appConfigRepositoryImpl$tryRefreshConfig$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    appConfigRepositoryImpl = appConfigRepositoryImpl3;
                }
                loaded = obj;
                FirebaseConfig firebaseConfig = appConfigRepositoryImpl.firebaseConfig;
                appConfigRepositoryImpl$tryRefreshConfig$1.L$0 = appConfigRepositoryImpl;
                appConfigRepositoryImpl$tryRefreshConfig$1.L$1 = loaded;
                appConfigRepositoryImpl$tryRefreshConfig$1.label = 2;
                obj = firebaseConfig.loadConfig(appConfigRepositoryImpl$tryRefreshConfig$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                configState = (ConfigState) obj;
                if (configState instanceof ConfigState.Loaded) {
                }
                Result.m7271constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
        }
        appConfigRepositoryImpl$tryRefreshConfig$1 = new AppConfigRepositoryImpl$tryRefreshConfig$1(this, continuation);
        obj = appConfigRepositoryImpl$tryRefreshConfig$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appConfigRepositoryImpl$tryRefreshConfig$1.label;
        if (i != 0) {
        }
        loaded = obj;
        FirebaseConfig firebaseConfig2 = appConfigRepositoryImpl.firebaseConfig;
        appConfigRepositoryImpl$tryRefreshConfig$1.L$0 = appConfigRepositoryImpl;
        appConfigRepositoryImpl$tryRefreshConfig$1.L$1 = loaded;
        appConfigRepositoryImpl$tryRefreshConfig$1.label = 2;
        obj = firebaseConfig2.loadConfig(appConfigRepositoryImpl$tryRefreshConfig$1);
        if (obj == coroutine_suspended) {
        }
        configState = (ConfigState) obj;
        if (configState instanceof ConfigState.Loaded) {
        }
        Result.m7271constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.config.AppConfigRepository
    public Object isFeatureEnabled(String str, Continuation<? super Boolean> continuation) {
        return executeInBackground(new AppConfigRepositoryImpl$isFeatureEnabled$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.config.AppConfigRepository
    public Object getFeatureLongValue(String str, Continuation<? super Long> continuation) {
        return executeInBackground(new AppConfigRepositoryImpl$getFeatureLongValue$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.config.AppConfigRepository
    public Object getVersionLongValue(String str, Continuation<? super Long> continuation) {
        return executeInBackground(new AppConfigRepositoryImpl$getVersionLongValue$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.config.AppConfigRepository
    public Object getFeatureStringValue(String str, String str2, Continuation<? super String> continuation) {
        return executeInBackground(new AppConfigRepositoryImpl$getFeatureStringValue$2(this, str, str2, null), continuation);
    }

    @Override // com.ifriend.domain.data.config.AppConfigRepository
    public Object getFeatureStringValue(String str, Continuation<? super String> continuation) {
        return executeInBackground(new AppConfigRepositoryImpl$getFeatureStringValue$4(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.config.AppConfigRepository
    public Object getFeatureLinkValue(String str, Continuation<? super String> continuation) {
        return executeInBackground(new AppConfigRepositoryImpl$getFeatureLinkValue$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.config.AppConfigRepository
    public Object getFeatureEndpointValue(String str, Continuation<? super String> continuation) {
        return executeInBackground(new AppConfigRepositoryImpl$getFeatureEndpointValue$2(this, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfigState mergeConfigs(ConfigState configState, ConfigState configState2) {
        if ((configState instanceof ConfigState.Error) && (configState2 instanceof ConfigState.Error)) {
            return new ConfigState.Error(CollectionsKt.plus((Collection) ((ConfigState.Error) configState).getErrors(), (Iterable) ((ConfigState.Error) configState2).getErrors()));
        }
        boolean z = configState instanceof ConfigState.Loaded;
        if (!z || (configState2 instanceof ConfigState.Loaded)) {
            if (!(configState2 instanceof ConfigState.Loaded) || z) {
                List<ConfigEntity> entities = configState.getEntities();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
                for (ConfigEntity configEntity : entities) {
                    arrayList.add(configEntity.getKey());
                }
                ArrayList arrayList2 = arrayList;
                List<ConfigEntity> entities2 = configState2.getEntities();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities2, 10));
                for (ConfigEntity configEntity2 : entities2) {
                    arrayList3.add(configEntity2.getKey());
                }
                List minus = CollectionsKt.minus((Iterable) arrayList2, (Iterable) arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : configState.getEntities()) {
                    if (minus.contains(((ConfigEntity) obj).getKey())) {
                        arrayList4.add(obj);
                    }
                }
                return configState2.plus(arrayList4);
            }
            return configState2;
        }
        return configState;
    }
}
