package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import androidx.compose.ui.text.android.Paint29$$ExternalSyntheticApiModelOutline0;
/* loaded from: classes4.dex */
public class RenderEffectBlur implements BlurAlgorithm {
    private int height;
    private final RenderNode node = Paint29$$ExternalSyntheticApiModelOutline0.m("BlurViewNode");
    private int width;

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public boolean canModifyBitmap() {
        return true;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public float scaleFactor() {
        return 6.0f;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public Bitmap blur(Bitmap bitmap, float f) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        if (bitmap.getHeight() != this.height || bitmap.getWidth() != this.width) {
            this.height = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.width = width;
            this.node.setPosition(0, 0, width, this.height);
        }
        beginRecording = this.node.beginRecording();
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.node.endRecording();
        RenderNode renderNode = this.node;
        createBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR);
        renderNode.setRenderEffect(createBlurEffect);
        return bitmap;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public void destroy() {
        this.node.discardDisplayList();
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public Bitmap.Config getSupportedBitmapConfig() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public void render(Canvas canvas, Bitmap bitmap) {
        canvas.drawRenderNode(this.node);
    }
}
