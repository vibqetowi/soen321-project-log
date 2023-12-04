package com.ifriend.presentation.features.home.mappers;

import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.home.ui.models.HomeUnavailableChatUi;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: СhatUnlockLabelMapperUi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/presentation/features/home/mappers/ChatUnlockLabelMapperUi;", "", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "map", "", "chat", "Lcom/ifriend/presentation/features/home/ui/models/HomeUnavailableChatUi;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatUnlockLabelMapperUi {
    public static final int $stable = 8;
    private final ResourceProvider resourceProvider;

    @Inject
    public ChatUnlockLabelMapperUi(ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
    }

    public final String map(HomeUnavailableChatUi homeUnavailableChatUi) {
        int orZero = ommonKt.orZero(homeUnavailableChatUi != null ? Integer.valueOf(homeUnavailableChatUi.getUnlockLevel()) : null);
        if (orZero > 0) {
            return this.resourceProvider.getString(R.string.home__chat_unlock_new_copy_message, Integer.valueOf(orZero));
        }
        return this.resourceProvider.getString(R.string.home__chat_unlock_neurons);
    }
}
