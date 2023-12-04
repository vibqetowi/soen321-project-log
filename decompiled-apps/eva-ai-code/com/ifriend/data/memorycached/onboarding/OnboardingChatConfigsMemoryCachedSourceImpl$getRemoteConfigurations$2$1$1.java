package com.ifriend.data.memorycached.onboarding;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.data.networking.api.onboarding.OnboardingApi;
import com.ifriend.data.networking.api.onboarding.models.OnboardingChatsRemote;
import com.ifriend.data.networking.api.onboarding.models.OnboardingChatsRootRemote;
import com.ifriend.domain.logic.onboarding.OnboardingChatInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
/* compiled from: OnboardingChatConfigsMemoryCachedSourceImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/logic/onboarding/OnboardingChatInfo;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.memorycached.onboarding.OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2$1$1", f = "OnboardingChatConfigsMemoryCachedSourceImpl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2$1$1 extends SuspendLambda implements Function1<Continuation<? super List<? extends OnboardingChatInfo>>, Object> {
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ OnboardingChatConfigsMemoryCachedSourceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2$1$1(OnboardingChatConfigsMemoryCachedSourceImpl onboardingChatConfigsMemoryCachedSourceImpl, String str, Continuation<? super OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = onboardingChatConfigsMemoryCachedSourceImpl;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2$1$1(this.this$0, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends OnboardingChatInfo>> continuation) {
        return invoke2((Continuation<? super List<OnboardingChatInfo>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<OnboardingChatInfo>> continuation) {
        return ((OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OnboardingApi onboardingApi;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            onboardingApi = this.this$0.onboardingApi;
            this.label = 1;
            obj = onboardingApi.getOnboardingChats(this.$userId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        List<OnboardingChatsRemote> chats = ((OnboardingChatsRootRemote) obj).getChats();
        if (chats == null) {
            chats = CollectionsKt.emptyList();
        }
        List<OnboardingChatsRemote> list = chats;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (OnboardingChatsRemote onboardingChatsRemote : list) {
            String chatId = onboardingChatsRemote.getChatId();
            if (chatId == null) {
                chatId = "";
            }
            arrayList.add(new OnboardingChatInfo(chatId, ommonKt.orFalse(onboardingChatsRemote.isSelected()), ommonKt.orFalse(onboardingChatsRemote.isDefaultSelected())));
        }
        return arrayList;
    }
}
