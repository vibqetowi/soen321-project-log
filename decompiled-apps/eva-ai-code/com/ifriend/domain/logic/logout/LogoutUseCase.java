package com.ifriend.domain.logic.logout;

import com.facebook.internal.NativeProtocol;
import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.common.RunCatchingUseCase;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.storage.token.UserTokenStorage;
import com.ifriend.internal_notifications.handler.InternalNotificationsQueue;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LogoutUseCase.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u009f\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(¢\u0006\u0002\u0010)J\u0019\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010,R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/ifriend/domain/logic/logout/LogoutUseCase;", "Lcom/ifriend/domain/logic/common/RunCatchingUseCase;", "", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "authDataStorage", "Lcom/ifriend/domain/data/AuthDataStorage;", "userTokenStorage", "Lcom/ifriend/domain/storage/token/UserTokenStorage;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "avatarsStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;", "longTermNotification", "Lcom/ifriend/domain/notifications/LongTermNotificationManager;", "internalNotificationsQueue", "Lcom/ifriend/internal_notifications/handler/InternalNotificationsQueue;", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "diaryRepository", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "levelsRepository", "Lcom/ifriend/domain/data/levels/LevelsRepository;", "chatGiftsRepository", "Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;", "chatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "chatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "userProfileRepository", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "onboardingChatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/OnboardingChatConfigsMemoryCachedSource;", "firebaseApiRepository", "Lcom/ifriend/domain/data/networking/FirebaseApiRepository;", "chatSubscriptionRepository", "Lcom/ifriend/domain/data/chat/subscription/ChatSubscriptionRepository;", "(Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/data/AuthDataStorage;Lcom/ifriend/domain/storage/token/UserTokenStorage;Lcom/ifriend/domain/socket/MessagesSource;Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;Lcom/ifriend/domain/notifications/LongTermNotificationManager;Lcom/ifriend/internal_notifications/handler/InternalNotificationsQueue;Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;Lcom/ifriend/domain/data/diary/DiaryRepository;Lcom/ifriend/domain/data/levels/LevelsRepository;Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;Lcom/ifriend/domain/data/chat/ChatsInfoRepository;Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;Lcom/ifriend/domain/data/user/UserProfileRepository;Lcom/ifriend/domain/data/memorycached/OnboardingChatConfigsMemoryCachedSource;Lcom/ifriend/domain/data/networking/FirebaseApiRepository;Lcom/ifriend/domain/data/chat/subscription/ChatSubscriptionRepository;)V", "execute", NativeProtocol.WEB_DIALOG_PARAMS, "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LogoutUseCase implements RunCatchingUseCase<Unit, Unit> {
    private final AuthDataStorage authDataStorage;
    private final AvatarsStorage avatarsStorage;
    private final BotRepository botRepository;
    private final ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
    private final ChatGiftsRepository chatGiftsRepository;
    private final ChatSubscriptionRepository chatSubscriptionRepository;
    private final ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
    private final ChatsInfoRepository chatsInfoRepository;
    private final DiaryRepository diaryRepository;
    private final FirebaseApiRepository firebaseApiRepository;
    private final GenerateBotAvatarRepository generateBotAvatarRepository;
    private final InternalNotificationsQueue internalNotificationsQueue;
    private final LevelsRepository levelsRepository;
    private final LongTermNotificationManager longTermNotification;
    private final MessagesSource messagesSource;
    private final OnboardingChatConfigsMemoryCachedSource onboardingChatConfigsMemoryCachedSource;
    private final UserProfileRepository userProfileRepository;
    private final UserRepository userRepository;
    private final UserTokenStorage userTokenStorage;

    @Inject
    public LogoutUseCase(UserRepository userRepository, BotRepository botRepository, AuthDataStorage authDataStorage, UserTokenStorage userTokenStorage, MessagesSource messagesSource, AvatarsStorage avatarsStorage, LongTermNotificationManager longTermNotification, InternalNotificationsQueue internalNotificationsQueue, GenerateBotAvatarRepository generateBotAvatarRepository, DiaryRepository diaryRepository, LevelsRepository levelsRepository, ChatGiftsRepository chatGiftsRepository, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, ChatsInfoRepository chatsInfoRepository, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, UserProfileRepository userProfileRepository, OnboardingChatConfigsMemoryCachedSource onboardingChatConfigsMemoryCachedSource, FirebaseApiRepository firebaseApiRepository, ChatSubscriptionRepository chatSubscriptionRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(authDataStorage, "authDataStorage");
        Intrinsics.checkNotNullParameter(userTokenStorage, "userTokenStorage");
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(avatarsStorage, "avatarsStorage");
        Intrinsics.checkNotNullParameter(longTermNotification, "longTermNotification");
        Intrinsics.checkNotNullParameter(internalNotificationsQueue, "internalNotificationsQueue");
        Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
        Intrinsics.checkNotNullParameter(diaryRepository, "diaryRepository");
        Intrinsics.checkNotNullParameter(levelsRepository, "levelsRepository");
        Intrinsics.checkNotNullParameter(chatGiftsRepository, "chatGiftsRepository");
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "chatsInfoConfigurationRepository");
        Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        Intrinsics.checkNotNullParameter(onboardingChatConfigsMemoryCachedSource, "onboardingChatConfigsMemoryCachedSource");
        Intrinsics.checkNotNullParameter(firebaseApiRepository, "firebaseApiRepository");
        Intrinsics.checkNotNullParameter(chatSubscriptionRepository, "chatSubscriptionRepository");
        this.userRepository = userRepository;
        this.botRepository = botRepository;
        this.authDataStorage = authDataStorage;
        this.userTokenStorage = userTokenStorage;
        this.messagesSource = messagesSource;
        this.avatarsStorage = avatarsStorage;
        this.longTermNotification = longTermNotification;
        this.internalNotificationsQueue = internalNotificationsQueue;
        this.generateBotAvatarRepository = generateBotAvatarRepository;
        this.diaryRepository = diaryRepository;
        this.levelsRepository = levelsRepository;
        this.chatGiftsRepository = chatGiftsRepository;
        this.chatConfigsMemoryCachedSource = chatConfigsMemoryCachedSource;
        this.chatsInfoRepository = chatsInfoRepository;
        this.chatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
        this.userProfileRepository = userProfileRepository;
        this.onboardingChatConfigsMemoryCachedSource = onboardingChatConfigsMemoryCachedSource;
        this.firebaseApiRepository = firebaseApiRepository;
        this.chatSubscriptionRepository = chatSubscriptionRepository;
    }

    @Override // com.ifriend.domain.logic.common.RunCatchingUseCase
    /* renamed from: invoke-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo6875invokegIAlus(Unit unit, Continuation<? super Result<? extends Unit>> continuation) {
        return m6880invokegIAlus(unit, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke-gIAlu-s  reason: avoid collision after fix types in other method and not valid java name */
    public Object m6880invokegIAlus(Unit unit, Continuation<? super Result<Unit>> continuation) {
        return RunCatchingUseCase.DefaultImpls.m6879invokegIAlus(this, unit, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174 A[RETURN] */
    @Override // com.ifriend.domain.logic.common.RunCatchingUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(Unit unit, Continuation<? super Unit> continuation) {
        LogoutUseCase$execute$1 logoutUseCase$execute$1;
        LogoutUseCase logoutUseCase;
        AuthDataStorage authDataStorage;
        UserTokenStorage userTokenStorage;
        AvatarsStorage avatarsStorage;
        BotRepository botRepository;
        ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
        ChatGiftsRepository chatGiftsRepository;
        ChatsInfoRepository chatsInfoRepository;
        ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
        UserProfileRepository userProfileRepository;
        OnboardingChatConfigsMemoryCachedSource onboardingChatConfigsMemoryCachedSource;
        ChatSubscriptionRepository chatSubscriptionRepository;
        if (continuation instanceof LogoutUseCase$execute$1) {
            logoutUseCase$execute$1 = (LogoutUseCase$execute$1) continuation;
            if ((logoutUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                logoutUseCase$execute$1.label -= Integer.MIN_VALUE;
                Object obj = logoutUseCase$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (logoutUseCase$execute$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        User currentUser = this.userRepository.getCurrentUser();
                        String userIdValue = currentUser != null ? currentUser.getUserIdValue() : null;
                        if (userIdValue != null) {
                            FirebaseApiRepository firebaseApiRepository = this.firebaseApiRepository;
                            logoutUseCase$execute$1.L$0 = this;
                            logoutUseCase$execute$1.label = 1;
                            if (firebaseApiRepository.unsubscribe(userIdValue, logoutUseCase$execute$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        logoutUseCase = this;
                        logoutUseCase.internalNotificationsQueue.clear();
                        authDataStorage = logoutUseCase.authDataStorage;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 2;
                        if (authDataStorage.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        userTokenStorage = logoutUseCase.userTokenStorage;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 3;
                        if (userTokenStorage.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        avatarsStorage = logoutUseCase.avatarsStorage;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 4;
                        if (avatarsStorage.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        logoutUseCase.userRepository.clear();
                        botRepository = logoutUseCase.botRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 5;
                        if (botRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        logoutUseCase.messagesSource.stop();
                        logoutUseCase.longTermNotification.clearAll();
                        logoutUseCase.generateBotAvatarRepository.clear();
                        logoutUseCase.diaryRepository.clear();
                        logoutUseCase.levelsRepository.clear();
                        chatConfigsMemoryCachedSource = logoutUseCase.chatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 6;
                        if (chatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatGiftsRepository = logoutUseCase.chatGiftsRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 7;
                        if (chatGiftsRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatsInfoRepository = logoutUseCase.chatsInfoRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 8;
                        if (chatsInfoRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatsInfoConfigurationRepository = logoutUseCase.chatsInfoConfigurationRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 9;
                        if (chatsInfoConfigurationRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        userProfileRepository = logoutUseCase.userProfileRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 10;
                        if (userProfileRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        logoutUseCase.internalNotificationsQueue.clear();
                        authDataStorage = logoutUseCase.authDataStorage;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 2;
                        if (authDataStorage.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        userTokenStorage = logoutUseCase.userTokenStorage;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 3;
                        if (userTokenStorage.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        avatarsStorage = logoutUseCase.avatarsStorage;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 4;
                        if (avatarsStorage.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        logoutUseCase.userRepository.clear();
                        botRepository = logoutUseCase.botRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 5;
                        if (botRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        logoutUseCase.messagesSource.stop();
                        logoutUseCase.longTermNotification.clearAll();
                        logoutUseCase.generateBotAvatarRepository.clear();
                        logoutUseCase.diaryRepository.clear();
                        logoutUseCase.levelsRepository.clear();
                        chatConfigsMemoryCachedSource = logoutUseCase.chatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 6;
                        if (chatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatGiftsRepository = logoutUseCase.chatGiftsRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 7;
                        if (chatGiftsRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoRepository = logoutUseCase.chatsInfoRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 8;
                        if (chatsInfoRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoConfigurationRepository = logoutUseCase.chatsInfoConfigurationRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 9;
                        if (chatsInfoConfigurationRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        userProfileRepository = logoutUseCase.userProfileRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 10;
                        if (userProfileRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 2:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        userTokenStorage = logoutUseCase.userTokenStorage;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 3;
                        if (userTokenStorage.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        avatarsStorage = logoutUseCase.avatarsStorage;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 4;
                        if (avatarsStorage.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        logoutUseCase.userRepository.clear();
                        botRepository = logoutUseCase.botRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 5;
                        if (botRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        logoutUseCase.messagesSource.stop();
                        logoutUseCase.longTermNotification.clearAll();
                        logoutUseCase.generateBotAvatarRepository.clear();
                        logoutUseCase.diaryRepository.clear();
                        logoutUseCase.levelsRepository.clear();
                        chatConfigsMemoryCachedSource = logoutUseCase.chatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 6;
                        if (chatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatGiftsRepository = logoutUseCase.chatGiftsRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 7;
                        if (chatGiftsRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoRepository = logoutUseCase.chatsInfoRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 8;
                        if (chatsInfoRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoConfigurationRepository = logoutUseCase.chatsInfoConfigurationRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 9;
                        if (chatsInfoConfigurationRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        userProfileRepository = logoutUseCase.userProfileRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 10;
                        if (userProfileRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        avatarsStorage = logoutUseCase.avatarsStorage;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 4;
                        if (avatarsStorage.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        logoutUseCase.userRepository.clear();
                        botRepository = logoutUseCase.botRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 5;
                        if (botRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        logoutUseCase.messagesSource.stop();
                        logoutUseCase.longTermNotification.clearAll();
                        logoutUseCase.generateBotAvatarRepository.clear();
                        logoutUseCase.diaryRepository.clear();
                        logoutUseCase.levelsRepository.clear();
                        chatConfigsMemoryCachedSource = logoutUseCase.chatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 6;
                        if (chatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatGiftsRepository = logoutUseCase.chatGiftsRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 7;
                        if (chatGiftsRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoRepository = logoutUseCase.chatsInfoRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 8;
                        if (chatsInfoRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoConfigurationRepository = logoutUseCase.chatsInfoConfigurationRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 9;
                        if (chatsInfoConfigurationRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        userProfileRepository = logoutUseCase.userProfileRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 10;
                        if (userProfileRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        logoutUseCase.userRepository.clear();
                        botRepository = logoutUseCase.botRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 5;
                        if (botRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        logoutUseCase.messagesSource.stop();
                        logoutUseCase.longTermNotification.clearAll();
                        logoutUseCase.generateBotAvatarRepository.clear();
                        logoutUseCase.diaryRepository.clear();
                        logoutUseCase.levelsRepository.clear();
                        chatConfigsMemoryCachedSource = logoutUseCase.chatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 6;
                        if (chatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatGiftsRepository = logoutUseCase.chatGiftsRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 7;
                        if (chatGiftsRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoRepository = logoutUseCase.chatsInfoRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 8;
                        if (chatsInfoRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoConfigurationRepository = logoutUseCase.chatsInfoConfigurationRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 9;
                        if (chatsInfoConfigurationRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        userProfileRepository = logoutUseCase.userProfileRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 10;
                        if (userProfileRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        logoutUseCase.messagesSource.stop();
                        logoutUseCase.longTermNotification.clearAll();
                        logoutUseCase.generateBotAvatarRepository.clear();
                        logoutUseCase.diaryRepository.clear();
                        logoutUseCase.levelsRepository.clear();
                        chatConfigsMemoryCachedSource = logoutUseCase.chatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 6;
                        if (chatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatGiftsRepository = logoutUseCase.chatGiftsRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 7;
                        if (chatGiftsRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoRepository = logoutUseCase.chatsInfoRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 8;
                        if (chatsInfoRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoConfigurationRepository = logoutUseCase.chatsInfoConfigurationRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 9;
                        if (chatsInfoConfigurationRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        userProfileRepository = logoutUseCase.userProfileRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 10;
                        if (userProfileRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        chatGiftsRepository = logoutUseCase.chatGiftsRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 7;
                        if (chatGiftsRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoRepository = logoutUseCase.chatsInfoRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 8;
                        if (chatsInfoRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoConfigurationRepository = logoutUseCase.chatsInfoConfigurationRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 9;
                        if (chatsInfoConfigurationRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        userProfileRepository = logoutUseCase.userProfileRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 10;
                        if (userProfileRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        chatsInfoRepository = logoutUseCase.chatsInfoRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 8;
                        if (chatsInfoRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatsInfoConfigurationRepository = logoutUseCase.chatsInfoConfigurationRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 9;
                        if (chatsInfoConfigurationRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        userProfileRepository = logoutUseCase.userProfileRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 10;
                        if (userProfileRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 8:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        chatsInfoConfigurationRepository = logoutUseCase.chatsInfoConfigurationRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 9;
                        if (chatsInfoConfigurationRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        userProfileRepository = logoutUseCase.userProfileRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 10;
                        if (userProfileRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 9:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        userProfileRepository = logoutUseCase.userProfileRepository;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 10;
                        if (userProfileRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 10:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        onboardingChatConfigsMemoryCachedSource = logoutUseCase.onboardingChatConfigsMemoryCachedSource;
                        logoutUseCase$execute$1.L$0 = logoutUseCase;
                        logoutUseCase$execute$1.label = 11;
                        if (onboardingChatConfigsMemoryCachedSource.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 11:
                        logoutUseCase = (LogoutUseCase) logoutUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        chatSubscriptionRepository = logoutUseCase.chatSubscriptionRepository;
                        logoutUseCase$execute$1.L$0 = null;
                        logoutUseCase$execute$1.label = 12;
                        if (chatSubscriptionRepository.clear(logoutUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 12:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        logoutUseCase$execute$1 = new LogoutUseCase$execute$1(this, continuation);
        Object obj2 = logoutUseCase$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (logoutUseCase$execute$1.label) {
        }
    }
}
