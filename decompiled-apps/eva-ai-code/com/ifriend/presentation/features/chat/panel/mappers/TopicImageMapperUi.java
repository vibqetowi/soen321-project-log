package com.ifriend.presentation.features.chat.panel.mappers;

import com.ifriend.presentation.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TopicImageMapperUi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/presentation/features/chat/panel/mappers/TopicImageMapperUi;", "", "()V", "map", "", "iconName", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopicImageMapperUi {
    public static final int $stable = 0;

    public final Integer map(String iconName) {
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        if (Intrinsics.areEqual(iconName, "drops")) {
            return Integer.valueOf(R.drawable.img_droplets);
        }
        return null;
    }
}
