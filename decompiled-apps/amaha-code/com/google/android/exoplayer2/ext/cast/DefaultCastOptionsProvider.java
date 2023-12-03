package com.google.android.exoplayer2.ext.cast;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l9.b;
import l9.d;
import l9.g;
import m9.a;
import m9.f;
/* loaded from: classes.dex */
public final class DefaultCastOptionsProvider implements d {
    @Override // l9.d
    public List<g> getAdditionalSessionProviders(Context context) {
        return Collections.emptyList();
    }

    @Override // l9.d
    public b getCastOptions(Context context) {
        return new b("A12D4273", new ArrayList(), true, new k9.g(), false, new a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, new f(f.f24974a0, f.f24975b0, 10000L, null, f.a.a("smallIconDrawableResId"), f.a.a("stopLiveStreamDrawableResId"), f.a.a("pauseDrawableResId"), f.a.a("playDrawableResId"), f.a.a("skipNextDrawableResId"), f.a.a("skipPrevDrawableResId"), f.a.a("forwardDrawableResId"), f.a.a("forward10DrawableResId"), f.a.a("forward30DrawableResId"), f.a.a("rewindDrawableResId"), f.a.a("rewind10DrawableResId"), f.a.a("rewind30DrawableResId"), f.a.a("disconnectDrawableResId"), f.a.a("notificationImageSizeDimenResId"), f.a.a("castingToDeviceStringResId"), f.a.a("stopLiveStreamStringResId"), f.a.a("pauseStringResId"), f.a.a("playStringResId"), f.a.a("skipNextStringResId"), f.a.a("skipPrevStringResId"), f.a.a("forwardStringResId"), f.a.a("forward10StringResId"), f.a.a("forward30StringResId"), f.a.a("rewindStringResId"), f.a.a("rewind10StringResId"), f.a.a("rewind30StringResId"), f.a.a("disconnectStringResId"), null), false, true), false, 0.05000000074505806d, false, false, false);
    }
}
