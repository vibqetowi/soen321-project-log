package ho;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProAssessmentAdditionalDetailFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f17965x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f17968w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f17966u = LogHelper.INSTANCE.makeLogTag(b.class);

    /* renamed from: v  reason: collision with root package name */
    public String f17967v = "";

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f17968w;
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
        return inflater.inflate(R.layout.fragment_pa_additional_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f17968w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.additionalDetailsSecondaryCTA);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new View.OnClickListener(this) { // from class: ho.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ b f17962v;

                    {
                        this.f17962v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        boolean z10;
                        Editable editable;
                        String obj;
                        float f;
                        int i6 = r2;
                        b this$0 = this.f17962v;
                        boolean z11 = false;
                        switch (i6) {
                            case 0:
                                int i10 = b.f17965x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                RobertoButton robertoButton2 = (RobertoButton) this$0._$_findCachedViewById(R.id.additionalDetailsSecondaryCTA);
                                if (robertoButton2 != null) {
                                    robertoButton2.setSelected(!((RobertoButton) this$0._$_findCachedViewById(R.id.additionalDetailsSecondaryCTA)).isSelected());
                                }
                                RobertoButton robertoButton3 = (RobertoButton) this$0._$_findCachedViewById(R.id.additionalDetailsNext);
                                if (robertoButton3 != null) {
                                    RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.additionalDetailsSecondaryCTA);
                                    if (robertoButton4 != null && robertoButton4.isSelected()) {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        f = 1.0f;
                                    } else {
                                        f = 0.34f;
                                    }
                                    robertoButton3.setAlpha(f);
                                    return;
                                }
                                return;
                            default:
                                int i11 = b.f17965x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.additionalDetailsSecondaryCTA);
                                if (robertoButton5 != null && robertoButton5.isSelected()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    obj = this$0.getString(R.string.paAdditionalDetailsCTA);
                                    kotlin.jvm.internal.i.f(obj, "{\n                    ge…ilsCTA)\n                }");
                                } else {
                                    RobertoEditText robertoEditText = (RobertoEditText) this$0._$_findCachedViewById(R.id.additionalDetailsEditText);
                                    if (robertoEditText != null) {
                                        editable = robertoEditText.getText();
                                    } else {
                                        editable = null;
                                    }
                                    obj = gv.r.i1(String.valueOf(editable)).toString();
                                }
                                this$0.f17967v = obj;
                                if (!gv.n.B0(obj)) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paAdditionalDetailsQues));
                                    jSONObject.put("type", "textinput");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f17967v}));
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                    ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.additionalDetailsEditText);
            if (robertoEditText != null) {
                robertoEditText.addTextChangedListener(new a());
            }
            RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.additionalDetailsNext);
            if (robertoButton2 != null) {
                robertoButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ho.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ b f17962v;

                    {
                        this.f17962v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        boolean z10;
                        Editable editable;
                        String obj;
                        float f;
                        int i6 = r2;
                        b this$0 = this.f17962v;
                        boolean z11 = false;
                        switch (i6) {
                            case 0:
                                int i10 = b.f17965x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                RobertoButton robertoButton22 = (RobertoButton) this$0._$_findCachedViewById(R.id.additionalDetailsSecondaryCTA);
                                if (robertoButton22 != null) {
                                    robertoButton22.setSelected(!((RobertoButton) this$0._$_findCachedViewById(R.id.additionalDetailsSecondaryCTA)).isSelected());
                                }
                                RobertoButton robertoButton3 = (RobertoButton) this$0._$_findCachedViewById(R.id.additionalDetailsNext);
                                if (robertoButton3 != null) {
                                    RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.additionalDetailsSecondaryCTA);
                                    if (robertoButton4 != null && robertoButton4.isSelected()) {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        f = 1.0f;
                                    } else {
                                        f = 0.34f;
                                    }
                                    robertoButton3.setAlpha(f);
                                    return;
                                }
                                return;
                            default:
                                int i11 = b.f17965x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.additionalDetailsSecondaryCTA);
                                if (robertoButton5 != null && robertoButton5.isSelected()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    obj = this$0.getString(R.string.paAdditionalDetailsCTA);
                                    kotlin.jvm.internal.i.f(obj, "{\n                    ge…ilsCTA)\n                }");
                                } else {
                                    RobertoEditText robertoEditText2 = (RobertoEditText) this$0._$_findCachedViewById(R.id.additionalDetailsEditText);
                                    if (robertoEditText2 != null) {
                                        editable = robertoEditText2.getText();
                                    } else {
                                        editable = null;
                                    }
                                    obj = gv.r.i1(String.valueOf(editable)).toString();
                                }
                                this$0.f17967v = obj;
                                if (!gv.n.B0(obj)) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paAdditionalDetailsQues));
                                    jSONObject.put("type", "textinput");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f17967v}));
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                    ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17966u, e10);
        }
    }

    /* compiled from: ProAssessmentAdditionalDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            float f;
            boolean z10;
            int i12;
            b bVar = b.this;
            RobertoButton robertoButton = (RobertoButton) bVar._$_findCachedViewById(R.id.additionalDetailsSecondaryCTA);
            boolean z11 = true;
            if (robertoButton != null) {
                if (charSequence != null && !gv.n.B0(charSequence)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                robertoButton.setVisibility(i12);
            }
            RobertoButton robertoButton2 = (RobertoButton) bVar._$_findCachedViewById(R.id.additionalDetailsSecondaryCTA);
            if (robertoButton2 != null) {
                robertoButton2.setSelected(false);
            }
            RobertoButton robertoButton3 = (RobertoButton) bVar._$_findCachedViewById(R.id.additionalDetailsNext);
            if (robertoButton3 != null) {
                if (charSequence != null && !gv.n.B0(charSequence)) {
                    z11 = false;
                }
                if (!z11) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                robertoButton3.setAlpha(f);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
