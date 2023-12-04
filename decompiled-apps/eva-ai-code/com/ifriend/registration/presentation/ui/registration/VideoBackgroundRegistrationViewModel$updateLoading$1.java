package com.ifriend.registration.presentation.ui.registration;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: VideoBackgroundRegistrationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class VideoBackgroundRegistrationViewModel$updateLoading$1 extends Lambda implements Function1<VideoBackgroundRegistrationState, VideoBackgroundRegistrationState> {
    final /* synthetic */ boolean $isLoading;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundRegistrationViewModel$updateLoading$1(boolean z) {
        super(1);
        this.$isLoading = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final VideoBackgroundRegistrationState invoke(VideoBackgroundRegistrationState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return VideoBackgroundRegistrationState.copy$default(it, false, this.$isLoading, false, 5, null);
    }
}
