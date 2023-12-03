package lq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DealingRacingMindActivity;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: Fragment_Racing_Mind_Step_4.java */
/* loaded from: classes2.dex */
public class d extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f24501u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f24502v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f24503w;

    /* compiled from: Fragment_Racing_Mind_Step_4.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((DealingRacingMindActivity) d.this.getActivity()).n0();
        }
    }

    /* compiled from: Fragment_Racing_Mind_Step_4.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_racing_mind, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f24501u = (RobertoTextView) view.findViewById(R.id.racingTitle);
        this.f24502v = (RobertoTextView) view.findViewById(R.id.racingDesc);
        this.f24501u.setText("Step 4: Breathe");
        this.f24502v.setText("Spend a few minutes engaging in deep breathing. Inhale for 4 counts, hold for 2 counts, and exhale for 6 counts. Doing this repeatedly can promote better blood flow and help you sleep better.");
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f24503w = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f24503w.setOnClickListener(new b());
    }
}
