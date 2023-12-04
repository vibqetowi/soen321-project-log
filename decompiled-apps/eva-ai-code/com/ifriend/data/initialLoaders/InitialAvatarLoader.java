package com.ifriend.data.initialLoaders;

import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InitialAvatarLoader.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/data/initialLoaders/InitialAvatarLoader;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "avatarGenerationStatusStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatusStorage;", "(Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatusStorage;)V", "load", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitialAvatarLoader implements InitialDataLoader {
    private final AvatarGenerationStatusStorage avatarGenerationStatusStorage;
    private final GenerateBotAvatarRepository generateBotAvatarRepository;

    public InitialAvatarLoader(GenerateBotAvatarRepository generateBotAvatarRepository, AvatarGenerationStatusStorage avatarGenerationStatusStorage) {
        Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
        Intrinsics.checkNotNullParameter(avatarGenerationStatusStorage, "avatarGenerationStatusStorage");
        this.generateBotAvatarRepository = generateBotAvatarRepository;
        this.avatarGenerationStatusStorage = avatarGenerationStatusStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[RETURN] */
    @Override // com.ifriend.domain.services.initialData.InitialDataLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(Continuation<? super Boolean> continuation) {
        InitialAvatarLoader$load$1 initialAvatarLoader$load$1;
        Object coroutine_suspended;
        int i;
        InitialAvatarLoader initialAvatarLoader;
        GenerateBotAvatarRepository generateBotAvatarRepository;
        if (continuation instanceof InitialAvatarLoader$load$1) {
            initialAvatarLoader$load$1 = (InitialAvatarLoader$load$1) continuation;
            if ((initialAvatarLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                initialAvatarLoader$load$1.label -= Integer.MIN_VALUE;
                Object obj = initialAvatarLoader$load$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initialAvatarLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AvatarGenerationStatusStorage avatarGenerationStatusStorage = this.avatarGenerationStatusStorage;
                    initialAvatarLoader$load$1.L$0 = this;
                    initialAvatarLoader$load$1.label = 1;
                    if (avatarGenerationStatusStorage.clear(initialAvatarLoader$load$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    initialAvatarLoader = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    initialAvatarLoader = (InitialAvatarLoader) initialAvatarLoader$load$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                generateBotAvatarRepository = initialAvatarLoader.generateBotAvatarRepository;
                initialAvatarLoader$load$1.L$0 = null;
                initialAvatarLoader$load$1.label = 2;
                if (generateBotAvatarRepository.getGenerationStatus(initialAvatarLoader$load$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Boxing.boxBoolean(true);
            }
        }
        initialAvatarLoader$load$1 = new InitialAvatarLoader$load$1(this, continuation);
        Object obj2 = initialAvatarLoader$load$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initialAvatarLoader$load$1.label;
        if (i != 0) {
        }
        generateBotAvatarRepository = initialAvatarLoader.generateBotAvatarRepository;
        initialAvatarLoader$load$1.L$0 = null;
        initialAvatarLoader$load$1.label = 2;
        if (generateBotAvatarRepository.getGenerationStatus(initialAvatarLoader$load$1) == coroutine_suspended) {
        }
        return Boxing.boxBoolean(true);
    }
}
