package com.ifriend.domain.logic.chat.models;

import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.logic.chat.models.ChatInfoPaymentOption;
import com.ifriend.domain.logic.chat.models.ChatInfoTrialOptions;
import com.ifriend.domain.logic.chat.models.ChatPaymentStatus;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: chatoptions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0004\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0004\u001a\n\u0010\t\u001a\u00020\u0007*\u00020\u0004¨\u0006\n"}, d2 = {"getMaxMessageCount", "", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$TrialPeriod;", "getNeuronsPrice", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "getUnlockLevel", "isCanChatting", "", "isNeedToPay", "isSubscriptionPaymentOptions", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatoptionsKt {
    public static final boolean isCanChatting(ChatInfo chatInfo) {
        Intrinsics.checkNotNullParameter(chatInfo, "<this>");
        return (chatInfo.getPaymentStatus() instanceof ChatPaymentStatus.Free) || ((chatInfo.getPaymentStatus() instanceof ChatPaymentStatus.Subscription) && ((ChatPaymentStatus.Subscription) chatInfo.getPaymentStatus()).getHasSubscription()) || (chatInfo.getPaymentStatus() instanceof ChatPaymentStatus.Paid) || (chatInfo.getPaymentStatus() instanceof ChatPaymentStatus.TrialPeriod);
    }

    public static final boolean isNeedToPay(ChatInfo chatInfo) {
        Intrinsics.checkNotNullParameter(chatInfo, "<this>");
        return (chatInfo.getPaymentStatus() instanceof ChatPaymentStatus.Purchase) || ((chatInfo.getPaymentStatus() instanceof ChatPaymentStatus.Subscription) && !((ChatPaymentStatus.Subscription) chatInfo.getPaymentStatus()).getHasSubscription()) || (chatInfo.getPaymentStatus() instanceof ChatPaymentStatus.TrialPeriod);
    }

    public static final int getUnlockLevel(ChatInfo chatInfo) {
        Integer num;
        Object obj;
        String value;
        boolean z;
        Intrinsics.checkNotNullParameter(chatInfo, "<this>");
        Iterator<T> it = chatInfo.getPaymentOptions().iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ChatInfoPaymentOption) obj).getType() == ChatInfoPaymentOption.PaymentOptionType.LEVEL) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        ChatInfoPaymentOption chatInfoPaymentOption = (ChatInfoPaymentOption) obj;
        if (chatInfoPaymentOption != null && (value = chatInfoPaymentOption.getValue()) != null) {
            num = StringsKt.toIntOrNull(value);
        }
        return ommonKt.orZero(num);
    }

    public static final int getNeuronsPrice(ChatInfo chatInfo) {
        Integer num;
        Object obj;
        String value;
        boolean z;
        Intrinsics.checkNotNullParameter(chatInfo, "<this>");
        Iterator<T> it = chatInfo.getPaymentOptions().iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ChatInfoPaymentOption) obj).getType() == ChatInfoPaymentOption.PaymentOptionType.NEURONS) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        ChatInfoPaymentOption chatInfoPaymentOption = (ChatInfoPaymentOption) obj;
        if (chatInfoPaymentOption != null && (value = chatInfoPaymentOption.getValue()) != null) {
            num = StringsKt.toIntOrNull(value);
        }
        return ommonKt.orZero(num);
    }

    public static final boolean isSubscriptionPaymentOptions(ChatInfo chatInfo) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(chatInfo, "<this>");
        Iterator<T> it = chatInfo.getPaymentOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ChatInfoPaymentOption) obj).getType() == ChatInfoPaymentOption.PaymentOptionType.SUBSCRIPTION) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return obj != null;
    }

    public static final int getMaxMessageCount(ChatPaymentStatus.TrialPeriod trialPeriod) {
        Integer num;
        Object obj;
        String value;
        boolean z;
        Intrinsics.checkNotNullParameter(trialPeriod, "<this>");
        Iterator<T> it = trialPeriod.getOptionals().iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ChatInfoTrialOptions) obj).getType() == ChatInfoTrialOptions.TrialOptionType.MESSAGES) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        ChatInfoTrialOptions chatInfoTrialOptions = (ChatInfoTrialOptions) obj;
        if (chatInfoTrialOptions != null && (value = chatInfoTrialOptions.getValue()) != null) {
            num = StringsKt.toIntOrNull(value);
        }
        return ommonKt.orZero(num);
    }
}
