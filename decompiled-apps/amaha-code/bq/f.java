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
/* compiled from: Uncertainity_6_Fragment.java */
/* loaded from: classes2.dex */
public class f extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f4648u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f4649v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoButton f4650w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f4651x;

    /* compiled from: Uncertainity_6_Fragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((AcceptingUncertaintyActivity) f.this.getActivity()).n0();
        }
    }

    /* compiled from: Uncertainity_6_Fragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_racing_mind, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f4648u = (RobertoTextView) view.findViewById(R.id.racingTitle);
        this.f4649v = (RobertoTextView) view.findViewById(R.id.racingDesc);
        this.f4648u.setText("The Final Step");
        this.f4649v.setText("The answers might make you realise that worrying is not helping you in any way. You could try using the problem solving skills you learned earlier to help you deal with a problem proactively. You could also try practising a relaxation activity to bring your attention to the present and let go of your need for certainty.");
        RobertoButton robertoButton = (RobertoButton) view.findViewById(R.id.tap);
        this.f4650w = robertoButton;
        robertoButton.setText("Done");
        this.f4650w.setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f4651x = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f4651x.setOnClickListener(new b());
    }
}
