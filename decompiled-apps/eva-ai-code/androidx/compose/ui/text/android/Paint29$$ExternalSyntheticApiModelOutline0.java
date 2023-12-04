package androidx.compose.ui.text.android;

import android.graphics.RenderNode;
import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class Paint29$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ RenderNode m(String str) {
        return new RenderNode(str);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ LineBreakConfig.Builder m5119m() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout m(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2, boolean z2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, f, f2, metrics, z, truncateAt, i2, z2);
    }

    public static /* bridge */ /* synthetic */ AutofillId m(Object obj) {
        return (AutofillId) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m5121m(Object obj) {
        return (ContentCaptureSession) obj;
    }
}
