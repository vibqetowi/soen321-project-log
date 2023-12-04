package com.ifriend.data.socket;

import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.api.SocketShardsApi;
import com.ifriend.data.networking.responses.ShardsResponse;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Response;
/* compiled from: MessagesSocketUrlProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ*\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\u001b\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/ifriend/data/socket/MessagesSocketUrlProvider;", "Lcom/ifriend/data/socket/SocketUrlProvider;", "api", "Lcom/ifriend/data/networking/api/SocketShardsApi;", "apiUrl", "", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/data/networking/api/SocketShardsApi;Ljava/lang/String;Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/common_utils/Logger;)V", "buildUrl", "shard", "host", "key", AnalyticsConstants.TIMESTAMP, "getUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internalGetUrl", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessagesSocketUrlProvider implements SocketUrlProvider {
    private final SocketShardsApi api;
    private final String apiUrl;
    private final AuthDataProvider authDataProvider;
    private final Logger logger;

    public MessagesSocketUrlProvider(SocketShardsApi api, String apiUrl, AuthDataProvider authDataProvider, Logger logger) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.api = api;
        this.apiUrl = apiUrl;
        this.authDataProvider = authDataProvider;
        this.logger = logger;
    }

    @Override // com.ifriend.data.socket.SocketUrlProvider
    public Object getUrl(String str, Continuation<? super String> continuation) {
        return internalGetUrl(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalGetUrl(String str, Continuation<? super String> continuation) {
        MessagesSocketUrlProvider$internalGetUrl$1 messagesSocketUrlProvider$internalGetUrl$1;
        int i;
        MessagesSocketUrlProvider messagesSocketUrlProvider;
        AuthData authData;
        String str2;
        MessagesSocketUrlProvider messagesSocketUrlProvider2;
        String str3;
        Response response;
        String shard;
        String key;
        if (continuation instanceof MessagesSocketUrlProvider$internalGetUrl$1) {
            messagesSocketUrlProvider$internalGetUrl$1 = (MessagesSocketUrlProvider$internalGetUrl$1) continuation;
            if ((messagesSocketUrlProvider$internalGetUrl$1.label & Integer.MIN_VALUE) != 0) {
                messagesSocketUrlProvider$internalGetUrl$1.label -= Integer.MIN_VALUE;
                Object obj = messagesSocketUrlProvider$internalGetUrl$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = messagesSocketUrlProvider$internalGetUrl$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthDataProvider authDataProvider = this.authDataProvider;
                    messagesSocketUrlProvider$internalGetUrl$1.L$0 = this;
                    messagesSocketUrlProvider$internalGetUrl$1.L$1 = str;
                    messagesSocketUrlProvider$internalGetUrl$1.label = 1;
                    obj = authDataProvider.lastAuthData(messagesSocketUrlProvider$internalGetUrl$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    messagesSocketUrlProvider = this;
                } else if (i != 1) {
                    if (i == 2) {
                        str3 = (String) messagesSocketUrlProvider$internalGetUrl$1.L$2;
                        str2 = (String) messagesSocketUrlProvider$internalGetUrl$1.L$1;
                        messagesSocketUrlProvider2 = (MessagesSocketUrlProvider) messagesSocketUrlProvider$internalGetUrl$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        response = (Response) obj;
                        if (!response.isSuccessful()) {
                            ShardsResponse shardsResponse = (ShardsResponse) response.body();
                            if (shardsResponse == null || (shard = shardsResponse.getShard()) == null) {
                                throw new IllegalStateException("Shard is null");
                            }
                            ShardsResponse shardsResponse2 = (ShardsResponse) response.body();
                            if (shardsResponse2 == null || (key = shardsResponse2.getKey()) == null) {
                                throw new IllegalStateException("Key is null");
                            }
                            Log.e("Shard", shard);
                            Log.e("Key", key);
                            String buildUrl = messagesSocketUrlProvider2.buildUrl(shard, (String) StringsKt.split$default((CharSequence) messagesSocketUrlProvider2.apiUrl, new String[]{"//api."}, false, 0, 6, (Object) null).get(1), key, str2);
                            messagesSocketUrlProvider2.logger.log("Socket url for user " + str3 + ": " + buildUrl);
                            return buildUrl;
                        }
                        throw new IllegalStateException("Shards response is not successful");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) messagesSocketUrlProvider$internalGetUrl$1.L$1;
                    messagesSocketUrlProvider = (MessagesSocketUrlProvider) messagesSocketUrlProvider$internalGetUrl$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                authData = (AuthData) obj;
                if (authData != null) {
                    throw new IllegalStateException("User is not logged in");
                }
                String value = authData.getUserId().getValue();
                String formatted = authData.getToken().formatted();
                messagesSocketUrlProvider.logger.log("Creating socket url for user " + value);
                SocketShardsApi socketShardsApi = messagesSocketUrlProvider.api;
                messagesSocketUrlProvider$internalGetUrl$1.L$0 = messagesSocketUrlProvider;
                messagesSocketUrlProvider$internalGetUrl$1.L$1 = str;
                messagesSocketUrlProvider$internalGetUrl$1.L$2 = value;
                messagesSocketUrlProvider$internalGetUrl$1.label = 2;
                obj = socketShardsApi.getShards(formatted, value, messagesSocketUrlProvider$internalGetUrl$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                messagesSocketUrlProvider2 = messagesSocketUrlProvider;
                str3 = value;
                response = (Response) obj;
                if (!response.isSuccessful()) {
                }
            }
        }
        messagesSocketUrlProvider$internalGetUrl$1 = new MessagesSocketUrlProvider$internalGetUrl$1(this, continuation);
        Object obj2 = messagesSocketUrlProvider$internalGetUrl$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = messagesSocketUrlProvider$internalGetUrl$1.label;
        if (i != 0) {
        }
        authData = (AuthData) obj2;
        if (authData != null) {
        }
    }

    private final String buildUrl(String str, String str2, String str3, String str4) {
        String str5;
        String str6 = str4;
        if (str6 == null || str6.length() == 0) {
            str5 = "";
        } else {
            str5 = "?sync=" + str4;
        }
        String str7 = "wss://rt" + str + "." + str2 + RemoteSettings.FORWARD_SLASH_STRING + str3 + str5;
        Log.e("Build url", str7);
        return str7;
    }
}
