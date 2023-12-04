package com.ifriend.data.initialLoaders;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: AppConfigLoader.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/data/initialLoaders/AppConfigLoader;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "appConfigRepository", "Lcom/ifriend/domain/data/config/AppConfigRepository;", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "(Lcom/ifriend/domain/data/config/AppConfigRepository;Lcom/ifriend/domain/data/TagsProvider;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;)V", "load", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppConfigLoader implements InitialDataLoader {
    private final AnalyticsInteractor analyticsInteractor;
    private final AppConfigRepository appConfigRepository;
    private final TagsProvider tagsProvider;

    @Inject
    public AppConfigLoader(AppConfigRepository appConfigRepository, TagsProvider tagsProvider, AnalyticsInteractor analyticsInteractor) {
        Intrinsics.checkNotNullParameter(appConfigRepository, "appConfigRepository");
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        this.appConfigRepository = appConfigRepository;
        this.tagsProvider = tagsProvider;
        this.analyticsInteractor = analyticsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    @Override // com.ifriend.domain.services.initialData.InitialDataLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(Continuation<? super Boolean> continuation) {
        AppConfigLoader$load$1 appConfigLoader$load$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        AppConfigLoader appConfigLoader;
        List<Tag> list;
        AppConfigLoader appConfigLoader2;
        boolean z;
        if (continuation instanceof AppConfigLoader$load$1) {
            appConfigLoader$load$1 = (AppConfigLoader$load$1) continuation;
            if ((appConfigLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                appConfigLoader$load$1.label -= Integer.MIN_VALUE;
                obj = appConfigLoader$load$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appConfigLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appConfigLoader$load$1.L$0 = this;
                    appConfigLoader$load$1.label = 1;
                    obj = FlowKt.first(this.tagsProvider.tagsFlow(), new AppConfigLoader$load$tags$1(null), appConfigLoader$load$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appConfigLoader = this;
                } else if (i != 1) {
                    if (i == 2) {
                        appConfigLoader2 = (AppConfigLoader) appConfigLoader$load$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ConfigState configState = (ConfigState) obj;
                        z = configState instanceof ConfigState.Error;
                        if (z) {
                            AnalyticsInteractor analyticsInteractor = appConfigLoader2.analyticsInteractor;
                            Exception exc = (Throwable) CollectionsKt.firstOrNull((List<? extends Object>) ((ConfigState.Error) configState).getErrors());
                            if (exc == null) {
                                exc = new Exception("loadConfig");
                            }
                            analyticsInteractor.trackException("Load app config", exc);
                        }
                        return Boxing.boxBoolean(!z);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    appConfigLoader = (AppConfigLoader) appConfigLoader$load$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                AppConfigRepository appConfigRepository = appConfigLoader.appConfigRepository;
                appConfigLoader$load$1.L$0 = appConfigLoader;
                appConfigLoader$load$1.label = 2;
                obj = appConfigRepository.loadConfig(list, appConfigLoader$load$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                appConfigLoader2 = appConfigLoader;
                ConfigState configState2 = (ConfigState) obj;
                z = configState2 instanceof ConfigState.Error;
                if (z) {
                }
                return Boxing.boxBoolean(!z);
            }
        }
        appConfigLoader$load$1 = new AppConfigLoader$load$1(this, continuation);
        obj = appConfigLoader$load$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appConfigLoader$load$1.label;
        if (i != 0) {
        }
        list = (List) obj;
        if (list == null) {
        }
        AppConfigRepository appConfigRepository2 = appConfigLoader.appConfigRepository;
        appConfigLoader$load$1.L$0 = appConfigLoader;
        appConfigLoader$load$1.label = 2;
        obj = appConfigRepository2.loadConfig(list, appConfigLoader$load$1);
        if (obj != coroutine_suspended) {
        }
    }
}
