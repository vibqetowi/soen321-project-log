package com.ifriend.data.repository;

import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.HttpStatus;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$getGenerationStatus$2", f = "GenerateBotAvatarRepositoryImpl.kt", i = {1}, l = {HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, HttpStatus.SC_REQUEST_TIMEOUT}, m = "invokeSuspend", n = {"it"}, s = {"L$2"})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl$getGenerationStatus$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<AvatarGenerationStatus> $result;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarRepositoryImpl$getGenerationStatus$2(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, Ref.ObjectRef<AvatarGenerationStatus> objectRef, Continuation<? super GenerateBotAvatarRepositoryImpl$getGenerationStatus$2> continuation) {
        super(2, continuation);
        this.this$0 = generateBotAvatarRepositoryImpl;
        this.$result = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateBotAvatarRepositoryImpl$getGenerationStatus$2(this.this$0, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenerateBotAvatarRepositoryImpl$getGenerationStatus$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef<AvatarGenerationStatus> objectRef;
        T t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AvatarGenerationStatus value = this.this$0.avatarGenerationStatusStorage.getStatus().getValue();
            if (value == 0) {
                this.label = 1;
                obj = this.this$0.loadRemoteGenerationStatus(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.$result.element = value;
                return Unit.INSTANCE;
            }
        } else if (i != 1) {
            if (i == 2) {
                objectRef = (Ref.ObjectRef) this.L$1;
                ResultKt.throwOnFailure(obj);
                t = (AvatarGenerationStatus) this.L$2;
                objectRef.element = t;
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl = this.this$0;
        Ref.ObjectRef<AvatarGenerationStatus> objectRef2 = this.$result;
        AvatarGenerationStatus avatarGenerationStatus = (AvatarGenerationStatus) obj;
        AvatarGenerationStatusStorage avatarGenerationStatusStorage = generateBotAvatarRepositoryImpl.avatarGenerationStatusStorage;
        this.L$0 = obj;
        this.L$1 = objectRef2;
        this.L$2 = avatarGenerationStatus;
        this.label = 2;
        if (avatarGenerationStatusStorage.setStatus(avatarGenerationStatus, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        objectRef = objectRef2;
        t = avatarGenerationStatus;
        objectRef.element = t;
        return Unit.INSTANCE;
    }
}
