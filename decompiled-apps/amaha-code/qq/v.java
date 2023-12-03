package qq;

import android.app.Dialog;
import android.view.View;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f30076u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x f30077v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Dialog f30078w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ View f30079x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f30080y;

    public /* synthetic */ v(Dialog dialog, x xVar, kotlin.jvm.internal.x xVar2, View view) {
        this.f30076u = 0;
        this.f30078w = dialog;
        this.f30077v = xVar;
        this.f30080y = xVar2;
        this.f30079x = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f30076u;
        View v10 = this.f30079x;
        kotlin.jvm.internal.x currText = this.f30080y;
        x this$0 = this.f30077v;
        Dialog dialog = this.f30078w;
        switch (i6) {
            case 0:
                int i10 = x.f30085x;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(currText, "$currText");
                kotlin.jvm.internal.i.g(v10, "$v");
                if (kotlin.jvm.internal.i.b(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString(), "")) {
                    Toast.makeText(this$0.getActivity(), "Please enter or select a task to add it to the schedule", 0).show();
                    return;
                }
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                if (x.M(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString(), ((DepressionPleasurableActivity) activity).B)) {
                    Toast.makeText(this$0.getActivity(), "This task has already been added to the schedule", 0).show();
                    return;
                }
                HashMap<String, Boolean> hashMap = this$0.f30086u;
                String lowerCase = ((String) currText.f23469u).toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                if (hashMap.containsKey(lowerCase)) {
                    String lowerCase2 = ((String) currText.f23469u).toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (kotlin.jvm.internal.i.b(hashMap.get(lowerCase2), Boolean.TRUE)) {
                        String lowerCase3 = ((String) currText.f23469u).toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
                        hashMap.put(lowerCase3, Boolean.FALSE);
                    }
                }
                String lowerCase4 = gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase4, "this as java.lang.String).toLowerCase()");
                if (hashMap.containsKey(lowerCase4)) {
                    String lowerCase5 = gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase5, "this as java.lang.String).toLowerCase()");
                    if (kotlin.jvm.internal.i.b(hashMap.get(lowerCase5), Boolean.FALSE)) {
                        String lowerCase6 = gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString().toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase6, "this as java.lang.String).toLowerCase()");
                        hashMap.put(lowerCase6, Boolean.TRUE);
                    }
                }
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity2).B.remove(((RobertoTextView) v10.findViewById(R.id.rowContent)).getText().toString());
                ((RobertoTextView) v10.findViewById(R.id.rowContent)).setText(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString());
                androidx.fragment.app.p activity3 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity3).B.add(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString());
                dialog.dismiss();
                return;
            case 1:
                int i11 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView = (RobertoTextView) dialog.findViewById(R.id.chip9);
                kotlin.jvm.internal.i.f(robertoTextView, "dialog.chip9");
                this$0.K(robertoTextView, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            case 2:
                int i12 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView2 = (RobertoTextView) dialog.findViewById(R.id.chip10);
                kotlin.jvm.internal.i.f(robertoTextView2, "dialog.chip10");
                this$0.K(robertoTextView2, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            case 3:
                int i13 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView3 = (RobertoTextView) dialog.findViewById(R.id.chip11);
                kotlin.jvm.internal.i.f(robertoTextView3, "dialog.chip11");
                this$0.K(robertoTextView3, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            case 4:
                int i14 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView4 = (RobertoTextView) dialog.findViewById(R.id.chip12);
                kotlin.jvm.internal.i.f(robertoTextView4, "dialog.chip12");
                this$0.K(robertoTextView4, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            case 5:
                int i15 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView5 = (RobertoTextView) dialog.findViewById(R.id.chip1);
                kotlin.jvm.internal.i.f(robertoTextView5, "dialog.chip1");
                this$0.K(robertoTextView5, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            case 6:
                int i16 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView6 = (RobertoTextView) dialog.findViewById(R.id.chip2);
                kotlin.jvm.internal.i.f(robertoTextView6, "dialog.chip2");
                this$0.K(robertoTextView6, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            case 7:
                int i17 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView7 = (RobertoTextView) dialog.findViewById(R.id.chip3);
                kotlin.jvm.internal.i.f(robertoTextView7, "dialog.chip3");
                this$0.K(robertoTextView7, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            case 8:
                int i18 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView8 = (RobertoTextView) dialog.findViewById(R.id.chip4);
                kotlin.jvm.internal.i.f(robertoTextView8, "dialog.chip4");
                this$0.K(robertoTextView8, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            case 9:
                int i19 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView9 = (RobertoTextView) dialog.findViewById(R.id.chip5);
                kotlin.jvm.internal.i.f(robertoTextView9, "dialog.chip5");
                this$0.K(robertoTextView9, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            case 10:
                int i20 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView10 = (RobertoTextView) dialog.findViewById(R.id.chip6);
                kotlin.jvm.internal.i.f(robertoTextView10, "dialog.chip6");
                this$0.K(robertoTextView10, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            case 11:
                int i21 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView11 = (RobertoTextView) dialog.findViewById(R.id.chip7);
                kotlin.jvm.internal.i.f(robertoTextView11, "dialog.chip7");
                this$0.K(robertoTextView11, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
            default:
                int i22 = x.f30085x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(currText, "$currText");
                RobertoTextView robertoTextView12 = (RobertoTextView) dialog.findViewById(R.id.chip8);
                kotlin.jvm.internal.i.f(robertoTextView12, "dialog.chip8");
                this$0.K(robertoTextView12, v10, (String) currText.f23469u);
                dialog.dismiss();
                return;
        }
    }

    public /* synthetic */ v(x xVar, Dialog dialog, View view, kotlin.jvm.internal.x xVar2, int i6) {
        this.f30076u = i6;
        this.f30077v = xVar;
        this.f30078w = dialog;
        this.f30079x = view;
        this.f30080y = xVar2;
    }
}
