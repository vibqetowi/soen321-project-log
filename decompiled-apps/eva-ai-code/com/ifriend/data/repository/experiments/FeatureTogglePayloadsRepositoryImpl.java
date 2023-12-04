package com.ifriend.data.repository.experiments;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.mappers.featuretoggles.FeatureToggleBotIdsMapper;
import com.ifriend.data.repository.experiments.model.FeatureToggleBotIdsData;
import com.ifriend.data.repository.experiments.model.FeatureToggleConditionBotIdsData;
import com.ifriend.data.repository.experiments.model.FeatureToggleConditionsData;
import com.ifriend.data.repository.experiments.model.FeatureTogglePayloadConditionsData;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.domain.config.ConfigEntity;
import com.ifriend.domain.data.experiments.FeatureTogglePayloadsRepository;
import com.ifriend.domain.models.experiments.common.FeatureToggleChatIds;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
/* compiled from: FeatureTogglePayloadsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u000fJ@\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/ifriend/data/repository/experiments/FeatureTogglePayloadsRepositoryImpl;", "Lcom/ifriend/domain/data/experiments/FeatureTogglePayloadsRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "json", "Lkotlinx/serialization/json/Json;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "featureToggleBotIdsMapper", "Lcom/ifriend/data/mappers/featuretoggles/FeatureToggleBotIdsMapper;", "(Lcom/ifriend/data/common/CoreExecuteCatching;Lkotlinx/serialization/json/Json;Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Lcom/ifriend/data/mappers/featuretoggles/FeatureToggleBotIdsMapper;)V", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatIdsPayload", "", "Lcom/ifriend/domain/models/experiments/common/FeatureToggleChatIds;", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatsFeaturePayload", "getPayload", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureTogglePayloadsRepositoryImpl implements FeatureTogglePayloadsRepository, CoreExecuteCatching {
    private final AppConfigLocalDataSource appConfigLocalDataSource;
    private final CoreExecuteCatching coreExecuteCatching;
    private final FeatureToggleBotIdsMapper featureToggleBotIdsMapper;
    private final Json json;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public FeatureTogglePayloadsRepositoryImpl(CoreExecuteCatching coreExecuteCatching, Json json, AppConfigLocalDataSource appConfigLocalDataSource, FeatureToggleBotIdsMapper featureToggleBotIdsMapper) {
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(featureToggleBotIdsMapper, "featureToggleBotIdsMapper");
        this.coreExecuteCatching = coreExecuteCatching;
        this.json = json;
        this.appConfigLocalDataSource = appConfigLocalDataSource;
        this.featureToggleBotIdsMapper = featureToggleBotIdsMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPayload(String str, Continuation<? super String> continuation) {
        FeatureTogglePayloadsRepositoryImpl$getPayload$1 featureTogglePayloadsRepositoryImpl$getPayload$1;
        int i;
        ConfigEntity configEntity;
        if (continuation instanceof FeatureTogglePayloadsRepositoryImpl$getPayload$1) {
            featureTogglePayloadsRepositoryImpl$getPayload$1 = (FeatureTogglePayloadsRepositoryImpl$getPayload$1) continuation;
            if ((featureTogglePayloadsRepositoryImpl$getPayload$1.label & Integer.MIN_VALUE) != 0) {
                featureTogglePayloadsRepositoryImpl$getPayload$1.label -= Integer.MIN_VALUE;
                Object obj = featureTogglePayloadsRepositoryImpl$getPayload$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = featureTogglePayloadsRepositoryImpl$getPayload$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppConfigLocalDataSource appConfigLocalDataSource = this.appConfigLocalDataSource;
                    featureTogglePayloadsRepositoryImpl$getPayload$1.label = 1;
                    obj = appConfigLocalDataSource.getFeatureEntity(str, featureTogglePayloadsRepositoryImpl$getPayload$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                configEntity = (ConfigEntity) obj;
                if (configEntity == null) {
                    return configEntity.getPayload();
                }
                return null;
            }
        }
        featureTogglePayloadsRepositoryImpl$getPayload$1 = new FeatureTogglePayloadsRepositoryImpl$getPayload$1(this, continuation);
        Object obj2 = featureTogglePayloadsRepositoryImpl$getPayload$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = featureTogglePayloadsRepositoryImpl$getPayload$1.label;
        if (i != 0) {
        }
        configEntity = (ConfigEntity) obj2;
        if (configEntity == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatIdsPayload(String str, Continuation<? super List<FeatureToggleChatIds>> continuation) {
        FeatureTogglePayloadsRepositoryImpl$getChatIdsPayload$1 featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1;
        int i;
        FeatureTogglePayloadsRepositoryImpl featureTogglePayloadsRepositoryImpl;
        String str2;
        if (continuation instanceof FeatureTogglePayloadsRepositoryImpl$getChatIdsPayload$1) {
            featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1 = (FeatureTogglePayloadsRepositoryImpl$getChatIdsPayload$1) continuation;
            if ((featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1.label & Integer.MIN_VALUE) != 0) {
                featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1.label -= Integer.MIN_VALUE;
                Object obj = featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1.L$0 = this;
                    featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1.label = 1;
                    obj = getPayload(str, featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    featureTogglePayloadsRepositoryImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    featureTogglePayloadsRepositoryImpl = (FeatureTogglePayloadsRepositoryImpl) featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str2 = (String) obj;
                if (str2 != null) {
                    return CollectionsKt.emptyList();
                }
                Json json = featureTogglePayloadsRepositoryImpl.json;
                FeatureToggleConditionsData payload = ((FeatureTogglePayloadConditionsData) json.decodeFromString(SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(FeatureTogglePayloadConditionsData.class, KTypeProjection.Companion.invariant(Reflection.typeOf(FeatureToggleConditionBotIdsData.class)))), str2)).getPayload();
                List<FeatureToggleConditionBotIdsData> conditions = payload != null ? payload.getConditions() : null;
                if (conditions == null) {
                    conditions = CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (FeatureToggleConditionBotIdsData featureToggleConditionBotIdsData : conditions) {
                    FeatureToggleBotIdsData chatIdsCondition = featureToggleConditionBotIdsData.getChatIdsCondition();
                    FeatureToggleChatIds map = chatIdsCondition != null ? featureTogglePayloadsRepositoryImpl.featureToggleBotIdsMapper.map(chatIdsCondition) : null;
                    if (map != null) {
                        arrayList.add(map);
                    }
                }
                return arrayList;
            }
        }
        featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1 = new FeatureTogglePayloadsRepositoryImpl$getChatIdsPayload$1(this, continuation);
        Object obj2 = featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = featureTogglePayloadsRepositoryImpl$getChatIdsPayload$1.label;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    @Override // com.ifriend.domain.data.experiments.FeatureTogglePayloadsRepository
    public Object getChatsFeaturePayload(String str, Continuation<? super List<FeatureToggleChatIds>> continuation) {
        return executeInBackground(new FeatureTogglePayloadsRepositoryImpl$getChatsFeaturePayload$2(this, str, null), continuation);
    }
}
