package ho;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import nn.v0;
/* compiled from: ProAssessmentNameFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/k;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18013w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18015v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18014u = LogHelper.INSTANCE.makeLogTag(k.class);

    public final void J(boolean z10) {
        float f;
        try {
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.paAssessmentNameCta);
            if (robertoButton != null) {
                robertoButton.setEnabled(z10);
            }
            RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.paAssessmentNameCta);
            if (robertoButton2 != null) {
                if (z10) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                robertoButton2.setAlpha(f);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18014u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18015v;
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
        return inflater.inflate(R.layout.fragment_pa_assessment_name, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18015v.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:3:0x0008, B:5:0x0015, B:7:0x001c, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:17:0x003a, B:19:0x0042, B:20:0x004a, B:22:0x0052, B:23:0x005b, B:25:0x0066, B:26:0x0070, B:28:0x0078, B:29:0x007b, B:31:0x0083), top: B:36:0x0008 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                String firstName = user.getFirstName();
                if (firstName != null && !gv.n.B0(firstName)) {
                    z10 = false;
                    if (!z10) {
                        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentNameText);
                        if (robertoEditText != null) {
                            robertoEditText.setText(user.getFirstName());
                        }
                        J(true);
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentNameText);
            if (robertoEditText2 != null) {
                robertoEditText2.addTextChangedListener(new a());
            }
            RobertoEditText robertoEditText3 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentNameText);
            if (robertoEditText3 != null) {
                robertoEditText3.setOnEditorActionListener(new dl.w(5, this));
            }
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.paAssessmentNameCta);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new v0(13, this));
            }
            RobertoEditText robertoEditText4 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentNameText);
            if (robertoEditText4 != null) {
                robertoEditText4.requestFocus();
            }
            if (((RobertoEditText) _$_findCachedViewById(R.id.paAssessmentNameText)) != null) {
                UiUtils.Companion companion = UiUtils.Companion;
                Context requireContext = requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                RobertoEditText paAssessmentNameText = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentNameText);
                kotlin.jvm.internal.i.f(paAssessmentNameText, "paAssessmentNameText");
                companion.showKeyboardFrom(requireContext, paAssessmentNameText);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18014u, e10);
        }
    }

    /* compiled from: ProAssessmentNameFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            if (charSequence != null && charSequence.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            int i12 = k.f18013w;
            k.this.J(!z10);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
