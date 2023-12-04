package com.ifriend.data.networking.datasources.chat;

import com.ifriend.data.networking.api.configuration.ChatConfigurationsApi;
import com.ifriend.data.networking.api.configuration.model.ChatConfigurationRemote;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: ChatConfigurationsRemoteDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChatConfigurationsRemoteDataSource$getChatConfigurations$2 extends FunctionReferenceImpl implements Function1<Continuation<? super Map<String, ? extends ChatConfigurationRemote>>, Object>, SuspendFunction {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatConfigurationsRemoteDataSource$getChatConfigurations$2(Object obj) {
        super(1, obj, ChatConfigurationsApi.class, "getChatConfigurations", "getChatConfigurations(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Map<String, ? extends ChatConfigurationRemote>> continuation) {
        return invoke2((Continuation<? super Map<String, ChatConfigurationRemote>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Map<String, ChatConfigurationRemote>> continuation) {
        return ((ChatConfigurationsApi) this.receiver).getChatConfigurations(continuation);
    }
}
