package com.google.android.gms.cast.framework.media.internal;

import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.theinnerhour.b2b.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import pl.a;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class ResourceProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Integer> f7284a;

    static {
        HashMap hashMap = new HashMap();
        a.h(R.drawable.cast_ic_notification_small_icon, hashMap, "smallIconDrawableResId", R.drawable.cast_ic_notification_stop_live_stream, "stopLiveStreamDrawableResId", R.drawable.cast_ic_notification_pause, "pauseDrawableResId", R.drawable.cast_ic_notification_play, "playDrawableResId");
        a.h(R.drawable.cast_ic_notification_skip_next, hashMap, "skipNextDrawableResId", R.drawable.cast_ic_notification_skip_prev, "skipPrevDrawableResId", R.drawable.cast_ic_notification_forward, "forwardDrawableResId", R.drawable.cast_ic_notification_forward10, "forward10DrawableResId");
        a.h(R.drawable.cast_ic_notification_forward30, hashMap, "forward30DrawableResId", R.drawable.cast_ic_notification_rewind, "rewindDrawableResId", R.drawable.cast_ic_notification_rewind10, "rewind10DrawableResId", R.drawable.cast_ic_notification_rewind30, "rewind30DrawableResId");
        a.h(R.drawable.cast_ic_notification_disconnect, hashMap, "disconnectDrawableResId", R.dimen.cast_notification_image_size, "notificationImageSizeDimenResId", R.string.cast_casting_to_device, "castingToDeviceStringResId", R.string.cast_stop_live_stream, "stopLiveStreamStringResId");
        a.h(R.string.cast_pause, hashMap, "pauseStringResId", R.string.cast_play, "playStringResId", R.string.cast_skip_next, "skipNextStringResId", R.string.cast_skip_prev, "skipPrevStringResId");
        a.h(R.string.cast_forward, hashMap, "forwardStringResId", R.string.cast_forward_10, "forward10StringResId", R.string.cast_forward_30, "forward30StringResId", R.string.cast_rewind, "rewindStringResId");
        hashMap.put("rewind10StringResId", Integer.valueOf((int) R.string.cast_rewind_10));
        hashMap.put("rewind30StringResId", Integer.valueOf((int) R.string.cast_rewind_30));
        hashMap.put("disconnectStringResId", Integer.valueOf((int) R.string.cast_disconnect));
        f7284a = Collections.unmodifiableMap(hashMap);
    }

    @RecentlyNonNull
    @Keep
    public static Integer findResourceByName(@RecentlyNonNull String str) {
        if (str == null) {
            return null;
        }
        return f7284a.get(str);
    }
}
