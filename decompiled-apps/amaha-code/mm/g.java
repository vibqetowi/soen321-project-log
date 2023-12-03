package mm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.k;
import ss.l;
/* compiled from: JournalTemplateSwitcherAdapter.kt */
/* loaded from: classes2.dex */
public final class g extends RecyclerView.e<a> {
    public final ss.a<k> A;

    /* renamed from: x  reason: collision with root package name */
    public final Context f25630x;

    /* renamed from: y  reason: collision with root package name */
    public int f25631y;

    /* renamed from: z  reason: collision with root package name */
    public final l<Integer, k> f25632z;

    /* compiled from: JournalTemplateSwitcherAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public g(Context context, int i6, JournalParentActivity.c cVar, JournalParentActivity.d dVar) {
        kotlin.jvm.internal.i.g(context, "context");
        this.f25630x = context;
        this.f25631y = i6;
        this.f25632z = cVar;
        this.A = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        ak.d dVar = new ak.d(i6, this, 11);
        View view = aVar.f2751a;
        view.setOnClickListener(dVar);
        Context context = this.f25630x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    Glide.g(context).a().C(Integer.valueOf((int) R.drawable.ic_journal_template_thought)).B((AppCompatImageView) view.findViewById(R.id.ivItemJournalTemplateIcon));
                    ((RobertoTextView) view.findViewById(R.id.tvItemJournalTemplateTitle)).setText(view.getContext().getString(R.string.journalTemplateThoughtHeader));
                    ((RobertoTextView) view.findViewById(R.id.tvItemJournalTemplateDescription)).setText(view.getContext().getString(R.string.journalTemplateThoughtDesc));
                    ((RobertoTextView) view.findViewById(R.id.tvItemJournalTemplateLearnMore)).setVisibility(0);
                    ((RobertoTextView) view.findViewById(R.id.tvItemJournalTemplateLearnMore)).setOnClickListener(new ol.k(17, this));
                }
            } else {
                Glide.g(context).a().C(Integer.valueOf((int) R.drawable.ic_journal_template_question)).B((AppCompatImageView) view.findViewById(R.id.ivItemJournalTemplateIcon));
                ((RobertoTextView) view.findViewById(R.id.tvItemJournalTemplateTitle)).setText(view.getContext().getString(R.string.journalTemplateQuestionHeader));
                ((RobertoTextView) view.findViewById(R.id.tvItemJournalTemplateDescription)).setText(view.getContext().getString(R.string.journalTemplateQuestionDesc));
                ((RobertoTextView) view.findViewById(R.id.tvItemJournalTemplateLearnMore)).setVisibility(4);
            }
        } else {
            Glide.g(context).a().C(Integer.valueOf((int) R.drawable.ic_journal_template_regular)).B((AppCompatImageView) view.findViewById(R.id.ivItemJournalTemplateIcon));
            ((RobertoTextView) view.findViewById(R.id.tvItemJournalTemplateTitle)).setText(view.getContext().getString(R.string.journalTemplateRegularHeader));
            ((RobertoTextView) view.findViewById(R.id.tvItemJournalTemplateDescription)).setText(view.getContext().getString(R.string.journalTemplateRegularDesc));
            ((RobertoTextView) view.findViewById(R.id.tvItemJournalTemplateLearnMore)).setVisibility(4);
        }
        Drawable background = ((ConstraintLayout) view.findViewById(R.id.clItemJournalTemplateContainer)).getBackground();
        kotlin.jvm.internal.i.e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (i6 == this.f25631y) {
            ShapeableImageView shapeableImageView = (ShapeableImageView) view.findViewById(R.id.ivItemJournalTemplateIconSelected);
            if (shapeableImageView != null) {
                shapeableImageView.setVisibility(0);
            }
            gradientDrawable.setColor(ColorStateList.valueOf(g0.a.b(view.getContext(), R.color.amahaLightGreen)));
            gradientDrawable.setStroke(1, ColorStateList.valueOf(g0.a.b(view.getContext(), R.color.amahaLightGreen)));
            return;
        }
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) view.findViewById(R.id.ivItemJournalTemplateIconSelected);
        if (shapeableImageView2 != null) {
            shapeableImageView2.setVisibility(8);
        }
        gradientDrawable.setColor(ColorStateList.valueOf(g0.a.b(view.getContext(), R.color.white)));
        gradientDrawable.setStroke(2, ColorStateList.valueOf(g0.a.b(view.getContext(), R.color.proDashboardFooter)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.item_journal_parent_template, parent, false, "from(parent.context).inf…_template, parent, false)"));
    }
}
