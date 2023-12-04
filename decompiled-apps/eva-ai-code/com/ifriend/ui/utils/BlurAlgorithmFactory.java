package com.ifriend.ui.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import eightbitlab.com.blurview.BlurAlgorithm;
import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderEffectBlur;
import eightbitlab.com.blurview.RenderScriptBlur;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UIUtils.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0003R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/ifriend/ui/utils/BlurAlgorithmFactory;", "", "()V", "isRenderEffectAvailable", "", "Ljava/lang/Boolean;", "createBlurAlgorithm", "Leightbitlab/com/blurview/BlurAlgorithm;", ViewHierarchyConstants.VIEW_KEY, "Leightbitlab/com/blurview/BlurView;", "tryCreateRenderEffect", "Leightbitlab/com/blurview/RenderEffectBlur;", "tryExecuteBlurEffect", "", "renderEffect", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BlurAlgorithmFactory {
    public static final BlurAlgorithmFactory INSTANCE = new BlurAlgorithmFactory();
    private static Boolean isRenderEffectAvailable;

    private BlurAlgorithmFactory() {
    }

    public final BlurAlgorithm createBlurAlgorithm(BlurView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.isHardwareAccelerated()) {
            BlurAlgorithm tryCreateRenderEffect = tryCreateRenderEffect();
            if (tryCreateRenderEffect == null) {
                tryCreateRenderEffect = new RenderScriptBlur(view.getContext());
            }
            return tryCreateRenderEffect;
        }
        return new RenderScriptBlur(view.getContext());
    }

    private final RenderEffectBlur tryCreateRenderEffect() {
        RenderEffectBlur renderEffectBlur = null;
        if (Intrinsics.areEqual((Object) isRenderEffectAvailable, (Object) false)) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                RenderEffectBlur renderEffectBlur2 = new RenderEffectBlur();
                tryExecuteBlurEffect(renderEffectBlur2);
                isRenderEffectAvailable = true;
                renderEffectBlur = renderEffectBlur2;
            } else {
                isRenderEffectAvailable = false;
            }
        } catch (Throwable unused) {
            isRenderEffectAvailable = false;
        }
        return renderEffectBlur;
    }

    private final void tryExecuteBlurEffect(RenderEffectBlur renderEffectBlur) {
        Bitmap.Config config;
        config = Bitmap.Config.HARDWARE;
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        renderEffectBlur.blur(createBitmap, 10.0f);
        renderEffectBlur.render(new Canvas(), createBitmap);
    }
}
