package com.ifriend.data.networking.api.configuration;

import com.ifriend.data.networking.api.configuration.model.ChatConfigurationRemote;
import com.ifriend.data.networking.api.configuration.model.ChatIntroRemote;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
/* compiled from: ChatConfigurationsApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/ChatConfigurationsApi;", "", "getChatConfigurations", "", "", "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatSlides", "Lcom/ifriend/data/networking/api/configuration/model/ChatIntroRemote;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatConfigurationsApi {
    @GET("/ai/configuration/bots")
    Object getChatConfigurations(Continuation<? super Map<String, ChatConfigurationRemote>> continuation);

    @GET("/ai/configuration/bots/slides")
    Object getChatSlides(Continuation<? super Map<String, ChatIntroRemote>> continuation);
}
