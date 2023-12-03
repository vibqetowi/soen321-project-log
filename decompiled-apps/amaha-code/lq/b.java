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
/* compiled from: Fragment_Racing_Mind_Step_2.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f24491u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f24492v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f24493w;

    /* compiled from: Fragment_Racing_Mind_Step_2.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((DealingRacingMindActivity) b.this.getActivity()).n0();
        }
    }

    /* compiled from: Fragment_Racing_Mind_Step_2.java */
    /* renamed from: lq.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0391b implements View.OnClickListener {
        public View$OnClickListenerC0391b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_racing_mind, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f24491u = (RobertoTextView) view.findViewById(R.id.racingTitle);
        this.f24492v = (RobertoTextView) view.findViewById(R.id.racingDesc);
        this.f24491u.setText("Step 2: Refocus On Your Body");
        this.f24492v.setText("Beyond 30 minutes, tell yourself that you’ve put in your best today and that you will think more if needed tomorrow.\nTurn your attention to your body, and spend some time focussing on your senses - what you can see, hear, smell, taste, and feel.");
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f24493w = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f24493w.setOnClickListener(new View$OnClickListenerC0391b());
    }
}
