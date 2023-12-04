package com.ifriend.chat.presentation.ui.chat.photo;

import android.util.Size;
import androidx.camera.core.ImageCapture;
import com.ifriend.chat.presentation.databinding.FragmentPreviewSendImageBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreviewSendImageFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/camera/core/ImageCapture;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewSendImageFragment$imageCapture$2 extends Lambda implements Function0<ImageCapture> {
    final /* synthetic */ PreviewSendImageFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSendImageFragment$imageCapture$2(PreviewSendImageFragment previewSendImageFragment) {
        super(0);
        this.this$0 = previewSendImageFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ImageCapture invoke() {
        FragmentPreviewSendImageBinding binding;
        FragmentPreviewSendImageBinding binding2;
        ImageCapture.Builder captureMode = new ImageCapture.Builder().setFlashMode(2).setCaptureMode(1);
        binding = this.this$0.getBinding();
        int width = binding.surface.getWidth();
        binding2 = this.this$0.getBinding();
        return captureMode.setTargetResolution(new Size(width, binding2.surface.getHeight())).build();
    }
}
