package com.ifriend.domain.logic.chat.permissions;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: CheckChatPermissionsUseCase.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/logic/chat/permissions/CheckChatPermissionsUseCase;", "", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "(Lcom/ifriend/domain/data/chat/ChatsInfoRepository;)V", "execute", "", "chatId", "", "permissions", "Lcom/ifriend/domain/logic/chat/permissions/ChatPermissions;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/chat/permissions/ChatPermissions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckChatPermissionsUseCase {
    private final ChatsInfoRepository chatsInfoRepository;

    /* compiled from: CheckChatPermissionsUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatPermissions.values().length];
            try {
                iArr[ChatPermissions.GIFTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatPermissions.CHAT_VIDEO_BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public CheckChatPermissionsUseCase(ChatsInfoRepository chatsInfoRepository) {
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        this.chatsInfoRepository = chatsInfoRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r7.getChatType() != com.ifriend.domain.logic.chat.models.ChatType.INFLUENCER) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        if (r7.isMain() != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(String str, ChatPermissions chatPermissions, Continuation<? super Boolean> continuation) {
        CheckChatPermissionsUseCase$execute$1 checkChatPermissionsUseCase$execute$1;
        int i;
        int i2;
        if (continuation instanceof CheckChatPermissionsUseCase$execute$1) {
            checkChatPermissionsUseCase$execute$1 = (CheckChatPermissionsUseCase$execute$1) continuation;
            if ((checkChatPermissionsUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                checkChatPermissionsUseCase$execute$1.label -= Integer.MIN_VALUE;
                Object obj = checkChatPermissionsUseCase$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkChatPermissionsUseCase$execute$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatsInfoRepository chatsInfoRepository = this.chatsInfoRepository;
                    checkChatPermissionsUseCase$execute$1.L$0 = chatPermissions;
                    checkChatPermissionsUseCase$execute$1.label = 1;
                    obj = chatsInfoRepository.getChat(str, checkChatPermissionsUseCase$execute$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatPermissions = (ChatPermissions) checkChatPermissionsUseCase$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ChatInfo chatInfo = (ChatInfo) obj;
                i2 = WhenMappings.$EnumSwitchMapping$0[chatPermissions.ordinal()];
                if (i2 != 1) {
                    if (chatInfo != null) {
                    }
                    z = false;
                    return Boxing.boxBoolean(z);
                } else if (i2 == 2) {
                    if (chatInfo == null) {
                        return Boxing.boxBoolean(false);
                    }
                    if (chatInfo.getChatType() != ChatType.MAIN) {
                    }
                    return Boxing.boxBoolean(z);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        checkChatPermissionsUseCase$execute$1 = new CheckChatPermissionsUseCase$execute$1(this, continuation);
        Object obj2 = checkChatPermissionsUseCase$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkChatPermissionsUseCase$execute$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        ChatInfo chatInfo2 = (ChatInfo) obj2;
        i2 = WhenMappings.$EnumSwitchMapping$0[chatPermissions.ordinal()];
        if (i2 != 1) {
        }
    }
}
