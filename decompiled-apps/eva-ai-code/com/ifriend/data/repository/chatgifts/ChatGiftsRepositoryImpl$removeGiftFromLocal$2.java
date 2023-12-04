package com.ifriend.data.repository.chatgifts;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.domain.logic.chat.gifts.ChatGift;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
/* compiled from: ChatGiftsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/logic/chat/gifts/ChatGift;", FirebaseAnalytics.Param.ITEMS, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatGiftsRepositoryImpl$removeGiftFromLocal$2 extends Lambda implements Function1<List<? extends ChatGift>, List<? extends ChatGift>> {
    final /* synthetic */ String $giftId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsRepositoryImpl$removeGiftFromLocal$2(String str) {
        super(1);
        this.$giftId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends ChatGift> invoke(List<? extends ChatGift> list) {
        return invoke2((List<ChatGift>) list);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<ChatGift> invoke2(List<ChatGift> list) {
        Object obj;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List<ChatGift> mutableList = CollectionsKt.toMutableList((Collection) list);
        String str = this.$giftId;
        Iterator<T> it = mutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ChatGift) obj).getGiftId(), str)) {
                break;
            }
        }
        TypeIntrinsics.asMutableCollection(mutableList).remove((ChatGift) obj);
        return mutableList;
    }
}
