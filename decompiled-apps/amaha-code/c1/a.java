package c1;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;
/* compiled from: DrawerLayout.java */
/* loaded from: classes.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z10;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z11 = true;
        if (windowInsets.getSystemWindowInsetTop() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        drawerLayout.R = windowInsets;
        drawerLayout.S = z10;
        drawerLayout.setWillNotDraw((z10 || drawerLayout.getBackground() != null) ? false : false);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
