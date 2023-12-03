package cr;

import a5.f;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: SleepCheckListIntroFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {
    public int A;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f11921u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f11922v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoButton f11923w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f11924x;

    /* renamed from: y  reason: collision with root package name */
    public Animation f11925y;

    /* renamed from: z  reason: collision with root package name */
    public String[] f11926z;

    /* compiled from: SleepCheckListIntroFragment.java */
    /* renamed from: cr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0174a extends f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f11927x;

        public C0174a(View view) {
            this.f11927x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f11927x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    /* compiled from: SleepCheckListIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            int i6 = aVar.A + 1;
            aVar.A = i6;
            if (i6 < aVar.f11926z.length) {
                aVar.f11922v.setAnimation(aVar.f11925y);
                aVar.f11922v.setText(aVar.f11926z[aVar.A]);
                aVar.f11925y.setDuration(500L);
                aVar.f11925y.start();
                return;
            }
            ((rr.a) aVar.getActivity()).t0();
        }
    }

    /* compiled from: SleepCheckListIntroFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_coping_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11923w = (RobertoButton) view.findViewById(R.id.tap);
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new C0174a(view));
        this.f11921u = (RobertoTextView) view.findViewById(R.id.Title);
        this.f11922v = (RobertoTextView) view.findViewById(R.id.desc);
        this.f11925y = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        new ArrayList();
        this.f11921u.setText("Create Your\nSleep Checklist");
        String[] strArr = {"Try and do at least one of these tasks everyday and you’ll notice your sleep improving."};
        this.f11926z = strArr;
        this.f11922v.setText(strArr[0]);
        this.f11923w.setOnClickListener(new b());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f11924x = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f11924x.setOnClickListener(new c());
    }
}
