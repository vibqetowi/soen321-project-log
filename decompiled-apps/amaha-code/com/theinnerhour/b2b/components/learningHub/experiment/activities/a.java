package com.theinnerhour.b2b.components.learningHub.experiment.activities;

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.load.engine.GlideException;
import com.theinnerhour.b2b.R;
import z4.e;
/* compiled from: CreativeCarouselPagerActivity.kt */
/* loaded from: classes2.dex */
public final class a implements e<Drawable> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f11289u;

    public a(ConstraintLayout constraintLayout) {
        this.f11289u = constraintLayout;
    }

    @Override // z4.e
    public final void a(Object obj) {
        Drawable drawable = (Drawable) obj;
        ConstraintLayout constraintLayout = this.f11289u;
        ((ProgressBar) constraintLayout.findViewById(R.id.pbCarousel)).setVisibility(8);
        ((AppCompatImageView) constraintLayout.findViewById(R.id.ivPhoto)).setVisibility(0);
    }

    @Override // z4.e
    public final void b(GlideException glideException) {
        ((ProgressBar) this.f11289u.findViewById(R.id.pbCarousel)).setVisibility(0);
    }
}
