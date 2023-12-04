package com.ifriend.data.memorycached.chats;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.data.memorycached.chats.mappers.ChatConfigMapper;
import com.ifriend.data.networking.api.configuration.model.ChatConfigurationRemote;
import com.ifriend.data.networking.datasources.chat.ChatConfigurationsRemoteDataSource;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatConfigsMemoryCachedSourceImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.memorycached.chats.ChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2", f = "ChatConfigsMemoryCachedSourceImpl.kt", i = {0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", n = {"apiUrl"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ChatConfig>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ChatConfigsMemoryCachedSourceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2(ChatConfigsMemoryCachedSourceImpl chatConfigsMemoryCachedSourceImpl, Continuation<? super ChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2> continuation) {
        super(2, continuation);
        this.this$0 = chatConfigsMemoryCachedSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ChatConfig>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ChatConfig>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ChatConfig>> continuation) {
        return ((ChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppConfigStorage appConfigStorage;
        ChatConfigurationsRemoteDataSource chatConfigurationsRemoteDataSource;
        String str;
        ChatConfigMapper chatConfigMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            appConfigStorage = this.this$0.appConfigStorage;
            String apiUrl = appConfigStorage.getApiUrl();
            chatConfigurationsRemoteDataSource = this.this$0.remoteDataSource;
            this.L$0 = apiUrl;
            this.label = 1;
            Object chatConfigurations = chatConfigurationsRemoteDataSource.getChatConfigurations(this);
            if (chatConfigurations == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = apiUrl;
            obj = chatConfigurations;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Map map = (Map) obj;
        ChatConfigsMemoryCachedSourceImpl chatConfigsMemoryCachedSourceImpl = this.this$0;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            chatConfigMapper = chatConfigsMemoryCachedSourceImpl.mapper;
            arrayList.add(chatConfigMapper.map((ChatConfigurationRemote) entry.getValue(), str));
        }
        return arrayList;
    }
}
