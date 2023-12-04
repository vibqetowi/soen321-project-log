package com.ifriend.domain.logic.chat.intro;

import com.ifriend.domain.data.chat.ChatIntroRepository;
import com.ifriend.domain.logic.chat.models.ChatIntroSlide;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GetChatIntroSlidesUseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/intro/GetChatIntroSlidesUseCase;", "", "chatIntroRepository", "Lcom/ifriend/domain/data/chat/ChatIntroRepository;", "(Lcom/ifriend/domain/data/chat/ChatIntroRepository;)V", "execute", "", "Lcom/ifriend/domain/logic/chat/models/ChatIntroSlide;", "botId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetChatIntroSlidesUseCase {
    private final ChatIntroRepository chatIntroRepository;

    @Inject
    public GetChatIntroSlidesUseCase(ChatIntroRepository chatIntroRepository) {
        Intrinsics.checkNotNullParameter(chatIntroRepository, "chatIntroRepository");
        this.chatIntroRepository = chatIntroRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(String str, Continuation<? super List<ChatIntroSlide>> continuation) {
        GetChatIntroSlidesUseCase$execute$1 getChatIntroSlidesUseCase$execute$1;
        Object obj;
        int i;
        GetChatIntroSlidesUseCase getChatIntroSlidesUseCase;
        List list;
        List list2;
        if (continuation instanceof GetChatIntroSlidesUseCase$execute$1) {
            getChatIntroSlidesUseCase$execute$1 = (GetChatIntroSlidesUseCase$execute$1) continuation;
            if ((getChatIntroSlidesUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                getChatIntroSlidesUseCase$execute$1.label -= Integer.MIN_VALUE;
                obj = getChatIntroSlidesUseCase$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getChatIntroSlidesUseCase$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatIntroRepository chatIntroRepository = this.chatIntroRepository;
                    getChatIntroSlidesUseCase$execute$1.L$0 = this;
                    getChatIntroSlidesUseCase$execute$1.L$1 = str;
                    getChatIntroSlidesUseCase$execute$1.label = 1;
                    obj = chatIntroRepository.isChatIntroShown(str, getChatIntroSlidesUseCase$execute$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getChatIntroSlidesUseCase = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            list2 = (List) getChatIntroSlidesUseCase$execute$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            return list2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) getChatIntroSlidesUseCase$execute$1.L$1;
                    getChatIntroSlidesUseCase = (GetChatIntroSlidesUseCase) getChatIntroSlidesUseCase$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    list = (List) obj;
                    if (!list.isEmpty()) {
                        return list;
                    }
                    ChatIntroRepository chatIntroRepository2 = getChatIntroSlidesUseCase.chatIntroRepository;
                    getChatIntroSlidesUseCase$execute$1.L$0 = list;
                    getChatIntroSlidesUseCase$execute$1.L$1 = null;
                    getChatIntroSlidesUseCase$execute$1.label = 3;
                    if (chatIntroRepository2.setChatIntroShown(str, true, getChatIntroSlidesUseCase$execute$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = list;
                    return list2;
                } else {
                    str = (String) getChatIntroSlidesUseCase$execute$1.L$1;
                    getChatIntroSlidesUseCase = (GetChatIntroSlidesUseCase) getChatIntroSlidesUseCase$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ChatIntroRepository chatIntroRepository3 = getChatIntroSlidesUseCase.chatIntroRepository;
                    getChatIntroSlidesUseCase$execute$1.L$0 = getChatIntroSlidesUseCase;
                    getChatIntroSlidesUseCase$execute$1.L$1 = str;
                    getChatIntroSlidesUseCase$execute$1.label = 2;
                    obj = chatIntroRepository3.getChatIntroSlides(str, getChatIntroSlidesUseCase$execute$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = (List) obj;
                    if (!list.isEmpty()) {
                    }
                } else {
                    return CollectionsKt.emptyList();
                }
            }
        }
        getChatIntroSlidesUseCase$execute$1 = new GetChatIntroSlidesUseCase$execute$1(this, continuation);
        obj = getChatIntroSlidesUseCase$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getChatIntroSlidesUseCase$execute$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
