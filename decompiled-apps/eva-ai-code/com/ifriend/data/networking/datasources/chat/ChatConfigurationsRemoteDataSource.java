package com.ifriend.data.networking.datasources.chat;

import com.ifriend.core.remote.common.RetryKt;
import com.ifriend.data.networking.api.configuration.ChatConfigurationsApi;
import com.ifriend.data.networking.api.configuration.model.ChatConfigurationRemote;
import com.ifriend.data.networking.api.configuration.model.ChatIntroRemote;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatConfigurationsRemoteDataSource.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/ChatConfigurationsRemoteDataSource;", "", "api", "Lcom/ifriend/data/networking/api/configuration/ChatConfigurationsApi;", "(Lcom/ifriend/data/networking/api/configuration/ChatConfigurationsApi;)V", "getChatConfigurations", "", "", "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatIntroSlides", "Lcom/ifriend/data/networking/api/configuration/model/ChatIntroRemote;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatConfigurationsRemoteDataSource {
    private final ChatConfigurationsApi api;

    @Inject
    public ChatConfigurationsRemoteDataSource(ChatConfigurationsApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    public final Object getChatConfigurations(Continuation<? super Map<String, ChatConfigurationRemote>> continuation) {
        return RetryKt.retryRemoteRequest$default(2, 0L, 0L, 0.0d, new ChatConfigurationsRemoteDataSource$getChatConfigurations$2(this.api), continuation, 14, null);
    }

    public final Object getChatIntroSlides(Continuation<? super Map<String, ChatIntroRemote>> continuation) {
        return this.api.getChatSlides(continuation);
    }
}
