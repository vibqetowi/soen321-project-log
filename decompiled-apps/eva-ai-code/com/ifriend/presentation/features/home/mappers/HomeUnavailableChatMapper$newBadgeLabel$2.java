package com.ifriend.presentation.features.home.mappers;

import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeUnavailableChatMapper.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeUnavailableChatMapper$newBadgeLabel$2 extends Lambda implements Function0<String> {
    final /* synthetic */ HomeUnavailableChatMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeUnavailableChatMapper$newBadgeLabel$2(HomeUnavailableChatMapper homeUnavailableChatMapper) {
        super(0);
        this.this$0 = homeUnavailableChatMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ResourceProvider resourceProvider;
        resourceProvider = this.this$0.resourceProvider;
        return resourceProvider.getString(R.string.home__chat_influencer_promote_badge);
    }
}
