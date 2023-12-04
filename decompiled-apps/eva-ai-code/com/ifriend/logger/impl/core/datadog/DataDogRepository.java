package com.ifriend.logger.impl.core.datadog;

import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.DataDogApiService;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.platform.tools.api.AppInfoProvider;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
/* compiled from: DataDogRepository.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J5\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/ifriend/logger/impl/core/datadog/DataDogRepository;", "", "dataDogApiService", "Lcom/ifriend/core/remote/services/DataDogApiService;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "appInfoProvider", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "gson", "Lcom/google/gson/Gson;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "(Lcom/ifriend/core/remote/services/DataDogApiService;Lcom/ifriend/core/local/api/AuthLocalDataSource;Lcom/ifriend/platform/tools/api/AppInfoProvider;Lcom/google/gson/Gson;Lcom/ifriend/core/tools/api/DispatcherProvider;)V", "getUserId", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTestAccount", "", "email", "provideBody", "payload", FirebaseAnalytics.Param.LEVEL, "service", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataDogRepository {
    private final AppInfoProvider appInfoProvider;
    private final AuthLocalDataSource authLocalDataSource;
    private final DataDogApiService dataDogApiService;
    private final DispatcherProvider dispatcherProvider;
    private final Gson gson;

    @Inject
    public DataDogRepository(DataDogApiService dataDogApiService, AuthLocalDataSource authLocalDataSource, AppInfoProvider appInfoProvider, Gson gson, DispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(dataDogApiService, "dataDogApiService");
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        Intrinsics.checkNotNullParameter(appInfoProvider, "appInfoProvider");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.dataDogApiService = dataDogApiService;
        this.authLocalDataSource = authLocalDataSource;
        this.appInfoProvider = appInfoProvider;
        this.gson = gson;
        this.dispatcherProvider = dispatcherProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getUserId(Continuation<? super String> continuation) {
        return this.authLocalDataSource.getUserId(continuation);
    }

    public final Object sendEvent(String str, String str2, Map<String, String> map, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatcherProvider.background(), new DataDogRepository$sendEvent$2(this, map, str, str2, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object provideBody(Object obj, String str, String str2, Continuation<? super String> continuation) {
        DataDogRepository$provideBody$1 dataDogRepository$provideBody$1;
        Object coroutine_suspended;
        int i;
        Object obj2;
        String str3;
        String str4;
        Object userId;
        DataDogRepository dataDogRepository;
        Object userEmail;
        String str5;
        String str6;
        String str7;
        Object obj3;
        DataDogRepository dataDogRepository2;
        String str8;
        String str9;
        String str10;
        if (continuation instanceof DataDogRepository$provideBody$1) {
            dataDogRepository$provideBody$1 = (DataDogRepository$provideBody$1) continuation;
            if ((dataDogRepository$provideBody$1.label & Integer.MIN_VALUE) != 0) {
                dataDogRepository$provideBody$1.label -= Integer.MIN_VALUE;
                Object obj4 = dataDogRepository$provideBody$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataDogRepository$provideBody$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj4);
                    dataDogRepository$provideBody$1.L$0 = this;
                    obj2 = obj;
                    dataDogRepository$provideBody$1.L$1 = obj2;
                    str3 = str;
                    dataDogRepository$provideBody$1.L$2 = str3;
                    str4 = str2;
                    dataDogRepository$provideBody$1.L$3 = str4;
                    dataDogRepository$provideBody$1.label = 1;
                    userId = getUserId(dataDogRepository$provideBody$1);
                    if (userId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dataDogRepository = this;
                } else if (i != 1) {
                    if (i == 2) {
                        obj3 = dataDogRepository$provideBody$1.L$1;
                        dataDogRepository2 = (DataDogRepository) dataDogRepository$provideBody$1.L$0;
                        ResultKt.throwOnFailure(obj4);
                        str6 = (String) dataDogRepository$provideBody$1.L$6;
                        str8 = (String) dataDogRepository$provideBody$1.L$4;
                        str5 = (String) dataDogRepository$provideBody$1.L$3;
                        str7 = (String) dataDogRepository$provideBody$1.L$2;
                        str9 = (String) dataDogRepository$provideBody$1.L$5;
                        str10 = (String) obj4;
                        if (str10 == null) {
                            str10 = "";
                        }
                        Gson gson = dataDogRepository2.gson;
                        JsonElement jsonTree = gson.toJsonTree(obj3);
                        boolean isTestAccount = dataDogRepository2.isTestAccount(str10);
                        Intrinsics.checkNotNull(jsonTree);
                        String json = gson.toJson(new DataDogRemoteParams(null, null, str9, jsonTree, str8, isTestAccount, str7, str5, null, str6, 259, null));
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        return json;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    String str11 = (String) dataDogRepository$provideBody$1.L$2;
                    Object obj5 = dataDogRepository$provideBody$1.L$1;
                    dataDogRepository = (DataDogRepository) dataDogRepository$provideBody$1.L$0;
                    ResultKt.throwOnFailure(obj4);
                    userId = obj4;
                    obj2 = obj5;
                    str4 = (String) dataDogRepository$provideBody$1.L$3;
                    str3 = str11;
                }
                String str12 = (String) userId;
                String versionName = dataDogRepository.appInfoProvider.getVersionName();
                String deviceInfo = dataDogRepository.appInfoProvider.getDeviceInfo();
                AuthLocalDataSource authLocalDataSource = dataDogRepository.authLocalDataSource;
                dataDogRepository$provideBody$1.L$0 = dataDogRepository;
                dataDogRepository$provideBody$1.L$1 = obj2;
                dataDogRepository$provideBody$1.L$2 = str3;
                dataDogRepository$provideBody$1.L$3 = str4;
                dataDogRepository$provideBody$1.L$4 = str12;
                dataDogRepository$provideBody$1.L$5 = versionName;
                dataDogRepository$provideBody$1.L$6 = deviceInfo;
                dataDogRepository$provideBody$1.label = 2;
                userEmail = authLocalDataSource.getUserEmail(dataDogRepository$provideBody$1);
                if (userEmail != coroutine_suspended) {
                    return coroutine_suspended;
                }
                str5 = str4;
                str6 = deviceInfo;
                str7 = str3;
                DataDogRepository dataDogRepository3 = dataDogRepository;
                obj3 = obj2;
                obj4 = userEmail;
                dataDogRepository2 = dataDogRepository3;
                str8 = str12;
                str9 = versionName;
                str10 = (String) obj4;
                if (str10 == null) {
                }
                Gson gson2 = dataDogRepository2.gson;
                JsonElement jsonTree2 = gson2.toJsonTree(obj3);
                boolean isTestAccount2 = dataDogRepository2.isTestAccount(str10);
                Intrinsics.checkNotNull(jsonTree2);
                String json2 = gson2.toJson(new DataDogRemoteParams(null, null, str9, jsonTree2, str8, isTestAccount2, str7, str5, null, str6, 259, null));
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                return json2;
            }
        }
        dataDogRepository$provideBody$1 = new DataDogRepository$provideBody$1(this, continuation);
        Object obj42 = dataDogRepository$provideBody$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataDogRepository$provideBody$1.label;
        if (i != 0) {
        }
        String str122 = (String) userId;
        String versionName2 = dataDogRepository.appInfoProvider.getVersionName();
        String deviceInfo2 = dataDogRepository.appInfoProvider.getDeviceInfo();
        AuthLocalDataSource authLocalDataSource2 = dataDogRepository.authLocalDataSource;
        dataDogRepository$provideBody$1.L$0 = dataDogRepository;
        dataDogRepository$provideBody$1.L$1 = obj2;
        dataDogRepository$provideBody$1.L$2 = str3;
        dataDogRepository$provideBody$1.L$3 = str4;
        dataDogRepository$provideBody$1.L$4 = str122;
        dataDogRepository$provideBody$1.L$5 = versionName2;
        dataDogRepository$provideBody$1.L$6 = deviceInfo2;
        dataDogRepository$provideBody$1.label = 2;
        userEmail = authLocalDataSource2.getUserEmail(dataDogRepository$provideBody$1);
        if (userEmail != coroutine_suspended) {
        }
    }

    private final boolean isTestAccount(String str) {
        String str2 = str;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "atolive1", false, 2, (Object) null)) {
            return StringsKt.contains$default((CharSequence) str2, (CharSequence) "@test.test", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "@gmail.com", false, 2, (Object) null);
        }
        return false;
    }
}
