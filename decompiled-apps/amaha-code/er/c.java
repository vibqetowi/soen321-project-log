package er;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: SleepAgeFragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public EditText f14476u;

    /* compiled from: SleepAgeFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = c.this;
            if (cVar.f14476u.getText() != null) {
                FirebasePersistence.getInstance().getUser().getSleep().setAge(cVar.f14476u.getText().toString());
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            ((SleepTimeTableActivity) cVar.getActivity()).t0();
        }
    }

    /* compiled from: SleepAgeFragment.java */
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
        return layoutInflater.inflate(R.layout.fragment_age, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14476u = (EditText) view.findViewById(R.id.edAge);
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
    }
}
