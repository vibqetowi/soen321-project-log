package com.ifriend.ui.recyclerView.audio.audioView;

import android.widget.ImageView;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: VoiceSampleView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class VoiceSampleView$playBackground$2 extends Lambda implements Function0<ImageView> {
    final /* synthetic */ VoiceSampleView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSampleView$playBackground$2(VoiceSampleView voiceSampleView) {
        super(0);
        this.this$0 = voiceSampleView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ImageView invoke() {
        return (ImageView) this.this$0.findViewById(R.id.play_background);
    }
}
