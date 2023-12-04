package com.ifriend.data.toggle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BackgroundAvatarTrigger.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUri", "", "Lcom/ifriend/data/toggle/BackgroundAvatarTrigger;", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackgroundAvatarTriggerKt {
    public static final String toUri(BackgroundAvatarTrigger backgroundAvatarTrigger) {
        Intrinsics.checkNotNullParameter(backgroundAvatarTrigger, "<this>");
        String videoName = backgroundAvatarTrigger.getVideoName();
        return "https://api.ifriend.ai/media/static/videos/ai/avatars/" + videoName + ".mp4";
    }
}
