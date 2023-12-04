package com.ifriend.data.initialLoaders;

import com.ifriend.domain.data.AppImageLoaderRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InitialConfigurationBotsAvatarLoader.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/data/initialLoaders/InitialConfigurationBotsAvatarLoader;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "chatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "appImageLoaderRepository", "Lcom/ifriend/domain/data/AppImageLoaderRepository;", "(Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/AppImageLoaderRepository;)V", "load", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitialConfigurationBotsAvatarLoader implements InitialDataLoader {
    private final AppImageLoaderRepository appImageLoaderRepository;
    private final ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
    private final UserRepository userRepository;

    public InitialConfigurationBotsAvatarLoader(ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, UserRepository userRepository, AppImageLoaderRepository appImageLoaderRepository) {
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appImageLoaderRepository, "appImageLoaderRepository");
        this.chatConfigsMemoryCachedSource = chatConfigsMemoryCachedSource;
        this.userRepository = userRepository;
        this.appImageLoaderRepository = appImageLoaderRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[LOOP:0: B:21:0x0057->B:23:0x005d, LOOP_END] */
    @Override // com.ifriend.domain.services.initialData.InitialDataLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(Continuation<? super Boolean> continuation) {
        InitialConfigurationBotsAvatarLoader$load$1 initialConfigurationBotsAvatarLoader$load$1;
        int i;
        InitialConfigurationBotsAvatarLoader initialConfigurationBotsAvatarLoader;
        if (continuation instanceof InitialConfigurationBotsAvatarLoader$load$1) {
            initialConfigurationBotsAvatarLoader$load$1 = (InitialConfigurationBotsAvatarLoader$load$1) continuation;
            if ((initialConfigurationBotsAvatarLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                initialConfigurationBotsAvatarLoader$load$1.label -= Integer.MIN_VALUE;
                Object obj = initialConfigurationBotsAvatarLoader$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initialConfigurationBotsAvatarLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.userRepository.getCurrentUser() != null) {
                        ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource = this.chatConfigsMemoryCachedSource;
                        initialConfigurationBotsAvatarLoader$load$1.L$0 = this;
                        initialConfigurationBotsAvatarLoader$load$1.label = 1;
                        obj = chatConfigsMemoryCachedSource.getChatConfigs(initialConfigurationBotsAvatarLoader$load$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        initialConfigurationBotsAvatarLoader = this;
                    }
                    return Boxing.boxBoolean(true);
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    initialConfigurationBotsAvatarLoader = (InitialConfigurationBotsAvatarLoader) initialConfigurationBotsAvatarLoader$load$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                for (ChatConfig chatConfig : (List) obj) {
                    initialConfigurationBotsAvatarLoader.appImageLoaderRepository.addEnqueue(chatConfig.getImages().getProfileAvatarUrl());
                    initialConfigurationBotsAvatarLoader.appImageLoaderRepository.addEnqueue(chatConfig.getImages().getRoundAvatarUrl());
                    initialConfigurationBotsAvatarLoader.appImageLoaderRepository.addEnqueue(chatConfig.getImages().getBackgroundUrl());
                }
                return Boxing.boxBoolean(true);
            }
        }
        initialConfigurationBotsAvatarLoader$load$1 = new InitialConfigurationBotsAvatarLoader$load$1(this, continuation);
        Object obj2 = initialConfigurationBotsAvatarLoader$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initialConfigurationBotsAvatarLoader$load$1.label;
        if (i != 0) {
        }
        while (r6.hasNext()) {
        }
        return Boxing.boxBoolean(true);
    }
}
