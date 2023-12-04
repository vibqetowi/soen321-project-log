package com.ifriend.data.repository.chat.info;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatsInfoRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatsInfoRepositoryImpl$cachedSource$2 extends Lambda implements Function0<InMemoryCachedSource<String, ChatInfo>> {
    public static final ChatsInfoRepositoryImpl$cachedSource$2 INSTANCE = new ChatsInfoRepositoryImpl$cachedSource$2();

    ChatsInfoRepositoryImpl$cachedSource$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InMemoryCachedSource<String, ChatInfo> invoke() {
        return new InMemoryCachedSource<>(null, null, null, 7, null);
    }
}
