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
/* compiled from: Uncertainity_1_Fragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f4618u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f4619v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoButton f4620w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f4621x;

    /* compiled from: Uncertainity_1_Fragment.java */
    /* renamed from: bq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0089a implements View.OnClickListener {
        public View$OnClickListenerC0089a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((AcceptingUncertaintyActivity) a.this.getActivity()).n0();
        }
    }

    /* compiled from: Uncertainity_1_Fragment.java */
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
        this.f4618u = (RobertoTextView) view.findViewById(R.id.racingTitle);
        this.f4619v = (RobertoTextView) view.findViewById(R.id.racingDesc);
        this.f4618u.setText("Facing Uncertainty");
        this.f4619v.setText("You might face uncertain situations where you are unsure of the outcome or the type of outcome. To be worried in such a circumstance is completely normal, however it is important that you learn to tolerate this uncertainty.");
        RobertoButton robertoButton = (RobertoButton) view.findViewById(R.id.tap);
        this.f4620w = robertoButton;
        robertoButton.setText("Next");
        this.f4620w.setOnClickListener(new View$OnClickListenerC0089a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f4621x = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f4621x.setOnClickListener(new b());
    }
}
