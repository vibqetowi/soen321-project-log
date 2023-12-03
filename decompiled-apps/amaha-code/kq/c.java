package kq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.CopingActivity;
import com.theinnerhour.b2b.model.Coping;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.CircularSlider;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
/* compiled from: CopingTrackerFragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b implements CircularSlider.a {

    /* renamed from: u  reason: collision with root package name */
    public CircularSlider f23787u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f23788v;

    /* renamed from: w  reason: collision with root package name */
    public String f23789w = Constants.moodStr[0];

    /* renamed from: x  reason: collision with root package name */
    public AppCompatImageView f23790x;

    /* compiled from: CopingTrackerFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    /* compiled from: CopingTrackerFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f23792u;

        public b(int i6) {
            this.f23792u = i6;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i6 = this.f23792u;
            c cVar = c.this;
            if (i6 == 1) {
                ((CopingActivity) cVar.getActivity()).A = new Coping(cVar.f23789w);
            } else {
                Coping coping = ((CopingActivity) cVar.getActivity()).A;
                if (coping.getDate().getTime() == 0) {
                    coping.setmDate(Calendar.getInstance().getTime());
                }
                coping.setLevelSecond(cVar.f23789w);
                FirebasePersistence.getInstance().getUser().getUserCopingList().add(coping);
                FirebasePersistence.getInstance().updateUserOnFirebase();
                Toast.makeText(cVar.getContext(), "Thank you", 0).show();
            }
            ((CopingActivity) cVar.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_coping_tracker, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CircularSlider circularSlider = (CircularSlider) view.findViewById(R.id.circular);
        this.f23787u = circularSlider;
        circularSlider.setColorCode(Constants.colorCode);
        this.f23787u.setOnSliderMovedListener(this);
        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.circularCenterText);
        this.f23788v = robertoTextView;
        robertoTextView.setText(this.f23789w);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        ((RobertoTextView) view.findViewById(R.id.llheader)).setText("Move the dial to indicate \nhow you are feeling");
        int i6 = getArguments().getInt("step");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.smiley_imageview);
        this.f23790x = appCompatImageView;
        appCompatImageView.setImageResource(Constants.trackerSmiley[0]);
        ((RobertoButton) view.findViewById(R.id.ll_submit)).setOnClickListener(new b(i6));
    }
}
