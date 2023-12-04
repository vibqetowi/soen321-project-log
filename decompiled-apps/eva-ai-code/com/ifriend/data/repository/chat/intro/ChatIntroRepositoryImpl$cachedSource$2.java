package com.ifriend.data.repository.chat.intro;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.logic.chat.models.ChatIntroSlide;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatIntroRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "", "Lcom/ifriend/domain/logic/chat/models/ChatIntroSlide;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroRepositoryImpl$cachedSource$2 extends Lambda implements Function0<InMemoryCachedSource<String, List<? extends ChatIntroSlide>>> {
    public static final ChatIntroRepositoryImpl$cachedSource$2 INSTANCE = new ChatIntroRepositoryImpl$cachedSource$2();

    ChatIntroRepositoryImpl$cachedSource$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final InMemoryCachedSource<String, List<? extends ChatIntroSlide>> invoke2() {
        return new InMemoryCachedSource<>(null, null, null, 7, null);
    }
}
