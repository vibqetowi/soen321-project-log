package com.ifriend.registration.presentation.ui.registration;

import android.content.Context;
import com.google.android.exoplayer2.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VideoBackgroundRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/exoplayer2/ExoPlayer;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoBackgroundRegistrationFragment$player$2 extends Lambda implements Function0<ExoPlayer> {
    final /* synthetic */ VideoBackgroundRegistrationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundRegistrationFragment$player$2(VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment) {
        super(0);
        this.this$0 = videoBackgroundRegistrationFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ExoPlayer invoke() {
        ExoPlayer createPlayer;
        VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment = this.this$0;
        Context requireContext = videoBackgroundRegistrationFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        createPlayer = videoBackgroundRegistrationFragment.createPlayer(requireContext);
        return createPlayer;
    }
}
