package com.ifriend.presentation.features.profile.header.delegate;

import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
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
/* compiled from: ChatHeaderDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$reloadAvatars$1", f = "ChatHeaderDelegate.kt", i = {}, l = {174, 177}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatHeaderDelegateImpl$reloadAvatars$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatHeaderDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHeaderDelegateImpl$reloadAvatars$1(ChatHeaderDelegateImpl chatHeaderDelegateImpl, Continuation<? super ChatHeaderDelegateImpl$reloadAvatars$1> continuation) {
        super(2, continuation);
        this.this$0 = chatHeaderDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHeaderDelegateImpl$reloadAvatars$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatHeaderDelegateImpl$reloadAvatars$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FeatureToggleRepository featureToggleRepository;
        GenerateBotAvatarRepository generateBotAvatarRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            featureToggleRepository = this.this$0.featureToggleRepository;
            this.label = 1;
            obj = featureToggleRepository.isFeatureEnabled(FeatureToggleKey.GENERATE_AI_PHOTOS, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        if (ommonKt.orFalse((Boolean) obj)) {
            generateBotAvatarRepository = this.this$0.generateBotAvatarRepository;
            this.label = 2;
            if (generateBotAvatarRepository.reloadAvatars(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
