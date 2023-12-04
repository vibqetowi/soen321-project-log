package com.ifriend.data.repository;

import com.facebook.internal.NativeProtocol;
import com.google.gson.JsonObject;
import com.ifriend.data.networking.api.RateUsApi;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.RateUsRepository;
import com.ifriend.domain.models.profile.user.AuthData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;
/* compiled from: RateUsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJW\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2<\u0010\u000e\u001a8\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000fH\u0082Hø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/data/repository/RateUsRepositoryImpl;", "Lcom/ifriend/domain/data/RateUsRepository;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "rateUsApi", "Lcom/ifriend/data/networking/api/RateUsApi;", "(Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/data/networking/api/RateUsApi;)V", "review", "", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withAuth", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "token", "userId", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RateUsRepositoryImpl implements RateUsRepository {
    private final AuthDataProvider authDataProvider;
    private final RateUsApi rateUsApi;

    public RateUsRepositoryImpl(AuthDataProvider authDataProvider, RateUsApi rateUsApi) {
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(rateUsApi, "rateUsApi");
        this.authDataProvider = authDataProvider;
        this.rateUsApi = rateUsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // com.ifriend.domain.data.RateUsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object review(String str, Continuation<? super Boolean> continuation) {
        RateUsRepositoryImpl$review$1 rateUsRepositoryImpl$review$1;
        int i;
        RateUsRepositoryImpl rateUsRepositoryImpl;
        AuthData authData;
        Response response;
        if (continuation instanceof RateUsRepositoryImpl$review$1) {
            rateUsRepositoryImpl$review$1 = (RateUsRepositoryImpl$review$1) continuation;
            if ((rateUsRepositoryImpl$review$1.label & Integer.MIN_VALUE) != 0) {
                rateUsRepositoryImpl$review$1.label -= Integer.MIN_VALUE;
                Object obj = rateUsRepositoryImpl$review$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rateUsRepositoryImpl$review$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthDataProvider authDataProvider = this.authDataProvider;
                    rateUsRepositoryImpl$review$1.L$0 = this;
                    rateUsRepositoryImpl$review$1.L$1 = str;
                    rateUsRepositoryImpl$review$1.label = 1;
                    obj = authDataProvider.lastAuthData(rateUsRepositoryImpl$review$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    rateUsRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        response = (Response) obj;
                        if (response != null || !response.isSuccessful()) {
                            z = false;
                        }
                        return Boxing.boxBoolean(z);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) rateUsRepositoryImpl$review$1.L$1;
                    rateUsRepositoryImpl = (RateUsRepositoryImpl) rateUsRepositoryImpl$review$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                authData = (AuthData) obj;
                response = null;
                if (authData != null) {
                    String formatted = authData.getToken().formatted();
                    String value = authData.getUserId().getValue();
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("t_" + System.currentTimeMillis(), str);
                    RateUsApi rateUsApi = rateUsRepositoryImpl.rateUsApi;
                    rateUsRepositoryImpl$review$1.L$0 = null;
                    rateUsRepositoryImpl$review$1.L$1 = null;
                    rateUsRepositoryImpl$review$1.label = 2;
                    obj = rateUsApi.review(formatted, value, jsonObject, rateUsRepositoryImpl$review$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    response = (Response) obj;
                }
                if (response != null) {
                }
                z = false;
                return Boxing.boxBoolean(z);
            }
        }
        rateUsRepositoryImpl$review$1 = new RateUsRepositoryImpl$review$1(this, continuation);
        Object obj2 = rateUsRepositoryImpl$review$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rateUsRepositoryImpl$review$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        authData = (AuthData) obj2;
        response = null;
        if (authData != null) {
        }
        if (response != null) {
        }
        z2 = false;
        return Boxing.boxBoolean(z2);
    }

    private final Object withAuth(Function2<? super String, ? super String, Response<ResponseBody>> function2, Continuation<? super Response<ResponseBody>> continuation) {
        AuthDataProvider authDataProvider = this.authDataProvider;
        InlineMarker.mark(0);
        Object lastAuthData = authDataProvider.lastAuthData(continuation);
        InlineMarker.mark(1);
        AuthData authData = (AuthData) lastAuthData;
        if (authData != null) {
            return function2.invoke(authData.getToken().formatted(), authData.getUserId().getValue());
        }
        return null;
    }
}
