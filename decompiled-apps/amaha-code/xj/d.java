package xj;

import android.graphics.Paint;
import kotlin.jvm.internal.k;
/* compiled from: SpotlightView.kt */
/* loaded from: classes.dex */
public final class d extends k implements ss.a<Paint> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f37823u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i6) {
        super(0);
        this.f37823u = i6;
    }

    @Override // ss.a
    public final Paint invoke() {
        Paint paint = new Paint();
        paint.setColor(this.f37823u);
        return paint;
    }
}
