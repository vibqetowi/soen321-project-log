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
/* compiled from: Uncertainity_4_Fragment.java */
/* loaded from: classes2.dex */
public class d extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f4636u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f4637v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoButton f4638w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f4639x;

    /* compiled from: Uncertainity_4_Fragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((AcceptingUncertaintyActivity) d.this.getActivity()).n0();
        }
    }

    /* compiled from: Uncertainity_4_Fragment.java */
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
        this.f4636u = (RobertoTextView) view.findViewById(R.id.racingTitle);
        this.f4637v = (RobertoTextView) view.findViewById(R.id.racingDesc);
        this.f4636u.setText("Accepting Doubt");
        this.f4637v.setText("It is important to learn how to accept doubt, uncertainty and unpredictability without worrying (too much), while learning to enjoy the positive and happy moments the present has to offer.");
        RobertoButton robertoButton = (RobertoButton) view.findViewById(R.id.tap);
        this.f4638w = robertoButton;
        robertoButton.setText("Next");
        this.f4638w.setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f4639x = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f4639x.setOnClickListener(new b());
    }
}
