package xj;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.jvm.internal.k;
/* compiled from: SpotlightView.kt */
/* loaded from: classes.dex */
public final class h extends k implements ss.a<Paint> {

    /* renamed from: u  reason: collision with root package name */
    public static final h f37827u = new h();

    public h() {
        super(0);
    }

    @Override // ss.a
    public final Paint invoke() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        return paint;
    }
}
