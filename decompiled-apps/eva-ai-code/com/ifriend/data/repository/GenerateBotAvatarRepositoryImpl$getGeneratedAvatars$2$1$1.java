package com.ifriend.data.repository;

import com.ifriend.domain.models.avatar.GeneratedAvatar;
import com.ifriend.domain.models.profile.user.AuthData;
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
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$2$1$1", f = "GenerateBotAvatarRepositoryImpl.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GeneratedAvatar>, Object> {
    final /* synthetic */ AuthData $authData;
    final /* synthetic */ String $id;
    final /* synthetic */ int $imageSize;
    int label;
    final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$2$1$1(AuthData authData, GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, String str, int i, Continuation<? super GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$2$1$1> continuation) {
        super(2, continuation);
        this.$authData = authData;
        this.this$0 = generateBotAvatarRepositoryImpl;
        this.$id = str;
        this.$imageSize = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$2$1$1(this.$authData, this.this$0, this.$id, this.$imageSize, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GeneratedAvatar> continuation) {
        return ((GenerateBotAvatarRepositoryImpl$getGeneratedAvatars$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AuthData authData = this.$authData;
            if (authData == null) {
                return null;
            }
            GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl = this.this$0;
            String str = this.$id;
            String valueOf = String.valueOf(this.$imageSize);
            this.label = 1;
            obj = generateBotAvatarRepositoryImpl.getGeneratedAvatar(authData, str, valueOf, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return (GeneratedAvatar) obj;
    }
}
