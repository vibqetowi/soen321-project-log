package bq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AcceptingUncertaintyActivity;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: Uncertainity_5_Fragment.java */
/* loaded from: classes2.dex */
public class e extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f4642u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f4643v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoButton f4644w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f4645x;

    /* compiled from: Uncertainity_5_Fragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((AcceptingUncertaintyActivity) e.this.getActivity()).n0();
        }
    }

    /* compiled from: Uncertainity_5_Fragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_racing_mind, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f4642u = (RobertoTextView) view.findViewById(R.id.racingTitle);
        this.f4643v = (RobertoTextView) view.findViewById(R.id.racingDesc);
        this.f4642u.setText("Challenging Intolerance");
        this.f4643v.setText("Try asking yourself the following questions:\nCan I ever be certain about everything in life?\nIs worrying helping me?\nDoes worrying change the outcome of the situation?\nIs there a likelihood of a positive outcome?\nAre the negative consequences of worry worth it?");
        RobertoButton robertoButton = (RobertoButton) view.findViewById(R.id.tap);
        this.f4644w = robertoButton;
        robertoButton.setText("Next");
        this.f4644w.setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f4645x = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f4645x.setOnClickListener(new b());
    }
}
