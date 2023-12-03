package eb;

import android.content.Context;
import com.theinnerhour.b2b.R;
/* compiled from: BottomNavigationItemView.java */
/* loaded from: classes.dex */
public final class a extends sb.a {
    public a(Context context) {
        super(context);
    }

    @Override // sb.a
    public int getItemDefaultMarginResId() {
        return R.dimen.design_bottom_navigation_margin;
    }

    @Override // sb.a
    public int getItemLayoutResId() {
        return R.layout.design_bottom_navigation_item;
    }
}
