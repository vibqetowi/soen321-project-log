package u0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: u  reason: collision with root package name */
    public final int f33726u;

    /* renamed from: v  reason: collision with root package name */
    public final h f33727v;

    /* renamed from: w  reason: collision with root package name */
    public final int f33728w;

    public a(int i6, h hVar, int i10) {
        this.f33726u = i6;
        this.f33727v = hVar;
        this.f33728w = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f33726u);
        this.f33727v.f33731a.performAction(this.f33728w, bundle);
    }
}
