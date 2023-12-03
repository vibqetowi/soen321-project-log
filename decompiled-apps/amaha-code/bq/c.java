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
/* compiled from: Uncertainity_3_Fragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f4630u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f4631v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoButton f4632w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f4633x;

    /* compiled from: Uncertainity_3_Fragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((AcceptingUncertaintyActivity) c.this.getActivity()).n0();
        }
    }

    /* compiled from: Uncertainity_3_Fragment.java */
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
        this.f4630u = (RobertoTextView) view.findViewById(R.id.racingTitle);
        this.f4631v = (RobertoTextView) view.findViewById(R.id.racingDesc);
        this.f4630u.setText("Reducing Distress");
        this.f4631v.setText("To reduce your distress, you begin focussing on future outcomes. This causes you to worry and think of the worst possible outcome(s) for the unpredictable and the uncertain situation.");
        RobertoButton robertoButton = (RobertoButton) view.findViewById(R.id.tap);
        this.f4632w = robertoButton;
        robertoButton.setText("What Should I Do?");
        this.f4632w.setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f4633x = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f4633x.setOnClickListener(new b());
    }
}
