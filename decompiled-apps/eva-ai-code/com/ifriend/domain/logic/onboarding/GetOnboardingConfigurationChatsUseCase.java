package com.ifriend.domain.logic.onboarding;

import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GetOnboardingConfigurationChatsUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/logic/onboarding/GetOnboardingConfigurationChatsUseCase;", "", "chatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "onboardingConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/OnboardingChatConfigsMemoryCachedSource;", "(Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;Lcom/ifriend/domain/data/memorycached/OnboardingChatConfigsMemoryCachedSource;)V", "execute", "", "Lkotlin/Pair;", "Lcom/ifriend/domain/logic/onboarding/OnboardingChatInfo;", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "isRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetOnboardingConfigurationChatsUseCase {
    private final ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
    private final OnboardingChatConfigsMemoryCachedSource onboardingConfigsMemoryCachedSource;

    @Inject
    public GetOnboardingConfigurationChatsUseCase(ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, OnboardingChatConfigsMemoryCachedSource onboardingConfigsMemoryCachedSource) {
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        Intrinsics.checkNotNullParameter(onboardingConfigsMemoryCachedSource, "onboardingConfigsMemoryCachedSource");
        this.chatConfigsMemoryCachedSource = chatConfigsMemoryCachedSource;
        this.onboardingConfigsMemoryCachedSource = onboardingConfigsMemoryCachedSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(boolean z, Continuation<? super List<Pair<OnboardingChatInfo, ChatConfig>>> continuation) {
        GetOnboardingConfigurationChatsUseCase$execute$1 getOnboardingConfigurationChatsUseCase$execute$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        GetOnboardingConfigurationChatsUseCase getOnboardingConfigurationChatsUseCase;
        Object chatConfigs;
        List list;
        Object obj2;
        if (continuation instanceof GetOnboardingConfigurationChatsUseCase$execute$1) {
            getOnboardingConfigurationChatsUseCase$execute$1 = (GetOnboardingConfigurationChatsUseCase$execute$1) continuation;
            if ((getOnboardingConfigurationChatsUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                getOnboardingConfigurationChatsUseCase$execute$1.label -= Integer.MIN_VALUE;
                obj = getOnboardingConfigurationChatsUseCase$execute$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getOnboardingConfigurationChatsUseCase$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        OnboardingChatConfigsMemoryCachedSource onboardingChatConfigsMemoryCachedSource = this.onboardingConfigsMemoryCachedSource;
                        getOnboardingConfigurationChatsUseCase$execute$1.L$0 = this;
                        getOnboardingConfigurationChatsUseCase$execute$1.label = 1;
                        if (onboardingChatConfigsMemoryCachedSource.refresh(getOnboardingConfigurationChatsUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    getOnboardingConfigurationChatsUseCase = this;
                } else if (i != 1) {
                    if (i == 2) {
                        getOnboardingConfigurationChatsUseCase = (GetOnboardingConfigurationChatsUseCase) getOnboardingConfigurationChatsUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        List list2 = (List) obj;
                        OnboardingChatConfigsMemoryCachedSource onboardingChatConfigsMemoryCachedSource2 = getOnboardingConfigurationChatsUseCase.onboardingConfigsMemoryCachedSource;
                        getOnboardingConfigurationChatsUseCase$execute$1.L$0 = list2;
                        getOnboardingConfigurationChatsUseCase$execute$1.label = 3;
                        chatConfigs = onboardingChatConfigsMemoryCachedSource2.getChatConfigs(getOnboardingConfigurationChatsUseCase$execute$1);
                        if (chatConfigs == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = chatConfigs;
                        list = list2;
                        ArrayList arrayList = new ArrayList();
                        while (r10.hasNext()) {
                        }
                        return arrayList;
                    } else if (i == 3) {
                        list = (List) getOnboardingConfigurationChatsUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ArrayList arrayList2 = new ArrayList();
                        for (OnboardingChatInfo onboardingChatInfo : (List) obj) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (Intrinsics.areEqual(onboardingChatInfo.getChatId(), ((ChatConfig) obj2).getChatId())) {
                                    break;
                                }
                            }
                            ChatConfig chatConfig = (ChatConfig) obj2;
                            Pair pair = chatConfig != null ? TuplesKt.to(onboardingChatInfo, chatConfig) : null;
                            if (pair != null) {
                                arrayList2.add(pair);
                            }
                        }
                        return arrayList2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    getOnboardingConfigurationChatsUseCase = (GetOnboardingConfigurationChatsUseCase) getOnboardingConfigurationChatsUseCase$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource = getOnboardingConfigurationChatsUseCase.chatConfigsMemoryCachedSource;
                getOnboardingConfigurationChatsUseCase$execute$1.L$0 = getOnboardingConfigurationChatsUseCase;
                getOnboardingConfigurationChatsUseCase$execute$1.label = 2;
                obj = chatConfigsMemoryCachedSource.getChatConfigs(getOnboardingConfigurationChatsUseCase$execute$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list22 = (List) obj;
                OnboardingChatConfigsMemoryCachedSource onboardingChatConfigsMemoryCachedSource22 = getOnboardingConfigurationChatsUseCase.onboardingConfigsMemoryCachedSource;
                getOnboardingConfigurationChatsUseCase$execute$1.L$0 = list22;
                getOnboardingConfigurationChatsUseCase$execute$1.label = 3;
                chatConfigs = onboardingChatConfigsMemoryCachedSource22.getChatConfigs(getOnboardingConfigurationChatsUseCase$execute$1);
                if (chatConfigs == coroutine_suspended) {
                }
            }
        }
        getOnboardingConfigurationChatsUseCase$execute$1 = new GetOnboardingConfigurationChatsUseCase$execute$1(this, continuation);
        obj = getOnboardingConfigurationChatsUseCase$execute$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getOnboardingConfigurationChatsUseCase$execute$1.label;
        if (i != 0) {
        }
        ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource2 = getOnboardingConfigurationChatsUseCase.chatConfigsMemoryCachedSource;
        getOnboardingConfigurationChatsUseCase$execute$1.L$0 = getOnboardingConfigurationChatsUseCase;
        getOnboardingConfigurationChatsUseCase$execute$1.label = 2;
        obj = chatConfigsMemoryCachedSource2.getChatConfigs(getOnboardingConfigurationChatsUseCase$execute$1);
        if (obj == coroutine_suspended) {
        }
        List list222 = (List) obj;
        OnboardingChatConfigsMemoryCachedSource onboardingChatConfigsMemoryCachedSource222 = getOnboardingConfigurationChatsUseCase.onboardingConfigsMemoryCachedSource;
        getOnboardingConfigurationChatsUseCase$execute$1.L$0 = list222;
        getOnboardingConfigurationChatsUseCase$execute$1.label = 3;
        chatConfigs = onboardingChatConfigsMemoryCachedSource222.getChatConfigs(getOnboardingConfigurationChatsUseCase$execute$1);
        if (chatConfigs == coroutine_suspended) {
        }
    }
}
