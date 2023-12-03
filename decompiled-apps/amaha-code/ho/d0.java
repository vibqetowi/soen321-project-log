package ho;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.CircleImageView;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import nn.v0;
import org.json.JSONObject;
/* compiled from: ProTherapistDetailFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/d0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f17990w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f17992v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f17991u = LogHelper.INSTANCE.makeLogTag(d0.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f17992v;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_pro_therapist_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f17992v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
        try {
            JSONObject jSONObject = ((ProInitialAssessmentActivity) requireActivity).D;
            if (jSONObject != null) {
                String firstName = jSONObject.optString("firstname");
                String optString = jSONObject.optString("lastname");
                String optString2 = jSONObject.optString("pro_exp");
                z4.f e10 = new z4.f().k(R.drawable.profile).e(R.drawable.profile);
                kotlin.jvm.internal.i.f(e10, "RequestOptions()\n       …error(R.drawable.profile)");
                z4.f fVar = e10;
                if (((CircleImageView) _$_findCachedViewById(R.id.ivProSubmitCoachImage)) != null) {
                    com.bumptech.glide.f i6 = Glide.i(requireActivity());
                    synchronized (i6) {
                        i6.s(fVar);
                    }
                    com.bumptech.glide.e<Bitmap> a10 = i6.a();
                    String optString3 = jSONObject.optString("image");
                    kotlin.jvm.internal.i.f(optString3, "response.optString(\"image\")");
                    if (gv.r.J0(optString3, "https:")) {
                        str = jSONObject.optString("image");
                    } else {
                        str = "https:" + jSONObject.optString("image");
                    }
                    a10.Z = str;
                    a10.f5953b0 = true;
                    a10.B((CircleImageView) _$_findCachedViewById(R.id.ivProSubmitCoachImage));
                }
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvProSubmitTherapistName);
                if (robertoTextView != null) {
                    robertoTextView.setText(firstName + ' ' + optString);
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvProSubmitPoint1);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(optString2);
                }
                RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnProSubmitMainCTA);
                if (robertoButton != null) {
                    kotlin.jvm.internal.i.f(firstName, "firstName");
                    String upperCase = firstName.toUpperCase();
                    kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase()");
                    robertoButton.setText(getString(R.string.proTherapistSuccessCTA, upperCase));
                }
                RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.btnProSubmitMainCTA);
                if (robertoButton2 != null) {
                    robertoButton2.setOnClickListener(new v0(18, this));
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvProSubmitTherapistPosition);
                if (robertoTextView3 != null) {
                    robertoTextView3.setText(jSONObject.optString("designation"));
                }
                RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvProSubmitPoint2);
                if (robertoTextView4 != null) {
                    robertoTextView4.setText(jSONObject.optString("profile_statement"));
                }
                RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvProSubmitPoint3);
                if (robertoTextView5 != null) {
                    robertoTextView5.setText(jSONObject.optString("philosophy"));
                }
                ApplicationPersistence.getInstance().setStringValue(Constants.PRO_THERAPIST_ID, jSONObject.optString("firebaseid"));
                return;
            }
            kotlin.jvm.internal.i.q("serverResponse");
            throw null;
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f17991u, e11);
        }
    }
}
