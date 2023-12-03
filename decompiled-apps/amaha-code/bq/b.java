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
/* compiled from: Uncertainity_2_Fragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f4624u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f4625v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoButton f4626w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f4627x;

    /* compiled from: Uncertainity_2_Fragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((AcceptingUncertaintyActivity) b.this.getActivity()).n0();
        }
    }

    /* compiled from: Uncertainity_2_Fragment.java */
    /* renamed from: bq.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0090b implements View.OnClickListener {
        public View$OnClickListenerC0090b() {
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
        this.f4624u = (RobertoTextView) view.findViewById(R.id.racingTitle);
        this.f4625v = (RobertoTextView) view.findViewById(R.id.racingDesc);
        this.f4624u.setText("Handling Uncertainty");
        this.f4625v.setText("People handle uncertainty differently - some are able to tolerate it, some cannot handle it at all. If you are unable to handle uncertainty, you view feelings of doubt and situations that are unpredictable negatively.");
        RobertoButton robertoButton = (RobertoButton) view.findViewById(R.id.tap);
        this.f4626w = robertoButton;
        robertoButton.setText("Next");
        this.f4626w.setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f4627x = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f4627x.setOnClickListener(new View$OnClickListenerC0090b());
    }
}
