package r6;

import android.graphics.Color;
import com.appsflyer.R;
import java.util.ArrayList;
import r6.j;
/* compiled from: BarLineScatterCandleBubbleDataSet.java */
/* loaded from: classes.dex */
public abstract class e<T extends j> extends i<T> implements v6.b<T> {

    /* renamed from: t  reason: collision with root package name */
    public int f30489t;

    public e(ArrayList arrayList) {
        super(arrayList);
        this.f30489t = Color.rgb(255, 187, (int) R.styleable.AppCompatTheme_tooltipFrameBackground);
    }

    @Override // v6.b
    public final int Z() {
        return this.f30489t;
    }
}
