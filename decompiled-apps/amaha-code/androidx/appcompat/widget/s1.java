package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
/* compiled from: TooltipPopup.java */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1542a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1543b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f1544c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1545d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1546e;
    public final int[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1547g;

    public s1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1545d = layoutParams;
        this.f1546e = new Rect();
        this.f = new int[2];
        this.f1547g = new int[2];
        this.f1542a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1543b = inflate;
        this.f1544c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(s1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = com.appsflyer.R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
