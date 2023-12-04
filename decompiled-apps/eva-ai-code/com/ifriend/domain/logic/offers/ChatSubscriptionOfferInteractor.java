package com.ifriend.domain.logic.offers;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.offers.UserOffersRepository;
import com.ifriend.domain.models.offer.ChatSubscriptionOfferType;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.models.profile.user.UserKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatSubscriptionOfferInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0011\u0010\u000b\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/logic/offers/ChatSubscriptionOfferInteractor;", "", "userOffersRepository", "Lcom/ifriend/domain/data/offers/UserOffersRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/domain/data/offers/UserOffersRepository;Lcom/ifriend/domain/data/UserRepository;)V", "getAutoOfferType", "Lcom/ifriend/domain/models/offer/ChatSubscriptionOfferType;", "shouldShow", "", "getSubscriptionOfferType", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onOfferShown", "", "type", "(Lcom/ifriend/domain/models/offer/ChatSubscriptionOfferType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionOfferInteractor {
    public static final Companion Companion = new Companion(null);
    private static final long SHOW_FIRST_TIME_THRESHOLD;
    private static final long SHOW_THRESHOLD;
    private final UserOffersRepository userOffersRepository;
    private final UserRepository userRepository;

    /* compiled from: ChatSubscriptionOfferInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatSubscriptionOfferType.values().length];
            try {
                iArr[ChatSubscriptionOfferType.Auto.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatSubscriptionOfferType.AfterOnboarding.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatSubscriptionOfferType.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public ChatSubscriptionOfferInteractor(UserOffersRepository userOffersRepository, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userOffersRepository, "userOffersRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.userOffersRepository = userOffersRepository;
        this.userRepository = userRepository;
    }

    /* compiled from: ChatSubscriptionOfferInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/logic/offers/ChatSubscriptionOfferInteractor$Companion;", "", "()V", "SHOW_FIRST_TIME_THRESHOLD", "Lkotlin/time/Duration;", "J", "SHOW_THRESHOLD", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        SHOW_THRESHOLD = DurationKt.toDuration(1, DurationUnit.HOURS);
        Duration.Companion companion2 = Duration.Companion;
        SHOW_FIRST_TIME_THRESHOLD = DurationKt.toDuration(3, DurationUnit.DAYS);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSubscriptionOfferType(Continuation<? super ChatSubscriptionOfferType> continuation) {
        ChatSubscriptionOfferInteractor$getSubscriptionOfferType$1 chatSubscriptionOfferInteractor$getSubscriptionOfferType$1;
        Object obj;
        int i;
        ChatSubscriptionOfferInteractor chatSubscriptionOfferInteractor;
        User user;
        User user2;
        ChatSubscriptionOfferInteractor chatSubscriptionOfferInteractor2;
        Long l;
        if (continuation instanceof ChatSubscriptionOfferInteractor$getSubscriptionOfferType$1) {
            chatSubscriptionOfferInteractor$getSubscriptionOfferType$1 = (ChatSubscriptionOfferInteractor$getSubscriptionOfferType$1) continuation;
            if ((chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.label & Integer.MIN_VALUE) != 0) {
                chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.label -= Integer.MIN_VALUE;
                obj = chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    User currentUser = this.userRepository.getCurrentUser();
                    if (currentUser == null) {
                        return ChatSubscriptionOfferType.None;
                    }
                    if (UserKt.isPremium(currentUser)) {
                        return ChatSubscriptionOfferType.None;
                    }
                    UserOffersRepository userOffersRepository = this.userOffersRepository;
                    chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.L$0 = this;
                    chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.L$1 = currentUser;
                    chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.label = 1;
                    Object shouldShowChatSubscriptionOfferAfterOnboarding = userOffersRepository.getShouldShowChatSubscriptionOfferAfterOnboarding(chatSubscriptionOfferInteractor$getSubscriptionOfferType$1);
                    if (shouldShowChatSubscriptionOfferAfterOnboarding == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatSubscriptionOfferInteractor = this;
                    user = currentUser;
                    obj = shouldShowChatSubscriptionOfferAfterOnboarding;
                } else if (i != 1) {
                    if (i == 2) {
                        user2 = (User) chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.L$1;
                        chatSubscriptionOfferInteractor2 = (ChatSubscriptionOfferInteractor) chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        l = (Long) obj;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (l != null) {
                            Long registrationDate = user2.getRegistrationDate();
                            if (registrationDate == null) {
                                return ChatSubscriptionOfferType.None;
                            }
                            long longValue = registrationDate.longValue();
                            Duration.Companion companion = Duration.Companion;
                            return chatSubscriptionOfferInteractor2.getAutoOfferType(Duration.m8639compareToLRDsOJo(DurationKt.toDuration(currentTimeMillis - longValue, DurationUnit.MILLISECONDS), SHOW_FIRST_TIME_THRESHOLD) > 0);
                        }
                        Duration.Companion companion2 = Duration.Companion;
                        return chatSubscriptionOfferInteractor2.getAutoOfferType(Duration.m8639compareToLRDsOJo(DurationKt.toDuration(currentTimeMillis - l.longValue(), DurationUnit.MILLISECONDS), SHOW_THRESHOLD) > 0);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    user = (User) chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.L$1;
                    chatSubscriptionOfferInteractor = (ChatSubscriptionOfferInteractor) chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return ChatSubscriptionOfferType.AfterOnboarding;
                }
                UserOffersRepository userOffersRepository2 = chatSubscriptionOfferInteractor.userOffersRepository;
                chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.L$0 = chatSubscriptionOfferInteractor;
                chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.L$1 = user;
                chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.label = 2;
                obj = userOffersRepository2.getLastChatSubscriptionOfferTimestamp(chatSubscriptionOfferInteractor$getSubscriptionOfferType$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                user2 = user;
                chatSubscriptionOfferInteractor2 = chatSubscriptionOfferInteractor;
                l = (Long) obj;
                long currentTimeMillis2 = System.currentTimeMillis();
                if (l != null) {
                }
            }
        }
        chatSubscriptionOfferInteractor$getSubscriptionOfferType$1 = new ChatSubscriptionOfferInteractor$getSubscriptionOfferType$1(this, continuation);
        obj = chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatSubscriptionOfferInteractor$getSubscriptionOfferType$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final Object onOfferShown(ChatSubscriptionOfferType chatSubscriptionOfferType, Continuation<? super Unit> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$0[chatSubscriptionOfferType.ordinal()];
        if (i == 1) {
            Object lastChatSubscriptionOfferTimestamp = this.userOffersRepository.setLastChatSubscriptionOfferTimestamp(System.currentTimeMillis(), continuation);
            return lastChatSubscriptionOfferTimestamp == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? lastChatSubscriptionOfferTimestamp : Unit.INSTANCE;
        } else if (i == 2) {
            Object shouldShowChatSubscriptionOfferAfterOnboarding = this.userOffersRepository.setShouldShowChatSubscriptionOfferAfterOnboarding(false, continuation);
            return shouldShowChatSubscriptionOfferAfterOnboarding == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? shouldShowChatSubscriptionOfferAfterOnboarding : Unit.INSTANCE;
        } else {
            return Unit.INSTANCE;
        }
    }

    private final ChatSubscriptionOfferType getAutoOfferType(boolean z) {
        if (z) {
            return ChatSubscriptionOfferType.Auto;
        }
        return ChatSubscriptionOfferType.None;
    }
}
