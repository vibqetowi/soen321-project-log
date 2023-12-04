package com.ifriend.data.repository.chat.info.mapper;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.data.networking.api.chat.models.ChatInfoTypeValueRemote;
import com.ifriend.data.networking.api.chat.models.ChatPaymentConditionsRemote;
import com.ifriend.data.networking.api.chat.models.ChatsRootRemote;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatInfoPaymentOption;
import com.ifriend.domain.logic.chat.models.ChatInfoTag;
import com.ifriend.domain.logic.chat.models.ChatInfoTrialOptions;
import com.ifriend.domain.logic.chat.models.ChatPaymentStatus;
import com.ifriend.domain.logic.chat.models.ChatPromote;
import com.ifriend.domain.logic.chat.models.ChatType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatInfoMapper.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0004H\u0002J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0004H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00140\u0004H\u0002¨\u0006\u001c"}, d2 = {"Lcom/ifriend/data/repository/chat/info/mapper/ChatInfoMapper;", "", "()V", "getPaymentOptions", "", "Lcom/ifriend/domain/logic/chat/models/ChatInfoPaymentOption;", "paymentConditions", "Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote;", "getPaymentStatus", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus;", "chatType", "Lcom/ifriend/domain/logic/chat/models/ChatType;", "map", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chatInfo", "Lcom/ifriend/data/networking/api/chat/models/ChatsRootRemote$ChatRemote;", "chatConfig", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "mapPaymentOption", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/data/networking/api/chat/models/ChatInfoTypeValueRemote;", "mapPaymentOptions", "paymentOptions", "mapTrialOptions", "Lcom/ifriend/domain/logic/chat/models/ChatInfoTrialOptions;", "trialOptions", "isSubscriptionPaymentOptions", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInfoMapper {
    public final ChatInfo map(ChatsRootRemote.ChatRemote chatInfo, ChatConfig chatConfig) {
        Intrinsics.checkNotNullParameter(chatInfo, "chatInfo");
        Intrinsics.checkNotNullParameter(chatConfig, "chatConfig");
        ChatType from = ChatType.Companion.from(chatConfig.getChatType());
        List<String> tags = chatConfig.getTags();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tags, 10));
        for (String str : tags) {
            arrayList.add(ChatInfoTag.Companion.from(str));
        }
        ArrayList arrayList2 = arrayList;
        ChatPaymentConditionsRemote paymentConditions = chatInfo.getPaymentConditions();
        ChatPaymentStatus paymentStatus = getPaymentStatus(from, paymentConditions);
        ChatPromote chatPromote = new ChatPromote(chatConfig.getPromote().isPromote(), chatConfig.getPromote().getPriority());
        List<ChatInfoPaymentOption> paymentOptions = getPaymentOptions(paymentConditions);
        String uid = chatInfo.getUid();
        if (uid == null) {
            uid = "";
        }
        return new ChatInfo(uid, chatConfig.getChatId(), from, chatConfig.getName(), chatConfig.getImages().getRoundAvatarUrl(), paymentStatus, paymentOptions, arrayList2, chatPromote);
    }

    private final List<ChatInfoPaymentOption> getPaymentOptions(ChatPaymentConditionsRemote chatPaymentConditionsRemote) {
        ChatPaymentConditionsRemote.PreCondition preCondition = chatPaymentConditionsRemote != null ? chatPaymentConditionsRemote.getPreCondition() : null;
        ChatPaymentConditionsRemote.PostCondition postCondition = chatPaymentConditionsRemote != null ? chatPaymentConditionsRemote.getPostCondition() : null;
        if (preCondition != null) {
            return mapPaymentOptions(preCondition.getPaymentOptions());
        }
        if (postCondition != null) {
            return mapPaymentOptions(postCondition.getPaymentOptions());
        }
        return CollectionsKt.emptyList();
    }

    private final List<ChatInfoPaymentOption> mapPaymentOptions(List<ChatInfoTypeValueRemote> list) {
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List<ChatInfoTypeValueRemote> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ChatInfoTypeValueRemote chatInfoTypeValueRemote : list2) {
            arrayList.add(mapPaymentOption(chatInfoTypeValueRemote));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ChatInfoPaymentOption) obj).getType() != ChatInfoPaymentOption.PaymentOptionType.UNKNOWN) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final ChatInfoPaymentOption mapPaymentOption(ChatInfoTypeValueRemote chatInfoTypeValueRemote) {
        String value = chatInfoTypeValueRemote.getValue();
        if (value == null) {
            value = "";
        }
        ChatInfoPaymentOption.PaymentOptionType.Companion companion = ChatInfoPaymentOption.PaymentOptionType.Companion;
        String type = chatInfoTypeValueRemote.getType();
        return new ChatInfoPaymentOption(companion.from(type != null ? type : ""), value);
    }

    private final ChatPaymentStatus getPaymentStatus(ChatType chatType, ChatPaymentConditionsRemote chatPaymentConditionsRemote) {
        ChatPaymentConditionsRemote.PreCondition preCondition = chatPaymentConditionsRemote != null ? chatPaymentConditionsRemote.getPreCondition() : null;
        ChatPaymentConditionsRemote.PostCondition postCondition = chatPaymentConditionsRemote != null ? chatPaymentConditionsRemote.getPostCondition() : null;
        if (chatType == ChatType.MAIN) {
            return ChatPaymentStatus.Free.INSTANCE;
        }
        if (preCondition != null) {
            List<ChatInfoTypeValueRemote> paymentOptions = preCondition.getPaymentOptions();
            if (paymentOptions == null) {
                paymentOptions = CollectionsKt.emptyList();
            }
            if (isSubscriptionPaymentOptions(paymentOptions)) {
                return new ChatPaymentStatus.Subscription(false);
            }
            return ChatPaymentStatus.Purchase.INSTANCE;
        } else if (postCondition != null) {
            List<ChatInfoTrialOptions> mapTrialOptions = mapTrialOptions(postCondition.getTrialOptions());
            if (true ^ mapTrialOptions.isEmpty()) {
                return new ChatPaymentStatus.TrialPeriod(mapTrialOptions);
            }
            List<ChatInfoTypeValueRemote> paymentOptions2 = postCondition.getPaymentOptions();
            if (paymentOptions2 == null) {
                paymentOptions2 = CollectionsKt.emptyList();
            }
            if (isSubscriptionPaymentOptions(paymentOptions2)) {
                return new ChatPaymentStatus.Subscription(false);
            }
            return ChatPaymentStatus.Purchase.INSTANCE;
        } else if (chatType == ChatType.INFLUENCER) {
            return new ChatPaymentStatus.Subscription(true);
        } else {
            return ChatPaymentStatus.Paid.INSTANCE;
        }
    }

    private final List<ChatInfoTrialOptions> mapTrialOptions(List<ChatInfoTypeValueRemote> list) {
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List<ChatInfoTypeValueRemote> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ChatInfoTypeValueRemote chatInfoTypeValueRemote : list2) {
            ChatInfoTrialOptions.TrialOptionType.Companion companion = ChatInfoTrialOptions.TrialOptionType.Companion;
            String type = chatInfoTypeValueRemote.getType();
            String str = "";
            if (type == null) {
                type = "";
            }
            ChatInfoTrialOptions.TrialOptionType from = companion.from(type);
            String value = chatInfoTypeValueRemote.getValue();
            if (value != null) {
                str = value;
            }
            arrayList.add(new ChatInfoTrialOptions(from, str));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ChatInfoTrialOptions) obj).getType() != ChatInfoTrialOptions.TrialOptionType.UNKNOWN) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final boolean isSubscriptionPaymentOptions(List<ChatInfoTypeValueRemote> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ChatInfoTypeValueRemote) obj).getType(), ChatInfoPaymentOption.PaymentOptionType.SUBSCRIPTION.getType())) {
                break;
            }
        }
        return obj != null;
    }
}
