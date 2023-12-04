package com.ifriend.domain.logic.experiments.checker;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.experiments.FeatureTogglePayloadsRepository;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import com.ifriend.domain.models.experiments.common.FeatureToggleChatIds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatIdConditionsCheckerUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/logic/experiments/checker/ChatIdConditionsCheckerUseCase;", "", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "featureTogglePayloadsRepository", "Lcom/ifriend/domain/data/experiments/FeatureTogglePayloadsRepository;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "(Lcom/ifriend/domain/data/chat/ChatsInfoRepository;Lcom/ifriend/domain/data/experiments/FeatureTogglePayloadsRepository;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;)V", "execute", "", "chatId", "", "toggle", "Lcom/ifriend/domain/logic/experiments/FeatureToggleKey;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/experiments/FeatureToggleKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIdConditionsCheckerUseCase {
    private final AnalyticsInteractor analyticsInteractor;
    private final ChatsInfoRepository chatsInfoRepository;
    private final FeatureTogglePayloadsRepository featureTogglePayloadsRepository;

    @Inject
    public ChatIdConditionsCheckerUseCase(ChatsInfoRepository chatsInfoRepository, FeatureTogglePayloadsRepository featureTogglePayloadsRepository, AnalyticsInteractor analyticsInteractor) {
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(featureTogglePayloadsRepository, "featureTogglePayloadsRepository");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        this.chatsInfoRepository = chatsInfoRepository;
        this.featureTogglePayloadsRepository = featureTogglePayloadsRepository;
        this.analyticsInteractor = analyticsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x004d, B:29:0x0070, B:31:0x0075, B:35:0x007f), top: B:77:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0032, B:39:0x0098, B:41:0x00a0, B:43:0x00a5, B:44:0x00b8, B:46:0x00be, B:48:0x00ca, B:53:0x00e0, B:49:0x00d3, B:54:0x00e8, B:56:0x00f0, B:65:0x0111, B:59:0x00fa, B:60:0x00fe, B:62:0x0104), top: B:79:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0032, B:39:0x0098, B:41:0x00a0, B:43:0x00a5, B:44:0x00b8, B:46:0x00be, B:48:0x00ca, B:53:0x00e0, B:49:0x00d3, B:54:0x00e8, B:56:0x00f0, B:65:0x0111, B:59:0x00fa, B:60:0x00fe, B:62:0x0104), top: B:79:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(String str, FeatureToggleKey featureToggleKey, Continuation<? super Boolean> continuation) {
        ChatIdConditionsCheckerUseCase$execute$1 chatIdConditionsCheckerUseCase$execute$1;
        Object coroutine_suspended;
        int i;
        ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase;
        ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase2;
        ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase3;
        String uId;
        Object chatsFeaturePayload;
        String str2;
        Object m7271constructorimpl;
        Throwable m7274exceptionOrNullimpl;
        List list;
        boolean z;
        if (continuation instanceof ChatIdConditionsCheckerUseCase$execute$1) {
            chatIdConditionsCheckerUseCase$execute$1 = (ChatIdConditionsCheckerUseCase$execute$1) continuation;
            if ((chatIdConditionsCheckerUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                chatIdConditionsCheckerUseCase$execute$1.label -= Integer.MIN_VALUE;
                Object obj = chatIdConditionsCheckerUseCase$execute$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatIdConditionsCheckerUseCase$execute$1.label;
                boolean z2 = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.Companion;
                        ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase4 = this;
                        ChatsInfoRepository chatsInfoRepository = this.chatsInfoRepository;
                        chatIdConditionsCheckerUseCase$execute$1.L$0 = this;
                        chatIdConditionsCheckerUseCase$execute$1.L$1 = featureToggleKey;
                        chatIdConditionsCheckerUseCase$execute$1.L$2 = this;
                        chatIdConditionsCheckerUseCase$execute$1.label = 1;
                        obj = chatsInfoRepository.getChat(str, chatIdConditionsCheckerUseCase$execute$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatIdConditionsCheckerUseCase2 = this;
                        chatIdConditionsCheckerUseCase3 = chatIdConditionsCheckerUseCase2;
                    } catch (Throwable th) {
                        th = th;
                        chatIdConditionsCheckerUseCase = this;
                        Result.Companion companion2 = Result.Companion;
                        m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                        if (m7274exceptionOrNullimpl != null) {
                        }
                        if (!Result.m7277isFailureimpl(m7271constructorimpl)) {
                        }
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        str2 = (String) chatIdConditionsCheckerUseCase$execute$1.L$1;
                        chatIdConditionsCheckerUseCase = (ChatIdConditionsCheckerUseCase) chatIdConditionsCheckerUseCase$execute$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            list = (List) obj;
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion22 = Result.Companion;
                            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                            m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                            if (m7274exceptionOrNullimpl != null) {
                            }
                            if (!Result.m7277isFailureimpl(m7271constructorimpl)) {
                            }
                        }
                        if (list.isEmpty()) {
                            List<FeatureToggleChatIds> list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            for (FeatureToggleChatIds featureToggleChatIds : list2) {
                                if (featureToggleChatIds.getInclude()) {
                                    z = featureToggleChatIds.getChatIds().contains(str2);
                                } else {
                                    z = !featureToggleChatIds.getChatIds().contains(str2);
                                }
                                arrayList.add(Boxing.boxBoolean(z));
                            }
                            ArrayList arrayList2 = arrayList;
                            if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                                Iterator it = arrayList2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!((Boolean) it.next()).booleanValue()) {
                                            z2 = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            m7271constructorimpl = Result.m7271constructorimpl(Boxing.boxBoolean(z2));
                            m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                            if (m7274exceptionOrNullimpl != null) {
                                AnalyticsInteractor analyticsInteractor = chatIdConditionsCheckerUseCase.analyticsInteractor;
                                Intrinsics.checkNotNullExpressionValue("ChatIdConditionsCheckerUseCase", "getSimpleName(...)");
                                analyticsInteractor.trackException("ChatIdConditionsCheckerUseCase", m7274exceptionOrNullimpl);
                            }
                            return !Result.m7277isFailureimpl(m7271constructorimpl) ? Boxing.boxBoolean(false) : m7271constructorimpl;
                        }
                        return Boxing.boxBoolean(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatIdConditionsCheckerUseCase2 = (ChatIdConditionsCheckerUseCase) chatIdConditionsCheckerUseCase$execute$1.L$2;
                    featureToggleKey = (FeatureToggleKey) chatIdConditionsCheckerUseCase$execute$1.L$1;
                    chatIdConditionsCheckerUseCase3 = (ChatIdConditionsCheckerUseCase) chatIdConditionsCheckerUseCase$execute$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        chatIdConditionsCheckerUseCase = chatIdConditionsCheckerUseCase3;
                        Result.Companion companion222 = Result.Companion;
                        m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                        if (m7274exceptionOrNullimpl != null) {
                        }
                        if (!Result.m7277isFailureimpl(m7271constructorimpl)) {
                        }
                    }
                }
                ChatInfo chatInfo = (ChatInfo) obj;
                uId = chatInfo == null ? chatInfo.getUId() : null;
                if (uId == null) {
                    uId = "";
                }
                FeatureTogglePayloadsRepository featureTogglePayloadsRepository = chatIdConditionsCheckerUseCase2.featureTogglePayloadsRepository;
                String key = featureToggleKey.getKey();
                chatIdConditionsCheckerUseCase$execute$1.L$0 = chatIdConditionsCheckerUseCase3;
                chatIdConditionsCheckerUseCase$execute$1.L$1 = uId;
                chatIdConditionsCheckerUseCase$execute$1.L$2 = null;
                chatIdConditionsCheckerUseCase$execute$1.label = 2;
                chatsFeaturePayload = featureTogglePayloadsRepository.getChatsFeaturePayload(key, chatIdConditionsCheckerUseCase$execute$1);
                if (chatsFeaturePayload != coroutine_suspended) {
                    return coroutine_suspended;
                }
                chatIdConditionsCheckerUseCase = chatIdConditionsCheckerUseCase3;
                String str3 = uId;
                obj = chatsFeaturePayload;
                str2 = str3;
                list = (List) obj;
                if (list.isEmpty()) {
                }
            }
        }
        chatIdConditionsCheckerUseCase$execute$1 = new ChatIdConditionsCheckerUseCase$execute$1(this, continuation);
        Object obj2 = chatIdConditionsCheckerUseCase$execute$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatIdConditionsCheckerUseCase$execute$1.label;
        boolean z22 = true;
        if (i != 0) {
        }
        ChatInfo chatInfo2 = (ChatInfo) obj2;
        if (chatInfo2 == null) {
        }
        if (uId == null) {
        }
        FeatureTogglePayloadsRepository featureTogglePayloadsRepository2 = chatIdConditionsCheckerUseCase2.featureTogglePayloadsRepository;
        String key2 = featureToggleKey.getKey();
        chatIdConditionsCheckerUseCase$execute$1.L$0 = chatIdConditionsCheckerUseCase3;
        chatIdConditionsCheckerUseCase$execute$1.L$1 = uId;
        chatIdConditionsCheckerUseCase$execute$1.L$2 = null;
        chatIdConditionsCheckerUseCase$execute$1.label = 2;
        chatsFeaturePayload = featureTogglePayloadsRepository2.getChatsFeaturePayload(key2, chatIdConditionsCheckerUseCase$execute$1);
        if (chatsFeaturePayload != coroutine_suspended) {
        }
    }
}
