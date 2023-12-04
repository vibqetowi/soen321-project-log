package cc.cloudist.acplibrary;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.Display;
import android.view.WindowManager;
/* loaded from: classes3.dex */
public abstract class ACProgressBaseDialog extends Dialog {
    /* JADX INFO: Access modifiers changed from: protected */
    public ACProgressBaseDialog(Context context) {
        super(context, R.style.ACPLDialog);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getMinimumSideOfScreen(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return Math.min(point.x, point.y);
    }
}
