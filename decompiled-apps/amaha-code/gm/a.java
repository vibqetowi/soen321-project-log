package gm;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.network.model.AddonProfileDetails;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.network.model.Testimonials;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
/* compiled from: InAppPromptVideoViewAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0253a> {

    /* renamed from: x  reason: collision with root package name */
    public final ProviderDetailHolderModel f16613x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f16614y;

    /* compiled from: InAppPromptVideoViewAdapter.kt */
    /* renamed from: gm.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0253a extends RecyclerView.c0 {
        public C0253a(View view) {
            super(view);
        }
    }

    public a(ProviderDetailHolderModel providerModel, boolean z10) {
        i.g(providerModel, "providerModel");
        this.f16613x = providerModel;
        this.f16614y = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        ArrayList<Testimonials> testimonials;
        boolean z10 = this.f16614y;
        ProviderDetailHolderModel providerDetailHolderModel = this.f16613x;
        if (z10) {
            AddonProfileDetails addonProfileDetails = providerDetailHolderModel.getAddonProfileDetails();
            if (addonProfileDetails != null && (testimonials = addonProfileDetails.getTestimonials()) != null) {
                return testimonials.size();
            }
            return 0;
        }
        return providerDetailHolderModel.getUserPhrases().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(C0253a c0253a, int i6) {
        ArrayList<Testimonials> testimonials;
        Testimonials testimonials2;
        boolean z10 = this.f16614y;
        ProviderDetailHolderModel providerDetailHolderModel = this.f16613x;
        View view = c0253a.f2751a;
        if (z10) {
            ((AppCompatImageView) view.findViewById(R.id.ivRowDoubleQuotesUpper)).setVisibility(8);
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowProviderVideoViewText);
            AddonProfileDetails addonProfileDetails = providerDetailHolderModel.getAddonProfileDetails();
            robertoTextView.setText((addonProfileDetails == null || (testimonials = addonProfileDetails.getTestimonials()) == null || (testimonials2 = testimonials.get(i6)) == null || (r6 = testimonials2.getMessage()) == null) ? "" : "");
            return;
        }
        ((AppCompatImageView) view.findViewById(R.id.ivRowDoubleQuotesUpper)).setVisibility(0);
        ((RobertoTextView) view.findViewById(R.id.tvRowProviderVideoViewText)).setText(providerDetailHolderModel.getUserPhrases().get(i6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new C0253a(e.h(parent, R.layout.row_in_app_prompt_video_book_drops_off_item, parent, false, "from(parent.context)\n   …_off_item, parent, false)"));
    }
}
