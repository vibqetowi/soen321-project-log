package aq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SleepDosDontsActivity;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: SleepDoDontIntroFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f3411u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f3412v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f3413w;

    /* renamed from: x  reason: collision with root package name */
    public final String f3414x = "Sleep Do's & Don'ts";

    /* renamed from: y  reason: collision with root package name */
    public final String f3415y = "Where you sleep is as important as what you do right before you go to bed. Learn more about the link between what you do on your bed and the quality of your sleep.";

    /* compiled from: SleepDoDontIntroFragment.java */
    /* renamed from: aq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0049a implements View.OnClickListener {
        public View$OnClickListenerC0049a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: SleepDoDontIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SleepDosDontsActivity) a.this.getActivity()).n0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sleep_do_dont_intro, viewGroup, false);
        this.f3411u = (RobertoTextView) inflate.findViewById(R.id.tvTitle);
        this.f3412v = (RobertoTextView) inflate.findViewById(R.id.tvDesc);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.header_arrow_back);
        this.f3413w = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f3413w.setOnClickListener(new View$OnClickListenerC0049a());
        this.f3411u.setText(this.f3414x);
        this.f3412v.setText(this.f3415y);
        ((RobertoButton) inflate.findViewById(R.id.tap)).setOnClickListener(new b());
        return inflate;
    }
}
