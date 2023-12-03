package wq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.HappinessAndEnviromentModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Iterator;
/* compiled from: HappinessAndEnvironmentDescFragment.java */
/* loaded from: classes2.dex */
public class d extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f37058u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f37059v;

    /* compiled from: HappinessAndEnvironmentDescFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) d.this.getActivity()).onBackPressed();
        }
    }

    @Override // rr.b
    public final rr.b F() {
        e eVar = new e();
        eVar.setArguments(getArguments());
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getArguments();
        HappinessAndEnviromentModel happinessAndEnviromentModel = null;
        String string = getArguments().getString("enviromental_model", null);
        Iterator<HappinessAndEnviromentModel> it = b.J().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HappinessAndEnviromentModel next = it.next();
            if (next.getId().equals(string)) {
                happinessAndEnviromentModel = next;
                break;
            }
        }
        ((ImageView) view.findViewById(R.id.cancel)).setOnClickListener(new a());
        this.f37058u = (RobertoTextView) view.findViewById(R.id.txt_title);
        this.f37059v = (RobertoTextView) view.findViewById(R.id.txt_desc);
        if (happinessAndEnviromentModel != null) {
            this.f37058u.setText(happinessAndEnviromentModel.getTitle());
            this.f37059v.setText(happinessAndEnviromentModel.getDesc());
        }
        ((ImageView) view.findViewById(R.id.impact_img)).setVisibility(8);
    }
}
