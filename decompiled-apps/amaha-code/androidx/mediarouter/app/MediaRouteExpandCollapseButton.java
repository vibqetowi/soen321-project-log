package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.theinnerhour.b2b.R;
import g0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    public final String A;
    public boolean B;
    public View.OnClickListener C;

    /* renamed from: x  reason: collision with root package name */
    public final AnimationDrawable f2495x;

    /* renamed from: y  reason: collision with root package name */
    public final AnimationDrawable f2496y;

    /* renamed from: z  reason: collision with root package name */
    public final String f2497z;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Object obj = g0.a.f16164a;
        AnimationDrawable animationDrawable = (AnimationDrawable) a.c.b(context, R.drawable.mr_group_expand);
        this.f2495x = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) a.c.b(context, R.drawable.mr_group_collapse);
        this.f2496y = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(u.c(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.f2497z = string;
        this.A = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new t(this));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.C = onClickListener;
    }
}
