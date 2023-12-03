package tk;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.theinnerhour.b2b.R;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class r extends ClickableSpan {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Context f33211u;

    public r(Context context) {
        this.f33211u = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kotlin.jvm.internal.i.g(widget, "widget");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        kotlin.jvm.internal.i.g(ds2, "ds");
        super.updateDrawState(ds2);
        ds2.setUnderlineText(false);
        ds2.setColor(g0.a.b(this.f33211u, R.color.teleCardTerracota));
    }
}
