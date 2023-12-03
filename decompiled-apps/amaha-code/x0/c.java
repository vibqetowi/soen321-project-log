package x0;

import android.content.Context;
import android.view.LayoutInflater;
/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes.dex */
public abstract class c extends a {
    public final int B;
    public final int C;
    public final LayoutInflater D;

    @Deprecated
    public c(Context context, int i6) {
        super(context);
        this.C = i6;
        this.B = i6;
        this.D = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
