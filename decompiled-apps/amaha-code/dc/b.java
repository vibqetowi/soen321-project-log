package dc;

import android.text.Editable;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.fragment.SSOFragment;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import fq.a1;
import fq.b0;
import fq.y0;
import hr.c7;
import hr.f8;
import hr.f9;
import hr.i5;
import hr.o8;
import hr.s5;
import hr.w8;
import hr.z7;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12736a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12737b;

    public /* synthetic */ b(int i6, Object obj) {
        this.f12736a = i6;
        this.f12737b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        RobertoEditText robertoEditText;
        int i6 = this.f12736a;
        boolean z11 = true;
        Object obj = this.f12737b;
        switch (i6) {
            case 0:
                e eVar = (e) obj;
                eVar.t(eVar.u());
                return;
            case 1:
                k kVar = (k) obj;
                kVar.f12758l = z10;
                kVar.q();
                if (!z10) {
                    kVar.t(false);
                    kVar.f12759m = false;
                    return;
                }
                return;
            case 2:
                ni.n this$0 = (ni.n) obj;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                hh.g.b(this$0.f26340c.f20105d, 0, new ni.h(this$0, view, z10), 3);
                return;
            case 3:
                ol.b this$02 = (ol.b) obj;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (z10) {
                    this$02.G.invoke();
                    return;
                }
                return;
            case 4:
                SSOFragment this$03 = (SSOFragment) obj;
                int i10 = SSOFragment.A;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                if (z10) {
                    try {
                        if (this$03.isAdded()) {
                            hn.q F = this$03.F();
                            if (F.N != 3) {
                                z11 = false;
                            }
                            if (!z11) {
                                F.j();
                            }
                            if (view instanceof RobertoEditText) {
                                robertoEditText = (RobertoEditText) view;
                            } else {
                                robertoEditText = null;
                            }
                            if (robertoEditText != null) {
                                robertoEditText.setOnFocusChangeListener(null);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this$03.f11360u, e10);
                        return;
                    }
                }
                return;
            case 5:
                b0 this$04 = (b0) obj;
                int i11 = b0.f15662z;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                if (z10) {
                    UiUtils.Companion.showSearch(R.layout.fragment_static_s12_search, (ConstraintLayout) this$04._$_findCachedViewById(R.id.constraintRoot), this$04.getActivity());
                    return;
                }
                return;
            case 6:
                y0 this$05 = (y0) obj;
                int i12 = y0.O;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                LogHelper.INSTANCE.i(this$05.f15826u, "setOnFocusChangeListener " + z10);
                if (z10) {
                    UiUtils.Companion.showSearch(R.layout.fragment_static_s45_and_s37_search_visible, (ConstraintLayout) this$05._$_findCachedViewById(R.id.constraintRoot), this$05.getActivity());
                    return;
                }
                return;
            case 7:
                a1 this$06 = (a1) obj;
                int i13 = a1.f15652z;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                if (z10) {
                    UiUtils.Companion.showSearch(R.layout.fragment_static_s5_search, (ConstraintLayout) this$06._$_findCachedViewById(R.id.constraintRoot), this$06.getActivity());
                    return;
                }
                return;
            case 8:
                i5 this$07 = (i5) obj;
                int i14 = i5.A;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                if (z10) {
                    UiUtils.Companion.showSearch(R.layout.fragment_screen_s12_search, (ConstraintLayout) this$07._$_findCachedViewById(R.id.constraintRoot), this$07.getActivity());
                    return;
                }
                return;
            case 9:
                s5 this$08 = (s5) obj;
                int i15 = s5.f19149x;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                if (z10) {
                    UiUtils.Companion.showSearch(R.layout.fragment_screen_s145_search, (ConstraintLayout) this$08._$_findCachedViewById(R.id.constraintRoot), this$08.getActivity());
                    return;
                }
                return;
            case 10:
                c7 this$09 = (c7) obj;
                int i16 = c7.D;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                LogHelper.INSTANCE.i(this$09.f18254u, "setOnFocusChangeListener " + z10);
                if (z10) {
                    c7.Z(R.layout.fragment_screen_s29_search_visible, (ConstraintLayout) this$09._$_findCachedViewById(R.id.constraintRoot), this$09.getActivity());
                    Editable text = ((RobertoEditText) this$09._$_findCachedViewById(R.id.editTextAdd)).getText();
                    kotlin.jvm.internal.i.d(text);
                    if (text.length() <= 0) {
                        z11 = false;
                    }
                    if (z11) {
                        ((ImageButton) this$09._$_findCachedViewById(R.id.textAdd)).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                z7 this$010 = (z7) obj;
                int i17 = z7.K;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                LogHelper.INSTANCE.i(this$010.f19447u, "setOnFocusChangeListener " + z10);
                if (z10) {
                    UiUtils.Companion.showSearch(R.layout.fragment_screen_s45_and_s37_search_visible, (ConstraintLayout) this$010._$_findCachedViewById(R.id.constraintRoot), this$010.getActivity());
                    return;
                }
                return;
            case 12:
                f8 this$011 = (f8) obj;
                int i18 = f8.C;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                if (z10) {
                    UiUtils.Companion.showSearch(R.layout.fragment_screen_s5_search, (ConstraintLayout) this$011._$_findCachedViewById(R.id.constraintRoot), this$011.getActivity());
                    return;
                }
                return;
            case 13:
                o8 this$012 = (o8) obj;
                int i19 = o8.H;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                LogHelper.INSTANCE.i(this$012.f18922u, "setOnFocusChangeListener " + z10);
                if (z10) {
                    UiUtils.Companion.showSearch(R.layout.fragment_screen_s66_search_visible, (ConstraintLayout) this$012._$_findCachedViewById(R.id.constraintRoot), this$012.getActivity());
                    return;
                }
                return;
            case 14:
                w8 this$013 = (w8) obj;
                int i20 = w8.f19358y;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                if (z10) {
                    UiUtils.Companion.showSearch(R.layout.fragment_screen_s77_search, (ConstraintLayout) this$013._$_findCachedViewById(R.id.constraintRoot), this$013.getActivity());
                    return;
                }
                return;
            default:
                f9 this$014 = (f9) obj;
                int i21 = f9.C;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                if (z10) {
                    UiUtils.Companion.showSearch(R.layout.fragment_screen_s84_search, (ConstraintLayout) this$014._$_findCachedViewById(R.id.constraintRoot), this$014.getActivity());
                    return;
                }
                return;
        }
    }
}
