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
/* compiled from: Fragment_Racing_Mind_Step_3.java */
/* loaded from: classes2.dex */
public class c extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f24496u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f24497v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f24498w;

    /* compiled from: Fragment_Racing_Mind_Step_3.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((DealingRacingMindActivity) c.this.getActivity()).n0();
        }
    }

    /* compiled from: Fragment_Racing_Mind_Step_3.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_racing_mind, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f24496u = (RobertoTextView) view.findViewById(R.id.racingTitle);
        this.f24497v = (RobertoTextView) view.findViewById(R.id.racingDesc);
        this.f24496u.setText("Step 3: Let Your Thoughts Float Away");
        this.f24497v.setText("If your thoughts are still playing on your mind, try a simple mindfulness technique. Imagine that you are in an open field with fluffy white clouds in the sky. Picture your thoughts joining the clouds and floating away with them.");
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f24498w = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f24498w.setOnClickListener(new b());
    }
}
