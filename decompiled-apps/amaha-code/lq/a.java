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
/* compiled from: Fragment_Racing_Mind_Step_1.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f24486u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f24487v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f24488w;

    /* compiled from: Fragment_Racing_Mind_Step_1.java */
    /* renamed from: lq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0390a implements View.OnClickListener {
        public View$OnClickListenerC0390a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((DealingRacingMindActivity) a.this.getActivity()).n0();
        }
    }

    /* compiled from: Fragment_Racing_Mind_Step_1.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_racing_mind, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f24486u = (RobertoTextView) view.findViewById(R.id.racingTitle);
        this.f24487v = (RobertoTextView) view.findViewById(R.id.racingDesc);
        this.f24486u.setText("Step 1: List Your Thoughts");
        this.f24487v.setText("Take a piece of paper and a pen, and list down all the things that are running in your head. If you find that you are worried about or bothered by something, spend 30 minutes thinking about what you can do to feel better or resolve the issue.");
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View$OnClickListenerC0390a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f24488w = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f24488w.setOnClickListener(new b());
    }
}
